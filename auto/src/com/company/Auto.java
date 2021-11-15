package com.company;

import java.util.Arrays;

public class Auto  {
    private final Motor motor;
    private final Kerek[] kerek;
    private final String tipus;

    public Auto(Motor motor, Kerek[] kerek, String tipus) {
        this.motor = motor;
        this.kerek = kerek;
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "motor=" + motor  +
                ", kerek=" + Arrays.toString(kerek) +
                ", tipus='" + tipus + '\'' +
                '}';
    }
}
