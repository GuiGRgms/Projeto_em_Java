/*
 Conversão de Temperaturas em Vetores
Receba 5 temperaturas em Celsius e armazene-as em um vetor. 
Converta cada temperatura para Fahrenheit utilizando a fórmula F = C * 9/5 + 32. 
uma condicional para exibir uma mensagem se alguma das temperaturas 
convertidas for superior a 100°F.
 */

package com.mycompany.conversao_de_temperaturas_em_vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author GuiGRgms
 */
public class Conversao_de_Temperaturas_em_Vetores {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Conversor de Temperaturas\nCelsius → Fahrenheit");

        StringBuilder saida = new StringBuilder("Resultados da Conversão:\n\n");

        for (int i = 0; i < 5; i++) {
            double celsius = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digite a temperatura " + (i + 1) + " em °C:")
            );

            double fahrenheit = celsius * 9 / 5 + 32;

            saida.append(String.format("%.2f°C = %.2f°F", celsius, fahrenheit));

            if (fahrenheit > 100) {
                saida.append("  ALERTA: Temperatura acima de 100°F!");
            }

            saida.append("\n");
        }

        JOptionPane.showMessageDialog(null, saida.toString());

        int opcao = JOptionPane.showConfirmDialog(
            null, 
            "Deseja realizar outra conversão?", 
            "Repetir", 
            JOptionPane.YES_NO_OPTION
        );

        if (opcao == JOptionPane.YES_OPTION) {
            main(args);
        } else {
            JOptionPane.showMessageDialog(null, "Programa encerrado!");
        }   
    }
}
