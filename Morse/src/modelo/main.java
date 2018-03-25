
 
package modelo;

import java.awt.BorderLayout;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String convercion = "";
        char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String[] alfabetoMorse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...",
                                   "-","..-","...-",".--","-..-","-.--","--.."};
        int op = 1;
        do{
            System.out.println("¿En que desea escribir su expresion?\n1)Texto\n2)Morse\n3)Salir");
            op = sc1.nextInt();
            
            switch(op){
                case 1:
                    limpiar(2);
                    System.out.println("Escriba la cadena que desea transformar a morse: ");
                    String cadena = sc2.nextLine().toLowerCase();
                    for (int i = 0; i < cadena.length(); i++) {
                        for (int j = 0; j < alfabeto.length; j++) {
                            if (cadena.charAt(i) == alfabeto[j]) {
                            convercion += alfabetoMorse[j]+" ";
                           }
                        }
                    }
        
                    System.out.println("///////////Su cadena en morse/////////////\n"+convercion+"\n///////////////////////");
                break;
                case 2: 
                    limpiar(2);
                    System.out.println("Escriba la cadena que desea transformar a texto: ");
                    System.out.println("por favor separe cada palabra con un #");
                    String cadena2 = sc2.nextLine();
                    String[] codigo = cadena2.split(" ");
                    
                    for (int i = 0; i < codigo.length; i++) {
                        if (codigo[i].equals("#")) {
                                convercion += " ";
                        }else{
                            for (int j = 0; j < alfabetoMorse.length; j++) {
                                if (codigo[i].equals(alfabetoMorse[j])) {
                                    convercion += alfabeto[j];
                                }
                            }
                        }
                    }
                    System.out.println("///////////Su cadena en morse/////////////\n"+convercion+"\n///////////////////////");
                break;
                case 3: 
                    System.out.println("Vuelva pronto");
                break;                
                default:
                    System.out.println("Opcion erronea");
            }
            limpiar(2);
            convercion = "";
        }while(op != 3);
            
       
        
         

    }
    
    public static void limpiar(int lineas){
        for (int i=0; i < lineas; i++){
            System.out.println();
        }
    }
}
