/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestiondeformulairecarte;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;


/**
 *
 * @author Dorcy
 */
public class Selectimage {
        
     private JLabel imageselectioner;
     private Icon IconeImage;
     private Icon logoIcone;
    byte []userimage=null;
   
    
      public Selectimage(){}
    
    public Selectimage( JLabel Imageuploadselection ){
        
        
        JFileChooser pic = new JFileChooser();
        pic.showOpenDialog(null);

        File picture = pic.getSelectedFile();

        String path = picture.getAbsolutePath();
        BufferedImage img;
        try {
            img = ImageIO.read(pic.getSelectedFile());
            ImageIcon imageic = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT));
            Imageuploadselection.setIcon(imageic);
             this.IconeImage = imageic;
            File image = new File(path);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];

            for (int i; (i = fis.read(buff)) != -1;) {
                bos.write(buff, 0, i);
            }

           userimage = bos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }

    public Icon getIconeImage() {
        return IconeImage;
    }

    
    
   
   
    
    
}
