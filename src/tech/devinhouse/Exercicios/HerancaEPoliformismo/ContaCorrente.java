package tech.devinhouse.Exercicios.HerancaEPoliformismo;

public class ContaCorrente extends Conta implements Operavel {

    @Override
    public void Depositar(Double valor) {
        saldo += valor;

    }

    @Override
    public void Sacar(Double valor) {
        saldo -= valor;
    }
}
