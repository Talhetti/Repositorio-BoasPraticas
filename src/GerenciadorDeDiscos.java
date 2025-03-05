import java.util.ArrayList;

public class GerenciadorDeDiscos {
    private final ArrayList<Disco> discos = new ArrayList<>();
    private EntradaUsuario iu;

    public GerenciadorDeDiscos(EntradaUsuario iu) {
        this.iu = iu;
    }

    public void adicionarDisco() {
        System.out.println("\nAdicionar disco: ");
        String titulo = iu.lerTexto("Título do disco: ");
        int anoLancamento = iu.lerInteiro("Ano de lançamento: ");
        String nomeArtista = iu.lerTexto("Nome do artista ou dupla: ");
        Artista artista = GerenciadorDeArtistas.buscarArtistaPorNome(nomeArtista);

        if (artista == null) {
            System.out.println("Artista não encontrado ou cadastrado.");
            return;
        }

        Disco disco = new Disco(titulo, anoLancamento, artista);
        discos.add(disco);
        System.out.println("Disco adicionado!");
    }

    public void adicionarFaixaAoDisco() {
        System.out.println("\nAdicionar Faixa ao Disco: ");
        String tituloDisco = iu.lerTexto("Título do disco: ");

        for (Disco disco : discos) {
            if (disco.getTitulo().equalsIgnoreCase(tituloDisco)) {
                String faixa = iu.lerTexto("Nome da faixa: ");
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

    public void removerDisco() {
        System.out.println("\nRemover disco: ");
        String tituloDisco = iu.lerTexto("Título do disco: ");

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
