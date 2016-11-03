/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Martin
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0;
       while(true){
           a++;
           System.out.println(a);
       }
    }
        
    
    
    public static int Ejercicio1DivideyVenceras(int[] ints, int desde, int hasta)
    {
        if(desde==hasta)
        {
            if(ints[desde]%7 ==0)
            {
             return  ints[desde];
            }
            else 
            {
                return 0;
            }
        }
        else
        {
            int medio = (desde+hasta)/2;
            return Ejercicio1DivideyVenceras(ints,desde,medio)+Ejercicio1DivideyVenceras(ints,medio+1,hasta);
        }
    }
    public static int Ejercicio2DyV(int[]ints ,int izq,int drc ,int numero)
    {
        if(izq == drc)
        {
           if(ints[izq] == numero)
           {
               return izq;
           }
           else
           {
               return -1;
           }
               
        }
        else
        {
            int medio = (izq+drc)/2;
            if(ints[medio] == numero )
            {
                return medio;
            }
            else if( ints[medio] < numero)
            {
               return Ejercicio2DyV(ints,medio+1,drc, numero);
            }
            else
            {
                return Ejercicio2DyV(ints, izq, medio-1,numero);
            }
        }
        
    }
    
    
    
}
    

