package com.cybersoft.osahaneatapp.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String addr;

    @Column(name = "description")
    private String desc;

    @Column(name = "rating")
    private String rating;

    @Column(name = "content")
    private String content;

    @OneToMany(mappedBy = "restaurant")
    private Set<RatingRes> ratingResSet;

    @OneToMany(mappedBy = "restaurant")
    private Set<CategoryRestaurant> categoryRestaurants;

    public Set<CategoryRestaurant> getCategoryRestaurants() {
        return categoryRestaurants;
    }

    public void setCategoryRestaurants(Set<CategoryRestaurant> categoryRestaurants) {
        this.categoryRestaurants = categoryRestaurants;
    }

    public Set<RatingRes> getRatingResSet() {
        return ratingResSet;
    }

    public void setRatingResSet(Set<RatingRes> ratingResSet) {
        this.ratingResSet = ratingResSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
