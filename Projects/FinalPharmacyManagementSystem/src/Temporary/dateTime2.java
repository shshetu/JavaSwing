/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author shshe
 */
public class dateTime2 {

    public static void main(String[] args) {

        Date date = new Date(System.currentTimeMillis());
        String[] d = String.valueOf(date).split("-");
        System.out.println(date);
        int y = Integer.parseInt(d[0]);
        int m = Integer.parseInt(d[1]);
        int d1 = Integer.parseInt(d[2]);
        LocalDate pD = LocalDate.of(y, m, d1);
        LocalDate eD = LocalDate.of(2020, 02, 06);
        Period diff = Period.between(pD, eD);
        System.out.println(diff.getYears() + " year " + diff.getMonths() + " months " + diff.getDays() + " days ");

    }
}
