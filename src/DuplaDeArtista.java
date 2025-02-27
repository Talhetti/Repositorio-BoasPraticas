public class DuplaDeArtista extends Artista {
    private String nomeArtista1;
    private String nomeArtista2;

    public DuplaDeArtista(String nomeDupla, String generoMusical, String nomeArtista1, String nomeArtista2) {
        super(nomeDupla, generoMusical);
        this.nomeArtista1 = nomeArtista1;
        this.nomeArtista2 = nomeArtista2;
    }

    public String getNomeArtista1() {
        return nomeArtista1;
    }

    public void setNomeArtista1(String nomeArtista1) {
        this.nomeArtista1 = nomeArtista1;
    }

    public String getNomeArtista2() {
        return nomeArtista2;
    }

    public void setNomeArtista2(String nomeArtista2) {
        this.nomeArtista2 = nomeArtista2;
    }

    @Override
    public String toString() {
        return "nome da dupla: " + getNome() +
                "\ngenero musical: " + getGeneroMusical() +
                "\nartista 1: " + nomeArtista1 +
                "\nartista 2: " + nomeArtista2 +
                "\n--------";
    }
}

