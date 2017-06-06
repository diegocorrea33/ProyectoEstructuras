
package proyectofinal;


public class Factores {
    
    private int peso, influencia, codigo;
    private String nombre;
    
    public Factores (String nombre, int peso, int influencia, int codigo) {
        this.nombre = nombre;
        this.peso = peso;
        this.influencia = influencia;
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setInfluencia(int influencia) {
        this.influencia = influencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
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
