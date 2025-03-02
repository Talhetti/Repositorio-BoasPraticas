import java.util.ArrayList;

public class GerenciadorDeArtistas {
    private ArrayList<Artista> artistas = new ArrayList<>();
    private interfaceUsuario iu;

    public GerenciadorDeArtistas(interfaceUsuario iu) {
        this.iu = iu;
    }

    public void adicionarArtista() {
        System.out.println("\nAdicionar artista");
        String nome = iu.lerTexto("Nome do artista: ");
        String generoMusical = iu.lerTexto("Gênero musical dele: ");

        Artista artista = new Artista(nome, generoMusical);
        artistas.add(artista);
        System.out.println("Artista adicionado!");
    }

    public void adicionarDuplaDeArtistas() {
        System.out.println("\nAdicionar uma dupla de artistas");
        String nomeDupla = iu.lerTexto("Nome da dupla: ");
        String generoMusical = iu.lerTexto("Gênero musical da dupla: ");
        String nomeArtista1 = iu.lerTexto("Nome do primeiro artista: ");
        String nomeArtista2 = iu.lerTexto("Nome do segundo artista: ");

        DuplaDeArtista dupla = new DuplaDeArtista(nomeDupla, generoMusical, nomeArtista1, nomeArtista2);
        artistas.add(dupla);
        System.out.println("Dupla de artistas adicionada!");
    }

    public static Artista buscarArtistaPorNome(String nome) {
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

    public void removerArtista() {
        System.out.println("\nRemover artista");
        String nome = iu.lerTexto("Nome do artista: ");

        Artista artista = buscarArtistaPorNome(nome);
        if (artista == null) {
            System.out.println("Artista não encontrado ou cadastrado.");
            return;
        }

        artistas.remove(artista);
        System.out.println("Artista removido!");
    }
}
