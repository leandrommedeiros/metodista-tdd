package br.com.metodista.tdd;


/**
 * @author Leandro Medeiros - R.A. 250544
 * @since 08-18-2014
 */
public class Calculator {
    public float sum(float a, float b) {
        return a + b;
    }
    
    public float subtract(float a, float b) {
        return a - b;
    }
    
    public float multiply(float a, float b) {
        return a * b;
    }
    
    public float divide(float a, float b) {
        try {
            return a / b;
        } catch (Exception e) {
            throw e;
        }
    }
    
    /**
     * @author Leandro Medeiros - R.A. 250544
     * @since 03-09-2014
     * @param newCommand
     * @return Cáculo (-1 para erros)
     */
    public float calc(String newCommand) {
        String[] sParams = newCommand.split(" ");
        
        switch(sParams[1]) {
            case "+" :
                return this.sum(Integer.parseInt(sParams[0]), 
                                Integer.parseInt(sParams[2]));
            
            case "-" :
                return this.subtract(Integer.parseInt(sParams[0]), 
                                     Integer.parseInt(sParams[2]));
                
            case "/" :
                return this.divide(Integer.parseInt(sParams[0]), 
                                   Integer.parseInt(sParams[2]));

            case "*" :
                return this.multiply(Integer.parseInt(sParams[0]), 
                                     Integer.parseInt(sParams[2]));
                
            default  :
                throw new IllegalArgumentException("COMANDO INCORRETO!");                
        }
    }
}