/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Main.MyException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @version 14 de abril del 2019
 * @author Hernaldo Valerio P.
 */
public class Tablero1 {        
            
    private int [][] matris1;
    private int caballo1;
    private int fila1;
    private int columna1;    
    private Lista_Coordenadas1 lista1;         
    private int caso_anterior1;
    private Lista_Casos1 lista2;

    public int getFila() {
        return fila1;
    }

    public void setFila(int fila) {
        this.fila1 = fila;
    }        

    public int getColumna() {
        return columna1;
    }

    public void setColumna(int columna) {
        this.columna1 = columna;
    }
        
    public Tablero1(int pTamanno) {          
        this.matris1 = new int [pTamanno][pTamanno];
        this.caballo1 = 1;
        this.caso_anterior1 = 0;
        this.lista1 = new Lista_Coordenadas1();
        this.lista2 = new Lista_Casos1();
    }    
                
    public boolean TamannoMatrix1(int pTamanno) {
        if (pTamanno > 5) {
            this.matris1 = new int[pTamanno][pTamanno];
            return true;
        }
        return false;
    }
    
    public boolean PosicionarCaballo1(int pFila, int pColumna){
        if(pFila <= matris1.length && pColumna <= matris1[0].length){
            this.matris1 [pFila][pColumna] = caballo1;        
            this.setFila(pFila);
            this.setColumna(pColumna);            
            this.lista1.InsertarFinal(pFila, pFila);
            return true;
        }
        return false;
    }
    
    /**
     * Pregunta si el caballo ha estado en la celda
     * @param pFila
     * @param pColumna
     * @return 
     */
    public boolean Caballo_Exite(int pFila, int pColumna){
        if(matris1[pFila][pColumna] == 0){
            return true;
        }           
        return false;
    }
           
    /**
     * Casos de movimiento del caballo del tablero
     * @return true
     */
    public boolean CASO1(){        
        return Caballo_Exite((this.getFila() -2), (this.getColumna() -1));
    }
    public boolean CASO2(){        
        return Caballo_Exite((this.getFila() -2), (this.getColumna() +1));
    }
    public boolean CASO3(){        
        return Caballo_Exite((this.getFila() -1), (this.getColumna() -2));
    }    
    public boolean CASO4(){        
        return Caballo_Exite((this.getFila() -1), (this.getColumna() +2));
    }    
    public boolean CASO5(){        
        return Caballo_Exite((this.getFila() +1), (this.getColumna() -2));
    }
    public boolean CASO6(){        
        return Caballo_Exite((this.getFila() +1), (this.getColumna() +2));
    }
    public boolean CASO7(){        
        return Caballo_Exite((this.getFila() +2), (this.getColumna() -1));
    }
    public boolean CASO8(){        
        return Caballo_Exite((this.getFila() +2), (this.getColumna() +1));
    }
            
