package com.cybersoft.osahaneatapp.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "coupon")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String desc;

    @Column(name = "discount")
    private double discount;

    @ManyToOne
    @JoinColumn(name = "cate_rest_id")
    private CategoryRestaurant categoryRestaurant;

    @OneToMany(mappedBy = "coupon")
    private Set<OrderItem> orderItems;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public CategoryRestaurant getCategoryRestaurant() {
        return categoryRestaurant;
    }

    public void setCategoryRestaurant(CategoryRestaurant categoryRestaurant) {
        this.categoryRestaurant = categoryRestaurant;
    }
}
