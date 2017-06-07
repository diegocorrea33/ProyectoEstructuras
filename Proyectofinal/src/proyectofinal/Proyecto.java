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
    
    public void ConfigFT(){
        
        archivo arc = new archivo();
        
        FT[0].setNombre("Sistema Distribuido");
        FT[1].setNombre("Objetivos de rendimiento");
        FT[2].setNombre("Eficiencia respecto al usuario final");
        FT[3].setNombre("Procesamiento compllejo");
        FT[4].setNombre("Codigo reutilizable");
        FT[5].setNombre("Instalacion sencilla");
        FT[6].setNombre("Facil utilizacion");
        FT[7].setNombre("Portabilidad");
        FT[8].setNombre("Facil de cambiar");
        FT[9].setNombre("Uso concurrente");
        FT[10].setNombre("Caracteristicas de seguridad");
        FT[11].setNombre("Accesible por terceros");
        FT[12].setNombre("Se requiere formacion especial");
        FT[0].setPeso(2);
        FT[1].setPeso(1);
        FT[2].setPeso(1);
        FT[3].setPeso(1);
        FT[4].setPeso(1);
        FT[5].setPeso(0.5);
        FT[6].setPeso(0.5);
        FT[7].setPeso(2);
        FT[8].setPeso(1);
        FT[9].setPeso(1);
        FT[10].setPeso(1);
        FT[11].setPeso(1);
        FT[12].setPeso(1);
        arc.CrearConfig(FT);
             
    }
    
    public void ConfigFE(){
        
        archivo arc = new archivo();

        
        FE[0].setNombre("Familiar con RUP");
        FE[1].setNombre("Experiencia en la aplicacion");
        FE[2].setNombre("Experiencia con orientacion a objetos");
        FE[3].setNombre("Capacidades de analisis");
        FE[4].setNombre("Motivacion");
        FE[5].setNombre("Requisitos estables");
        FE[6].setNombre("Trabajadores a tiempo parcial");
        FE[7].setNombre("Lenguaje complejo");
        FE[0].setPeso(1.5);
        FE[1].setPeso(0.5);
        FE[2].setPeso(1);
        FE[3].setPeso(0.5);
        FE[4].setPeso(1);
        FE[5].setPeso(2);
        FE[6].setPeso(-1);
        FE[7].setPeso(-1);
        arc.CrearConfig(FE);
        
    }
}
