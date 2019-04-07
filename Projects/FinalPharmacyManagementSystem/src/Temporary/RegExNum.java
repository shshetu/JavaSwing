/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author shshe
 */
public class RegExNum {

    public static void main(String[] args) {
        String str = "33%";
        Pattern pattern1 = Pattern.compile("\\d+\\.\\d+"); //compile will work for pattern
        Pattern pattern2 = Pattern.compile("\\d+"); //compile will work for pattern
        Matcher matcher1 = pattern1.matcher(str);
        Matcher matcher2 = pattern2.matcher(str);
        if(matcher1.find()) {
            System.out.println(matcher2.group(0));
        }else if(matcher2.find()) {
            System.out.println(matcher1.group(0));
        }
    }
}
