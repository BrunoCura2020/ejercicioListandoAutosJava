
package logica;

/**
 *
 * @author Usuario
 */
public class Auto {
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String tipo_motor;
    
    public Auto(String patente, String marca, String modelo, String color, String tipo_motor) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo_motor = tipo_motor;
    }
    //GET
    public String getPatente(){
        return patente;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getTipo_motor(){
        return tipo_motor;
    }
    
    //SET
    public void setPatente(String patente){
       this.patente = patente;
    }

    public void setMarca(String marca){
       this.marca = marca;
    }
    
    public void setModelo(String modelo){
       this.modelo = modelo;
    }
    
    public void setColor(String color){
       this.color = color;
    }
    
    public void setTipo_motor(String tipo_motor){
       this.tipo_motor = tipo_motor;
    }
    
}
