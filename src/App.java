import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o valor de um lado de um quadrado: ");
        double lado = sc.nextDouble();

        sc.close();

        double dobrodaArea = (lado * lado) * 2;

        System.out.println("O dobro da área do quadrado é: "+dobrodaArea);   
    }
}