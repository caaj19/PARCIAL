
package PRACTICA;

/**
 *
 * @author Estudiante
 */
public  class objeto  implements venta{
    
  
    double idObjeto;
    double valor;
    String nombre;

    public objeto(double idObjeto, double valor, String nombre) {
        this.idObjeto = idObjeto;
        this.valor = valor;
        this.nombre = nombre;
    }

    public double getIdObjeto() {
        return idObjeto;
    }

    public double getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdObjeto(double idObjeto) {
        this.idObjeto = idObjeto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Override
    public double valor() {
        return valor; 
    }

    @Override
    public String mostrarInformacion() {
        return "objeto"  + this.nombre + " " + this.idObjeto; 
    }
    
   
    }


    
    

