package org.example.domain;

import java.io.Serializable;

public class Order implements Serializable {
    //随机生成的序列化编码
    private static final long serialVersionUID = -1937482850946728114L;
    //订单编号
    private String id;
    //订单单价
    private float price;
    //订单名称
    private String goodName;
    //订单数量
    private int amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", goodName='" + goodName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
