package com.trunghtluu.catindex.view

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.trunghtluu.catindex.R
import com.trunghtluu.catindex.adapter.CatCardAdapter
import com.trunghtluu.catindex.model.Breed
import com.trunghtluu.catindex.model.Cat
import com.trunghtluu.catindex.viewmodel.MainCat
import kotlinx.android.synthetic.main.activity_main.*
import java.util.HashSet
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation



class MainActivity : AppCompatActivity() {

    private lateinit var mainCat: MainCat

    lateinit var catObserver: Observer<List<Cat>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainCat = ViewModelProviders.of(this).get(MainCat::class.java)

        catObserver = object : Observer<List<Cat>> {
            override fun onChanged(catList: List<Cat>) {
                val breedSet = HashSet<String>()
                val catArrayList = ArrayList<Cat>()

                for (cat in catList) {
                    if (cat.breeds.size == 0)
                        continue

                    val breed = cat.breeds.get(0)

                    if (!breedSet.contains(breed.id)){
                        catArrayList.add(cat)
                        breedSet.add(breed.id)
                    }
                }

                val waste = "Use: " + catArrayList.size + "/" + catList.size + " cat pics"
                Log.d("TAG_X", waste)

                setupRV(catArrayList)
            }
        }

        mainCat.getResultLiveData().observe(this@MainActivity, catObserver)

        mainCat.getCats()

        Thread(Runnable {
            val anim = RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f)
            anim.interpolator = LinearInterpolator()
            anim.repeatCount = Animation.INFINITE
            anim.duration = 7000

            page_tv.startAnimation(anim)

        }).start()
    }

    private fun setupRV(catList: List<Cat>) {
        val adapter = CatCardAdapter(catList, this)
        main_rv.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false))
        main_rv.setAdapter(adapter)
    }
}
