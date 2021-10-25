package com.company.impl;

import com.company.Motor;

public class Villanymotor implements Motor {
    private final int teljesitmeny;
    private final int feszultseg;

    public Villanymotor(int teljesitmeny, int feszultseg) {
        this.teljesitmeny = teljesitmeny;
        this.feszultseg = feszultseg;
    }

    @Override
    public String toString() {
        return "Villanymotor{" +
                "teljesitmeny=" + teljesitmeny +
                ", feszultseg=" + feszultseg +
                '}';
    }
}
