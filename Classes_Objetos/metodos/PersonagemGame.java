public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void tomarDano(int quantidadeDano) {
        this.saudeAtual = Math.max(this.saudeAtual - quantidadeDano, 0);
    }

    public void receberCura(int quantidadeCura) {
        this.saudeAtual = Math.min(this.saudeAtual + quantidadeCura, 100);
    }
}
