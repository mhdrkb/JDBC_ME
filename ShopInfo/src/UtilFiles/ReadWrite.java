/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Java
 */
public class ReadWrite {
    public static void writeTofile(String filename, List<Catagory> catagory) throws Exception {
        File destFile = new File(filename + ".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("We had to make a new file.");
                destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Catagory c : catagory) {
                out.append(c.getC_id() + ", " +c.getName()  +"\n");
            }
            out.close();
        } catch (IOException e) {
            System.out.println("COULD NOT LOG!!");
        }
    }
    
    public static void ReadFile(String filename, DefaultTableModel model){
    String line;
    BufferedReader reader;
    try{       
        reader = new BufferedReader(new FileReader(filename+".txt"));

        while((line = reader.readLine()) != null)
        {
           model.addRow(line.split(", ")); //this has a comma and a space bc that  is how the file is written to
        }
        reader.close();
     }
    catch(IOException e){
        JOptionPane.showMessageDialog(null, "Buffered Reader issue.");
    }

}
    
}
