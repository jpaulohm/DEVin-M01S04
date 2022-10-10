package tech.devinhouse.Exercicios.Excecoes;

import java.util.Scanner;

public class PerguntaIdade {
    public static void main(String[] args) {
        Integer idade = -1;
        Scanner scan = new Scanner(System.in);


        while (idade<0 || idade>100){
            System.out.printf("Digite sua idade:");
            String stringDoScanner = scan.nextLine();

            try{
                idade = Integer.valueOf(stringDoScanner);
                if (idade<0 || idade>100) {
                    throw new IdadeInvalidaException();
                }
            }catch (NumberFormatException e){
                System.out.println("Valor informado nao e numero.");
            }catch (IdadeInvalidaException e){
                System.out.println("Valor deve ser entre 0 e 100.");
            }
        }

    System.out.println("Sua idade e " + idade);

    }
}
