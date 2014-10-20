package br.metodista.tdd;

import br.metodista.tdd.CPFValidator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @title Validador de CPF
 * @since 06.10.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 * @author Felipe Rodrigues Gil - R.A. 248543
 */
public class TestCPFValidator {
    @Test
    public void testGetNumbersOnly() {
        /* Quando informado um número de CPF a classe deve ser capaz de
        validá-lo independente de estar ou não formatado.
        */        
        assertEquals("27046416761", CPFValidator.getNumbersOnly("270.464.167-61"));
        assertEquals("27046416761", CPFValidator.getNumbersOnly("270a464/167xg()61"));
    }
    
    @Test
    public void testGetFirstDigit() {
        /* O CPF Informado é válido, portanto o primeiro dígito verificador
        deve ser igual à 6 e por consequência diferente de 0
        */
        assertEquals(6, CPFValidator.getFirstDigit("27046416761"));
        assertNotSame(0, CPFValidator.getFirstDigit("27046416761"));
    }
    
    @Test
    public void testGetSecondDigit() {
        /* O CPF Informado é válido, portanto o segundo dígito verificador
        deve ser igual à 1 e por consequência diferente de 0
        */
        assertEquals(1, CPFValidator.getSecondDigit("27046416761"));
        assertNotSame(0, CPFValidator.getFirstDigit("27046416761"));
    }

    @Test
    public void testValidation() {
        /* O método "validate()" deve retornar "False" caso um dos dois dígitos
        verificadores do CPF informado esteja incorreto ou o CPF tenha menos
        do que 11 dígitos, caso contrário o retorno deve ser "Verdadeiro".
        */
        assertTrue(CPFValidator.validate("270.464.167-61"));
        assertTrue(CPFValidator.validate("27046416761"));
        assertTrue(CPFValidator.validate("270A464/167+61"));
        assertFalse(CPFValidator.validate("123.456.789-10"));
        assertFalse(CPFValidator.validate("123.456.789"));
    }
}
