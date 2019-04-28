/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


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
    private int contador1;
    private Lista_Doble1 lista1;
         

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
        this.caballo1 = 0;
        this.contador1 = 0;
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
     * Posibles movimientos cuando el caballo se encuentra en una casilla en el borde interno del tablero
     * @return int 
     */
    public int Movimiento_BordeInterno(){
        int movimiento = 0;
        //Casos de la columna izquierda del borde interior del tablero
        if (this.getFila() == 1 && this.getColumna() == 1) {
            // Casos de movimiento 4 6 7 8
            if (this.CASO4()) {
                movimiento = 4;
            } else if (this.CASO6()) {
                movimiento = 6;
            } else if (this.CASO7()) {
                movimiento = 7;
            } else {
                movimiento = 8;
            }
        } else if (this.getFila() == (matris1.length - 2) && this.getColumna() == 1) {
            // Casos de movimiento 1 2 4 6
            if (this.CASO1()) {
                movimiento = 1;
            } else if (this.CASO2()) {
                movimiento = 2;
            } else if (this.CASO4()) {
                movimiento = 4;
            } else {
                movimiento = 6;
            }
        }
        
        // Caso general de la columna izquierda del borde interno del tablero 
        else if (this.getColumna() == 1) {
            // Casos de movimiento 1 2 4 6 7 8
            if (this.CASO1()) {
                movimiento = 1;
            } else if (this.CASO2()) {
                movimiento = 2;
            } else if (this.CASO4()) {
                movimiento = 4;
            } else if(this.CASO6()){
                movimiento = 6;
            } else if(this.CASO7()){
                movimiento = 7;
            } else {
                movimiento = 8;
            }
        }

        //Casos de la columna derecha del borde interior del tablero
        else if (this.getFila() == 1 && this.getColumna() == (this.matris1.length - 2)) {
            // Casos de movimiento 5 7 8
            if (this.CASO5()) {
                movimiento = 5;
            } else if (this.CASO7()) {
                movimiento = 7;
            }else {
                movimiento = 8;
            }                                                
        } else if (this.getFila() == (this.matris1.length-2) && this.getColumna() == (this.matris1.length-2)) {
            // Casos de movimiento 1 2 3 5
            if (this.CASO1()) {
                movimiento = 1;
            } else if (this.CASO2()) {
                movimiento = 2;
            } else if (this.CASO3()) {
                movimiento = 3;
            } else {
                movimiento = 5;
            }
        }
        
        // Caso general de la columna de la derecha del borde interno del tablero
        else if (this.getColumna() == (this.matris1.length - 2)) {
            // Casos de movimiento 1 2 3 5 7 8
            if (this.CASO1()) {
                movimiento = 1;
            } else if (this.CASO2()) {
                movimiento = 2;
            } else if (this.CASO3()) {
                movimiento = 3;
            } else if (this.CASO5()) {
                movimiento = 5;
            } else if (this.CASO7()) {
                movimiento = 7;
            } else {
                movimiento = 8;
            }
        }
        
        return movimiento;
    }        
    
    /**
     * Posibles movimientos cuando el caballo se encuentra en una casilla del borde externo del tablero
     * @return int
     */
    public int Movimiento_BordeExterno(){
        int movimiento = 0;
        
        //Casos de la primera fila del borde externo del tablero
        if (this.getFila() == 0 && this.getColumna() == 0) {
            // Casos de movimiento 6 8
            if (this.CASO6()) {
                movimiento = 6;
            } else {
                movimiento = 8;
            }
        } else if (this.getFila() == 0 && this.getColumna() == 1) {
            // Casos de movimiento 6 7 8
            if (this.CASO6()) {
                movimiento = 6;
            } else if (this.CASO7()) {
                movimiento = 7;
            }else {
                movimiento = 8;
            }            
        }    
        
        //Caso general del borde exterior superior del tablero
        else if (this.getFila() == 0) {
            // Casos de movimiento 5 6 7 8
            if (this.CASO5()) {
                movimiento = 5;
            } else if (this.CASO6()) {
                movimiento = 6;
            } else if (this.CASO7()) {
                movimiento = 7;
            } else {
                movimiento = 8;
            }
            
        } else if (this.getFila() == 0 && this.getColumna() == (this.matris1.length - 2)) {
            // Casos de movimiento 5 7 8
            if (this.CASO5()) {
                movimiento = 5;
            } else if (this.CASO7()) {
                movimiento = 7;
            }else {
                movimiento = 8;
            }
        } else if (this.getFila() == 0 && this.getColumna() == (this.matris1.length - 1)) {
            // Casos de movimiento 5 7 
             if (this.CASO5()) {
                movimiento = 5;
            } else {
                movimiento = 7;
            }                    
        }
        
        //Casos de la ultima fila del borde externo del tablero
        else if (this.getFila() == (this.matris1.length-1) && this.getColumna() == 0) {
            // Casos de movimiento 2 4            
            if (this.CASO2()) {
                movimiento = 2;
            } else {
                movimiento = 4;
            }
        }else if(this.getFila() == (this.matris1.length-1) && this.getColumna() == 1){
            // Casos de movimiento 1 2 4
            if (this.CASO1()) {
                movimiento = 1;
            } else if (this.CASO2()) {
                movimiento = 2;
            }else {
                movimiento = 4;
            }
        }
        
        // Caso general borde exterior inferior del tablero
        else if(this.getFila() == (this.matris1.length-1)){
            // Casos de movimiento 1 2 3 4     
             if (this.CASO1()) {
                movimiento = 1;
            } else if (this.CASO2()) {
                movimiento = 2;
            } else if (this.CASO3()) {
                movimiento = 3;
            } else {
                movimiento = 4;
            }
             
        }else if(this.getFila() == (this.matris1.length-1) && this.getColumna() == (this.matris1.length-2) ){
            // Casos de movimiento 1 2 3 
             if (this.CASO1()) {
                movimiento = 1;
            } else if (this.CASO2()) {
                movimiento = 2;
            }else {
                movimiento = 3;
            }            
        }else if(this.getFila() == (this.matris1.length-1) && this.getColumna() == (this.matris1.length-1) ){
            // Casos de movimiento 1 3 
             if (this.CASO1()) {
                movimiento = 1;
            } else {
                movimiento = 3;
            }
        }
                                
        //Casos de la columna izquierda del borde externo del tablero
        else if (this.getFila() == 1 && this.getColumna() == 0) {
            // Casos de movimiento 4  6  8
             if (this.CASO4()) {
                movimiento = 4;
            } else if (this.CASO6()) {
                movimiento = 6;
            }else {
                movimiento = 8;
            }
        } else if (this.getFila() == (this.matris1.length -2) && this.getColumna() == 0) {
            // Casos de movimiento 2 4 6
              if (this.CASO2()) {
                movimiento = 2;
            } else if (this.CASO4()) {
                movimiento = 4;
            }else {
                movimiento = 6;
            }
        }
        
        /////////////////////////////////yfhusdfhsu//////////////
        
        //Casos de la columna derecha del borde externo del tablero
        else if (this.getFila() == 1 && this.getColumna() == (this.matris1.length -1)) {
            // Casos de movimiento 3  5  7
            if (this.CASO3()) {
                movimiento = 3;
            } else if (this.CASO5()) {
                movimiento = 5;
            }else {
                movimiento = 7;
            }
        } else if (this.getFila() == (this.matris1.length -2) && this.getColumna() == (this.matris1.length -1)) {
            // Casos de movimiento 1 3 5
            if (this.CASO1()) {
                movimiento = 1;
            } else if (this.CASO3()) {
                movimiento = 3;
            }else {
                movimiento = 5;
            }
        }
        
        return movimiento;
    }        
    
    /**
     * Posibles movimiento cuando el caballo se encuentra en una casilla central del tablero
     * @return 
     */
     public int Movimiento_Central() {
        int caso = 0;
        //Casos 1 2 3 4 5 6 7 8
        if (this.CASO1()) {
            caso = 1;
        } else if (this.CASO2()) {
            caso = 2;
        } else if (this.CASO3()) {
            caso = 3;
        } else if (this.CASO4()) {
            caso = 4;
        } else if (this.CASO5()) {
            caso = 5;
        } else if (this.CASO6()) {
            caso = 6;
        } else if (this.CASO7()) {
            caso = 7;
        } else {
            caso = 8;
        }
        return caso;
    }

    public void Movimiento() {
         if(this.getFila()== 0 || this.getFila()== (this.matris1.length -1)
                || this.getColumna() == 0 || this.getColumna() == (this.matris1.length -1)){
             
                this.MoverCaballo(this.Movimiento_BordeExterno());
                
        } else if(this.getFila() == 1 || this.getFila()== (this.matris1.length -2)
                || this.getColumna() == 1 || this.getColumna() == (this.matris1.length -2)){
            
            this.MoverCaballo(this.Movimiento_BordeInterno());
            
        } else {
            this.MoverCaballo(this.Movimiento_Central());
        }                       
    }                        
        
    public void MoverCaballo(int pOpcion){                
        
        switch (pOpcion) {                        
            case 1: // Ubica al caballo dos filas arriba de su posicion actual
                //                      una columna a la izquierda de su posicion actual
                this.matris1 [fila1-2][columna1-1] = caballo1;
                this.caballo1++;
                this.setFila(fila1-2);
                this.setColumna(columna1-1);
                break;
                        
            case 2: // Ubica al caballo dos filas arriba de su posicion actual
                //                      una columna a la derecha de su posicion actual
                this.matris1 [fila1-2][columna1+1] = caballo1;
                this.caballo1++;
                this.setFila(fila1-2);
                this.setColumna(columna1+1);
                break;            
            
            case 3: // Ubica al caballo una fila arriba de su posicion actual
                //                      dos columnas a la izquierda de su posicion actual
                this.matris1 [fila1-1][columna1-2] = caballo1;
                this.caballo1++;
                this.setFila(fila1-1);
                this.setColumna(columna1-2);
                break;
                        
            case 4: // Ubica al caballo una fila arriba de su posicion actual
                //                      dos columnas a la derecha de su posicion actual
                this.matris1 [fila1-1][columna1+2] = caballo1;
                this.caballo1++;
                this.setFila(fila1-1);
                this.setColumna(columna1+2);
                break;
                
            case 5: // Ubica al caballo una fila debajo de su posicion actual
                //                      dos columnas a la izquierda de su posicion actual
                this.matris1[fila1+1][columna1-2] = caballo1;
                this.caballo1++;
                this.setFila(fila1+1);
                this.setColumna(columna1-2);
                break;
                
            case 6: // Ubica al caballo una fila debajo de su posicion actual
                //                      dos columnas a la derecha de su posicion actual
                this.matris1[fila1+1][columna1+2] = caballo1;
                this.caballo1++;
                this.setFila(fila1+1);
                this.setColumna(columna1+2);
                break;
                
            case 7: // Ubica al caballo dos filas debajo de su posicion actual
                //                      una columna a la izquierda de su posicion actual
                this.matris1[fila1+2][columna1-1] = caballo1;
                this.caballo1++;
                this.setFila(fila1+2);
                this.setColumna(columna1-1);
                break;
                
            case 8: // Ubica al caballo dos filas debajo de su posicion actual
                //                      una columna a la derecha de su posicion actual
                this.matris1[fila1+2][columna1+1] = caballo1;
                this.caballo1++;
                this.setFila(fila1+2);
                this.setColumna(columna1+1);
                break;
        }
    }
    
    public String MostrarTablero(){
        String impresion = "\n              ";
        int con = 1;
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[i].length; j++) {
                if (matris1[i][j] == 0) 
                    impresion += "0" + "   ";                
                else{
                    impresion += con + "   ";                
                    con++;
                }
                    
            }
            impresion += "\n            ";
        }
        
        return impresion;
    }    
    
    public String MostarRecorrido(){
        Nodo1 oNodo = lista1.getPrimero();
        int [][] matrisRecorrido = new int [matris1.length][matris1.length];
        String impresion = "";
        return impresion;
    }
}

