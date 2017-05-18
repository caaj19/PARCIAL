
package PRACTICA;

    
    public class comprador extends persona{

       double idObra;

    public comprador(double idObra, String nombre, String apellido) {
        super(nombre, apellido);
        this.idObra = idObra;
    }

    public double getIdObra() {
        return idObra;
    }

    public void setIdObra(double idObra) {
        this.idObra = idObra;
    }

    @Override
    public double valor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String mostrarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

       
            
        }

 
     
       
    

