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
public class Nodo_Coordenadas1 {
    int x;
    int y;
    Nodo_Coordenadas1 sig;
    Nodo_Coordenadas1 ant;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Nodo_Coordenadas1 getSig() {
        return sig;
    }

    public void setSig(Nodo_Coordenadas1 sig) {
        this.sig = sig;
    }

    public Nodo_Coordenadas1 getAnt() {
        return ant;
    }

    public void setAnt(Nodo_Coordenadas1 ant) {
        this.ant = ant;
    }

    public Nodo_Coordenadas1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}
