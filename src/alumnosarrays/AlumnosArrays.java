/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnosarrays;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class AlumnosArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Utils utils = new Utils();
         utils.imprime("Cuantos alumnos vamos a tener?");
         Scanner alumnosTeclado = new Scanner(System.in);
         int alumnos = alumnosTeclado.nextInt();
         utils.alumnos(alumnos);
         // utils.buscar("nuria");
    }
    
}
