import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = s.nextInt();
        if (idade >= 18){
            System.out.println("É adulto");
        } else {
            System.out.println("Não é adulto");
        }
    }
}
