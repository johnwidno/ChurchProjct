/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestiondeformulairecarte;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JPanel;


/**
 *
 * @author Dorcy
 */
public class ImprimaerUneCarte {
    
  
    
    
PrinterJob job = PrinterJob.getPrinterJob();
     
public void printComponenet( JPanel panel){

 PrinterJob pj = PrinterJob.getPrinterJob();
 pj.setJobName(" Imprimer ");

 pj.setPrintable (new Printable() {    
  public int print(Graphics pg, PageFormat pf, int pageNum){
   if (pageNum > 0){
   return Printable.NO_SUCH_PAGE;
   }

   Graphics2D g2 = (Graphics2D) pg;
   g2.translate(pf.getImageableX(), pf.getImageableY());
   panel.paint(g2);
   return Printable.PAGE_EXISTS;
  }
 });
 if (pj.printDialog() == false)
 return;

 try {
    pj.print();
 } catch (PrinterException ex) {
    // handle exception
 }
}
    
    
    
}
