import java.util.ArrayList;

public class ProcessadorVideo {
    ArrayList<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal (CanalNotificacao canalNotificacao) {
        canais.add(canalNotificacao);
    }

    public void processar (Video video){
        Mensagem mensagem = new Mensagem();
        mensagem.setTipoMensagem(TipoMensagem.LOG);
        mensagem.setTexto(video.arquivo + " - " + video.formato);
        canais.forEach(canal -> canal.notificar(mensagem));
    }
}
