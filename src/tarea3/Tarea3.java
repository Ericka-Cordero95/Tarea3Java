/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea3;

import java.util.Scanner;

/**
 *
 * @author Ericka2
 */
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
          menu();
        
    }
    public static void menu(){
        Ejercicios tarea = new Ejercicios();
        Scanner input = new Scanner(System.in);
         while(true){
            System.out.println("Menú Principal");
            System.out.println("1. Sets.");
            System.out.println("2. Votaciones.");
            System.out.println("3. Salir.");
            
            System.out.println("Ingrese una opción: ");
            int opcion = input.nextInt();
            
             switch(opcion){
                case 1 -> tarea.Sets();
                case 2 -> tarea.Votaciones();
                case 3 -> {
                    System.out.println("Salir");
                    return;
                }
                default -> System.out.println("Opcion invalida.");
            }
         }
    }
}

    

