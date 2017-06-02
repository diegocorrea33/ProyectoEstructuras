package proyectofinal;

public class Lista {
    private Nodo cab;
    
    Lista(){
        cab=null;
    }
    
    public boolean isEmpty(){
        return cab == null;
    }
    
    public void InsertarCab(Proyecto obj){
        if(isEmpty()){
            cab = new Nodo(obj);
        }else{
            cab = new Nodo(obj, cab);
        }
    }
    
    public void InsertarFinal(Proyecto obj){
        Nodo ult;
        if(isEmpty()){
            InsertarCab(obj);
        }else{
            ult = Ultimo();
            ult.setSig(new Nodo(obj));
        }
        
    }
    
    public Nodo Ultimo(){
        Nodo aux = cab;
        Nodo ult = null;
        while(aux != null){
            ult = aux;
            aux = aux.getSig();
        }
        return ult;
    }
    
    public String toString(){
        String r="";
        Nodo aux = cab;
        while(aux != null){
            r = r+aux.getDato() + " ";
            aux = aux.getSig();
        }
            return r;
    }
    
    public Nodo Anterior(String cod){
        
        Nodo ant = null;
        Nodo aux = cab;
        while(aux!=null && !aux.getDato().getCodigo().equals(cod)){
            ant = aux;
            aux = aux.getSig();
        }
        return ant;
    }
    
    
    public Proyecto EliminarCab(){
        Nodo aux=null;
        
        
        if(!isEmpty()){
            aux = cab;
            cab = cab.getSig();
        }
        if(aux == null){
            return null;
        }else{
            return aux.getDato();
        }
    }
    
    public Proyecto EliminarFinal(){
        Nodo aux=null;
        Nodo ant=null;
        Nodo ult=Ultimo();
        
        if(ult!=null){
            aux = ult;
            ant = Anterior(ult.getDato().getCodigo());
            if(ant==null){
                EliminarCab();
            }else{
                ant.setSig(null);
                ult = null;
            }
        }
        if(aux==null){
            return null;
        }else{
            return aux.getDato();
        }
    }
    
    public Proyecto Eliminar(int cod){
        Nodo ant=null;
        Nodo aux=cab;
        
        if(!isEmpty()){
            while(aux!=null && !aux.getDato().getCodigo().equals(cod)){
                aux = aux.getSig();
            }
            if(aux!=null){
                ant=Anterior(aux.getDato().getCodigo());
                if(ant==null)
                    EliminarCab();
                else{
                    ant.setSig(aux.getSig());
                }
            }
        }
        if(aux!=null)
            return aux.getDato();
        else
            return null;
    }
    
    public int Cantidad(){
        Nodo aux = cab;
        int cant = 0;
        
        while(aux !=null){
            cant++;
            aux = aux.getSig();
        }
        return cant;
    }
    
    public Proyecto Buscar(int cod){
        Nodo aux = cab;
        
        while(aux!=null && !aux.getDato().getCodigo().equals(cod)){
            aux = aux.getSig();
        }
        if(aux!=null){
            return aux.getDato();
        }else{
            return null;
        }
    }
    
    public Proyecto BuscarPos(int pos) {
        Nodo aux =cab;
        int cont =1;
        while(aux!=null && cont < pos) {
            cont ++;
            aux = aux.getSig();
        }
        return (Proyecto) aux.getDato();
    }
    
    public int Cantidadproy(String nombre) {
        int cont=0;
        Nodo aux=cab;
        
        while(aux!=cab) {
            if(aux.getDato().getResponsable().equalsIgnoreCase(nombre));
            cont ++;
            aux=aux.getSig();
                
            
        } return cont;
    }
    
    public double PromedioHoras() {
        int cont =0;
         Nodo aux=cab;
         while (aux!=null) {
             cont+= aux.getDato().
             aux=aux.getSig();
         }
         return cont/(double)Cantidad();
    }
    
    public double Totalinvertido(){
        
        double cont =0;
        
        Nodo aux = cab;
        
        while(aux!=null) {
            
            cont += aux.getDato().getMonto();
            
            aux=aux.getSig();
        }
        return cont;
    }
    
    

}
