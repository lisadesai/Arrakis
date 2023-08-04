package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trade")
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trade_id", nullable = false)
    private int trade_id;
    @Column(name = "currency", nullable = false)
    private String currency;
    @Column(name = "quantity", nullable = false)
    private int quantity;
    @Column(name = "unit_price", nullable = false)
    private float unit_price;
    @Column(name = "settle_date", nullable = false)
    private Date settle_date;
    @Column(name = "t_status", nullable = false)
    private String t_status;
    @Column(name = "trade_date", nullable = false)
    private Date trade_date;
    @Column(name = "buy_sell", nullable = false)
    private String buy_sell;
    @ManyToOne
    @JoinColumn(name="book_id", nullable = false)
    private Book book_id;
    @ManyToOne
    @JoinColumn(name="security_id", nullable = false)
    private Securities security_id;
    @ManyToOne
    @JoinColumn(name="cp_id", nullable = false)
    private CounterParty cp_id;

    //TODO: missing foreign keys!
    //book_id_fk3
    //security_id_fk1
    //cp_id_fk

    public int getTrade_id() {
        return trade_id;
    }

    public void setTrade_id(int trade_id) {
        this.trade_id = trade_id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getSettle_date() {
        return settle_date;
    }

    public void setSettle_date(Date settle_date) {
        this.settle_date = settle_date;
    }

    public String getT_status() {
        return t_status;
    }

    public void setT_status(String t_status) {
        this.t_status = t_status;
    }

    public Date getTrade_date() {
        return trade_date;
    }

    public void setTrade_date(Date trade_date) {
        this.trade_date = trade_date;
    }

    public Book getBook_id() {
        return book_id;
    }

    public void setBook_id(Book book_id) {
        this.book_id = book_id;
    }

    public Securities getSecurity_id() {
        return security_id;
    }

    public void setSecurity_id(Securities security_id) {
        this.security_id = security_id;
    }

    public CounterParty getCp_id() {
        return cp_id;
    }

    public void setCp_id(CounterParty cp_id) {
        this.cp_id = cp_id;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }

    public String getBuy_sell() {
        return buy_sell;
    }

    public void setBuy_sell(String buy_sell) {
        this.buy_sell = buy_sell;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "trade_id=" + trade_id +
                ", currency='" + currency + '\'' +
                ", quantity=" + quantity +
                ", unit_price=" + unit_price +
                ", settle_date=" + settle_date +
                ", t_status='" + t_status + '\'' +
                ", trade_date=" + trade_date +
                ", buy_sell='" + buy_sell + '\'' +
                ", book_id=" + book_id +
                ", security_id=" + security_id +
                ", cp_id=" + cp_id +
                '}';
    }
}