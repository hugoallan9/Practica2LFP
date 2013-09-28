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
    private int estado = 0;

    public String getValorLexema() {
        return valorLexema;
    }

    public int getToken() {
        return token;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public int getEstado() {
        return estado;
    }

    private boolean esDelimitador(char c){
        boolean respuesta = false;
        if('\'' == c) respuesta = true;
        if(c == 32) respuesta = true;
        if(c == '@') respuesta = true;
        return respuesta;
        
    }
    
    public int analizar(char entrada){
        int estadoAnalizador = 0;
        switch(estado){
            case 0:
                if(Character.isAlphabetic(entrada)){
                    estado = 1;
                    valorLexema = ""+entrada;
                    estadoAnalizador = 2;
                }else if(Character.isDigit(entrada)){
                    estado = 2;
                    valorLexema = ""+entrada;
                    estadoAnalizador = 0;
                }else if(esDelimitador(entrada)){
                    estado = 0;
                    estadoAnalizador = 0;
                }else{
                    estado = 0;
                    rutinaDeError(1, estadoAnalizador =1);
                }
                break;
            case 1:
                if(Character.isAlphabetic(entrada)){
                    estado = 1;
                    valorLexema = valorLexema + entrada;
                    estadoAnalizador = 2;
                }else if(Character.isDigit(entrada)){
                    estado = 1;
                    valorLexema = valorLexema + entrada;
                    estadoAnalizador = 2;
                }else{
                    estado = 0; 
                    estadoAnalizador = 3;
                    token = 50;
                }
                break;
            case 2:
                if(Character.isDigit(entrada)){
                    estado = 2;
                    valorLexema = valorLexema + entrada;
                    estadoAnalizador = 0;
                }else if(entrada == '.'){
                    estado = 3;
                    valorLexema = valorLexema + entrada;
                    estadoAnalizador = 0;
                }else{
                    estado = 0;
                    rutinaDeError(2, estadoAnalizador=1);
                }
                break;
            case 3:
                if(Character.isDigit(entrada)){
                    estado = 4;
                    valorLexema = valorLexema + entrada;
                    estadoAnalizador = 2;
                }else{
                    estado = 0;
                    rutinaDeError(3, estadoAnalizador=1);
                }
                break;
            case 4:
                if(Character.isDigit(entrada)){
                    estado = 4;
                    valorLexema = valorLexema + entrada;
                    estadoAnalizador = 2;
                }else if(entrada == 'E' || entrada == 'e'){
                    estado = 5;
                    valorLexema = valorLexema + entrada;
                    estadoAnalizador = 0;
                }else{
                    estado = 0;
                    estadoAnalizador = 3;
                    token = 100;
                }
                break;
            case 5:
                if(Character.isDigit(entrada)){
                    estado = 7;
                    valorLexema = valorLexema + entrada;
                    estadoAnalizador = 2;
                }else if(entrada == '+' || entrada == '-'){
                    estado = 6;
                    valorLexema = valorLexema + entrada;
                    estadoAnalizador = 0;
                }else{
                    estado = 0;
                    rutinaDeError(4, estadoAnalizador = 1);
                }
                break;
            case 6:
                if(Character.isDigit(entrada)){
                    estado = 7;
                    valorLexema = valorLexema + entrada;
                    estadoAnalizador = 2;
                }else{
                    estado = 0;
                    rutinaDeError(4, estadoAnalizador=1);
                }
                break;
            case 7:
                if(Character.isDigit(entrada)){
                    estado = 7;
                    valorLexema = valorLexema + entrada;
                    estadoAnalizador = 2;
                }else{
                    estado = 0;
                    estadoAnalizador = 3;
                    token = 100;
                }
                break;
                }
        return estadoAnalizador;
        }

    private void rutinaDeError(int op, int analizador) {
        switch(op){
            case 1:
                mensajeError = "No hay ninguna expresión regular que comience con ese símbolo. Por favor revisa tu entrada.";
                break;
            case 2:
                mensajeError = "No has completado la expresión regular, esperaba un .";
                break;
            case 3:
                mensajeError = "No has completado la expresión regula, esperaba un Dígito";
                break;
            case 4:
                mensajeError = "No se ha completado la expresión regular de notación exponencial";
                
        }
    }

    int analizar(char leido, int estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
