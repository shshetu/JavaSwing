/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.MyEvidencePractice.FirstTime;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Must {
    //two methods should be made
    
    ///write method to write
    public static void writeToFile(String fileName,List<Student> student){
        //declare the file name
        File destFile = new File(fileName+".txt");
        //create the file 
        try {
            if(destFile.exists() == false){
                System.out.println("We have to make new file!");
                destFile.createNewFile();
            }
            //Printwriter to write into the file
            PrintWriter out = new PrintWriter(new FileWriter(destFile,true));
            for(Student s:student){
                out.append(s.getId()+", "+s.getName()+", "+s.getAge()+", "+s.getEmail()+", "+s.getGender()+
                    ", "+s.getCourse()+", "+s.getRound()+", "+s.getComments()+"\n");
            }
        out.close();
        } catch (Exception e) {
            System.out.println("Could not log!"); 
        }
    }
/////Read method
    ///two parameter 1.from where to read 2. where to show
    public static void readFromFile(String  fileName, DefaultTableModel model){
    String line;
    //must to use BuffereedReader(), and FileReader()
    //And add to the table using the object of the table
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(fileName+".txt"));
            while((line = reader.readLine()) != null){
            model.addRow(line.split(", "));
            }
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buffered Reader issue.");
        }
    }

}

