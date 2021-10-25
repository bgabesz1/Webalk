package com.company.springauto;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import com.company.springauto.impl.BelsoegesuMotor;
import com.company.springauto.impl.Villanymotor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SpringautoApplication {

@Mock Kerek kerek;
@Mock Motor motor;
@InjectMocks Auto auto;

@Test
void toStringBelsoegesuMotorTest() {
    final String expected ="BelsoegesuMotor{" +
            "loero=" + 160 +
            ", ccm=" + 120 +
            "}" ;
    final int loero = 160;
    final int ccm = 120;
    Motor motor = new BelsoegesuMotor(loero,ccm);
    final String result = motor.toString();
    assertEquals(expected,result);
}
    @Test
    void toStringVillanymotorTest() {
        final String expected = "Villanymotor{teljesitmeny=160, feszultseg=120}";
        final int teljesitmeny = 160;
        final int feszultseg = 120;
        Motor motor =new Villanymotor(teljesitmeny,feszultseg);
        final String result = motor.toString();
        assertEquals(expected,result);
    }
    @Test
    void toStringKerekTest() {
        final String expected = "Kerek{15/20 R 17}";
        final int szelesseg = 15;
        final int atmero = 17;
        final int kopenyMagassag = 20;
    Kerek kerek = new com.company.springauto.impl.Kerek(szelesseg,atmero,kopenyMagassag);
        final String result = kerek.toString();
        assertEquals(expected,result);
    }
    @Test
    void MotorhívásTest() {
        final String expected = "Auto{motor=Motor [teljesitmeny=160, ccm=120], kerek=[Kerek{205/15 R 65}, Kerek{205/15 R 65}, Kerek{205/15 R 65}, Kerek{205/15 R 65}], tipus='Ford'}";
        final String Kerekret = "Kerek{"+ 205 + "/" + 65  +  "R "+ 15 + "}";
        final String Motorret = "Motor [teljesitmeny=160, ccm=120]";
        final String tipus = "Ford";
        when(motor.toString()).thenReturn(Motorret);
        Auto auto = new Auto(motor,get4kerek(),tipus);
        String result = auto.toString();
        assertEquals(expected, result);
    }
    private static Kerek[] get4kerek(){
        Kerek[] kerekek = new Kerek[4];
        for (int i = 0; i < kerekek.length; i++) {
            kerekek[i] = new com.company.springauto.impl.Kerek(205,65,15);
        }
        return kerekek;
    }
    @Test
    void isKerekekCalled() {

    }


}
