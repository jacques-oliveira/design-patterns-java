package model.strategy;

public class ComportamentoDefensivo implements IEstado{
    @Override
    public void Mover() {
        System.out.println("Movimento Defensivo");
    }
}
