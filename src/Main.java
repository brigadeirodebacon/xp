import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);
//        System.out.println("1 numero");
//        int num = scanner.nextInt();
//        System.out.println("2 numero");
//        int num2 = scanner.nextInt();
//        int resu =num+num2;
//        scanner.close();
//        System.out.println("soma = "+resu);
//
//
//        System.out.println("1 numero");
//        int num3 = scanner.nextInt();
//        System.out.println("2 numero");
//        int num4 = scanner.nextInt();
//        int resu2 =num3-num4;
//        scanner.close();
//        System.out.println("subtração = "+ resu2);
//
//
//
//        System.out.println("1 numero");
//        int num5 = scanner.nextInt();
//        System.out.println("2 numero");
//        int num6 = scanner.nextInt();
//        int resu3 =num5*num6;
//        scanner.close();
//        System.out.println("multi = "+ resu3);
//
//       ;
//        System.out.println("1 numero");
//        int num7 = scanner.nextInt();
//        System.out.println("2 numero");
//        int num8 = scanner.nextInt();
//        int resu4 =num7/num8;
//        scanner.close();
//        System.out.println("div = "+ resu4);
        System.out.println("digite um numero");
        int numero = scanner.nextInt();
        int resultado =numero%2;
        if (resultado == 0) {
            System.out.println(numero + " é um número PAR.");
        } else {
            System.out.println(numero + " é um número ÍMPAR.");
        }



        int valor = 10;
        System.out.println("variavel do tipo int: " + valor);

        double VALOR = 5;
        System.out.println("variavel do tipo double "+ VALOR);

        short SO = 44;
        System.out.println("variavel do tipo short "+SO);

        long log = 999;
        System.out.println("variavel do tipo long "+log);

        byte by = 80;
        System.out.println("variavel do tipo byte " +by);

        boolean gey = false;
        System.out.println("variavel do tipo boolean "+gey);

        String cah = "cara";
        System.out.println("variavel do tipo string " +cah);

        char cha = 88;
        System.out.println("variavel do tipo char "+cha);

        float flu = 60;
        System.out.println("variavel do tipo float "+flu);


    }
}