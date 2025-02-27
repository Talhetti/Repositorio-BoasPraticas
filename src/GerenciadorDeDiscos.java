import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeDiscos {
    private ArrayList<Disco> discos = new ArrayList<>();

    public void adicionarDisco(Scanner sc, GerenciadorDeArtistas gerenciadorDeArtistas) {
        System.out.println("\nAdicionar disco: ");
        System.out.print("Título do disco: ");
        String titulo = sc.nextLine();
        System.out.print("Ano de lançamento: ");
        int anoLancamento = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do artista ou dupla: ");
        String nomeArtista = sc.nextLine();
        Artista artista = gerenciadorDeArtistas.buscarArtistaPorNome(nomeArtista);

        if (artista == null) {
            System.out.println("Artista não encontrado ou cadastrado.");
            return;
        }

        Disco disco = new Disco(titulo, anoLancamento, artista);
        discos.add(disco);
        System.out.println("Disco adicionado!");
    }

    public void adicionarFaixaAoDisco(Scanner sc) {
        System.out.println("\nAdicionar Faixa ao Disco: ");
        System.out.print("Título do disco: ");
        String tituloDisco = sc.nextLine();

        for (Disco disco : discos) {
            if (disco.getTitulo().equalsIgnoreCase(tituloDisco)) {//usado para achar o titulo correto
                System.out.print("Nome da faixa: ");
                String faixa = sc.nextLine();
                disco.adicionarFaixa(faixa);
                System.out.println("Faixa adicionada!");
                return;
            }
        }
        System.out.println("Disco não encontrado ou cadastrado.");
    }

    public void listarDiscos() {
        if (discos.isEmpty()) {
            System.out.println("Nenhum disco cadastrado.");
        } else {
            System.out.println("\nLista de Discos: ");
            for (Disco disco : discos) {
                System.out.println(disco);
            }
        }
    }

    public void removerDisco(Scanner sc) {
        System.out.println("\nRemover disco: ");
        System.out.print("Título do disco: ");
        String tituloDisco = sc.nextLine();

        for (Disco disco : discos) {
            if (disco.getTitulo().equalsIgnoreCase(tituloDisco)) {
                discos.remove(disco);
                System.out.println("Disco removido!");
                return;
            }
        }
        System.out.println("Disco não encontrado ou cadastrado.");
    }
}
