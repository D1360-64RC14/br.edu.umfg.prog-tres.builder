package builders;

import entities.Relatorio;

public class RelatorioBuilder {
    private Relatorio relatorio = new Relatorio();

    public RelatorioBuilder setTitulo(String titulo) {
        relatorio.setTitulo(titulo);
        return this;
    }

    public RelatorioBuilder setCorpo(String corpo) {
        relatorio.setCorpo(corpo);
        return this;
    }

    public RelatorioBuilder setRodape(String rodape) {
        relatorio.setRodape(rodape);
        return this;
    }

    public Relatorio build() {
        if (relatorio.getTitulo() == null || relatorio.getTitulo().isBlank()) {
            throw new IllegalStateException("O relatório deve ter um título");
        }

        if (relatorio.getCorpo() == null || relatorio.getCorpo().isBlank()) {
            throw new IllegalStateException("O relatório deve ter um corpo");
        }

        return relatorio;
    }
}
