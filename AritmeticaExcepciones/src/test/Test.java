package test;

import aritmetica.Aritmetica;

public class Test {
    
    public static void main(String[] args) {
        
        int res = 0;
        
        try {
            
            res = Aritmetica.division(10, 0);
            
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            System.out.println("\nBloque Finally");
        }
        

    }
    
}
