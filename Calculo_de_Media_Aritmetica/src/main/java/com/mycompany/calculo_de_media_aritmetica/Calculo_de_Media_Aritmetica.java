/*
Exercício 2: Cálculo de Média Aritmética
Crie um programa que peça ao usuário três notas de um aluno e calcule a média aritmética.
O programa deve informar se o aluno foi "aprovado" (média >= 7), "em recuperação" 
(média entre 5 e 6.9) ou "reprovado" (média < 5).
 */

package com.mycompany.calculo_de_media_aritmetica;

import javax.swing.JOptionPane;

/**
 *
 * @author GuiGRgms
 */
public class Calculo_de_Media_Aritmetica {

    public static void main(String[] args) {
      JOptionPane.showMessageDialog(null, "Cálculo de Média Aritmética");

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a terceira nota:"));

        double media = (nota1 + nota2 + nota3) / 3.0;

        String situacao;
        if (media >= 7.0) {
            situacao = "Aprovado!";
        } else if (media >= 5.0) {
            situacao = "Em Recuperação.";
        } else {
            situacao = "Reprovado.";
        }


        JOptionPane.showMessageDialog(null,
            String.format("A média aritmética do aluno é: %.2f\nSituação: %s", media, situacao));

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?", "Repetir", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            main(args);
        } else {
            JOptionPane.showMessageDialog(null, "Programa encerrado!");
        }
    }
}
