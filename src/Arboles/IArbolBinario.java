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
interface IArbolBinario {

    void eliminar(int dato);

    NodoAB getRaiz();

    void imprimirInOrder();

    void imprimirPostOrder();

    void imprimirPreOrder();

    void insertar(int dato);

    boolean isEmpty();
    
}
