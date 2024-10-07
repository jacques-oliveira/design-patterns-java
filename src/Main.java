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

    }
}