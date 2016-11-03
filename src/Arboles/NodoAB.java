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
class NodoAB <T> {
          
         private T dato;
	 private NodoAB<T> izq;
	 private NodoAB<T> der;

	public NodoAB (T dato){
            this.dato = dato;
            this.izq = null;
            this.der = null;
	}
        
	public NodoAB (T dato, NodoAB izq, NodoAB der){
            this.dato = dato;
            this.izq = izq;
            this.der = der;
	}

    /**
     * @return the dato
     */
    public T getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * @return the izq
     */
    public NodoAB<T> getIzq() {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(NodoAB<T> izq) {
        this.izq = izq;
    }

    /**
     * @return the der
     */
    public NodoAB<T> getDer() {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(NodoAB<T> der) {
        this.der = der;
    }
}



