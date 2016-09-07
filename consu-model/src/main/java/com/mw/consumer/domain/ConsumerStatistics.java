package com.mw.consumer.domain;

/**
 * Created by wei.ma on 2016/9/2.
 */
public class ConsumerStatistics {
    private int id;
    private double perday_cost;
    private String date;
    private String description;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPerday_cost() {
        return perday_cost;
    }

    public void setPerday_cost(double perday_cost) {
        this.perday_cost = perday_cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ConsumerStatistics{" +
                "id=" + id +
                ", perday_cost=" + perday_cost +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", userId=" + userId +
                '}';
    }
}
