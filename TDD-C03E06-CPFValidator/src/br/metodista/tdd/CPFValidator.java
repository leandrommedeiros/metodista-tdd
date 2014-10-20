package br.metodista.tdd;

/*******************************************************************************
 *                              Validador de CPF.
 * 
 *   Esta classe é capaz de validar uma String como um CPF desde que haja pelo
 * menos 11 caracteres numéricos no parâmetro de entrada. Todo caracter não
 * numérico é ignorado assim como qualquer número que esteja após o 11º.
 * 
 * @since 06.10.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 * @author Felipe Rodrigues Gil - R.A. 248543
 ******************************************************************************/
public class CPFValidator {

    /**
     * Método Principal - Valida um CPF
     * @param inValue - String contendo um CPF formatado ou não.
     * @return Booleano que indica se CPF é ou não válido.
     */
    public static boolean validate(String inValue) {
        inValue = CPFValidator.getNumbersOnly(inValue);
        
        /*Caso após a validação o CPF informado tiver menos de
          11 digítos automáticamente assumo que é inválido. */
        if (inValue.length() < 11) return false;
        
        int iRightDigit1 = CPFValidator.getFirstDigit(inValue);
        int iRightDigit2 = CPFValidator.getSecondDigit(inValue);
        
        int inputDigit1 = Character.digit(inValue.charAt(9), 10);
        int inputDigit2 = Character.digit(inValue.charAt(10), 10);
        
        return ((iRightDigit1 == inputDigit1) && (iRightDigit2 == inputDigit2));
    }    
    
    /**
     * Método - Retorna Apenas Números
     * @param inValue - String contendo um CPF formatado ou não.
     * @return String contendo apenas os números recebidos por parâmetro.
     */
    public static String getNumbersOnly(String inValue) {
        String numbers = "";

        for (int idx = 0; idx < inValue.length(); idx++)
            if (Character.isDigit(inValue.charAt(idx)))
                numbers += String.valueOf(inValue.charAt(idx));
        
        return numbers;
    }
    
    /**
     * Método - Obter Primeiro Dígito
     * @param inValue - String contendo um CPF.
     * @return Inteiro com o valor do primeiro dígito verificado VÁLIDO
     */
    public static int getFirstDigit(String inValue) {
        return CPFValidator.getDigit(inValue, 2, 10);
    }

    /**
     * Método - Obter Segundo Dígito
     * @param inValue - String contendo um CPF.
     * @return Inteiro com o valor do segundo dígito verificado VÁLIDO
     */
    public static int getSecondDigit(String inValue) {
        return CPFValidator.getDigit(inValue, 1, 11);
    }
    
    /**
     * Método - Obter Dígito
     * @param inValue - String contendo um CPF.
     * @param inSubLength - Inteiro que defini quantos caracteres do final serão desconsiderados
     * @param inMultiplicator - Inteiro que define qual o valor inicial do multiplicador
     * @return Inteiro com o valor do primeiro dígito verificado VÁLIDO
     */
    private static int getDigit(String inValue, int inSubLength, int inMultiplicator) {
        int iAux, 
            iRest,
            iDigit,
            iSum = 0,
            iMax = 11 - inSubLength;

        for (int idx = 0; idx < iMax; idx++, inMultiplicator--) {
            iAux = Character.digit(inValue.charAt(idx), 10);
            iSum += iAux * inMultiplicator;
        }
        
        iRest = iSum % 11;
        
        if (iRest < 2) iDigit = 0;
        else           iDigit = 11 - iRest;
        
        return iDigit;
    }
}