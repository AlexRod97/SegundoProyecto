/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Classes.ArrayList;
import Classes.Generic_Stack;
import Classes.Generic_Queue;

import java.io.*;
import java.util.LinkedList;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import Classes.FileLoader;
import Classes.Generic_CircularLinkedList;
import Classes.Generic_DoubleLinkedList;
import Classes.Generic_LinkedList;
import javax.swing.JFileChooser;
import Classes.GraphViz;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Felipe
 */
public class MainFrame extends javax.swing.JFrame {

    
      private File txt_File;
      private Scanner Scan;
      String PatternStack = "STACK";
      String PatternQueue = "QUEUE";
      Generic_Stack Stack01 = new Generic_Stack();    //generates new stack generic                          
      Generic_Queue Queue01 = new Generic_Queue();  //generates new queue generic                
      Generic_LinkedList linkedList01 = new Generic_LinkedList(); 
      Generic_DoubleLinkedList doubleLinkedList01 = new Generic_DoubleLinkedList(); 
      Generic_CircularLinkedList circularLinkedList01 = new Generic_CircularLinkedList(); 
      
      String fileHeader = "digraph G{\n"; 
      String dotDirectioner = "->"; 
      String fileFooter = "}"; 
      String data = ""; 
      GraphViz graph = new GraphViz();
      
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);   // this centers my window to the center of the screen
        
        jButton1.show(false);
        jTextArea1.show(false);
        jTextArea1.enable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("File Path: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton1.setText("Analize");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jMenu1.setText("File");

        jMenuItem1.setText("Open File");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here: 
       OpenFile();   
       ReadFile();
       CloseFile();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FileLoader fl = new FileLoader(); 
        int cont = 0;         
        String temp = "";
        String temp2 = ""; 
        String ruta = "D:\\Alex Rodríguez\\Desktop\\printfile.dot";
        String header = ""; 
        String trailer = ""; 
        
        header = (String) circularLinkedList01.first(); 
        trailer = (String) circularLinkedList01.last(); 
      while(!circularLinkedList01.isEmpty()) {
            
        temp = (String) circularLinkedList01.first(); 
        circularLinkedList01.removeFirst();
        temp2 = (String)  circularLinkedList01.first(); 
        
        if (temp != null && temp2!= null)
        {
            data += "\r\n" + temp + dotDirectioner + temp2;
            data += "\r\n" + temp2 + dotDirectioner + temp;
        }
        
        }        
        data+= "\r\n" + trailer + dotDirectioner+ header; 
        data+= "\r\n" + header + dotDirectioner+ trailer;
        
        fl.writeUsingFileWriter(fileHeader + "\r\n" + data +"\r\n" + fileFooter);      
          try {
              graph.createDemoFromDot(ruta);
              
          } catch (IOException ex) {
              Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
          }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void OpenFile(){
         
       jLabel2.setText("");
         try{    
             
             final JFileChooser Chooser = new JFileChooser();        // I create a new filechooser object type wich allows me to open dialog
             Chooser.showOpenDialog(null);           // opens dialog to search my file with a window browser 
             
             txt_File = Chooser.getSelectedFile();
       
             String FilePath = txt_File.getAbsolutePath();
             jLabel2.setText(FilePath);     // takes the canonical and absolute path and shows it to user.
             
             // converti el file 
             Scan = new Scanner (new FileReader(txt_File)); 
            
             jButton1.show(true);
             jTextArea1.show(true);
         }     
         catch(IOException e){          
                e.printStackTrace();
         }
    }
    
    public void ReadFile() {

        while( Scan.hasNext() ) {
            
         if (Scan.findInLine("stack") != null) {
               
                Scan.nextLine();                
               while (Scan.hasNextInt()== true)
                 {                     
                     Stack01.Push(Scan.next());  
                 }
               Scan.nextLine();
            }
            
            if (Scan.findInLine("queue") != null) {
                
                Scan.nextLine();
                 while (Scan.hasNextInt() == true)
                 {                     
                    Queue01.enqueue(Scan.next());  
                 } 
                 Scan.nextLine();
            }
            
               if (Scan.findInLine("linkedlist") != null) {
                
                Scan.nextLine();
                  int cont = 0; 
                  
                 while (Scan.hasNextInt() == true)
                 { 
                     if(cont == 0)
                    {
                       linkedList01.addFirst(Scan.next());
                       cont++; 
                    }
                    else 
                    {
                        linkedList01.addLast(Scan.next());  
                    }
                 } 
                 Scan.nextLine();
            }
            
            if (Scan.findInLine("doublelinkedlist") != null) {
                Scan.nextLine();  
                int cont = 0; 
                
                  while (Scan.hasNextInt() != false)
                 {                     
                    if(cont == 0)
                    {
                       doubleLinkedList01.addFirst(Scan.next());
                       cont++; 
                    }
                    else 
                    {
                        doubleLinkedList01.addLast(Scan.next());  
                    }
                 }  
                  Scan.nextLine();
            }
            if (Scan.findInLine("circularlinkedlist") != null) {
                Scan.nextLine();  
                int cont = 0; 
                
                  while (Scan.hasNextInt() != false)
                 {                     
                    if(cont == 0)
                    {
                       circularLinkedList01.addFirst(Scan.next());
                       cont++; 
                    }
                    else 
                    {
                        circularLinkedList01.addLast(Scan.next());  
                    }
                 } 
                //  Scan.nextLine();
            }
            
            
          
        }//end of main While
    } // end of ReadFile()
    
    
    public void PrintStructures(){
        
    }
    
     public void CloseFile(){
         Scan.close();
     }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
