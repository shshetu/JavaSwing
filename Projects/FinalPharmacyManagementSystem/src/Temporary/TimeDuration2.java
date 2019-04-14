/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author shshe
 */
public class TimeDuration2 {

    public static void main(String[] args) {
        String time1 = "12:00:00";
        String time2 = "13:00:00";
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        Date date1 = Date.valueOf(time1.toString());
        System.out.println(date1);
        Date date2 = Date.valueOf(time2.toString());
        System.out.println(date2);
//        long diff = date2.getTime() - date1.getTime();
      

    }
}
