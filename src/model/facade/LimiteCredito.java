package model.facade;

public class LimiteCredito {
    public boolean PossuiLimiteCredito(Cliente cliente, double valor){
        System.out.println("Verificando o limite de credito do cliente " + cliente.getNome());
        if(valor > 200000.00){
            return false;
        }else{
            return true;
        }
    }
}
