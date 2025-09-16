/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraIMCTest {
    
    CalculadoraIMC calc = new CalculadoraIMC();

    @Test
    void testCalculoIMC_CasoNormal() {
        // Testa um caso de IMC normal
        assertEquals(22.86, calc.calcular(70, 1.75), 0.01);
    }

    @Test
    void testClassificacao_AbaixoDoPeso() {
        // Testa a classificação para IMC abaixo do peso
        assertEquals("Abaixo do peso", calc.getClassificacao(18.4));
    }

    @Test
    void testClassificacao_Sobrepeso() {
        // Testa a classificação para Sobrepeso
        assertEquals("Sobrepeso", calc.getClassificacao(27.5));
    }
}