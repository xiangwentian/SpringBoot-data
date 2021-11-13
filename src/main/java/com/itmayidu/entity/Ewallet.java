package com.itmayidu.entity;

public class Ewallet {
    private Integer id;
    private String uid;
    private Double amount;
    private Double other_card_fee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getOther_card_fee() {
        return other_card_fee;
    }

    public void setOther_card_fee(Double other_card_fee) {
        this.other_card_fee = other_card_fee;
    }

    @Override
    public String toString() {
        return "Ewallet{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", amount=" + amount +
                ", other_card_fee=" + other_card_fee +
                '}';
    }
}
