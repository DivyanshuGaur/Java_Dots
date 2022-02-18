/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_Demos;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;
import javax.imageio.ImageIO;




/**
 *
 * @author Asus
 */
public class Test2 {
    
    
     public static void main(String[] args) throws IOException {

             File f =  new File("img file path");
             String encodstring = encodeFileToBase64Binary(f);
             decodeBase64Binary(encodstring);
             System.out.println(encodstring);
       }

       private static String encodeFileToBase64Binary(File file){
            String encodedfile = null;
            try {
                FileInputStream fileInputStreamReader = new FileInputStream(file);
                byte[] bytes = new byte[(int)file.length()];
                fileInputStreamReader.read(bytes);
                encodedfile = new String(Base64.getEncoder().encodeToString(bytes));
                
                
                FileWriter fw = new FileWriter("C://Users/Asus/Desktop/djangob64.txt");
                BufferedWriter bfw = new BufferedWriter(fw);
                
                bfw.write(encodedfile);
                
                
                
                
                
                
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return encodedfile;
        }

    private static void decodeBase64Binary(String encodstring) throws IOException {
        
             byte[] image = Base64.getDecoder().decode(encodstring);
             
             
             BufferedImage img = ImageIO.read(new ByteArrayInputStream(image));
             
             ImageIO.write(img, "jpg", new File("path"));

    }
}