    /**
     * Posibles movimientos cuando el caballo se encuentra en una casilla del borde externo del tablero
     * @return int
     */
    public int Movimiento_BordeExterno(){
        int movimiento = 0;
        
        //Casos de la primera fila del borde externo del tablero
        //1
        if (this.getFila() == 0 && this.getColumna() == 0) {
            // Casos de movimiento 6 8
            if (this.CASO6()) {
                this.lista2.InsertarFinal(6);
            }
            if (this.CASO8()) {
                this.lista2.InsertarFinal(8);
            }
        //2
        } else if (this.getFila() == 0 && this.getColumna() == 1) {
            // Casos de movimiento 6 7 8
            if (this.CASO6()) {
                this.lista2.InsertarFinal(6);
            }
            if (this.CASO7()) {
                this.lista2.InsertarFinal(7);                
            }
            if (this.CASO8()) {
                this.lista2.InsertarFinal(8);
            }
        //3
        } else if (this.getFila() == 0 && this.getColumna() == (this.matris1.length - 2)) {
            // Casos de movimiento 5 7 8
            if (this.CASO5()) {
                this.lista2.InsertarFinal(5);
            }
            if (this.CASO7()) {
                this.lista2.InsertarFinal(7);
            }
            if (this.CASO8()) {
                this.lista2.InsertarFinal(8);
            }
        //4
        } else if (this.getFila() == 0 && this.getColumna() == (this.matris1.length - 1)) {
            // Casos de movimiento 5 7 
            if (this.CASO5()) {
                this.lista2.InsertarFinal(5);
            }
            if (this.CASO7()) {
                this.lista2.InsertarFinal(7);
            }                   
        }
        
        //Caso general del borde exterior superior del tablero
        else if (this.getFila() == 0) {
            // Casos de movimiento 5 6 7 8
            if (this.CASO5()) {
                this.lista2.InsertarFinal(5);
            }
            if (this.CASO6()) {
                this.lista2.InsertarFinal(6);
            }
            if (this.CASO7()) {
                this.lista2.InsertarFinal(7);
            }
            if (this.CASO8()) {
                this.lista2.InsertarFinal(8);
            }           
        }
        
        //Casos de la ultima fila del borde externo del tablero
        //1
        else if (this.getFila() == (this.matris1.length-1) && this.getColumna() == 0) {
            // Casos de movimiento 2 4            
            if (this.CASO2()) {
                this.lista2.InsertarFinal(2);
            }
            if (this.CASO4()) {
                this.lista2.InsertarFinal(4);
            }
        //2
        }else if(this.getFila() == (this.matris1.length-1) && this.getColumna() == 1){
            // Casos de movimiento 1 2 4
            if (this.CASO1()) {
                this.lista2.InsertarFinal(1);
            }
            if (this.CASO2()) {
                this.lista2.InsertarFinal(2);
            }
            if (this.CASO4()) {
                this.lista2.InsertarFinal(4);
            }
        //3
        } else if (this.getFila() == (this.matris1.length - 1) && this.getColumna() == (this.matris1.length - 2)) {
            // Casos de movimiento 1 2 3 
            if (this.CASO1()) {
                this.lista2.InsertarFinal(1);
            }
            if (this.CASO2()) {
                this.lista2.InsertarFinal(2);
            }
            if (this.CASO3()) {
                this.lista2.InsertarFinal(3);
            }            
        //4
        }else if(this.getFila() == (this.matris1.length-1) && this.getColumna() == (this.matris1.length-1) ){
            // Casos de movimiento 1 3 
            if (this.CASO1()) {
                this.lista2.InsertarFinal(1);
            }
            if (this.CASO3()) {
                this.lista2.InsertarFinal(3);
            }
        }
        // Caso general borde exterior inferior del tablero
        else if(this.getFila() == (this.matris1.length-1)){
            // Casos de movimiento 1 2 3 4     
            if (this.CASO1()) {
                this.lista2.InsertarFinal(1);
            }
            if (this.CASO2()) {
                this.lista2.InsertarFinal(2);
            }
            if (this.CASO3()) {
                this.lista2.InsertarFinal(3);
            }
            if (this.CASO4()) {
                this.lista2.InsertarFinal(4);
            }
        }
                                
        //Casos de la columna izquierda del borde externo del tablero
        //1
        else if (this.getFila() == 1 && this.getColumna() == 0) {
            // Casos de movimiento 4  6  8
            if (this.CASO4()) {
                this.lista2.InsertarFinal(4);
            }
            if (this.CASO6()) {
                this.lista2.InsertarFinal(6);
            }
            if (this.CASO8()) {
                this.lista2.InsertarFinal(8);
            }
        //2
        } else if (this.getFila() == (this.matris1.length -2) && this.getColumna() == 0) {
            // Casos de movimiento 2 4 6
            if (this.CASO2()) {
                this.lista2.InsertarFinal(2);
            }
            if (this.CASO4()) {
                this.lista2.InsertarFinal(4);
            }
            if (this.CASO6()) {
                this.lista2.InsertarFinal(6);
            }
        }
        
        // Caso general de la columna izquierda del borde exterior del tablero
        else if(this.getColumna() == 0){
            // Casos de movimiento 2 4 6 8
            if (this.CASO2()) {
                this.lista2.InsertarFinal(2);
            }
            if (this.CASO4()) {
                this.lista2.InsertarFinal(4);
            }
            if (this.CASO6()) {
                this.lista2.InsertarFinal(6);
            }
            if (this.CASO8()) {
                this.lista2.InsertarFinal(8);
            }
        }        
        
        //Casos de la columna derecha del borde externo del tablero
        //1
        else if (this.getFila() == 1 && this.getColumna() == (this.matris1.length -1)) {
            // Casos de movimiento 3  5  7
            if (this.CASO3()) {
                this.lista2.InsertarFinal(3);
            }
            if (this.CASO5()) {
                this.lista2.InsertarFinal(5);
            }
            if (this.CASO7()) {
                this.lista2.InsertarFinal(7);
            }
        //2
        } else if (this.getFila() == (this.matris1.length -2) && this.getColumna() == (this.matris1.length -1)) {
            // Casos de movimiento 1 3 5
            if (this.CASO1()) {
                this.lista2.InsertarFinal(1);
            }
            if (this.CASO3()) {
                this.lista2.InsertarFinal(3);
            }
            if (this.CASO5()) {
                this.lista2.InsertarFinal(5);
            }
        }
        
        // Caso general de la columna derecha del borde exterior del tablero
        else if(this.getColumna() == (this.matris1.length -1) ){
            // Casos de movimiento 1 3 5 7
            if (this.CASO1()) {
                this.lista2.InsertarFinal(1);                
            }
            if (this.CASO3()) {
                this.lista2.InsertarFinal(3);                
            }
            if (this.CASO5()) {
                this.lista2.InsertarFinal(5);                
            }
            if (this.CASO7()) {
                this.lista2.InsertarFinal(7);                
            }                          
        }    
        
        if (lista2.getTamm() != 0) {
            movimiento = lista2.ObtenerCaso();
        }
        
        return movimiento;
    }   
    
