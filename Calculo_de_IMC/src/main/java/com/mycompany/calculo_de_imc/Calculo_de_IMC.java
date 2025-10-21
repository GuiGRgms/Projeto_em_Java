/*
 /*Exercício 1: Cálculo de IMC
Peça ao usuário para inserir o peso 
(em kg) e a altura (em metros), e calcule o 
Índice de Massa Corporal (IMC) usando a fórmula:

O programa deve informar se o usuário 
está "abaixo do peso" (IMC < 18.5), "peso normal" 
(IMC entre 18.5 e 24.9), "sobrepeso" (IMC entre 25 e 29.9) ou "obesidade" (IMC >= 30).

*/

package com.mycompany.calculo_de_imc;

import javax.swing.JOptionPane;

/**
 *
 * @author GuiGRgms
 */
public class Calculo_de_IMC {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Calculadora de Índice de Massa Corporal (IMC)");

        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, insira o seu peso (em kg):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, insira a sua altura (em metros):"));

        double imc = peso / Math.pow(altura, 2);

        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            classificacao = "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }

        JOptionPane.showMessageDialog(null, 
            String.format("Seu IMC é: %.2f\nClassificação: %s", imc, classificacao)
        );

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?", "Escolha", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            main(args);
        } else {
            JOptionPane.showMessageDialog(null, "Programa encerrado!");
        }
    }
}
