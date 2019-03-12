/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidencePrac2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shshe
 */
public class FileReadWrite {
   //write method
    public static void writeTOFileFromTable(String fileName,List<Student> student){
        //declare the file
        File file = new File(fileName+".txt");
        try {
            if(file.exists() == false){
                System.out.println("We have to make a new File");
                file.createNewFile();
                
                //PrintWriter
                PrintWriter out = new PrintWriter(new FileWriter(file,true));
                
                //Using for each loop to add to the file
                for(Student s:student){
                out.append(s.getId()+", "+s.getName()+", "+s.getAge()+", "+s.getEmail()+", "+s.getGender()+", "
                +s.getCourse()+", "+s.getRound()+", "+s.getComment());
                }
                out.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    //Read method
    public static void readFromFileIntoTable(String fileName,DefaultTableModel model){
       String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName+".txt"));
           while((line = reader.readLine()) != null){
            model.addRow(line.split(", "));
            }
            reader.close();
        } catch (Exception e) {
        e.getMessage();
        }
    }

    
}
