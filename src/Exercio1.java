import java.util.Scanner;

public class Exercio1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

//        System.out.println("digite um numero");
//    int idade = scanner.nextInt();
//    int meses = idade * 12;
//    int dias = idade * 365;
//        System.out.println("sua idade "+ idade);
//        System.out.println("sua idade em meses "+ meses);
//        System.out.println("sua idade em dias "+ dias);
//        int num = scanner.nextInt();
//        int anterior = num-1;
//        int sucessor = num+1;
//        System.out.println("seu numero "+ num);
//        System.out.println("numero anterior "+ anterior);
//        System.out.println("numero sucessor "+ sucessor);



//        int m1= 8;
//        int m2= 9;
//        int m3= 7;
//        float media= (m1+m2+m3)/3;
//        System.out.println("Media 1 ="+media);
//        int m4= 4;
//        int m5= 5;
//        int m6= 6;
//        float media2= (m4+m5+m6)/3;
//        System.out.println("Media 2 ="+media2);
//        float soma= media+media2;
//        System.out.println("soma das medias ="+ soma);
//        float media3= soma/2;
//        System.out.println("a media da media é "+media3);

//        System.out.println("digite o seu nivel");
//        int nivel = scanner.nextInt();
//        double um = nivel*7 ;
//        double dois =  (um*7);
//        double tres =  (dois*7);
//        System.out.println("para subir um nivel é preciso "+ um+ " de xp" );
//        System.out.println("para subir dois niveis é preciso "+ dois+ " de xp");
//        System.out.println("para subir tres niveis é preciso "+ tres+ " de xp");

        System.out.println("Digite o seu nível: ");
        int inicial = scanner.nextInt();

        System.out.println("Digite o número de níveis que deseja subir: ");
        int num = scanner.nextInt();
        double xp = 200;

        for (int i = 1; i <= num; i++) {
            double proximo = xp *= 1.5;
            System.out.println("é preciso de " + proximo + " de xp para subir para o nivel "+ (inicial+i) ) ;
        }
    }
}
