import java.util.ArrayList;
//Aplicando boas práticas de programação nesse código.
public class Disco { //A antiga classe disco, não tinha variáveis bem definidas. A adição da palavra Disco ao final da palavra
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

    /*public void setTituloDisco(String tituloDisco) {
        this.tituloDisco = tituloDisco;
    }
    Esse bloco de código está suscetível a erro, pois o usuário pode colocar um título de disco nulo ou vazio, o que não é possível.
    */

    public void setTituloDisco(String tituloDisco) {
        if(tituloDisco == null || tituloDisco.trim().isEmpty()){
            System.out.println("O título do disco não pode ser nulo ou vazio.");
        } else {
            this.tituloDisco = tituloDisco;
        }
    }

    public int getAnoLancamentoDisco() {
        return anoLancamentoDisco;
    }

    /*public void setAnoLancamentoDisco(int anoLancamentoDisco) {
        this.anoLancamentoDisco = anoLancamentoDisco;
    }
    Esse bloco de código está suscetível a erro, pois o usuário para colocar zero na data de lançamento do disco, o que não é possível.
    */

    public void setAnoLancamentoDisco(int anoLancamentoDisco) {
        if(anoLancamentoDisco <= 0){
            System.out.println("O ano de lançamento do disco não pode ser zero ou menor que zero.");
        } else {
            this.anoLancamentoDisco = anoLancamentoDisco;
        }
    }//Código alterado e melhorado

    public Artista getArtistaDisco() {
        return artistaDisco;
    }

    /*public void setArtistaDisco(Artista artista) {
        this.artistaDisco = artistaDisco;
    }

    Esse bloco de código está suscetível a erro, pois o usuário pode colocar um artista nulo, o que não é possível.

    */

    public void setArtistaDisco(Artista artistaDisco) {
        if(artistaDisco == null){
            System.out.println("O artista do disco não pode ser nulo.");
        } else {
            this.artistaDisco = artistaDisco;
        }
    }//Código alterado e melhorado

    public ArrayList<String> getFaixasDisco() {
        return faixasDisco;
    }

    /*public void setFaixasDisco(ArrayList<String> faixas) {
        this.faixasDisco = faixas;
    }*/
    //Esse bloco de código está suscetível a erro, pois o usuário pode colocar uma lista de faixas nula, o que não é possível.

    public void setFaixasDisco(ArrayList<String> faixasDisco) {
        if(faixasDisco == null){
            System.out.println("A lista de faixas do disco não pode ser nula.");
        } else {
            this.faixasDisco = faixasDisco;
        }
    }//Código alterado e melhorado

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
