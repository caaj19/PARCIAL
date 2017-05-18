
package PRACTICA;

    
public abstract class persona implements venta{
    
     String nombre;
   String apellido;
  

    public persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
   
}

  
