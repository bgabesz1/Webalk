package com.company.impl;

import com.company.Motor;

public class BelsoegesuMotor implements Motor {
    private final int loero;
    private final int ccm;

    public BelsoegesuMotor(int loero, int ccm) {
        this.loero = loero;
        this.ccm = ccm;
    }

    @Override
    public String toString() {
        return "BelsoegesuMotor{" +
                "loero=" + loero +
                ", ccm=" + ccm +
                '}';
    }
}
