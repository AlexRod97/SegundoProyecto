# Proyecto 2

[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)


Uno de los conceptos más importantes al momento de utilizar estructuras dinámicas es la capacidad de diseñar representaciones gráficas de los mismos, especialmente para entender como se conforman las representaciones en memoria de los datos.

En esta oportunidad se le solicita a usted como estudiante de ingeniería en sistemas la implementación.


#### <i class="icon-pencil"></i> Funciones:

 > - Carga, Lectura y creacion de archivos en formato Graphviz.
 >- Lectura de formatos de estructuras dinamicas y almacenamientos de estas.
 >- Impresion de graficas de dichas estructuras.

El objetivo de este sistema es que no solo se emple el correcto uso de las estructuras dinamicas vistas dentro de el curso de programacion avanzada. 

>>  El programa fue realizado en lenguaje Java como una aplicacion en entorno grafico simple.



# Carga de Archivos.

>> la principal funcion y requerimiento del programa era que este debia de realizar la carga de un archivo de formato tiupo texto o notepad el cual tenia una direccion local y este debia de ser guardado como un archivo tipo **FILE** el cual luego a criterio debia ser convertido en un objeto de tipo **Stream** tipo para ser analizado posteriormente.
$~$

![enter image description here](https://lh3.googleusercontent.com/UHSDCPZ4MP9YBJ8PcsAwyFJz9W1BBKlw7ENwXPRZQ_TqyGxK0A4kqTH5Zz-3MOjcqQTdT8y3_B_P=s350 "1.PNG")

### <i class="icon-hdd"></i> Codigo.

>###  **Metodo OpenFile()** en -> Clase MainFrame

```java
 public void OpenFile(){
         
       jLabel2.setText("Open File To Start.");
         
         try{    
             
             final JFileChooser Chooser = new JFileChooser();        
             Chooser.showOpenDialog(null);          
             
             txt_File = Chooser.getSelectedFile();
       
             String FilePath = txt_File.getAbsolutePath();
             jLabel2.setText(FilePath);    
             
             // File Convertion
             Scan = new Scanner (new FileReader(txt_File));   
             jTextArea1.show(true);
         }     
         catch(IOException e){          
                e.printStackTrace();
         }
    }
```
![enter image description here](https://lh3.googleusercontent.com/jz0sgRRId6LyxEvx5ZxLELcSN98jnUxYLO6DdubT8cs4pzDNt_rL0rdkDkYcDSoqeES3faXWjUX9=s400 "2.PNG")

# Lectura de Archivos.

>### <i class="icon-pencil"></i> 
>> Luego de que el archivo de .txt ha sido cargado exitosamente dentro del programa y almacenado dentro de un objeto cuyos metodos seran de uso para la lectura posterior, procedemos a hacer el codigo el cual esta encargado de recorrer el txt por medio de un objeto de tipo **Scanner** y de leer y reconocer cada estructura y almacenarla en las diferentes estructuras segun lo que este escrito en el txt, codigo base abajo.
$~$
>

###  **Metodo ReadFile()** en -> Clase MainFrame

> ####Codigo

    

       public void ReadFile() {

        while( Scan.hasNext() ) {
            
         if (Scan.findInLine("stack") != null) {
               
                Scan.nextLine();                
               while (Scan.hasNextInt()== true)
                 {                     
                     Stack01.Push(Scan.next());  
                 }
               printStack();
               Scan.nextLine();
            }
            
            if (Scan.findInLine("queue") != null) {
                
                Scan.nextLine();
                 while (Scan.hasNextInt() == true)
                 {                     
                    Queue01.enqueue(Scan.next());  
                 } 
                 printQueue(); 
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
                 printLinkedList(); 
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
                  printDoubleLinkedList(); 
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
                  printCircularLinkedList(); 
                //  Scan.nextLine();
            }
  
        }//end of main While
    }


> ####<i class="icon-pencil"></i> **Nota**: siempre que se termine la lectura y analisis de las estructutas de datos en el txt debemos de cerrar el **Scanner** method cerrando el archivo con el metodo realizado **Close()**

## Graphviz API

> Graphviz uno de los api mas usados para la graficacion de estructuras de datos es graphviz escrito originalmente para C++ y con diversas implementaciones en diferentes lenguajes de programación incluido Java.
> 
> Se Realizo un metodo para que se cree un archivo de tipo Dot el cual es el formato de tipo de archivo el cual es usado para que la estructura sea graphicada
>
>###Codigo:

```java
 public void createDemoFromDot(String file) throws IOException {
 
		FileInputStream fis = null;

		fis = new FileInputStream(file);
		
                ruta = ruta + cont + type; 
                
		MutableGraph g = Parser.read(fis);
		
		Graphviz.fromGraph(g).height(500).width(100).render(Format.PNG).toFile(new File(ruta));
                cont++; 
                ruta = "example/grafo";
	}
```

> ####<i class="icon-pencil"></i> **Nota**: El metodo CreateDemoFromDot no es responsable de la creacion para que este sea creado por graphviz para esto creamos un metodo en clase llamado **Writer()** que 

```java
 public void writeUsingFileWriter(String data) {
 
    File file = new File("D:\\Alex Rodríguez\\Desktop\\printfile.dot");
    
    try (FileWriter fw = new FileWriter(file)) {
			fw.write(data);
                        
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
```
