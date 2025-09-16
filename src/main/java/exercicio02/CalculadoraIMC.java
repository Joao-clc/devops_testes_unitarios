/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

public class CalculadoraIMC {
    public double calcular(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
        return peso / (altura * altura);
    }

    public String getClassificacao(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 25) return "Peso normal";
        if (imc < 30) return "Sobrepeso";
        if (imc < 35) return "Obesidade Grau I";
        if (imc < 40) return "Obesidade Grau II";
        return "Obesidade Grau III";
    }
}
