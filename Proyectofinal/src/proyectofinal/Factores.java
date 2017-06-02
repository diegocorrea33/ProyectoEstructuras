
package proyectofinal;


public class Factores {
    
    private int nombre, peso, influencia, codigo, descripcion;
    
    public Factores (int nombre, int peso, int influencia, int codigo, int descripcion) {
        this.nombre = nombre;
        this.peso = peso;
        this.influencia = influencia;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setInfluencia(int influencia) {
        this.influencia = influencia;
    }

    public int getNombre() {
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

    public int getDescripcion() {
        return descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Factores{" + "nombre=" + nombre + ", peso=" + peso + ", influencia=" + influencia + ", codigo=" + codigo + ", descripcion=" + descripcion + '}';
    }   
    
}
