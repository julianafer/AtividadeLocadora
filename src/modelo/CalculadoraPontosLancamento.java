package modelo;

public class CalculadoraPontosLancamento implements CalculadoraPontos {
    @Override
    public int calcularPontos(int diasAlugado) {
        return (diasAlugado > 1) ? 2 : 1;
    }
}
