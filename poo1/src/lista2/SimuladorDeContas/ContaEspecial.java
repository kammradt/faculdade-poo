package lista2.SimuladorDeContas;

public class ContaEspecial extends  ContaCorrente{

    private Double limite;

    public ContaEspecial(int numero, Double saldo, String cliente, Double limite) {
        super(numero, saldo, cliente);
        this.limite = limite;
    }

    @Override
    public void creditar(Double valor){
        if ((this.saldo + valor) > this.limite) {
//        if ((super.getSaldo() + valor) > this.limite) {
            System.out.println("ERRO: Impossível creditar. O limite máximo atual é: " + this.limite);
        } else {
            this.saldo += valor;
            System.out.println("SUCESSO: Valor creditado: "+valor+". Saldo atual: "+ this.saldo);

        }
    }
}
