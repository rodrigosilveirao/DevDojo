import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        int salario = s.nextInt();
        if (salario > 4500){
            System.out.println(0.3 * salario);
        }else {
            System.out.println(0.15 * salario);
        }
    }

}
