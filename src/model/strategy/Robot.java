package model.strategy;

public class Robot {
    private IEstado strategy;

    public void setComportamento(IEstado estado){
        this.strategy = estado;
    }

    public void mover(){
        strategy.Mover();
    }
}
