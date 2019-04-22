/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Main.MyException;

/**
 *
 * @author ucr
 */
public class Lista_Doble {
    private Nodo primero;
    private Nodo ultimo;
    private int tamm;

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamm() {
        return tamm;
    }

    public void setTamm(int tamm) {
        this.tamm = tamm;
    }
    
    public Lista_Doble() {
        this.primero = null;        
        this.ultimo = null;
        this.tamm = 0;
    }
    
    public void InsertarInicio(int pX, int pY) {

        if (primero == null) {
            primero = new Nodo(pX, pY);
            ultimo = primero;
        } else {
            Nodo nuevo = new Nodo(pX, pY);
            nuevo.setSig(primero);            
            primero.setAnt(nuevo);                                
            primero = nuevo;
        }
        tamm++;        
    }
    
    public void InsertarFinal(int pX, int pY) {
        if (primero == null) {
            primero = new Nodo(pX, pY);
            ultimo = primero;
        } else {
            Nodo nuevo = new Nodo(pX, pY);
            nuevo.setAnt(ultimo);
            ultimo.setSig(nuevo);
            ultimo = nuevo;
        }
        tamm++;        
    }        
        
    
    public void EliminarLista() throws MyException{
        
        if (primero != null) {
            primero = null;
            ultimo = null;
            tamm = 0;
        }else{            
            throw new MyException("La lista se encuentra vacia");
        }
    }
    
    public void EliminarInicio() throws MyException {

        if (primero != null) {            
            if (primero.getSig() != null) {
                
                primero = primero.getSig();

            } else {
                primero = null;

            }
            tamm--;
            
        } else {
            throw new MyException("La lista está vacía");
        }
    }
    
    public void EliminarFinal() throws MyException {

        if (primero != null) {
            if (primero.getSig() != null) {                
                
                ultimo = ultimo.getAnt();                                
                ultimo.sig = null;
                tamm--;                
            }
            else{
                EliminarLista();
            }    

        } else {
            throw new MyException("La lista está vacía");
        }        
    }
        
    
        
}
