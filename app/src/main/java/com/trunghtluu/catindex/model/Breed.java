package com.trunghtluu.catindex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Breed {
    @SerializedName("adaptability")
    @Expose
    private Integer adaptability;
    @SerializedName("affection_level")
    @Expose
    private Integer affectionLevel;
    @SerializedName("alt_names")
    @Expose
    private String altNames;
    @SerializedName("cfa_url")
    @Expose
    private String cfaUrl;
    @SerializedName("child_friendly")
    @Expose
    private Integer childFriendly;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("country_codes")
    @Expose
    private String countryCodes;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("dog_friendly")
    @Expose
    private Integer dogFriendly;
    @SerializedName("energy_level")
    @Expose
    private Integer energyLevel;
    @SerializedName("experimental")
    @Expose
    private Integer experimental;
    @SerializedName("grooming")
    @Expose
    private Integer grooming;
    @SerializedName("hairless")
    @Expose
    private Integer hairless;
    @SerializedName("health_issues")
    @Expose
    private Integer healthIssues;
    @SerializedName("hypoallergenic")
    @Expose
    private Integer hypoallergenic;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("indoor")
    @Expose
    private Integer indoor;
    @SerializedName("intelligence")
    @Expose
    private Integer intelligence;
    @SerializedName("lap")
    @Expose
    private Integer lap;
    @SerializedName("life_span")
    @Expose
    private String lifeSpan;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("natural")
    @Expose
    private Integer natural;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("rare")
    @Expose
    private Integer rare;
    @SerializedName("rex")
    @Expose
    private Integer rex;
    @SerializedName("shedding_level")
    @Expose
    private Integer sheddingLevel;
    @SerializedName("short_legs")
    @Expose
    private Integer shortLegs;
    @SerializedName("social_needs")
    @Expose
    private Integer socialNeeds;
    @SerializedName("stranger_friendly")
    @Expose
    private Integer strangerFriendly;
    @SerializedName("suppressed_tail")
    @Expose
    private Integer suppressedTail;
    @SerializedName("temperament")
    @Expose
    private String temperament;
    @SerializedName("vcahospitals_url")
    @Expose
    private String vcahospitalsUrl;
    @SerializedName("vetstreet_url")
    @Expose
    private String vetstreetUrl;
    @SerializedName("vocalisation")
    @Expose
    private Integer vocalisation;
    @SerializedName("weight")
    @Expose
    private Weight weight;
    @SerializedName("wikipedia_url")
    @Expose
    private String wikipediaUrl;

    public Integer getAdaptability() {
        return adaptability;
    }

    public void setAdaptability(Integer adaptability) {
        this.adaptability = adaptability;
    }

    public Breed withAdaptability(Integer adaptability) {
        this.adaptability = adaptability;
        return this;
    }

    public Integer getAffectionLevel() {
        return affectionLevel;
    }

    public void setAffectionLevel(Integer affectionLevel) {
        this.affectionLevel = affectionLevel;
    }

    public Breed withAffectionLevel(Integer affectionLevel) {
        this.affectionLevel = affectionLevel;
        return this;
    }

    public String getAltNames() {
        return altNames;
    }

    public void setAltNames(String altNames) {
        this.altNames = altNames;
    }

    public Breed withAltNames(String altNames) {
        this.altNames = altNames;
        return this;
    }

    public String getCfaUrl() {
        return cfaUrl;
    }

    public void setCfaUrl(String cfaUrl) {
        this.cfaUrl = cfaUrl;
    }

    public Breed withCfaUrl(String cfaUrl) {
        this.cfaUrl = cfaUrl;
        return this;
    }

    public Integer getChildFriendly() {
        return childFriendly;
    }

    public void setChildFriendly(Integer childFriendly) {
        this.childFriendly = childFriendly;
    }

    public Breed withChildFriendly(Integer childFriendly) {
        this.childFriendly = childFriendly;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Breed withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(String countryCodes) {
        this.countryCodes = countryCodes;
    }

    public Breed withCountryCodes(String countryCodes) {
        this.countryCodes = countryCodes;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Breed withDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getDogFriendly() {
        return dogFriendly;
    }

    public void setDogFriendly(Integer dogFriendly) {
        this.dogFriendly = dogFriendly;
    }

    public Breed withDogFriendly(Integer dogFriendly) {
        this.dogFriendly = dogFriendly;
        return this;
    }

    public Integer getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(Integer energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Breed withEnergyLevel(Integer energyLevel) {
        this.energyLevel = energyLevel;
        return this;
    }

    public Integer getExperimental() {
        return experimental;
    }

    public void setExperimental(Integer experimental) {
        this.experimental = experimental;
    }

    public Breed withExperimental(Integer experimental) {
        this.experimental = experimental;
        return this;
    }

    public Integer getGrooming() {
        return grooming;
    }

    public void setGrooming(Integer grooming) {
        this.grooming = grooming;
    }

    public Breed withGrooming(Integer grooming) {
        this.grooming = grooming;
        return this;
    }

    public Integer getHairless() {
        return hairless;
    }

    public void setHairless(Integer hairless) {
        this.hairless = hairless;
    }

    public Breed withHairless(Integer hairless) {
        this.hairless = hairless;
        return this;
    }

    public Integer getHealthIssues() {
        return healthIssues;
    }

    public void setHealthIssues(Integer healthIssues) {
        this.healthIssues = healthIssues;
    }

    public Breed withHealthIssues(Integer healthIssues) {
        this.healthIssues = healthIssues;
        return this;
    }

    public Integer getHypoallergenic() {
        return hypoallergenic;
    }

    public void setHypoallergenic(Integer hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }

    public Breed withHypoallergenic(Integer hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Breed withId(String id) {
        this.id = id;
        return this;
    }

    public Integer getIndoor() {
        return indoor;
    }

    public void setIndoor(Integer indoor) {
        this.indoor = indoor;
    }

    public Breed withIndoor(Integer indoor) {
        this.indoor = indoor;
        return this;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Breed withIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
        return this;
    }

    public Integer getLap() {
        return lap;
    }

    public void setLap(Integer lap) {
        this.lap = lap;
    }

    public Breed withLap(Integer lap) {
        this.lap = lap;
        return this;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public Breed withLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed withName(String name) {
        this.name = name;
        return this;
    }

    public Integer getNatural() {
        return natural;
    }

    public void setNatural(Integer natural) {
        this.natural = natural;
    }

    public Breed withNatural(Integer natural) {
        this.natural = natural;
        return this;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Breed withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public Integer getRare() {
        return rare;
    }

    public void setRare(Integer rare) {
        this.rare = rare;
    }

    public Breed withRare(Integer rare) {
        this.rare = rare;
        return this;
    }

    public Integer getRex() {
        return rex;
    }

    public void setRex(Integer rex) {
        this.rex = rex;
    }

    public Breed withRex(Integer rex) {
        this.rex = rex;
        return this;
    }

    public Integer getSheddingLevel() {
        return sheddingLevel;
    }

    public void setSheddingLevel(Integer sheddingLevel) {
        this.sheddingLevel = sheddingLevel;
    }

    public Breed withSheddingLevel(Integer sheddingLevel) {
        this.sheddingLevel = sheddingLevel;
        return this;
    }

    public Integer getShortLegs() {
        return shortLegs;
    }

    public void setShortLegs(Integer shortLegs) {
        this.shortLegs = shortLegs;
    }

    public Breed withShortLegs(Integer shortLegs) {
        this.shortLegs = shortLegs;
        return this;
    }

    public Integer getSocialNeeds() {
        return socialNeeds;
    }

    public void setSocialNeeds(Integer socialNeeds) {
        this.socialNeeds = socialNeeds;
    }

    public Breed withSocialNeeds(Integer socialNeeds) {
        this.socialNeeds = socialNeeds;
        return this;
    }

    public Integer getStrangerFriendly() {
        return strangerFriendly;
    }

    public void setStrangerFriendly(Integer strangerFriendly) {
        this.strangerFriendly = strangerFriendly;
    }

    public Breed withStrangerFriendly(Integer strangerFriendly) {
        this.strangerFriendly = strangerFriendly;
        return this;
    }

    public Integer getSuppressedTail() {
        return suppressedTail;
    }

    public void setSuppressedTail(Integer suppressedTail) {
        this.suppressedTail = suppressedTail;
    }

    public Breed withSuppressedTail(Integer suppressedTail) {
        this.suppressedTail = suppressedTail;
        return this;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public Breed withTemperament(String temperament) {
        this.temperament = temperament;
        return this;
    }

    public String getVcahospitalsUrl() {
        return vcahospitalsUrl;
    }

    public void setVcahospitalsUrl(String vcahospitalsUrl) {
        this.vcahospitalsUrl = vcahospitalsUrl;
    }

    public Breed withVcahospitalsUrl(String vcahospitalsUrl) {
        this.vcahospitalsUrl = vcahospitalsUrl;
        return this;
    }

    public String getVetstreetUrl() {
        return vetstreetUrl;
    }

    public void setVetstreetUrl(String vetstreetUrl) {
        this.vetstreetUrl = vetstreetUrl;
    }

    public Breed withVetstreetUrl(String vetstreetUrl) {
        this.vetstreetUrl = vetstreetUrl;
        return this;
    }

    public Integer getVocalisation() {
        return vocalisation;
    }

    public void setVocalisation(Integer vocalisation) {
        this.vocalisation = vocalisation;
    }

    public Breed withVocalisation(Integer vocalisation) {
        this.vocalisation = vocalisation;
        return this;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public Breed withWeight(Weight weight) {
        this.weight = weight;
        return this;
    }

    public String getWikipediaUrl() {
        return wikipediaUrl;
    }

    public void setWikipediaUrl(String wikipediaUrl) {
        this.wikipediaUrl = wikipediaUrl;
    }

    public Breed withWikipediaUrl(String wikipediaUrl) {
        this.wikipediaUrl = wikipediaUrl;
        return this;
    }
}
