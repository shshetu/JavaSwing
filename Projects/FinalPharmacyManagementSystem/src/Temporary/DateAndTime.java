/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary;


import java.sql.Date;
import java.text.SimpleDateFormat;



/**
 *
 * @author shshe
 */
public class DateAndTime {

    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis()); // this object contains the current date value  
        System.out.println(date);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String time = formatter.format(date);
        System.out.println(time);
    }
}
