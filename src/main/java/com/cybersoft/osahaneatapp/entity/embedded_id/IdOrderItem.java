package com.cybersoft.osahaneatapp.entity.embedded_id;


import com.cybersoft.osahaneatapp.entity.Order;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class IdOrderItem implements Serializable {
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "food_id")
    private String foodId;

    public IdOrderItem() {
    }

    public IdOrderItem(String orderId, String foodId) {
        this.orderId = orderId;
        this.foodId = foodId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }
}
