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
public class Lista_Doble1 {
    private Nodo1 primero;
    private Nodo1 ultimo;
    private int tamm;

    public Nodo1 getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo1 primero) {
        this.primero = primero;
    }

    public Nodo1 getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo1 ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamm() {
        return tamm;
    }

    public void setTamm(int tamm) {
        this.tamm = tamm;
    }
    
    public Lista_Doble1() {
        this.primero = null;        
        this.ultimo = null;
        this.tamm = 0;
    }        
    
    public void InsertarFinal(int pX, int pY) {
        if (primero == null) {
            primero = new Nodo1(pX, pY);
            ultimo = primero;
        } else {
            Nodo1 nuevo = new Nodo1(pX, pY);
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
        
    public int ObtenerFila(){
        int fila = ultimo.getX();;                                
        return fila;
    }
    
    public int ObtenerColumna(){
        int columna = ultimo.getY();;                                
        return columna;
    }
        
}
