import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeArtistas {
    private ArrayList<Artista> artistas = new ArrayList<>();

    public void adicionarArtista(Scanner sc) {
        System.out.println("\nAdicionar artista");
        System.out.print("Nome do artista: ");
        String nome = sc.nextLine();
        System.out.print("Gênero musical dele: ");
        String generoMusical = sc.nextLine();

        Artista artista = new Artista(nome, generoMusical);
        artistas.add(artista);
        System.out.println("Artista adicionado!");
    }

    public Artista buscarArtistaPorNome(String nome) {
        for (Artista artista : artistas) {
            if (artista.getNome().equalsIgnoreCase(nome)) {
                return artista;
            }
        }
        return null;
    }

    public void listarArtistas() {
        if (artistas.isEmpty()) {
            System.out.println("Nenhum artista foi cadastrado.");
        } else {
            System.out.println("\nLista de artistas: ");
            for (Artista artista : artistas) {
                System.out.println(artista);
            }
        }
    }
}
