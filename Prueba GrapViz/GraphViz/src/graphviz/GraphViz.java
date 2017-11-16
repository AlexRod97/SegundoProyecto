/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphviz;
import java.io.IOException;

/**
 *
 * @author rodri
 */
public class GraphViz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
    try {
        
      Runtime rt = Runtime.getRuntime();
      
      String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";                       
      String inputPath = " C:\\dot\\pruebaDot.txt";
      String outputPath = " C:\\dot\\pruebaDot.jpg"; 
      String paramT = " -Tjpg"; 
      String paramO = " -o";      
    
      String cmd = dotPath + paramT + inputPath + paramO + outputPath; 
      
      System.out.printf(cmd); 
      
      rt.exec(cmd);   
    }
     catch(Exception ex){
            ex.printStackTrace();
        }
        
     
      
        // TODO code application logic here
    }
    
}
