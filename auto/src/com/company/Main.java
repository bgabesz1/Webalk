package com.company;

import com.company.impl.BelsoegesuMotor;
import com.company.impl.Kerek;

public class Main {
    public static void main(String[] args){
        Motor motor16 = new BelsoegesuMotor(160,1680);
        Auto opelAstra= new Auto(motor16,get4kerek(),"Opel Astra");
        System.out.println(opelAstra);

    }
    private static Kerek[] get4kerek(){
        Kerek[] kerekek = new Kerek[4];
        for (int i = 0; i < 4; i++) {
            kerekek[i] = new Kerek(205, 15, 65);
        }
    return kerekek;
    }
}
