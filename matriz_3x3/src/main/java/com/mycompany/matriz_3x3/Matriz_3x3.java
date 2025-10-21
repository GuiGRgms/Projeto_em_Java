/*
 Verificação de Maior Valor em uma Matriz e sua Posição
Crie um programa que receba uma matriz 3x3 de números inteiros. 
Percorra a matriz utilizando laços de repetição e determine o maior valor. 
Exiba o maior valor e sua posição (linha e coluna) na matriz.
 */

package com.mycompany.matriz_3x3;

import javax.swing.JOptionPane;

/**
 *
 * @author @author GuiGRgms
 */
public class Matriz_3x3 {

  public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        JOptionPane.showMessageDialog(null, "Digite os valores para a matriz 3x3");
        
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                matriz[l][c] = Integer.parseInt(
                    JOptionPane.showInputDialog(null, 
                        "Posição [" + l + "][" + c + "]:")
                );
            }
        }

    
        int maiorValor = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;

     
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (matriz[l][c] > maiorValor) {
                    maiorValor = matriz[l][c];
                    linhaMaior = l;
                    colunaMaior = c;
                }
            }
        }

  
        StringBuilder saida = new StringBuilder("Valores da Matriz 3x3:\n\n");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                saida.append(String.format("[%d][%d] = %d", l, c, matriz[l][c])).append("\n");
            }
        }

    
        saida.append("\nMaior valor encontrado: ").append(maiorValor)
             .append("\nPosição: [").append(linhaMaior).append("][").append(colunaMaior).append("]");


        JOptionPane.showMessageDialog(null, saida.toString());


        int opcao = JOptionPane.showConfirmDialog(null, "Deseja preencher outra matriz?", "Repetir", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            main(args); 
        } else {
            JOptionPane.showMessageDialog(null, "Programa encerrado!");
        }
    }
}
