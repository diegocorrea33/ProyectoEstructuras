package proyectofinal;

public class Proyecto {
    
    private String nombre, responsable;
    private Jer actores, cu;
    private Factores FT[] = new Factores[12];
    private Factores FE[] = new Factores[7]; 
    
    public Proyecto(String nombre, String responsable, Jer actores, Jer cu) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.actores = actores;
        this.cu = cu;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public Jer getActores() {
        return actores;
    }

    public Jer getCu() {
        return cu;
    }

    public Factores[] getFT() {
        return FT;
    }

    public Factores[] getFE() {
        return FE;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public void setActores(Jer actores) {
        this.actores = actores;
    }

    public void setCu(Jer cu) {
        this.cu = cu;
    }

    public void setFT(Factores[] FT) {
        this.FT = FT;
    }

    public void setFE(Factores[] FE) {
        this.FE = FE;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", responsable=" + responsable + '}';
    }
    
    //FttoString()... (Vector return string)
    
}
