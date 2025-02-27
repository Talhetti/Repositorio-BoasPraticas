import java.util.ArrayList;

public class Disco {
    private String tituloDisco;
    private int anoLancamentoDisco;
    private Artista artistaDisco;
    private ArrayList<String> faixasDisco;

    public Disco(String tituloDisco, int anoLancamentoDisco, Artista artistaDisco) {
        this.tituloDisco = tituloDisco;
        this.anoLancamentoDisco = anoLancamentoDisco;
        this.artistaDisco = artistaDisco;
        this.faixasDisco = new ArrayList<>();
    }

    public String getTituloDisco() {return tituloDisco;}

    public void setTituloDisco(String tituloDisco) {
        this.tituloDisco = tituloDisco;
    }

    public int getAnoLancamentoDisco() {
        return anoLancamentoDisco;
    }

    public void setAnoLancamentoDisco(int anoLancamentoDisco) {
        this.anoLancamentoDisco = anoLancamentoDisco;
    }

    public Artista getArtistaDisco() {
        return artistaDisco;
    }

    public void setArtistaDisco(Artista artista) {
        this.artistaDisco = artistaDisco;
    }

    public ArrayList<String> getFaixasDisco() {
        return faixasDisco;
    }

    public void setFaixasDisco(ArrayList<String> faixas) {
        this.faixasDisco = faixas;
    }

    public void adicionarFaixa(String faixa) {
        faixasDisco.add(faixa);
    }

    @Override
    public String toString() {
        return "titulo: " + tituloDisco +
                "\nano lancamento: " + anoLancamentoDisco +
                "\nartista: " + artistaDisco.getNome() +
                "\nfaixas: " + faixasDisco +
                "\n--------";
    }
}
