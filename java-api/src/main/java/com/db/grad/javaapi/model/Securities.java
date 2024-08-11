package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "securities")
public class Securities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "security_id", nullable = false)
    private int security_id;
    @Column(name = "bond_currency", nullable = false)
    private String bond_currency;
    @Column(name = "coupon_rate", nullable = false)
    private float coupon_rate;
    @Column(name = "cusip", nullable = false)
    private String cusip;
    @Column(name = "isin", nullable = false)
    private String isin;
    @Column(name = "face_value", nullable = false)
    private int face_value;
    @Column(name = "issuer_name", nullable = false)
    private String issuer_name;
    @Column(name = "mature_date")
    private String mature_date;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "bond_type", nullable = false)
    private String bond_type;

    public int getSecurity_id() {
        return security_id;
    }

    public void setSecurity_id(int security_id) {
        this.security_id = security_id;
    }

    public String getBond_currency() {
        return bond_currency;
    }

    public void setBond_currency(String bond_currency) {
        this.bond_currency = bond_currency;
    }

    public float getCoupon_rate() {
        return coupon_rate;
    }

    public void setCoupon_rate(float coupon_rate) {
        this.coupon_rate = coupon_rate;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public int getFace_value() {
        return face_value;
    }

    public void setFace_value(int face_value) {
        this.face_value = face_value;
    }

    public String getIssuer_name() {
        return issuer_name;
    }

    public void setIssuer_name(String issuer_name) {
        this.issuer_name = issuer_name;
    }

    public String getMature_date() {
        return mature_date;
    }

    public void setMature_date(String mature_date) {
        this.mature_date = mature_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBond_type() {
        return bond_type;
    }

    public void setBond_type(String bond_type) {
        this.bond_type = bond_type;
    }


    @Override
    public String toString() {
        return "Securities{" +
                "security_id=" + security_id +
                ", bond_currency='" + bond_currency + '\'' +
                ", coupon_rate=" + coupon_rate +
                ", cusip='" + cusip + '\'' +
                ", isin='" + isin + '\'' +
                ", face_value=" + face_value +
                ", issuer_name='" + issuer_name + '\'' +
                ", mature_date=" + mature_date +
                ", status='" + status + '\'' +
                ", bond_type='" + bond_type +
                '}';
    }
}