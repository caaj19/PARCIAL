package PRACTICA;

    
  public class artista extends persona{
       
         String distinciones;
         String curriculum;
         String precio;

    public artista(String distinciones, String curriculum, String precio, String nombre, String apellido) {
        super(nombre, apellido);
        this.distinciones = distinciones;
        this.curriculum = curriculum;
        this.precio = precio;
    }

    public String getDistinciones() {
        return distinciones;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public String getPrecio() {
        return precio;
    }

    public void setDistinciones(String distinciones) {
        this.distinciones = distinciones;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
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

              
     

       
  
            