    /**
     * Posibles movimientos cuando el caballo se encuentra en una casilla en el borde interno del tablero
     * @return int 
     */
    public int Movimiento_BordeInterno(){
        int movimiento = 0;
        //Casos de la columna izquierda del borde interior del tablero
        //1
        if (this.getFila() == 1 && this.getColumna() == 1) {
            // Casos de movimiento 4 6 7 8
            if (this.CASO4()) {
                this.lista2.InsertarFinal(4);
            }
            if (this.CASO6()) {
                this.lista2.InsertarFinal(6);
            }
            if (this.CASO7()) {
                this.lista2.InsertarFinal(7);
            }
            if (this.CASO8()) {
                this.lista2.InsertarFinal(8);
            }
        //2
        } else if (this.getFila() == (matris1.length - 2) && this.getColumna() == 1) {
            // Casos de movimiento 1 2 4 6
            if (this.CASO1()) {
                this.lista2.InsertarFinal(1);
            }
            if (this.CASO2()) {
                this.lista2.InsertarFinal(2);
            }
            if (this.CASO4()) {
                this.lista2.InsertarFinal(4);
            }
            if (this.CASO6()) {
                this.lista2.InsertarFinal(6);
            }
        }
        
        // Caso general de la columna izquierda del borde interno del tablero 
        else if (this.getColumna() == 1) {
            // Casos de movimiento 1 2 4 6 7 8
            if (this.CASO1()) {
                this.lista2.InsertarFinal(1);
            }
            if (this.CASO2()) {
                this.lista2.InsertarFinal(2);
            }
            if (this.CASO4()) {
                this.lista2.InsertarFinal(4);
            }
            if (this.CASO6()) {
                this.lista2.InsertarFinal(6);
            }
            if (this.CASO7()) {
                this.lista2.InsertarFinal(7);
            }
            if (this.CASO8()) {
                this.lista2.InsertarFinal(8);
            }
        }

        //Casos de la columna derecha del borde interior del tablero
        //1
        else if (this.getFila() == 1 && this.getColumna() == (this.matris1.length - 2)) {
            // Casos de movimiento 5 7 8
            if (this.CASO5()) {
                this.lista2.InsertarFinal(5);
            }
            if (this.CASO7()) {
                this.lista2.InsertarFinal(7);
            }
            if (this.CASO8()) {
                this.lista2.InsertarFinal(8);
            }                                                
         //2
        } else if (this.getFila() == (this.matris1.length-2) && this.getColumna() == (this.matris1.length-2)) {
            // Casos de movimiento 1 2 3 5
            if (this.CASO1()) {
                this.lista2.InsertarFinal(1);
            }
            if (this.CASO2()) {
                this.lista2.InsertarFinal(2);
            }
            if (this.CASO3()) {
                this.lista2.InsertarFinal(3);
            }
            if (this.CASO5()) {
                this.lista2.InsertarFinal(5);
            }
        }
        
        // Caso general de la columna de la derecha del borde interno del tablero
        else if (this.getColumna() == (this.matris1.length - 2)) {
            // Casos de movimiento 1 2 3 5 7 8
            if (this.CASO1()) {
                this.lista2.InsertarFinal(1);
            }
            if (this.CASO2()) {
                this.lista2.InsertarFinal(2);
            }
            if (this.CASO3()) {
                this.lista2.InsertarFinal(3);
            }
            if (this.CASO5()) {
                this.lista2.InsertarFinal(5);
            }
            if (this.CASO7()) {
                this.lista2.InsertarFinal(7);
            }
            if (this.CASO8()) {
                this.lista2.InsertarFinal(8);
            }
        }
        
        // Caso general de la fila superior del borde interno del tablero
        else if (this.getFila() == 1) {
            // Casos de movimiento 3 4 5 6 7 8
            if (this.CASO3()) {
                this.lista2.InsertarFinal(3);
            }
            if (this.CASO4()) {
                this.lista2.InsertarFinal(4);
            }
            if (this.CASO5()) {
                this.lista2.InsertarFinal(5);
            }
            if (this.CASO6()) {
                this.lista2.InsertarFinal(6);
            }
            if (this.CASO7()) {
                this.lista2.InsertarFinal(7);
            }
            if (this.CASO8()) {
                this.lista2.InsertarFinal(8);
            }
        }
        
        // Caso general de la fila inferior del borde interno del tablero
        else if (this.getFila() == (matris1.length-2)) {
            // Casos de movimiento 1 2 3 4 5 6
            if (this.CASO1()) {
                this.lista2.InsertarFinal(1);
            }
            if (this.CASO2()) {
                this.lista2.InsertarFinal(2);
            }
            if (this.CASO3()) {
                this.lista2.InsertarFinal(3);
            }
            if (this.CASO4()) {
                this.lista2.InsertarFinal(4);
            }
            if (this.CASO5()) {
                this.lista2.InsertarFinal(5);
            }
            if (this.CASO6()) {
                this.lista2.InsertarFinal(6);
            }
        }
        
        if (lista2.getTamm() != 0) {
            movimiento = lista2.ObtenerCaso();
        }
        
        return movimiento;
    }        
    
    
    /**
     * Posibles movimiento cuando el caballo se encuentra en una casilla central del tablero
     * @return 
     */
     public int Movimiento_Central() {
        int movimiento = 0;
        //Casos de movimiento 1 2 3 4 5 6 7 8
         if (this.CASO1()) {
             this.lista2.InsertarFinal(1);
         }
         if (this.CASO2()) {
             this.lista2.InsertarFinal(2);
         }
         if (this.CASO3()) {
             this.lista2.InsertarFinal(3);
         }
         if (this.CASO4()) {
             this.lista2.InsertarFinal(4);
         }
         if (this.CASO5()) {
             this.lista2.InsertarFinal(5);
         }
         if (this.CASO6()) {
             this.lista2.InsertarFinal(6);
         }
         if (this.CASO7()) {
             this.lista2.InsertarFinal(7);
         }
         if (this.CASO8()) {
             this.lista2.InsertarFinal(8);
         }                      
        
         if (lista2.getTamm() != 0) {
             movimiento = lista2.ObtenerCaso();            
         }
        
        return movimiento;
    }

