/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Hernaldo Valerio P.
 */
public class Nodo_Casos1 {
    int num;    
    Nodo_Casos1 sig;
    Nodo_Casos1 ant;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }      

    public Nodo_Casos1 getSig() {
        return sig;
    }

    public void setSig(Nodo_Casos1 sig) {
        this.sig = sig;
    }

    public Nodo_Casos1 getAnt() {
        return ant;
    }

    public void setAnt(Nodo_Casos1 ant) {
        this.ant = ant;
    }

    public Nodo_Casos1(int num) {
        this.num = num;
    }     
}
