package modelo;

public class CalculadoraPrecoLancamento implements CalculadoraPreco {
    @Override
    public double calcularPreco(int diasAlugado) {
        return diasAlugado * 3.00;
    }
}
