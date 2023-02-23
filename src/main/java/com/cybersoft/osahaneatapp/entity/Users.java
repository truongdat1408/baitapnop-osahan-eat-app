package com.cybersoft.osahaneatapp.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String pass;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "address")
    private String addr;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles role;

    @OneToMany(mappedBy = "user")
    private Set<RatingRes> ratingResSet;

    @OneToMany(mappedBy = "user")
    private Set<Order> orders;

    @OneToMany(mappedBy = "user")
    private Set<RatingFood> ratingFoods;

    @OneToMany(mappedBy = "user")
    private Set<RatingOrder> ratingOrders;

    public Set<RatingOrder> getRatingOrders() {
        return ratingOrders;
    }

    public void setRatingOrders(Set<RatingOrder> ratingOrders) {
        this.ratingOrders = ratingOrders;
    }

    public Set<RatingFood> getRatingFoods() {
        return ratingFoods;
    }

    public void setRatingFoods(Set<RatingFood> ratingFoods) {
        this.ratingFoods = ratingFoods;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
