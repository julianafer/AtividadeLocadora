package modelo;

public class CalculadoraPrecoNormal implements CalculadoraPreco {
    @Override
    public double calcularPreco(int diasAlugado) {
        double valorCorrente = 2.0;
        if (diasAlugado > 2) {
            valorCorrente += (diasAlugado - 2) * 1.5;
        }
        return valorCorrente;
    }
}
