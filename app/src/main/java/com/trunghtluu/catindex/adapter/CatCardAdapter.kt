package com.trunghtluu.catindex.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.trunghtluu.catindex.R
import com.trunghtluu.catindex.model.Breed
import com.trunghtluu.catindex.model.Cat
import kotlinx.android.synthetic.main.cat_card.*
import kotlinx.android.synthetic.main.cat_card.view.*
import java.util.HashSet

class CatCardAdapter(var catList : List<Cat>,
                     var applicationContext: Context) : RecyclerView.Adapter<CatCardAdapter.CatViewHolder>() {

    init {
        this.catList = catList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        applicationContext = parent.context.applicationContext

        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.cat_card, parent, false)

        return CatViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return catList.size
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        val breed = catList.get(position).breeds.get(0)

        holder.nameTextView
            .setText(breed.name)
        holder.descTextView
            .setText(breed.description)
        Glide.with(applicationContext)
            .load(catList.get(position).url)
            .apply(RequestOptions.centerCropTransform())
            .into(holder.catImageView)
    }

    class CatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameTextView: TextView = itemView.name_content_card_tv
        var descTextView: TextView = itemView.desc_content_card_tv
        var catImageView: ImageView = itemView.cat_card_iv
    }
}