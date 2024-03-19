package modelo;

public class DVD {

    private String título;
    private CalculadoraPreco calculadoraPreco;

    public DVD(String título, CalculadoraPreco calculadoraPreco) {
        this.título = título;
        this.calculadoraPreco = calculadoraPreco;
    }

    public String getTítulo() {
        return título;
    }

    public double calcularPreco(int diasAlugado) {
        return calculadoraPreco.calcularPreco(diasAlugado);
    }
}
