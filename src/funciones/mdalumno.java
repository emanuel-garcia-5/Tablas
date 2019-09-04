
package funciones;


public class mdalumno {

  
    public String getCorreo() {
        return correo;
    }

    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

  
    public String getId() {
        return id;
    }

   
    public void setId(String id) {
        this.id = id;
    }

    
    public String getCarne() {
        return carne;
    }

    /**
     * @param carne the carne to set
     */
    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public int getModa() {
        return moda;
    }

   
    public void setModa(int moda) {
        this.moda = moda;
    }

   
    public double getMediana() {
        return mediana;
    }

    
    public void setMediana(double mediana) {
        this.mediana = mediana;
    }

    
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    
    public double getRango() {
        return rango;
    }

    public void setRango(double rango) {
        this.rango = rango;
    }

    
    public double getDesviacion() {
        return desviacion;
    }

    
    public void setDesviacion(double desviacion) {
        this.desviacion = desviacion;
    }
   private String nombre;
   private int moda;
   private double mediana;
   private double media;
   private double rango;
   private double desviacion;
   private String correo;
   private String id;
   private String carne;
}
