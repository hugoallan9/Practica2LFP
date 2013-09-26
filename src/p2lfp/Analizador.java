/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2lfp;

/**
 *
 * @author hugo
 */
public class Analizador {
    private String valorLexema;
    private int token;
    private String mensajeError;
    private int estado;

    private boolean esDelimitador(char c){
        boolean respuesta = false;
        if('\'' == c) respuesta = true;
        if(c == 32) respuesta = true;
        if(c == '@') respuesta = true;
        return respuesta;
        
    }

    
}
