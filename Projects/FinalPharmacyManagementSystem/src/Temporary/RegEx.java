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
public class RegEx {
    public static void main(String[] args) {
        String mydate = "some string with 'the data i want' inside";
        Pattern pattern = Pattern.compile("'(.*?)'"); //matches only one time since there is ? after greedy quantifier
        Matcher matcher = pattern.matcher(mydate);
        while(matcher.find()){
            System.out.println(matcher.group(1));
        
        }
    }
}
