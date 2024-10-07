package model.facade;

public class Cadin {
    public boolean EstaNoCadin(Cliente cliente){
        System.out.println("Verificando o CADIN para o cliente " + cliente.getNome());
        return false;
    }
}
