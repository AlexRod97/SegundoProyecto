/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import static guru.nidi.graphviz.model.Factory.graph;
import static guru.nidi.graphviz.model.Factory.node;
import guru.nidi.graphviz.model.Graph;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.parse.Parser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Felipe
 */
public class GraphViz {
    String[] rutas; 
    String ruta = "example/grafo";
    String type = ".png"; 
    int cont = 0; 
    //rutas[0] = "example/ex4-1.png"; 
   
    
    	public void createDemoFromDot(String file) throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream(file);
		
                ruta = ruta + cont + type; 
                
		MutableGraph g = Parser.read(fis);
		Graphviz.fromGraph(g).width(700).render(Format.PNG).toFile(new File(ruta));
                cont++; 
                ruta = "example/grafo";
	}
        
        public void createDemoGraph() throws IOException {
		Graph g = graph("example1").directed().with(node("a").link(node("b")));
		Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("example/ex1.png"));
	}
	

    
}
