package entities;

/**
 * Aluno: Diego Garcia Perez Biguette
 * RA: 1424
 */

public class Pizza {
    private String massa;
    private String tamanho;
    private String ingrediente;

    public String getMassa() {
        return massa;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "======== Pizza ========\n" +
                " Massa:       " + massa + "\n" +
                " Tamanho:     " + tamanho + "\n" +
                " Ingrediente: " + ingrediente + "\n";
    }
}
