import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        interfaceUsuario iu = new interfaceUsuario(sc);
        GerenciadorDeArtistas gerenciadorDeArtistas = new GerenciadorDeArtistas(iu);
        GerenciadorDeDiscos gerenciadorDeDiscos = new GerenciadorDeDiscos(iu);

        int escolha = 0;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1 : Adicionar Artista");
            System.out.println("2 : Adicionar Dupla de Artistas");
            System.out.println("3 : Adicionar Disco");
            System.out.println("4 : Adicionar Faixa a um Disco");
            System.out.println("5 : Listar Discos");
            System.out.println("6 : Listar Artistas");
            System.out.println("7 : Remover Disco");
            System.out.println("8 : Sair");
            System.out.print("Escolha uma opção correta: ");
            escolha = iu.lerInteiro("");

            switch (escolha) {
                case 1:
                    gerenciadorDeArtistas.adicionarArtista();
                    break;
                case 2:
                    gerenciadorDeArtistas.adicionarDuplaDeArtistas();
                    break;
                case 3:
                    gerenciadorDeDiscos.adicionarDisco();
                    break;
                case 4:
                    gerenciadorDeDiscos.adicionarFaixaAoDisco();
                    break;
                case 5:
                    gerenciadorDeDiscos.listarDiscos();
                    break;
                case 6:
                    gerenciadorDeArtistas.listarArtistas();
                    break;
                case 7:
                    gerenciadorDeDiscos.removerDisco();
                    break;
                case 8:
                    System.out.println("Saindo..");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha um número correto.");
                    break;
            }
        } while (escolha != 8);

        iu.fecharScanner();
    }
}

