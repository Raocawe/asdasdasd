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
public class ArbolBinario<T> implements IArbolBinario {
    
    private NodoAB<T> asd;

	public ArbolBinario (){
            this.raiz = null;
	}
	
        public ArbolBinario (NodoAB pNodo){ 
            this.raiz = pNodo;
	}
        
	public NodoAB getRaiz(){
            return this.raiz;
	}

	public boolean isEmpty(){
            return (this.raiz == null);
	}
        
        public void insertar(int dato){
	}

	public void eliminar(int dato){
	}

	public void imprimirPreOrder(){
		imprimirPreOrder(this.raiz);
	}

	public void imprimirPreOrder(NodoAB a){
		if (a!=null){
            System.out.println(a.getDato()+" - ");
            imprimirPreOrder(a.getIzq());
            imprimirPreOrder(a.getDer());
       }
	}
        
        public void imprimirPostOrder(){
		imprimirPostOrder(this.raiz);
	}
	public void imprimirPostOrder(NodoAB a){
		if (a!=null){
            imprimirPostOrder(a.getIzq());
            imprimirPostOrder(a.getDer());
		     System.out.println(a.getDato()+" - ");
       }
	}
	public void imprimirInOrder(){
		imprimirInOrder(this.raiz);
	}
	public void imprimirInOrder(NodoAB a){
		if (a!=null){
            imprimirInOrder(a.getIzq());
            imprimirInOrder(a.getDer());
		     System.out.println(a.getDato()+" - ");
       }
	}



}