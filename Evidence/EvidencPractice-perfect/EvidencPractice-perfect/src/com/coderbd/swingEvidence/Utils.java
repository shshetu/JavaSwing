
package com.coderbd.swingEvidence;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Utils {
    public static void writeToFile(String filename, List<Student> student){
    
    File destFile = new File(filename + ".txt");
        try {
            if( destFile.exists()== false){
        System.out.println("We had to make a new file");
        destFile.createNewFile();
    }
    
        PrintWriter out= new PrintWriter(new FileWriter(destFile, true));
        for(Student s: student){
        out.append(s.getId()+", "+s.getName()+", "+s.getAge()+", "+s.getEmail()+", "+s.getGender()+
                    ", "+s.getCourse()+", "+s.getRound()+", "+s.getComment()+"\n");
        }
        out.close();
        } catch (Exception e) {
            System.out.println("Could not log!");
        }

        } 
    
    public static void displayStudentDataFromFile(String filename, DefaultTableModel model){
       String line;
       BufferedReader reader;
        try {
           reader = new BufferedReader(new FileReader(filename+".txt"));
           while((line= reader.readLine()) != null){
           model.addRow(line.split(", "));
           }
           reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Buffered Reader issue.");
            
        }
        
        
    }
    
    
    
}
