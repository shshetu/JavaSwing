/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author shshe
 */
public class dateTime {
    public static void main(String[] args) {
        LocalDate pD = LocalDate.of(2017, 02, 28);
        LocalDate eD = LocalDate.of(2019, 02, 23);
        Period diff = Period.between(pD, eD);
        System.out.println(diff.getYears()+" year "+diff.getMonths()+" months "+diff.getDays()+" days ");
    }
}
