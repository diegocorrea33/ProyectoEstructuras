package proyectofinal;

public class Nodo {
    private Proyecto dato;
    private Nodo sig;

    public Nodo(Proyecto dato) {
        this.dato = dato;
    }

    public Nodo(Proyecto dato, Nodo sig) {
        this.dato = dato;
        this.sig = sig;
    }

    public Proyecto getDato() {
        return dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setDato(Proyecto dato) {
        this.dato = dato;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
}
