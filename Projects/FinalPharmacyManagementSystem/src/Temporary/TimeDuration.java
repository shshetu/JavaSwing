/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author shshe
 */
public class TimeDuration {

    public static void main(String[] args) throws Exception {
        Date date = new java.sql.Date(System.currentTimeMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String time1 = formatter.format(date);
        System.out.println("system time: "+time1);
        String time2 = "23:50:00";

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date date1 = format.parse(time1);
        Date date2 = format.parse(time2);
        long diff = date2.getTime() - date1.getTime();
        System.out.println("difference: " + diff);
        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;
        long diffDays = diff / (24 * 60 * 60 * 1000);
        System.out.println(diffHours + " hour " + diffMinutes + " min " + diffSeconds + " sec ");

    }
}
