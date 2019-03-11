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
 * @author shshe
 */
public class Utils {
    
    //creating the writeToFile() method
    public static void writeToFile(String filename,List<Student> student){
        //File desitnation = where to save the file
        File destFile = new File(filename+".txt");
        try {
            if(destFile.exists() == false){
                System.out.println("We had to make a new file!");
                destFile.createNewFile();
                
                //using printwriter 
                PrintWriter out = new PrintWriter(new FileWriter(destFile,true));
               //Writing Student type data using for each loop
                for(Student s:student){
                out.append(s.getId()+", "+s.getName()+", "+s.getAge()+", "+s.getEmail()+", "+s.getGender()+", "+s.getCourse()+", "+s.getRound()+", "+s.getComments()+"\n");
                }
                out.close();
            }
        } catch (Exception e) {
        e.getMessage();
        }
    }
        
        //Display Student Data from file
        public static void displayStudentDataFromFile(String filename,DefaultTableModel model){
        String line;
        BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(filename+".txt"));
                while((line = reader.readLine()) != null){
                model.addRow(line.split(", "));
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Buffered Reader issue.");
            }
        }
 }   

