package br.com.metodista.tdd;

import java.util.Scanner;

/**
 * Classe - Programa Calculadora
 * @author Leandro Medeiros - RA 250544
 * @since 08-18-2014
 */
public class CalcProgram {
    public void sum() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        float num2 = scan.nextInt();
        
        Calculator calc = new Calculator();
        System.out.println("A soma equivale à " + calc.sum(num1, num2));
        new java.util.Scanner(System.in).nextLine();
    }

    public void subtract() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        float num2 = scan.nextInt();
        
        Calculator calc = new Calculator();
        System.out.println("A soma equivale à " + calc.subtract(num1, num2));
        new java.util.Scanner(System.in).nextLine();
    }

    public void multiply() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        float num2 = scan.nextInt();
        
        Calculator calc = new Calculator();
        System.out.println("A soma equivale à " + calc.multiply(num1, num2));
        new java.util.Scanner(System.in).nextLine();
    }

    public void divide() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        float num2 = scan.nextInt();
        
        Calculator calc = new Calculator();
        System.out.println("A soma equivale à " + calc.divide(num1, num2));
        new java.util.Scanner(System.in).nextLine();
    }

    public void initialize() {
        int iOption;
        
        do {
            System.out.println("###############\n# CALCULADORA #\n###############\n\n");
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair");
            System.out.print("Função: ");

            Scanner scan = new Scanner(System.in);        
            iOption = scan.nextInt();

            switch (iOption) {
                case 1:
                    this.sum();
                break;
                    
                case 2:
                    this.subtract();
                break;
                    
                case 3:
                    this.multiply();
                break;
                    
                case 4:
                    this.divide();
                break;
                
                case 5:
                break;
                    
                default:
                    System.out.println("Opção Inválida! Pressione qualquer tecla para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                break;
            }
        } while (iOption != 5);        
    }
}