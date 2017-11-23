

# Sysley

[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)


El congreso de la república de Goathemala se ha percatado que una de las mayores deficiencias
al momento de emitir los votos en el hemiciclo parlamentario es el desconocimiento de
las leyes del país. Por tal motivo, ha solicitado su apoyo como futuro ingeniero de software para el diseño y
desarrollo del sistema denominado.

#### <i class="icon-pencil"></i> Funciones:

 > - Creacion, Modificacion, Eliminacion de Parlamentos con sus respectivos asesores.
 >- Creacion, Modificacion, Eliminacion de Leyes y sus reglamentos.
 >- Prestamos y devoluciones de las leyes.

El objetivo de este sistema es que cualquier diputado y/o asesor de diputado tenga a su disposición
una biblioteca completa de leyes y reglamentos del país bajo la premisa de que mientras
mejor acceso tengan a las leyes, sus votos mejoraran.

>>  El programa fue realizado en lenguaje Java como una aplicacion en entorno grafico



# Agregacion.

>>La funcion de agregacion tanto de leyes como de usuarios se basa en la agreacion de objetos de tipo clase **Usuario** o tipo **Leyes** para las cuales se realizaron 2 clases diferentes mas la clase generica que almacenara cada objeto en una lista principal.
$~$

![Agregacion](https://lh3.googleusercontent.com/hVkX147gxc7DGyAN6LNCiAVQ2iVtxulRJ6hhG0PDSZMyeEz9OvEyGMOcfF3-OLjlEuHs7VQwha4u=s500 "2..PNG")
$~$

### <i class="icon-hdd"></i> Codigo.

>### Clase Leyes

```java
public class Leyes {
    
    public String nombreLey;
    public String reglamentoLey;
    private String id;
    private int TotalCantidadDeLeyes;

    public Leyes(String Ley, String Descripcion) { // CONSTRUCTOR
        this.nombreLey = Ley;
        this.reglamentoLey = Descripcion;
        this.TotalCantidadDeLeyes++;
    }
    
    public String getLey(){
        return this.nombreLey;
    }
    public String getDescripcion(){
        return this.reglamentoLey;
    }
     public String getID(){
        return this.id;
    }
     public int getTotalCantidadDeLeyes(){
        return this.TotalCantidadDeLeyes;
    }
    public void setLey(String Ley){
        this.nombreLey = Ley;
    }
    public void setDescripcion(String Descripcion){
        this.reglamentoLey = Descripcion;
    }
    public void setID(String id){
        this.id = id;
    }
```
```java
>### Clase Usuarios

public class Usuarios {
    private String parlamentario; 
    private String[] asesores = new String[8]; 
    private String id; 
    private int prestamos = 0;    
    
    public Usuarios(String parlamentario, String[] asesores,String id) {
        this.parlamentario = parlamentario;
        this.asesores = asesores; 
        this.id = id; 
    }

    public String getParlamentario() {
        return parlamentario;
    }

    public void setParlamentario(String parlamentario) {
        this.parlamentario = parlamentario;
    }

    public String getAsesores(int i) {
        return asesores[i];
    }

    public void setAsesores(String[] asesores) {
        this.asesores = asesores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }   
    
       public int getPrestamos() {
        return prestamos;
    }

    public boolean setPrestamos(int prestamos) {
       int prestamo = getPrestamos(); 
       
       if(prestamo > 2) {
           return false;
       }
       else {
           this.prestamos = prestamos+1;
           return true; 
       }
    }
   }
```

>##### <i class="icon-pencil"></i>  El proceso de agregacion como modificacion se basa en la creacion de un objeto de tipo usuario el cual sera creada pormedio de la  **Clase Usuario** que creara un objeto de tipo usuario o ley con sus respectivos atributos y luego estos son enviados por medio de un metodo  **Add()** que envia el objeto a la clase **Lista** de tipo generico.


```java
public void add(int i, E e) {                 
	if (size >= data.length) // not enough capacity
		throw new IllegalStateException("THE SPACE ON THE ARRAY IS FULL NOW");
	        else{
                 data[size] = e; 
                 size++;                      
                 }
     }
```
>#### <i class="icon-refresh"></i> Constructores Creadores de Usuarios y Leyes

```javascript
 public Usuarios(String parlamentario, String[] asesores, String id) {
        this.parlamentario = parlamentario;
        this.asesores = asesores; 
        this.id = id; 
    }
```
```javascript
  public Leyes(String Ley, String Descripcion) { // CONSTRUCTOR
        this.nombreLey = Ley;
        this.reglamentoLey = Descripcion;
        this.TotalCantidadDeLeyes++;
    }
  }
```


>### Clase Lista

```java
public class Lista<E> implements ListInt<E> {
	
	public static final int CAPACITY=16;
	private E[ ] data;
	private int size = 0;
	//private int contCapacidad = 0; 
        
	public Lista() {
		this(CAPACITY); //  da la capacidad del array 16
	}

	public Lista(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() { 
		return size == 0;
	}

	public E get(int i) {              
		return data[i];
	}

	public E set(int i, E e) {
		E temp = data[i];
        data[i] = null; 
		data[i] = e;
		return temp;
	}

	public void add(int i, E e) {                 
		if (size >= data.length) // not enough capacity
			throw new IllegalStateException("THE SPACE ON THE ARRAY IS FULL NOW");
                 else{
                       data[size] = e; 
                       size++;                      
                       }    
                   }
        
        public E remove( int i ) throws IndexOutOfBoundsException {
		//checkIndex(i, size);
		E temp = data[i];
                data[i] = null; 
		for (int k=i; k < size-1; k++) {                    
                   data[k] = data[k+1];
                   data[size-1] = null; 
                }			
		size--;
		return temp;
	}
       protected void checkIndex(int i, int n) throws IndexOutOfBoundsException { 
		if (i <= 0 || i >= n)
		throw new IndexOutOfBoundsException("Illegal index: " + i);
	}  
}    
```

>>Luego que los objetos son agregados a la lista generica se pueden hacer consultas para la posterior solicitud de estos mismos en las forms de modificacion como eliminacion, devolucion y prestamos de las leyes.

<p align="center">
![enter image description here](https://lh3.googleusercontent.com/hVkX147gxc7DGyAN6LNCiAVQ2iVtxulRJ6hhG0PDSZMyeEz9OvEyGMOcfF3-OLjlEuHs7VQwha4u=s350 "2..PNG")

<p align="center">
![enter image description here](https://lh3.googleusercontent.com/1kU8dyHbv2I19A3Yg3sIbSo1lZpvBNt9OcB3Z48dK1HbcsWRzSdSKN-TIyXJnSyhQNKcLLR5MXrN=s350 "1.PNG")


>> De la misma manera se realiza tanto el proceso de **modificacion** como el proceso de **eliminacion** de los usuarios y de las leyes, elegiendo una ley o usuario solicitado pormedio de la form deseada en una consulta tanto de request del usuario o ley y luego haciendo una solicitacion de modificacion o eliminacion.

### <i class="icon-hdd"></i> Codigo Implicado.


>#### <i class="icon-refresh"></i>  Evento Boton **Guardar** en forma Modificacion


```java
private void button10ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        int selectedItemIndex = -1; 
        selectedItemIndex = jComboBox3.getSelectedIndex();           
        tempLaw = (Leyes) this.lawList.get(selectedItemIndex);
        
        String reglamento;
        String nombreLey; 
        
        if (jTextArea2.getText().equals("") && textField37.getText().equals("")) {
            throw new RuntimeException("STRING IS EMPTY");
        }
        else{
        
        nombreLey = textField37.getText();
        reglamento = jTextArea2.getText();
        tempLaw.setLey(nombreLey);
        tempLaw.setDescripcion(reglamento);          
        lawList.set(selectedItemIndex,tempLaw);
 }
```


>#### <i class="icon-refresh"></i>  Modificacion de Objeto en Lista

``` java
public E set(int i, E e) {
		E temp = data[i];
        data[i] = null; 
		data[i] = e;
		return temp;
	}
 }
```

>#### <i class="icon-refresh"></i>  Eliminacion de Objeto en Lista

``` java
public E remove( int i ) throws IndexOutOfBoundsException {
		
		E temp = data[i];
                data[i] = null; 
		
		for (int k=i; k < size-1; k++) {                    
            data[k] = data[k+1];
	        data[size-1] = null; 
        }			
		size--;
		return temp;
	}
```

#Prestamos y Devoluciones 

>>La funcion de prestamos y devoluciones de leyes individuales o por lotes (ley y su reglamento) al igual que la modificacion de usuarios o leyes , se basa en la solicitud de objetos o atributos de los objetos para hacer el request de estos y ser asignados a atributos de otros objetos en este caso, paso de atributos de **Clase Ley** a **Clase Usuarios**

### <i class="icon-hdd"></i> Codigo Implicado.

```java
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        int menuUser = jComboBox6.getSelectedIndex(); 
        int specificUser = jComboBox4.getSelectedIndex(); 
        int selectedLaw = jComboBox7.getSelectedIndex(); 
        tempUser = (Usuarios) this.usersList.get(menuUser); 
        tempLaw = (Leyes) this.lawList.get(selectedLaw);         
        String prestamoUser; 
        String prestamoLaw; 
        boolean prestamoSuccess; 
        
       if (specificUser == 0) {
           prestamoUser = tempUser.getParlamentario(); 
       } 
       else {
           prestamoUser = tempUser.getAsesores(specificUser-1); 
       }
       
        //prestamo de un reglamento
        if (jRadioButton1.isSelected()) {
          prestamoLaw = tempLaw.getDescripcion(); 
          prestamoSuccess = tempLaw.prestamoReglamento(); 
            if (prestamoSuccess) {
                this.jLabel8.setText("Préstamo exitoso para < " + prestamoUser +  "> con el reglamento de la ley: " + prestamoLaw);
            }
            else {
                this.jLabel8.setText("Préstamo fallido, no hay reglamento disponible de esa ley");
            }
        }
        //prestamo de una ley
        if (jRadioButton2.isSelected()) {
          prestamoLaw = tempLaw.getLey(); 
          prestamoSuccess = tempLaw.prestamoLey(); 
           if (prestamoSuccess) {
               this.jLabel8.setText("Préstamo exitoso para < " + prestamoUser +  "> con la ley: " + prestamoLaw);
            }
            else {
                this.jLabel8.setText("Préstamo fallido, ley no disponible");
            }    
        }
        //prestamo por lote 
        if ( jRadioButton3.isSelected())  {
          prestamoLaw = tempLaw.getLey(); 
          prestamoSuccess = tempLaw.prestamoLote(); 
           if (prestamoSuccess) {
               this.jLabel8.setText("Préstamo exitoso para < " + prestamoUser +  "> con lote de ley : " + prestamoLaw);
            }
            else {
                this.jLabel8.setText("Préstamo fallido, ley no disponible");
            }             
        }   
    }
```

>>##### <i class="icon-pencil"></i>  El atributo a pedir, ya sea ley, reglamento o el lote entero, depende solamente de el radio button seleccionado dentro de la forma de prestamos  .

>![enter image description here](https://lh3.googleusercontent.com/zZ2LHPF-F3oa6WxStjdacpejgi0ODx843YxXV83kWPsavWblS81wOW7Auv_Sm-fDtkYqLhPjWuBd=s350 "8.PNG")

![enter image description here](https://lh3.googleusercontent.com/us3MgLuGtQwAZnDaEBu6vUIXXbGbtXSsAgBciftJG8x-eHYC2de5BC4YCRItBOCHp31NXB_tFL5r=s350 "10.PNG")








