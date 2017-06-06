package proyectofinal;

public class Proyecto {
    
    private String nombre;
    private Responsable responsable;
    private Jer actores, cu;
    private Factores FT[] = new Factores[12];
    private Factores FE[] = new Factores[7]; 

    
    public Proyecto(String nombre, Responsable responsable, Jer actores, Jer cu) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.actores = actores;
        this.cu = cu;
    }

    public String getNombre() {
        return nombre;
    }

    public Responsable getResponsable() {
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

    public void setResponsable(Responsable responsable) {
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
        return "Proyecto{" + "nombre=" + nombre + ", responsable=" + responsable.toString() + '}';
    }
    
    //FttoString()... (Vector return string)
    
    public int UACP(){
    
        int UACP;
        
        UACP = PASA() + PTSA();
        
        return UACP;
    }
    
    public int PASA(){
        
        int PASA;
        
        PASA = ((actores.getSimple()*1)+(actores.getMedia()*2)+(actores.getCompleja()*3));
        
        return PASA;
    }
    
    public int PTSA(){
    
        int PTSA;
        
        PTSA = ((cu.getSimple()*5)+(cu.getMedia()*10)+(cu.getCompleja()*15));
        
        return PTSA;
    }
    
    public double TCF(){
    
        double FactorT = 0, TCF;
        
        for (int i = 0; i < 12; i++) {
            FactorT += (FT[i].getInfluencia() * FT[i].getPeso());
        }
        
        TCF = 0.6 + (0.1 * FactorT);
    
        return TCF;
    }
    
    public double EF(){
    
        double FactorA = 0, EF;
        
        for (int i = 0; i < 7; i++) {
            FactorA += (FE[i].getInfluencia() * FE[i].getPeso());
        }
        
        EF = 1.4 - (0.3 * FactorA);
        
        return EF;
    }
    
    public double UCP(){
        
        double UCP;
        
        UCP = UACP() + TCF() + EF();
        
        return UCP;
    }
}
