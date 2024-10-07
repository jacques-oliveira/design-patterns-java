package model.facade;

public class Serasa {
    public boolean EstaNoSerasa(Cliente cliente){
        System.out.println("Verificando SERASA do cliente " + cliente.getNome());
        return false;
    }
}
