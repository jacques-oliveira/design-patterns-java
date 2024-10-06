package model;

public class SingletonModel {
    private static SingletonModel instancia;

    private SingletonModel(){
        super();
    }

    public static SingletonModel getInstancia(){
        if(instancia == null){
            instancia = new SingletonModel();
        }
        return instancia;
    }
}
