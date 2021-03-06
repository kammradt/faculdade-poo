package lista4.SimuladorDeContas3;

public class ContaCorrente {
    private int numero;
    private Double saldo;

    public ContaCorrente(int numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void debitar(Double valor){
        if (this.saldo < valor) {
            System.out.println("ERRO: Impossível debitar. Saldo abaixo do débito. Saldo atual: " + this.saldo);
        } else {
            this.saldo -= valor;
            System.out.println("SUCESSO: Valor debitado: "+valor+". Saldo atual: "+ this.saldo);
        }
    }

    public void creditar(Double valor){
        this.saldo += valor;
        System.out.println("SUCESSO: Valor creditado: "+valor+". Saldo atual: "+ this.saldo);

    }

    @Override
    public String toString() {
        return "Número de conta: " + this.numero + ", Saldo: " + this.saldo + ".";

    }
}
