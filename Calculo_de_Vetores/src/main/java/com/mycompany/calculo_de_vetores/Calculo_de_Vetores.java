/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculo_de_vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author GuiGRgms
 */
public class Calculo_de_Vetores {

    public static void main(String[] args) {

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] resultado = new int[5];

        JOptionPane.showMessageDialog(null, "Operações com Vetores\n\n" +
            "→ Posições pares: soma dos elementos\n" +
            "→ Posições ímpares: multiplicação dos elementos");

     
        for (int i = 0; i < 5; i++) {
            vetor1[i] = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número do PRIMEIRO vetor:")
            );
        }

   
        for (int i = 0; i < 5; i++) {
            vetor2[i] = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número do SEGUNDO vetor:")
            );
        }

      
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { 
                resultado[i] = vetor1[i] + vetor2[i];
            } else { 
                resultado[i] = vetor1[i] * vetor2[i];
            }
        }

        StringBuilder saida = new StringBuilder("Resultados dos Vetores:\n\n");
        for (int i = 0; i < 5; i++) {
            saida.append("Posição ").append(i)
                 .append(": ").append(resultado[i])
                 .append("\n");
        }

        JOptionPane.showMessageDialog(null, saida.toString());

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?", "Repetir", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            main(args); 
        } else {
            JOptionPane.showMessageDialog(null, "Programa encerrado!");
        }
    }
}