import java.util.Scanner;

public class EntradaUsuario {
    private final Scanner sc;

    public EntradaUsuario(Scanner sc) {
        this.sc = sc;
    }

    public String lerTexto(String mensagem) {
        System.out.print(mensagem);

        while (!sc.hasNextLine()) {
            System.out.println("Digite um texto.");
            sc.nextLine();
        }
        return sc.nextLine();
    }


    public int lerInteiro(String mensagem) {
        System.out.print(mensagem);

        while (!sc.hasNextInt()) {
            System.out.println("Por favor, insira um número válido.");
            sc.nextLine();
        }
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }


    public void fecharScanner() {
        sc.close();
    }
}

