package model.facade;

public class Cadastro {
    public  void cadastrarCliente(Cliente cliente){
        System.out.println("Cadastro do cliente " + cliente.getNome() + " concluido.");
    }
}
