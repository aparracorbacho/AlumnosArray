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
public class Utils {
    int alumnos = CAlumnos();
    int []notas = new int[alumnos];
    String []nomes = new String[alumnos];
    int aux;
    String aux1;
    
    public void imprime(String texto){
        System.out.println(texto);
    }
    public void imprime(int texto){
        System.out.println(texto);
    }
    public int CAlumnos(int alumnos){
        return alumnos;
    }
    
    public void alumnos(){
                
        for (int i=0;i<alumnos;i++){
             imprime("Introduce el nombre del alumno");
             Scanner NomAlumnosTeclado = new Scanner(System.in);
             String NomAlumnos = NomAlumnosTeclado.next();
             nomes[i] = NomAlumnos;
             
             imprime("Introudce la nota del alumno");
             Scanner NotAlumnosTeclado = new Scanner(System.in);
             int NotAlumnos = NotAlumnosTeclado.nextInt();
             notas[i] = NotAlumnos;
             
         
        }
    }
    public void ordenar(){
        for (int x=0;x<alumnos-1;x++){
          for (int j=x+1;j<alumnos;j++){
              if (notas[x]>notas[j]){
               aux=notas[x];
               notas[x]=notas[j];
               notas[j]=aux;
               
               aux1=nomes[x];
               nomes[x]=nomes[j];
               nomes[j]=aux1;
              }
               
          }
        }
        imprime("Estos son los alumnos ordenados por notas");
         for (int w=0;w<alumnos;w++){
             imprime(nomes[w]);
             imprime(notas[w]);
             
         }
    }          
    
 /**   public void buscar(String NombreAlumno){
        for (int y=0;y<alumnos;y++){
            if (nomes[y].equalsIgnoreCase(NombreAlumno)==true){
                imprime (nomes[y]);
                imprime (notas[y]);
            }
        }
        
    }   */
        
        
     
            
    }
  
    



