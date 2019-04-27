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
    private Caballo caballo;
    private Lista_Doble lista;

    public Caballo[][] getMatris() {
        return matris;
    }

    public Caballo getCaballo() {
        return caballo;
    }

    public void setCaballo(Caballo caballo) {
        this.caballo = caballo;
    }    

    public Matris_Caballo(int pFila, int pColumna) {
        matris = new Caballo[pFila][pColumna];
        caballo = new Caballo();
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
            matris [pFila][pColumna] = caballo;
            caballo.setFila(pFila);
            caballo.setColumna(pColumna);
            return true;
        }
        return false;
    }
    
    public int movimientoBordeInterno(){
        //Casos de la columna izquierda interior
        if (caballo.getFila() == 1 && caballo.getColumna() == 1) {
            //4 6 7 8
        } else if (caballo.getFila() == (matris.length-2) && caballo.getColumna() == 1) {
            // 1 2 4 6
        }
        if (caballo.getColumna() == 1) {
            //1 2 4 6 7 8
        }
        
        //Casos de la columna derecha interior
        if (caballo.getFila() == 1 && caballo.getColumna() == (matris.length-2)) {
            // 5 7 8
        } else if (caballo.getFila() == (matris.length-2) && caballo.getColumna() == (matris.length-2)) {
            // 1 2 3 5
        }
        if (caballo.getColumna() == (matris.length-2)) {
            //1 2 3 5 7 8
        }
        
        return 0;
    }
    
    public int movimientoBordeExterno(){
        //Casos de la primera fila externa
        if (caballo.getFila() == 0 && caballo.getColumna() == 0) {//Caballo fila 0 columna 0
            //6 8

        } else if (caballo.getFila() == 0 && caballo.getColumna() == 1) {
            //6 7 8
            
        } else if (caballo.getFila() == 0 && caballo.getColumna() == (matris.length - 2)) {
            //5 7 8

        } else if (caballo.getFila() == 0 && caballo.getColumna() == (matris.length - 1)) {
            //5 7 
            
        //////////////////////////////////////////////    
        } else if (caballo.getFila() == 0) {
            //5 6 7 8
        }
        /////////////////////////////////////////////
        
        //Casos de la ultima fila externa
        if (caballo.getFila() == (matris.length-1) && caballo.getColumna() == (matris.length -1)) {
            //2 4            
        }
        else if(caballo.getFila() == (matris.length-1) && caballo.getColumna() == 1){
            // 1 2 4
            
        }else if(caballo.getFila() == (matris.length-1) && caballo.getColumna() == 2){
            // 1 2 3 4        
        
        }else if(caballo.getFila() == (matris.length-1) && caballo.getColumna() == (matris.length-2) ){
            // 1 2 3 
            
        }else if(caballo.getFila() == (matris.length-1) && caballo.getColumna() == (matris.length-2) ){
            // 1 3 
        }
                        
        
        //Casos de la columna izquierda externa
        if (caballo.getFila() == 1 && caballo.getColumna() == 0) {
            // 4  6  8
        } else if (caballo.getFila() == (matris.length -2) && caballo.getColumna() == 0) {
            //2 4 6
        }
        
        //Casos de la columna derecha externa
        if (caballo.getFila() == 1 && caballo.getColumna() == (matris.length -1)) {
            // 3  5  7
        } else if (caballo.getFila() == (matris.length -2) && caballo.getColumna() == (matris.length -1)) {
            //1 3 7
        }
        
        return 0;
    }

    public int posibleMovimiento() {
        int valor = 0;
        
        
        
        
        return valor;
    }                        
        
    public void moverCaballo(int pOpcion){        
        int fila = caballo.getFila();
        int columna = caballo.getColumna();
        
        switch (pOpcion) {                        
            case 1: // Ubica al caballo dos filas arriba de su posicion actual
                //                      una columna a la izquierda de su posicion actual
                matris [fila-2][columna-1] = caballo;
                break;
                        
            case 2: // Ubica al caballo dos filas arriba de su posicion actual
                //                      una columna a la derecha de su posicion actual
                matris [fila-2][columna+1] = caballo;
                break;            
            
            case 3: // Ubica al caballo una fila arriba de su posicion actual
                //                      dos columnas a la izquierda de su posicion actual
                matris [fila-1][columna-2] = caballo;
                break;
                        
            case 4: // Ubica al caballo una fila arriba de su posicion actual
                //                      dos columnas a la derecha de su posicion actual
                matris [fila-1][columna+2] = caballo;
                break;
                
            case 5: // Ubica al caballo una fila debajo de su posicion actual
                //                      dos columnas a la izquierda de su posicion actual
                matris[fila+1][columna-2] = caballo;
                break;
                
            case 6: // Ubica al caballo una fila debajo de su posicion actual
                //                      dos columnas a la derecha de su posicion actual
                matris[fila+1][columna+2] = caballo;
                break;
                
            case 7: // Ubica al caballo dos filas debajo de su posicion actual
                //                      una columna a la izquierda de su posicion actual
                matris[fila+2][columna-1] = caballo;
                break;
                
            case 8: // Ubica al caballo dos filas debajo de su posicion actual
                //                      una columna a la derecha de su posicion actual
                matris[fila+2][columna+1] = caballo;
                break;
        }
    }
    
    public String MostrarMatris(){
        String impresion = "\n              ";
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

