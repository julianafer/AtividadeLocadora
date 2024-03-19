package modelo;

public class CalculadoraPrecoInfantil implements CalculadoraPreco {
    @Override
    public double calcularPreco(int diasAlugado) {
        double valorCorrente = 1.5;
        if (diasAlugado > 3) {
            valorCorrente += (diasAlugado - 3) * 1.5;
        }
        return valorCorrente;
    }
}
