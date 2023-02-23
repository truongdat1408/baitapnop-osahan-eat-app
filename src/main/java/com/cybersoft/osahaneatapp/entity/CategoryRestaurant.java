package com.cybersoft.osahaneatapp.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "category_restaurant")
public class CategoryRestaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "cate_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "rest_id")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "categoryRestaurant")
    private Set<Coupon> coupons;

    @OneToMany(mappedBy = "categoryRestaurant")
    private Set<Food> foods;

    public Set<Food> getFoods() {
        return foods;
    }

    public void setFoods(Set<Food> foods) {
        this.foods = foods;
    }

    public Set<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(Set<Coupon> coupons) {
        this.coupons = coupons;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
