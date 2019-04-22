/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import logica.Caballo;

/**
 *
 * @version 14 de abril del 2019
 * @author Hernaldo Valerio P.
 */
public class Matris_Caballo {
    private Caballo [][] matris;
    private Caballo o_caballo;
    private Lista_Doble lista;

    public Caballo[][] getMatris() {
        return matris;
    }

    public void setMatris(Caballo[][] matris) {
        this.matris = matris;
    }   

    public Caballo getO_caballo() {
        return o_caballo;
    }

    public Matris_Caballo(int pFila, int pColumna) {
        matris = new Caballo[pFila][pColumna];
        o_caballo = new Caballo();
    }
    
                
    public boolean TamannoMatrix(int pTamanno) {
        if (pTamanno > 5) {
            matris = new Caballo[pTamanno][pTamanno];
            return true;
        }
        return false;
    }

    public boolean PosicionarCaballo(int pFila, int pColumna){
        if(pFila <= matris.length && pColumna <= matris[0].length){
            matris [pFila][pColumna] = o_caballo;
            o_caballo.setFila(pFila);
            o_caballo.setColumna(pColumna);
            return true;
        }
        return false;
    }
        
    public void MoverCaballo(int pOpcion){        
        int fila = o_caballo.getFila();
        int columna = o_caballo.getColumna();
        
        switch (pOpcion) {                        
            case 1: // Ubica al caballo dos filas arriba de su posicion actual
                //                      una columna a la izquierda de su posicion actual
                matris [fila-2][columna-1] = o_caballo;
                break;
                        
            case 2: // Ubica al caballo dos filas arriba de su posicion actual
                //                      una columna a la derecha de su posicion actual
                matris [fila-2][columna+1] = o_caballo;
                break;            
            
            case 3: // Ubica al caballo una fila arriba de su posicion actual
                //                      dos columnas a la izquierda de su posicion actual
                matris [fila-1][columna-2] = o_caballo;
                break;
                        
            case 4: // Ubica al caballo una fila arriba de su posicion actual
                //                      dos columnas a la derecha de su posicion actual
                matris [fila-1][columna+2] = o_caballo;
                break;
                
            case 5: // Ubica al caballo una fila debajo de su posicion actual
                //                      dos columnas a la izquierda de su posicion actual
                matris[fila+1][columna-2] = o_caballo;
                break;
                
            case 6: // Ubica al caballo una fila debajo de su posicion actual
                //                      dos columnas a la derecha de su posicion actual
                matris[fila+1][columna+2] = o_caballo;
                break;
                
            case 7: // Ubica al caballo dos filas debajo de su posicion actual
                //                      una columna a la izquierda de su posicion actual
                matris[fila+2][columna-1] = o_caballo;
                break;
                
            case 8: // Ubica al caballo dos filas debajo de su posicion actual
                //                      una columna a la derecha de su posicion actual
                matris[fila+2][columna+1] = o_caballo;
                break;
        }
    }
    
    public String MostrarMatris(){
        String impresion = "\n            ";
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if (matris[i][j] == null) 
                    impresion += "0" + "   ";                
                else
                    impresion += "1" + "   ";                
            }
            impresion += "\n            ";
        }
        
        return impresion;
    }    
    
    public String MostarRecorrido(){
        Nodo oNodo = lista.getPrimero();
        int [][] matrisRecorrido = new int [matris.length][matris.length];
        String impresion = "";
        return impresion;
    }
}

