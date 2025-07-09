public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public String getStatus() {
        return status;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        this.status = saudeAtual > 0 ? "vivo" : "morto";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void tomarDano(int quantidadeDeDano) {
        setSaudeAtual(Math.max(this.saudeAtual - quantidadeDeDano, 0));
    }

    public void receberCura(int quantidadeDeCura) {
        setSaudeAtual(Math.min(this.saudeAtual + quantidadeDeCura, 100));

    }
}
