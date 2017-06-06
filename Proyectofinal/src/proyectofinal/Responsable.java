
package proyectofinal;

public class Responsable {
    
    private String nombre;
    private int cedula;
    
    Responsable (String nnombre, int cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Responsable{" + "nombre=" + nombre + ", cedula=" + cedula + '}';
    }
    
    
}
