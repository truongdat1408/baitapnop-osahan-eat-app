package com.cybersoft.osahaneatapp.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "descritpion")
    private String desc;

    @Column(name = "price")
    private double price;

    @OneToMany(mappedBy = "food")
    private List<OrderItem> orderItems;

    @OneToMany(mappedBy = "food")
    private Set<RatingFood> ratingFoods;

    @ManyToOne
    @JoinColumn(name = "cate_rest_id")
    private CategoryRestaurant categoryRestaurant;

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Set<RatingFood> getRatingFoods() {
        return ratingFoods;
    }

    public void setRatingFoods(Set<RatingFood> ratingFoods) {
        this.ratingFoods = ratingFoods;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CategoryRestaurant getCategoryRestaurant() {
        return categoryRestaurant;
    }

    public void setCategoryRestaurant(CategoryRestaurant categoryRestaurant) {
        this.categoryRestaurant = categoryRestaurant;
    }
}
