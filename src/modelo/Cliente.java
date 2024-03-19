package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;

        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + getNome() + fimDeLinha);

        for (Aluguel aluguel : alugueis) {
            DVD dvd = aluguel.getDVD();
            double valorCorrente = dvd.calcularPreco(aluguel.getDiasAlugado());
            pontosDeAlugadorFrequente += aluguel.calcularPontos();

            resultado.append("\t").append(dvd.getTítulo()).append("\t").append(valorCorrente).append(fimDeLinha);
            valorTotal += valorCorrente;
        }

        resultado.append("Valor total devido: ").append(valorTotal).append(fimDeLinha);
        resultado.append("Você acumulou ").append(pontosDeAlugadorFrequente).append(" pontos de alugador frequente");

        return resultado.toString();
    }
}
