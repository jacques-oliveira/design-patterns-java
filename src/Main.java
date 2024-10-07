import model.facade.Cliente;
import model.facade.OperacaoFacade;
import model.singleton.SingletonModel;
import model.strategy.*;

public class Main {
    public static void main(String[] args) {
        //singleton
        var singleton1 = SingletonModel.getInstancia();
        System.out.println(singleton1);
        var singleton2 = SingletonModel.getInstancia();
        System.out.println(singleton2);

        //strategy
        IEstado normal = new ComportamentoNormal();
        IEstado defensivo = new ComportamentoDefensivo();
        IEstado agressivo = new ComportamentoAgressivo();

        Robot robo = new Robot();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //facade
        OperacaoFacade concedeCreditoFacade = new OperacaoFacade();
        Cliente cliente1 = new Cliente("Mario");
        boolean resultado = concedeCreditoFacade.ConcederEmprestimo(cliente1,199000.00);
        System.out.println("O emprestimo pleitiado pelo cliente " + cliente1.getNome() + "foi " + (resultado == true ? "Concedido" : "Negado"));

    }
}