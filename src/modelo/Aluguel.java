package modelo;

public class Aluguel {

    private DVD dvd;
    private int diasAlugado;
    private CalculadoraPontos calculadoraPontos;

    public Aluguel(DVD dvd, int diasAlugado, CalculadoraPontos calculadoraPontos) {
        this.dvd = dvd;
        this.diasAlugado = diasAlugado;
        this.calculadoraPontos = calculadoraPontos;
    }

    public DVD getDVD() {
        return dvd;
    }

    public int getDiasAlugado() {
        return diasAlugado;
    }

    public int calcularPontos() {
        return calculadoraPontos.calcularPontos(diasAlugado);
    }
}
