/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConversorTemperaturaTest {
    private static final double DELTA = 0.001; // Margem de erro para doubles

    @Test
    void testCelsiusParaFahrenheit_Congelamento() {
        // Testa caso de borda: 0°C = 32°F
        assertEquals(32.0, ConversorTemperatura.celsiusParaFahrenheit(0.0), DELTA);
    }

    @Test
    void testCelsiusParaFahrenheit_Ebulicao() {
        // Testa caso de borda: 100°C = 212°F
        assertEquals(212.0, ConversorTemperatura.celsiusParaFahrenheit(100.0), DELTA);
    }
    
    @Test
    void testFahrenheitParaCelsius_Normal() {
        // Testa caso normal: 77°F = 25°C
        assertEquals(25.0, ConversorTemperatura.fahrenheitParaCelsius(77.0), DELTA);
    }
}