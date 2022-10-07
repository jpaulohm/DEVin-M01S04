package tech.devinhouse.Exercicios.Interfaces;

public class Produto implements Tributavel{
    Float valor;
    Float valorImposto;
    @Override
    public Float CalcularValorComImposto() {
        return valor + valorImposto;
    }
}
