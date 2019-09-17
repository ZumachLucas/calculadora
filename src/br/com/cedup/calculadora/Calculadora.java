package br.com.cedup.calculadora;

/**
 *
 * @author Lucas Matheus Zumach
 */

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner calc = new Scanner(System.in); // cria o scanner
        String entrada = "s"; // cria entrada com valor s

        System.out.println("Bem vindo ao Calculator"); 

        while (entrada.equals("s")) { //inicia o loop se for igual a s
            System.out.println("\n^.^ Calculator ^.^");
            System.out.println("\nDigite o primeiro número: ");
            double num1 = calc.nextDouble(); // recolhe o primeiro número
            System.out.println("Digite a operação que deseja fazer (+ - * /)");
            String Op = calc.next(); // recolhe a operação
            System.out.println("Digite o segundo número");
            double num2 = calc.nextDouble(); // recolhe o segundo número

            double resultado;
            
            if (Op.equals("+")) { // se a op. desejada for +
                resultado = num1 + num2;  // efetua a soma                         
                System.out.println("O resultado é: " + resultado); // imprime o resultado
                System.out.println("Deseja fazer outra operação? (s / n)");
                entrada = calc.next();
            } else if (Op.equals("-")) { 
                resultado = num1 - num2;
                System.out.println("O resultado é: " + resultado);
                System.out.println("Deseja fazer outra operação? (s / n)");
                entrada = calc.next();
            } else if (Op.equals("*")) { 
                resultado = num1 * num2;
                System.out.println("O resultado é: " + resultado);
                System.out.println("Deseja fazer outra operação? (s / n)");
                entrada = calc.next();
            } else if (Op.equals("/")) { 
                resultado = num1 / num2;
                System.out.println("O resultado é: " + resultado);
                System.out.println("Deseja fazer outra operação? (s / n)");
                entrada = calc.next();
            }
        }
    }
} //Fim do programa
