package model;

public class Moto extends Veiculo {
    public Moto() {}

    public Moto(String modelo, String marca, int ano) {
        super(modelo, marca, ano);

        setValorDiaria();
    }

    @Override
    public double calcularValor(int dias) {
        return getValorDiaria() * dias;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Moto").append("\n");
        sb.append("Modelo = ").append(getModelo()).append("\n");
        sb.append("Marca = ").append(getMarca()).append("\n");
        sb.append("Ano = ").append(getAno()).append("\n");
        sb.append("Valor Diaria = ").append(getValorDiaria()).append("\n");
        sb.append("Disponibilidade para aluguel = ").append(isDisponivel());
        return sb.toString();
    }

}