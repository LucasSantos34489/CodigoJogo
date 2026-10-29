public class Nivel implements Pergunta {

    private String pergunta;
    private String alternativa;
    private String respostaCerta;
    private String resposta;
    private int ponto;

    public Nivel(String pergunta, String alternativa, String respostaCerta) {
        this.pergunta = pergunta;
        this.alternativa = alternativa;
        this.respostaCerta = respostaCerta;
        this.ponto = 0;
    }

    public void mostrar() {
        IO.println(pergunta);
        IO.println(alternativa);
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }

    public String getRespostaCerta() {
        return respostaCerta;
    }

    public void setRespostaCerta(String respostaCerta) {
        this.respostaCerta = respostaCerta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    @Override
    public void pergunta(String pergunta) {

    }

    @Override
    public void respostaCerta(String respostaCerta) {

    }

    @Override
    public boolean resposta(String resposta) {
        this.resposta = resposta;

        if (resposta.equalsIgnoreCase(respostaCerta)){
            IO.println("Certa resposta!");
            return true;
        }else {
            IO.println("Resposta errada!");
            return false;
        }
    }

}
