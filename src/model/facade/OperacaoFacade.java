package model.facade;

public class OperacaoFacade {
    private LimiteCredito limite;
    private Serasa serasa;
    private  Cadin cadin;
    private Cadastro cadastro;

    public OperacaoFacade(){
        limite = new LimiteCredito();
        serasa = new Serasa();
        cadin = new Cadin();
        cadastro = new Cadastro();
    }

    public boolean ConcederEmprestimo(Cliente cliente, double valor){
        System.out.println(cliente.getNome() + " esta pleitiando um emprestimo no valor de " + valor);
        cadastro.cadastrarCliente(cliente);

        boolean concederEmprestimo = true;

        if(serasa.EstaNoSerasa(cliente)){
            System.out.println("Cliente " + cliente.getNome() + " possui restriçao no SERASA");
            concederEmprestimo = false;
        }else if(cadin.EstaNoCadin(cliente)){
            System.out.println("Cliente " + cliente.getNome() + " possui restriçao no CADIN");
            concederEmprestimo = false;
        }else if(!limite.PossuiLimiteCredito(cliente, valor)){
            System.out.println("Cliente " + cliente.getNome() + " possui limite de credito inferior a " + valor);
            concederEmprestimo = false;
        }
        return concederEmprestimo;
    }
}
