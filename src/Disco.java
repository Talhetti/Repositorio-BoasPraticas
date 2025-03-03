import java.util.ArrayList;

public class Disco {
    private String titulo;
    private int anoLancamento;
    private Artista artista;
    private ArrayList<String> faixas;//maneira certa para colocar lista como atributo

    public Disco(String titulo, int anoLancamento, Artista artista) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.artista = artista;
        this.faixas = new ArrayList<>();
    }//construtor não recebe faixas como parâmetro pois posteriormente serão adicionadas

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public ArrayList<String> getFaixas() {
        return faixas;
    }

    public void setFaixas(ArrayList<String> faixas) {
        this.faixas = faixas;
    }

    public void adicionarFaixa(String faixa) {
        faixas.add(faixa);
    }

    @Override
    public String toString() {
        return "titulo: " + titulo +
                "\nano lancamento: " + anoLancamento +
                "\nartista: " + artista.getNome() + //usei o getNome para pegar o atributo da outra classe
                "\nfaixas: " + faixas +
                "\n--------";
    }
}
