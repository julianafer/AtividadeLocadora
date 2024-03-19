package modelo;

public class Locadora {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Alex Sandro");
        c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", new CalculadoraPrecoNormal()), 10, new CalculadoraPontosPadrao()));
        c1.adicionaAluguel(new Aluguel(new DVD("Luca", new CalculadoraPrecoInfantil()), 2, new CalculadoraPontosPadrao()));
        c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2", new CalculadoraPrecoLancamento()), 30, new CalculadoraPontosLancamento()));
        c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto", new CalculadoraPrecoLancamento()), 4, new CalculadoraPontosPadrao()));
        c1.adicionaAluguel(new Aluguel(new DVD("Moana", new CalculadoraPrecoInfantil()), 10, new CalculadoraPontosPadrao()));
        c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", new CalculadoraPrecoNormal()), 3, new CalculadoraPontosPadrao()));
        System.out.println(c1.extrato());
    }
}
