import java.util.Scanner;

public class TorneioNatacao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Digite seu nome: ");
        String nome = s.next();
        System.out.println("Digite sua idade para saber qual sua categoria: ");
        int idade = s.nextInt();
        if (idade <= 10){
            System.out.println(" Categoria infantil. ");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(" Categoria juvenil. ");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome +" com sua idade (" + idade + ") voce esta na categoria pré-adulto. ");
        } else {
            System.out.println(" Categoria adulto. ");
        }
    }
}
