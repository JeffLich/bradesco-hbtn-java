public class Email implements CanalNotificacao{

    public void notificar(Mensagem mensagem) {
        System.out.println("[EMAIL] {" + mensagem.tipoMensagem + "} - " + mensagem.texto);
    }
}
