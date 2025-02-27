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
    }//método que criei para que o usuário cadastre somente um artista

    public void adicionarDuplaDeArtistas(Scanner sc) {
        System.out.println("\nAdicionar uma dupla de artistas");
        System.out.print("Nome da dupla: ");
        String nomeDupla = sc.nextLine();
        System.out.print("Gênero musical da dupla: ");
        String generoMusical = sc.nextLine();
        System.out.print("Nome do primeiro artista: ");
        String nomeArtista1 = sc.nextLine();
        System.out.print("Nome do segundo artista: ");
        String nomeArtista2 = sc.nextLine();

        DuplaDeArtista dupla = new DuplaDeArtista(nomeDupla, generoMusical, nomeArtista1, nomeArtista2);
        artistas.add(dupla);
        System.out.println("Dupla de artistas adicionada!");
    }//esse é o método para o usuário cadastrar uma dupla de artistas

    public Artista buscarArtistaPorNome(String nome) {
        for (Artista artista : artistas) {
            if (artista.getNome().equalsIgnoreCase(nome)) {
                return artista;
            }
        }
        return null;
    }//foi necessário criar esse método para associar com o gerenciador de discos depois

    public void listarArtistas() {
        if (artistas.isEmpty()) {//usei para verificar se lista está vazia
            System.out.println("Nenhum artista foi cadastrado.");
        } else {
            System.out.println("\nLista de artistas: ");
            for (Artista artista : artistas) {
                System.out.println(artista);
            }
        }
    }
}
