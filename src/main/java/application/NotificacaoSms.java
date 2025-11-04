package application;
 
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
 
@Getter
@Setter
 
public class NotificacaoSms extends Notificacao implements Priorizavel {
    private String numeroTelefone;
    private String mensagem;
   
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private int NivelPrioridade;
 
    public NotificacaoSms(String remetente, String numeroTelefone, String mensagem, int prioridade)
    {
        super(remetente);
        this.numeroTelefone = numeroTelefone;
        this.mensagem = mensagem;
        this.NivelPrioridade = prioridade;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS (Prioridade" + this.NivelPrioridade + ") para " + this.numeroTelefone);
    }
    
    @Override
    public void registrarLog(){
        System.out.println("[LOG] SMS ("+ "Prioridade" + this.NivelPrioridade + ") para " + this.numeroTelefone);
    }


    @Override
    public int obterNivelPrioridade() {
        return this.NivelPrioridade;
    }

    @Override
    public void definirPrioridade(int nivel) {
        if(nivel >= 1 && nivel <= 10) {
            this.NivelPrioridade = nivel;
            System.out.println("Prioridade Redefinida: " + this.NivelPrioridade);

        } else {
            System.out.println("Nivel de Prioridade Inválido (1-10)");
        }
    }
}
 