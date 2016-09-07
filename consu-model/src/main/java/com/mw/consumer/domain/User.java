package com.mw.consumer.domain;

/**
 * Created by wei.ma on 2016/9/2.
 */
public class User {
    private int id;
    private int userId;
    private String name;
    private double cost_morning;
    private double cost_noon;
    private double cos_afternoon;
    private String nickName;
    private String description;
    private String date;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost_morning() {
        return cost_morning;
    }

    public void setCost_morning(double cost_morning) {
        this.cost_morning = cost_morning;
    }

    public double getCost_noon() {
        return cost_noon;
    }

    public void setCost_noon(double cost_noon) {
        this.cost_noon = cost_noon;
    }

    public double getCos_afternoon() {
        return cos_afternoon;
    }

    public void setCos_afternoon(double cos_afternoon) {
        this.cos_afternoon = cos_afternoon;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", cost_morning=" + cost_morning +
                ", cost_noon=" + cost_noon +
                ", cos_afternoon=" + cos_afternoon +
                ", nickName='" + nickName + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
