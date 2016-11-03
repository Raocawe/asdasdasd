/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

/**
 *
 * @author Martin
 */
public class Utilidades {
     // Genera el siguiente Arbol Binario (No Busqueda)
        //      8
        //    /   \
        //   5	   15
        //  / \	   / \
        // 7   1  9   3
        
        public static ArbolBinario BuildArbolBinarioCompleto()
        {
            // raiz
            NodoAB raiz = new NodoAB(8);
            // nivel 1
            NodoAB unoIzq = new NodoAB(5);
            NodoAB unoDer = new NodoAB(15);
            raiz.setIzq(unoIzq);
            raiz.setDer(unoDer);
            // nivel 2
            NodoAB unoIzqdosIzq = new NodoAB(7);
            NodoAB unoIzqdosDer = new NodoAB(1);
            unoIzq.setIzq(unoIzqdosIzq);
            unoIzq.setDer(unoIzqdosDer);
            NodoAB unoDerdosIzq = new NodoAB(3);
            NodoAB unoDerdosDer = new NodoAB(9);
            unoDer.setIzq(unoDerdosIzq);
            unoDer.setDer(unoDerdosDer);
            // Genera el arbol
            ArbolBinario arbolB = new ArbolBinario(raiz);
            return arbolB;
        }

        // Genera el siguiente Arbol Binario (No Busqueda)
        //      8
        //    /   \
        //   4	   16
        //  / \	   / \
        // 6   2  10  12
        //  \
        //   24
        //     \
        //      20
        public static ArbolBinario BuildArbolBinarioPares()
        {
            // raiz
            NodoAB raiz = new NodoAB(8);
            // nivel 1
            NodoAB unoIzq = new NodoAB(4);
            NodoAB unoDer = new NodoAB(16);
            raiz.setIzq(unoIzq);
            raiz.setDer(unoDer);
            // nivel 2
            NodoAB unoIzqdosIzq = new NodoAB(6);
            NodoAB unoIzqdosDer = new NodoAB(2);
            unoIzq.setIzq(unoIzqdosIzq);
            unoIzq.setDer(unoIzqdosDer);
            NodoAB unoDerdosIzq = new NodoAB(10);
            NodoAB unoDerdosDer = new NodoAB(12);
            unoDer.setIzq(unoDerdosIzq);
            unoDer.setDer(unoDerdosDer);
            // nivel 3
            NodoAB unoIzqdosIzqTresDer = new NodoAB(24);
            unoIzqdosIzq.setDer(unoIzqdosIzqTresDer);
            // nivel 4
            NodoAB unoIzqdosIzqTresDerCuatroDer = new NodoAB(20);
            unoIzqdosIzqTresDer.setDer(unoIzqdosIzqTresDerCuatroDer);
            // Genera el arbol
            ArbolBinario arbolB = new ArbolBinario(raiz);
            return arbolB;
        }

        // Genera el siguiente Arbol Binario (No Busqueda)
        //        21
        //      /   \
        //     15    26
        //    /        \
        //   12         29
        //  /  \       /
        // 5   14     28
        //  \           \
        //   9           32
        public static ArbolBinario BuildArbolBinarioParcial1()
        {
            // raiz
            NodoAB raiz = new NodoAB(21);
            // nivel 1
            NodoAB unoIzq = new NodoAB(15);
            NodoAB unoDer = new NodoAB(26);
            raiz.setIzq(unoIzq);
            raiz.setDer(unoDer);
            // nivel 2
            NodoAB unoIzqdosIzq = new NodoAB(12);
            unoIzq.setIzq(unoIzqdosIzq);
            NodoAB unoDerdosDer = new NodoAB(29);
            unoDer.setDer(unoDerdosDer);
            // nivel 3-
            NodoAB unoIzqdosIzqTresDer = new NodoAB(14);
            unoIzqdosIzq.setDer(unoIzqdosIzqTresDer);
            NodoAB unoIzqdosIzqTresIzq = new NodoAB(5);
            unoIzqdosIzq.setIzq(unoIzqdosIzqTresIzq);
            NodoAB unoDerdosDerTresIzq = new NodoAB(28);
            unoDerdosDer.setIzq(unoDerdosDerTresIzq);
            // nivel 4
            NodoAB unoIzqdosIzqTresDerCuatroDer = new NodoAB(9);
            unoIzqdosIzqTresIzq.setDer(unoIzqdosIzqTresDerCuatroDer);
            NodoAB unoDerdosDerTresIzqcuatroDer = new NodoAB(32);
            unoDerdosDerTresIzq.setDer(unoDerdosDerTresIzqcuatroDer);
            // Genera el arbol
            ArbolBinario arbolB = new ArbolBinario(raiz);
            return arbolB;
        }
    
    }   

