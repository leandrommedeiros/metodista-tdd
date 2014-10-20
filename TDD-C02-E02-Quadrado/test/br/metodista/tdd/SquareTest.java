package br.metodista.tdd;

import br.metodista.tdd.Square;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @title Classe para Teste (JUnit) - Área do Quadrado
 * @author Leandro Melão Medeiros - R.A. 250544
 * @since 2014-09-01
 *
 * Testes
 * 
 * 1. Altura / Largura devem ser iguais
 * 2. Medidas devem ser positivas
 * 3. Calculo da área de um quadrado de lados = 4u.c. deve retornar 16u.a.
 */
public class SquareTest {
    @Test
    public void testSquareAreaCalc() {
        Square quadrado = new Square();
        quadrado.setHeigth(4);
        quadrado.setWidth(4);
        
        
        assertEquals(16, quadrado.area(4, 4));
    }    
}