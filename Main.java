import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a descricao: ");
        String descricao = scanner.nextLine();

        System.out.println("Digite o valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // limpa enter

        System.out.println("Digite a data: ");
        String data = scanner.nextLine();

        System.out.println("Digite a categoria: ");
        String categoria = scanner.nextLine();

        Gastos gasto = new Gastos(descricao, valor, data, categoria);
        System.out.println("\nGasto cadastrado: ");
        System.out.println(gasto);

        scanner.close();
    }
}

