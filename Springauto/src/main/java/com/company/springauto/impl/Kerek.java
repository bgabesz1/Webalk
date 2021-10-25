package com.company.springauto.impl;


public class Kerek implements com.company.springauto.Kerek {
    private final int szelesseg;
    private final int atmero;
    private final int kopenyMagassag;

    public Kerek(int szelesseg, int atmero, int kopenyMagassag) {
        this.szelesseg = szelesseg;
        this.atmero = atmero;
        this.kopenyMagassag = kopenyMagassag;
    }

    @Override
    public String toString() {
        return "Kerek{" +
                szelesseg +
                "/" + kopenyMagassag +
                " R " + atmero +
                '}';
    }
}
