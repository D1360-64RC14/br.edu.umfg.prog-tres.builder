package builders;

import entities.Veiculo;

/**
 * Aluno: Diego Garcia Perez Biguette
 * RA: 1424
 */

public class VeiculoBuilder {
    private Veiculo veiculo = new Veiculo();

    public VeiculoBuilder setTipo(String tipo) {
        veiculo.setTipo(tipo);
        return this;
    }

    public VeiculoBuilder setCor(String cor) {
        veiculo.setCor(cor);
        return this;
    }

    public VeiculoBuilder setRodas(int rodas) {
        veiculo.setRodas(rodas);
        return this;
    }

    public Veiculo build() {
        return veiculo;
    }
}
