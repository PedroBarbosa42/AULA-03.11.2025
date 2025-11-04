package application;

public class Main {
    public static void main(String[] args) {
        NotificacaoSms notifSms = new NotificacaoSms("Pedro", "1411113333","Mensagem de teste",1);

        
        notifSms.exibirInformacoesRemetente();
        notifSms.enviar();
        notifSms.registrarLog();

        notifSms.definirPrioridade(8);
        System.out.println(notifSms.obterNivelPrioridade());
        notifSms.definirPrioridade(0);

        Notificacao notif = new NotificacaoSms("Fulano", "1411112222", "Testando", 3);

        notif.exibirInformacoesRemetente();
        notif.enviar();

        Priorizavel objPriorizavel = new NotificacaoSms("Ciclano", "1422226666", "Novo Teste", 2);

        objPriorizavel.definirPrioridade(6);
      
    }
}
 