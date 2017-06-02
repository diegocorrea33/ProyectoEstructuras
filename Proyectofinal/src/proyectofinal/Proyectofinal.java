
package proyectofinal;

import java.util.Scanner;


public class Proyectofinal {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        int op;
        
        do{
            op = Menu();
            switch (op) {
                case 1:
                    break;
            }
        }while(op != 0);
        
    }
    
    public static int Menu(){
    
        int op;
        System.out.println("");
        op = sc.nextInt();
        return op;
    }
    
}
