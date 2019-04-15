/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @version 14 de abril del 2019
 * @author Hernaldo Valerio P
 */
public class Caballo {
    private int fila;
    private int columna;

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public Caballo() {
        this.fila = 0;
        this.columna = 0;
    }
    
}
