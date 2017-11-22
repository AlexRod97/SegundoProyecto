/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author rodri
 */
public class FileLoader {
    
    public void writeUsingFileWriter(String data) {
File file = new File("D:\\Alex Rodríguez\\Desktop\\printfile.dot");
    		

		try (FileWriter fw = new FileWriter(file)) {
			fw.write(data);
                        
		} catch (IOException e) {
			e.printStackTrace();
		}

    }
    
    
   
    
}
