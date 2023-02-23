package com.cybersoft.osahaneatapp.entity;

import com.cybersoft.osahaneatapp.entity.embedded_id.IdOrderItem;

import javax.persistence.*;

@Entity(name = "order_item")
public class OrderItem {

    @EmbeddedId
    IdOrderItem idOrderItem;

    @Column(name = "amount")
    private int amount;

    @Column(name = "price")
    private double price;

    @ManyToOne
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "food_id", insertable = false, updatable = false)
    private Food food;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public IdOrderItem getIdOrderItem() {
        return idOrderItem;
    }

    public void setIdOrderItem(IdOrderItem idOrderItem) {
        this.idOrderItem = idOrderItem;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }
}
