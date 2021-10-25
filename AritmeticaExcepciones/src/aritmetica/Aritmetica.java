package aritmetica;

import excepciones.OperacionException;

public class Aritmetica {

    public static int division(int numerador, int denominador) throws OperacionException{
        if(denominador == 0){
            throw new OperacionException("No se puede dividir entre 0");
        }
        
        return numerador / denominador;
    }
    
}
