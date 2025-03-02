import java.util.Scanner;

public class interfaceUsuario {
    private Scanner sc = new Scanner(System.in);

    public interfaceUsuario(Scanner sc) {
        this.sc = sc;
    }

    public String lerTexto(String mensagem) {
        //fazer comparação se o dado for correto, se não for texto, manda na tela para retornar um certo
        while (!sc.hasNextLine()) {
            System.out.println("Digite um texto.");
            sc.nextLine();
        }
        return sc.nextLine();
    }

    public int lerInteiro(String mensagem) {
        //fazer comparação se o dado for correto, se não for inteiro, manda na tela para retornar um certo
        while (!sc.hasNextInt()) {
            System.out.println("Digite um número inteiro.");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public void fecharScanner() {
        sc.close();
    }


}
