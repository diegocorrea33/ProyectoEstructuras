
package proyectofinal;

import java.util.Scanner;


public class Proyectofinal {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        int option; //Vaariable que contiene la opcion del usuario
        
        //Variables para crear un proyecto
        
        String nombre_proyecto;
        Responsable responsable;
        Jer actores, cu; //Jer = int simple - int medio - int complejo
        Factores ft[] = new Factores[12];
        Factores fe[] = new Factores[7];
        
        
        do{
            option = Menu();
            switch (option) {
                case 1:
                    
                    System.out.println("Ingresar el nombre del proyecto:");
                    nombre_proyecto = sc.next();
                    //----------------------------------------------------------
                    
                    System.out.println("Ingresar el responsable:");
                    System.out.print("Ingresar nombre del encargado:");
                    String name = sc.next(); 
                    System.out.print("Ingresar cedula del encargado:");
                    int cedula = sc.nextInt();
                    responsable = new Responsable(name, cedula);
                    //----------------------------------------------------------
                   
                    System.out.println("Ingresar los actores:");
                    
                    System.out.println("Ingresar cantidad de actores simples");
                    int simples = sc.nextInt(); //Simples
                    System.out.println("Ingresar cantidad de actores simples");
                    int medios = sc.nextInt(); //Medios
                    System.out.println("Ingresar cantidad de actores simples");
                    int complejos = sc.nextInt(); //Complejos
                    actores = new Jer(simples, medios, complejos);
                    //----------------------------------------------------------
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5: // Factores Tecnicos.
                    
                    break;
                case 6: // Factores Entorno.
                    break;
                case 7:
                    break;
                case 8: //Salir
                    System.out.println("Salio del programa");
                    break;
            }
        }while(option != 0);            
        
    }
    
    public static int Menu(){
        
        int option;
        System.out.println("1. Crear proyecto \n2. Ver proyectos \n3. Ver factores técnicos \n4. Ver factores de entorno \n5. Editar peso e influencia factores técnicos \n6. Editar peso e influencia factores de entorno \n7. Arbol \n8. Salir");
        option = sc.nextInt();
        return option;
    }
    
}
