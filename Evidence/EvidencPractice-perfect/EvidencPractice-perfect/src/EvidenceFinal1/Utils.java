/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidenceFinal1;

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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shshe
 */
public class Utils {
    
    //Write to file from table using object
    public static void WriteToFile(String fileName,List<Student> student){
    //File , PrintWriter,FileWriter
    File destFile = new File(fileName+".txt");
        try {
          if(destFile.exists() == false){
        System.out.println("We have to make a new file!");
        destFile.createNewFile();
          }
              PrintWriter out = new PrintWriter(new FileWriter(destFile,true));
              for(Student s: student){
              out.append(s.getId()+", "+s.getName()+", "+s.getAge()+", "+s.getEmail()+", "+s.getGender()+", "+
                      s.getCourses()+", "+s.getRound()+", "+s.getComments()+"\n");
              }
              out.close();
     
        } catch (Exception e) {
            e.printStackTrace();
        }
  
    }
    
    //Read the file into table
    public static void ReadFromFile(String fileName,DefaultTableModel model) throws IOException{
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName+".txt"));
            String line;
            
            while((line = reader.readLine())!= null){
         model.addRow(line.split(", "));
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
}
