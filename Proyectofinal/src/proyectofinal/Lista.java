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
        while(aux!=null && !aux.getDato().getNombre().equals(cod)){
            ant = aux;
            aux = aux.getSig();
        }
        return ant;
    }
//    
//    public void Insertar(Object obj){  //forma ordenada
//        Nodo aux = cab;
//        Nodo ant = null;
//        if(aux==null){
//            InsertarCab(obj);
//        }else{
//            while(aux !=null && (int)aux.getDato()<(int)obj){
//                aux = aux.getSig();
//            }
//        if(aux==null){
//            InsertarFinal(obj);
//        }else{       
//            ant = Anterior((int) aux.getDato().getCodigo());
//            if(ant == null){
//                InsertarCab(obj);
//            }else{
//                Nodo n = new Nodo(obj, aux);
//                ant.setSig(n);
//            }
//        }
//        }   
//    }
    
    public Object EliminarCab(){
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
    
    public Object EliminarFinal(){
        Nodo aux=null;
        Nodo ant=null;
        Nodo ult=Ultimo();
        
        if(ult!=null){
            aux = ult;
            ant = Anterior(ult.getDato().getNombre());      //Comparando cadenas, sin "int".
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
    
    public Object Eliminar(String cod){
        Nodo ant=null;
        Nodo aux=cab;
        
        if(!isEmpty()){
            while(aux!=null && !aux.getDato().getNombre().equals(cod)){
                aux = aux.getSig();
            }
            if(aux!=null){
                ant=Anterior(aux.getDato().getNombre());
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
    
//    public Object Buscar(int cod){
//        Nodo aux = cab;
//        
//        while(aux!=null && !aux.getDato().getNombre().equals(cod)){
//            aux = aux.getSig();
//        }
//        if(aux!=null){
//            return aux.getDato();
//        }else{
//            return null;
//        }
//    }
    
    public Object Buscar(String cod){
        Nodo aux = cab;
        
        while(aux!=null && !aux.getDato().getNombre().equals(cod)){
            aux = aux.getSig();
        }
        if(aux!=null){
            return aux.getDato();
        }else{
            return null;
        }
    }    
    
    public Proyecto BuscarPos(int pos){
        
        Nodo aux = cab;
        int cont = 1;
        
        while (aux!=null && cont < pos){
            cont ++;
            aux = aux.getSig();
        }
        return aux.getDato();
    }
    
    public int CantidadProy(String nom){
    
        int cont = 0;
        Nodo aux = cab;
        
        while(aux != null){
            if(aux.getDato().getNombre().equalsIgnoreCase(nom)){
                cont++;
            }
            aux = aux.getSig();
        }
        return cont;
    }
    
//    public double PromH(){
//        
//        int cont = 0;
//        Nodo aux = cab;
//        
//        while(aux != null){
//            cont += aux.getDato().getHoras();
//            aux = aux.getSig();
//        }
//        return cont/(double)Cantidad();
//    }
    
//    public double TotalInv(){
//        
//        double cont = 0;
//        Nodo aux = cab;
//        
//        while(aux != null){
//            cont += aux.getDato().getMonto();
//            aux = aux.getSig();
//        }
//        return cont;
//    }
    
//    public String FacInv(){
//        double cont[] = {0,0,0,0};
//        Nodo aux = cab;
//        while (aux != null){
//            switch (aux.getDato().getFacultad()) {
//                case "INGENIERIAS":
//                    cont[0] += aux.getDato().getMonto();
//                    break;
//                case "CIENCIAS SOCIALES":
//                    cont[1] += aux.getDato().getMonto();
//                    break;
//                case "CIENCIAS EMPRESARIALES":
//                    cont[2] += aux.getDato().getMonto();
//                    break;
//                case "DERECHO":
//                    cont[3] += aux.getDato().getMonto();
//                    break;
//            }
//            aux = aux.getSig();
//        }
//        double mayor = cont[0];
//        int pos = 0;
//        for (int i = 0; i <= 3; i++) {
//            if(mayor < cont[i]){
//                mayor = cont[i];
//                pos = i;
//            }
//        }
//        switch (pos) {
//            case 1:
//                return "INGENIERIAS";
//            case 2:
//                return "CIENCIAS SOCIALES";
//            case 3:
//                return "CIENCIAS EMPRESARIALES";
//            case 4:
//                return "DERECHO";
//        }
//        return null;
//    }
}
