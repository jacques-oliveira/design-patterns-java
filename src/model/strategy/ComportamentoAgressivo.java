package model.strategy;

public class ComportamentoAgressivo implements IEstado{
    @Override
    public void Mover() {
        System.out.println("Movimento Agressivo");
    }
}
