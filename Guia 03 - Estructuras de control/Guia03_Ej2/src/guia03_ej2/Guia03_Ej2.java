/*
2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package guia03_ej2;

import java.util.Scanner;

public class Guia03_Ej2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine().toLowerCase();
        if ("eureka".equals(frase)) {
            System.out.println("Mensaje correcto.");
        } else {
            System.out.println("Mensaje incorrecto.");
        }
    }
}
