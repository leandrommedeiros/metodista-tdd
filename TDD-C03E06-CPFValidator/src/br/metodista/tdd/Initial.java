package br.metodista.tdd;

import java.util.Scanner;

/**
 * @title Validador de CPF
 * @since 06.10.2014
 * @author Leandro Melão Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 * @author Felipe Rodrigues Gil - R.A. 248543
 */
public class Initial {
    public static void main(String[] args) {
        char goAgain;

        System.out.println("====================");
        System.out.println("= VALIDADOR DE CPF =");
        System.out.println("====================");
        
        do {

            System.out.println("\nDigite um CPF para ser validado:");
            Scanner scan = new Scanner(System.in);

            if (CPFValidator.validate(scan.nextLine())) {
                System.out.println("CPF Válido!");
            }
            else {
                System.out.println("CPF Inválido!");
            }
            
            System.out.println("Deseja verificar outro CPF? (s/n)");
            goAgain = scan.nextLine().charAt(0);
        } while(goAgain == 's');
    }
}
