import lista1.*;
import lista2.SalariosFuncionarios.Chefe;
import lista2.SalariosFuncionarios.Empregado;
import lista2.SalariosFuncionarios.Estagiario;
import lista2.SimuladorAnimais.Cachorro;
import lista2.SimuladorAnimais.Gato;
import lista2.SimuladorDeContas.ContaCorrente;
import lista2.SimuladorDeContas.ContaEspecial;
import lista2.SimuladorDeContas.ContaPoupanca;
import lista2.SimuladorFuncionarios.Assistente;
import lista2.SimuladorFuncionarios.AssistenteAdministrativo;
import lista2.SimuladorFuncionarios.AssistenteTecnico;
import lista2.SimuladorFuncionarios.Funcionario;
import lista2.SimuladorIngressos.*;
import lista2.SimuladorPessoas.Miseravel;
import lista2.SimuladorPessoas.PessoaListaDois;
import lista2.SimuladorPessoas.Pobre;
import lista2.SimuladorPessoas.Rica;
import lista3.ClassesAbstratas.Gerente;
import lista3.ClassesAbstratas.Programador;
import lista3.Operacoes.Divisao;
import lista3.Operacoes.Multiplicacao;
import lista3.Operacoes.Soma;
import lista3.Operacoes.Subtracao;
import lista3.newSimuladorDeContas.Cliente;

public class Main {

    public static void main(String[] args) {
        // lista1
        Bola bolinha = new Bola("vermelho", 5, "plástico");
        Quadrado quadradinho = new Quadrado(10);
        Pessoa euzinho = new Pessoa("Vinicus", 19, 76.5, 1.76);
        Televisor tevezinha = new Televisor(100, 3);
        Bichinho bicho = new Bichinho("Vinicius", 10, 7, 10);
        BombaDeCombustivel bomba = new BombaDeCombustivel("Aditivada", 2.0, 50.0);

        // lista2 // Baseado na página 26 do .pdf sobre POO
        ContaCorrente cc = new ContaCorrente(1, 1000.0, "Vini");
        ContaEspecial ce = new ContaEspecial(1, 1000.0, "Vini", 2000.0);
        ContaPoupanca cp = new ContaPoupanca(1, 1000.0, "Vini", 100.0);

        // lista2 // Ex 2
        Empregado empregado = new Empregado(1,"Vini", "@gmail", 1000.0);
        Chefe chefe = new Chefe(1,"Vini", "@gmail", 1000.0 ,100.0);
        Estagiario estagiario = new Estagiario (1,"Vini", "@gmail", 1000.0 ,100.0);

        // lista2 // Ex 3
        // Abstract ingresso = new Ingresso(200.0);
        IngressoVip vip = new IngressoVip(200.0, 100.0);
        IngressoNormal normal = new IngressoNormal(200.0);
        CamaroteInferior ci = new CamaroteInferior(200.0, "Araquari");
        CamaroteSuperior cs = new CamaroteSuperior(200.0, 100.0, "Araquari");

        // lista2 // Ex 4
        Funcionario func= new Funcionario("Vinicius", "Rua Araquari", "+55 048 91111-1111", "func@email.com", 1000.0);
        Assistente assistente = new Assistente("Vinicius", "Rua Araquari", "+55 048 91111-1111", "assis@email.com", 1000.0, 1);
        AssistenteTecnico assistenteTecnico = new AssistenteTecnico("Vinicius", "Rua Araquari", "+55 048 91111-1111", "assisTec@email.com", 1000.0, 10, 100.0);
        AssistenteAdministrativo assistenteAdministrativo = new AssistenteAdministrativo("Vinicius2", "Rua Araquari2", "+55 048 92222-2222", "assisAdmin@email.com", 1000.0, 20, "noturno");

        System.out.println("________________________________________________");
        assistenteTecnico.exibeDados();
        assistenteTecnico.getNumeroMatricula();
        System.out.println("________________________________________________");
        assistenteAdministrativo.exibeDados();
        assistenteAdministrativo.getNumeroMatricula();
        System.out.println("________________________________________________");

        // lista2 // Ex 5
        Cachorro cachorro = new Cachorro("Bernardo", "Compridinho");
        Gato gato = new Gato("Maycon", "Malhado");
        cachorro.latir();
        gato.miar();
        cachorro.caminhar();
        gato.caminhar();

        // lista2 // Ex 6
        PessoaListaDois pessoa = new PessoaListaDois("Vini", 19);
        Rica rica = new Rica("Vini", 19, 999.9);
        rica.fazCompras();
        Pobre pobre = new Pobre("Vini", 19);
        pobre.trabalhar();
        Miseravel miseravel = new Miseravel("Vini", 19);

        //Lista 3 // Ex 1
        lista3.newSimuladorDeContas.Cliente cliente1 = new Cliente("Vini", "011.411.776.22");
        lista3.newSimuladorDeContas.ContaCorrente conta1 = new lista3.newSimuladorDeContas.ContaCorrente(1, 100.0, cliente1);

        lista3.newSimuladorDeContas.Cliente cliente2 = new Cliente("Fernando", "011.411.776.22");
        lista3.newSimuladorDeContas.ContaCorrente conta2 = new lista3.newSimuladorDeContas.ContaCorrente(2, 200., cliente2);
        lista3.newSimuladorDeContas.ContaCorrente conta3 = new lista3.newSimuladorDeContas.ContaPoupanca(3, 300., cliente2, 200.0);

        lista3.newSimuladorDeContas.Cliente cliente3 = new Cliente("José", "011.411.776.22");
        lista3.newSimuladorDeContas.ContaCorrente conta4 = new lista3.newSimuladorDeContas.ContaEspecial(4, 150., cliente3, 200.0);
        lista3.newSimuladorDeContas.ContaCorrente conta5 = new lista3.newSimuladorDeContas.ContaInvestimento(5, 75., cliente3, 1,5);

        lista3.newSimuladorDeContas.Cliente cliente4 = new Cliente("Maria", "011.411.776.22");
        lista3.newSimuladorDeContas.ContaCorrente conta6 = new lista3.newSimuladorDeContas.ContaInvestimento(6, 1000.0, cliente4, 1,5);

        lista3.newSimuladorDeContas.Cliente cliente5 = new Cliente("Henrique", "011.411.776.22");
        // Sem conta

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
        System.out.println(conta4);
        System.out.println(conta5);
        System.out.println(conta6);

        // Lista 3 // Ex 2
        Gerente gerente = new Gerente("Vini", 1000.0);
        Programador programador = new Programador("Vini", 2000.0);
        System.out.println(gerente + "\n" + programador);

        // Lista 3 // Ex 3
        Soma soma = new Soma();
        System.out.println(soma.calcula(10.0, 2.0));
        Subtracao subtracao = new Subtracao();
        System.out.println(subtracao.calcula(10.0, 2.0));
        Multiplicacao multiplicacao = new Multiplicacao();
        System.out.println(multiplicacao.calcula(10.0, 2.0));
        Divisao divisao = new Divisao();
        System.out.println(divisao.calcula(10.0, 2.0));







    }
}
