package proyectofinal;

import java.io.*;
import java.util.Scanner;

public class archivo {
    
//archivos con los datos de la lista
    
    public void Crearar(Lista L) {
        
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        Proyecto proy = null;
        
        try {
            fw =new FileWriter("C:\\Users\\practicas\\Documents\\proyectos.Txt");
            bw = new BufferedWriter(fw);
            
        for (int i=1; i<L.Cantidad(); i++) {
            
            proy = L.BuscarPos(i);
            
            bw.write(proy.getNombre() + "\t" 
                   + proy.getResponsable()+ "\t" 
                   + proy.getActores()+ "\t"
                   + proy.getCu()+ "\t"
                   + proy.getFT()+ "\t" 
                   + proy.getFE()+ "\t");
            
            
            
        }
        bw.close();;
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public Lista leerarch () {
        Lista L = new Lista();
        
        String nombre, responsable,acto;
        Jer actores = null, cu = null;
        Factores FT, FE;
        int actor[] = new int[3];
        int cus[] = new int[3];
        
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            file = new File("C:\\Users\\practicas\\Documents\\proyectos.Txt");
            fr= new FileReader(file);
            br = new BufferedReader(fr);
            String linea;
            String carac[];
            while ((linea = br.readLine()) != null) {
            carac =linea.split("\t");
                    nombre=carac[0];
                    responsable=carac[1];
                    actor[0]= Integer.parseInt(carac[2]);
                    cus[1]=Integer.parseInt(carac[3]);
                    
                    L.InsertarFinal(new Proyecto(nombre, responsable, actores , cu));
            
        } br.close();
         
        } catch (IOException e) {
            e.printStackTrace();
        }
        
      return L;  
    }
    
        public void Escribirarch (Lista L ) throws IOException {
            
            Factores fts;
            Proyecto proy=null;
            
            for (int h=1 ; h<L.Cantidad(); h++) {
                
                proy = L.Buscar(h);
                
                
            
            }
        
        
        
        
        }
        
        public void Creararchivo (String s) {
            
            File archivo = new File ("C:\\Users\\practicas\\Documents\\proyectos.Txt");
            
            try {
                if(archivo.createNewFile()) {
                    System.out.println("El archivo se ha creado");
                }
                else {
                    System.out.println("No se ha podido crear el archivo");
                }
                    
                
            } catch (IOException e) {
                e.printStackTrace();
                }  
            
            }
        
       
        } 
    
