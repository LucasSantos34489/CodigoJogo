public class Jogador {

    private String nome;
    private int idade;
    private String email;
    private int pontuacao;
    private int pulosUsados;

    public Jogador(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.pontuacao = 0;
        this.pulosUsados = 0;
    }

    public void adicionarPontos(int pontos){
        this.pontuacao += pontos;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public boolean pular() {
        if (pulosUsados < 3) {
            pulosUsados++;
            return true;
        }
        return false;
    }

    public int getPulosRestantes() {
        return 3 - pulosUsados;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

}
