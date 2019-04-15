/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @version 14 de abril del 2019
 * @author Hernaldo Valerio P.
 */
public class Matris {
    private Caballo [][] matris_caballo;
    private Caballo o_caballo;

    public Caballo[][] getMatris_caballo() {
        return matris_caballo;
    }

    public void setMatris_caballo(Caballo[][] matris_caballo) {
        this.matris_caballo = matris_caballo;
    }    

    public Caballo getO_caballo() {
        return o_caballo;
    }
                
    public boolean TamannoMatrix(int pTamanno) {
        if (pTamanno > 5) {
            matris_caballo = new Caballo[pTamanno][pTamanno];
            return true;
        }
        return false;
    }

    public boolean PosicionarCaballo(int p_fila, int p_columna){
        if(p_fila <= matris_caballo.length && p_columna <= matris_caballo[0].length){
            matris_caballo [p_fila][p_columna] = o_caballo;
            o_caballo.setFila(p_fila);
            o_caballo.setColumna(p_columna);
            return true;
        }
        return false;
    }
        
    public void MoverCaballo(int p_opcion){        
        int v_fila_caballo = o_caballo.getFila();
        int v_columna_caballo = o_caballo.getColumna();
        
        switch (p_opcion) {                        
            case 1: // Ubica al caballo dos filas arriba de su posicion actual
                //                      una columna a la izquierda de su posicion actual
                matris_caballo [v_fila_caballo-2][v_columna_caballo-1] = o_caballo;
                break;
                        
            case 2: // Ubica al caballo dos filas arriba de su posicion actual
                //                      una columna a la derecha de su posicion actual
                matris_caballo [v_fila_caballo-2][v_columna_caballo+1] = o_caballo;
                break;            
            
            case 3: // Ubica al caballo una fila arriba de su posicion actual
                //                      dos columnas a la izquierda de su posicion actual
                matris_caballo [v_fila_caballo-1][v_columna_caballo-2] = o_caballo;
                break;
                        
            case 4: // Ubica al caballo una fila arriba de su posicion actual
                //                      dos columnas a la derecha de su posicion actual
                matris_caballo [v_fila_caballo-1][v_columna_caballo+2] = o_caballo;
                break;
                
            case 5: // Ubica al caballo una fila debajo de su posicion actual
                //                      dos columnas a la izquierda de su posicion actual
                matris_caballo[v_fila_caballo+1][v_columna_caballo-2] = o_caballo;
                break;
                
            case 6: // Ubica al caballo una fila debajo de su posicion actual
                //                      dos columnas a la derecha de su posicion actual
                matris_caballo[v_fila_caballo+1][v_columna_caballo+2] = o_caballo;
                break;
                
            case 7: // Ubica al caballo dos filas debajo de su posicion actual
                //                      una columna a la izquierda de su posicion actual
                matris_caballo[v_fila_caballo+2][v_columna_caballo-1] = o_caballo;
                break;
                
            case 8: // Ubica al caballo dos filas debajo de su posicion actual
                //                      una columna a la derecha de su posicion actual
                matris_caballo[v_fila_caballo+2][v_columna_caballo+1] = o_caballo;
                break;
        }
    }
}

