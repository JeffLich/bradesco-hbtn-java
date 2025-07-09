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

    public void tomarDano(int quantidadeDeDano) {
        this.saudeAtual = Math.max(this.saudeAtual - quantidadeDeDano, 0);
    }

    public void receberCura(int quantidadeDeCura) {
        this.saudeAtual = Math.min(this.saudeAtual + quantidadeDeCura, 100);
    }
}
