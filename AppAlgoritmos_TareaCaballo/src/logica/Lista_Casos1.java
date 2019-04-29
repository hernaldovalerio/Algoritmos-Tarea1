/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Main.MyException;

/**
 *
 * @version 29 de abril del 2019
 * @author Hernaldo Valerio Pineda
 */
public class Lista_Casos1 {
    private Nodo_Casos1 primero;
    private Nodo_Casos1 ultimo;
    private Nodo_Casos1 aux;
    private int tamm;

    public Nodo_Casos1 getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo_Casos1 primero) {
        this.primero = primero;
    }

    public Nodo_Casos1 getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo_Casos1 ultimo) {
        this.ultimo = ultimo;
    }

    public Nodo_Casos1 getAux() {
        return aux;
    }

    public void setAux(Nodo_Casos1 aux) {
        this.aux = aux;
    }    
    
    public int getTamm() {
        return tamm;
    }

    public void setTamm(int tamm) {
        this.tamm = tamm;
    }
    
    public Lista_Casos1() {
        this.primero = null;        
        this.ultimo = null;
        this.aux = null;
        this.tamm = 0;
    }        
    
    public void InsertarFinal(int pNum) {
        if (primero == null) {
            primero = new Nodo_Casos1(pNum);
            ultimo = primero;
            aux = primero;
        } else {
            Nodo_Casos1 nuevo = new Nodo_Casos1(pNum);
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
            aux = null;
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
    
    public int ObtenerCaso(){
        int caso = aux.getNum();
        
        if (aux.getSig() != null) {
            aux = aux.getSig();
        }
        
        return caso;
    }
        
    public int ObtenerNumero(){
        int fila = ultimo.getNum();  
        return fila;
    }        
        
}
