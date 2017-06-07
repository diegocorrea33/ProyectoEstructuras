
package proyectofinal;


public class Factores {
    
    private double peso;
    private int influencia, codigo;
    private String nombre;
    
    public Factores (String nombre, double peso, int influencia, int codigo) {
        this.nombre = nombre;
        this.peso = peso;
        this.influencia = influencia;
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setInfluencia(int influencia) {
        this.influencia = influencia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getInfluencia() {
        return influencia;
    }

    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    @Override
    public String toString() {
        return "Factores{" + "nombre=" + nombre + ", peso=" + peso + ", influencia=" + influencia + ", codigo=" + codigo + '}';
    }   
    
}