    public void Movimiento() {
        int opcion = 0;        
        
        //Mueve el caballo de una celda del borde externo
        if (this.getFila() == 0 || this.getFila() == (this.matris1.length - 1)
                || this.getColumna() == 0 || this.getColumna() == (this.matris1.length - 1)) {                        
            opcion = 1;                        

        //Mueve el caballo de una celda del borde interno
        } else if (this.getFila() == 1 || this.getFila() == (this.matris1.length - 2)
                || this.getColumna() == 1 || this.getColumna() == (this.matris1.length - 2)) {                       
            opcion = 2;            
            
        //Mueve el caballo de alguna celda central
        } else {                        
            opcion = 3;            
        }
        
        //Mueve el caballo si el valor es distinto de 0
            //Caso contrario retrocede
        switch(opcion){
            case 1:
                opcion = this.Movimiento_BordeExterno();
                this.MoverCaballo(opcion);
                break;
            case 2:
                opcion = this.Movimiento_BordeInterno();
                this.MoverCaballo(opcion);
                break;
            case 3:
                opcion = this.Movimiento_Central();
                this.MoverCaballo(opcion);
                break;            
        }        
    }                        
        
    public void MoverCaballo(int pOpcion){                        
        boolean bandera = false;
        int fila = this.getFila(), fila_anterior = this.getFila();
        int columna = this.getColumna(), columna_anterior = this.getColumna();
        int nuevo_caso = 0;
        
        //Pregunta si el caballo posee movimientos
        if (pOpcion != 0) {
            this.caballo1++;
            bandera = true;
        }        
        
        switch (pOpcion) {                        
            case 1: // Ubica al caballo dos filas arriba de su posicion actual
                //                      una columna a la izquierda de su posicion actual                
                this.matris1 [fila1-2][columna1-1] = caballo1;                
                this.setFila(fila1-2);
                this.setColumna(columna1-1);                
                break;
                        
            case 2: // Ubica al caballo dos filas arriba de su posicion actual
                //                      una columna a la derecha de su posicion actual                
                this.matris1 [fila1-2][columna1+1] = caballo1;                
                this.setFila(fila1-2);
                this.setColumna(columna1+1);                
                break;            
            
            case 3: // Ubica al caballo una fila arriba de su posicion actual
                //                      dos columnas a la izquierda de su posicion actual                
                this.matris1 [fila1-1][columna1-2] = caballo1;                
                this.setFila(fila1-1);
                this.setColumna(columna1-2);
                break;
                        
            case 4: // Ubica al caballo una fila arriba de su posicion actual
                //                      dos columnas a la derecha de su posicion actual                
                this.matris1 [fila1-1][columna1+2] = caballo1;                
                this.setFila(fila1-1);
                this.setColumna(columna1+2);
                break;
                
            case 5: // Ubica al caballo una fila debajo de su posicion actual
                //                      dos columnas a la izquierda de su posicion actual                
                this.matris1[fila1+1][columna1-2] = caballo1;                
                this.setFila(fila1+1);
                this.setColumna(columna1-2);
                break;
                
            case 6: // Ubica al caballo una fila debajo de su posicion actual
                //                      dos columnas a la derecha de su posicion actual                
                this.matris1[fila1+1][columna1+2] = caballo1;                
                this.setFila(fila1+1);
                this.setColumna(columna1+2);
                break;
                
            case 7: // Ubica al caballo dos filas debajo de su posicion actual
                //                      una columna a la izquierda de su posicion actual                
                this.matris1[fila1+2][columna1-1] = caballo1;                
                this.setFila(fila1+2);
                this.setColumna(columna1-1);
                break;
                
            case 8: // Ubica al caballo dos filas debajo de su posicion actual
                //                      una columna a la derecha de su posicion actual                
                this.matris1[fila1 + 2][columna1 + 1] = caballo1;
                this.setFila(fila1 + 2);
                this.setColumna(columna1 + 1);
                break;
            default:
                //El caballo retrocede       
                caballo1--;
                this.matris1[fila][columna] = 0;
                 {
                    try {
                        this.lista1.EliminarFinal();
                    } catch (MyException ex) {
                        System.out.println("Error \n" + ex.getMessage());
                    }
                }
                fila_anterior = lista1.ObtenerFila();
                columna_anterior = lista1.ObtenerColumna();                
                this.setFila(fila_anterior);
                this.setColumna(columna_anterior);
                nuevo_caso = this.lista2.ObtenerCaso();
                this.MoverCaballo(nuevo_caso);
                break;
        }
                
        //Si la bandera es true inserta las coordenadas
        if (bandera) {
            this.lista1.InsertarFinal(fila1, columna1);
            try {
                this.lista2.EliminarLista();
            } catch (MyException ex) {
                System.out.println("Error:\n" + ex.getMessage());;
            }
        }                
        
    }
    
    public String MostrarTablero(){
        String impresion = "\n              ";        
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[i].length; j++) {
                impresion += matris1[i][j] + "    ";
            }
            impresion += "\n              ";
        }

        return impresion;
    }    
    
    public String MostarRecorrido(){
        Nodo_Coordenadas1 oNodo = lista1.getPrimero();
        int [][] matrisRecorrido = new int [matris1.length][matris1.length];
        String impresion = "";
        return impresion;
    }
}

