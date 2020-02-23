/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monoalphabeticcipher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author LENOVO
 */
public class FileOperations {
   String fileName = "C:\\Users\\LENOVO\\Desktop\\plaintext.txt";
     String fileName2="C:\\Users\\LENOVO\\Desktop\\ciphertext.txt";
    File file = new File(fileName);
    File f = new File(fileName2);
    public String dosyaOku() throws FileNotFoundException, IOException {

        FileReader frr = new FileReader(file);
        BufferedReader br = new BufferedReader(frr);
        String line;
       line=br.readLine();
       br.close();
     return line;
    }
    
   public void dosyayaYaz(String s) throws IOException{
        String str = s;
        FileWriter fileWriter = new FileWriter(f, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(str);
        bWriter.close();
}

}
