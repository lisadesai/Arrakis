package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "counter_party")
public class CounterParty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cp_id", nullable = false)
    private int cp_id;

    @Column(name = "name", nullable = false)
    private String name;

    public int getCp_id() {
        return cp_id;
    }

    public void setCp_id(int cp_id) {
        this.cp_id = cp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CounterParty{" +
                "cp_id=" + cp_id +
                ", name='" + name + '\'' +
                '}';
    }
}