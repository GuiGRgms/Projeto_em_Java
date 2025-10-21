/*
 Exercício 4: Classificação de Triângulos
O programa deve solicitar ao usuário que insira três números que 
representem os lados de um triângulo. Verifique se os valores formam
um triângulo e, se sim, classifique-o como "equilátero", "isósceles" ou "escaleno".
A condição para formar um triângulo é que a soma de dois lados 
deve ser sempre maior que o terceiro.
 */

package com.mycompany.classificacao_de_triangulos;

import javax.swing.JOptionPane;

/**
 *
 * @author GuiGRgms
 */
public class Classificacao_de_Triangulos {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Classificação de Triângulos");

        double ladoA = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o comprimento do primeiro lado (A):"));
        double ladoB = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o comprimento do segundo lado (B):"));
        double ladoC = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o comprimento do terceiro lado (C):"));

        boolean eTriangulo = (ladoA + ladoB > ladoC) &&
                             (ladoA + ladoC > ladoB) &&
                             (ladoB + ladoC > ladoA);

        String mensagem;

        if (eTriangulo) {
  
            if (ladoA == ladoB && ladoB == ladoC) {
                mensagem = "Os lados formam um triângulo EQUILÁTERO.";
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                mensagem = "Os lados formam um triângulo ISÓSCELES.";
            } else {
                mensagem = "Os lados formam um triângulo ESCALENO.";
            }
        } else {
            mensagem = "Os valores informados NÃO formam um triângulo.";
        }

        JOptionPane.showMessageDialog(null, mensagem);

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja verificar outro triângulo?", "Repetir", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            main(args); 
        } else {
            JOptionPane.showMessageDialog(null, "Programa encerrado!");
        }
    }
}
