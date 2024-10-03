package builders;

import entities.Pizza;

/**
 * Aluno: Diego Garcia Perez Biguette
 * RA: 1424
 */

public class PizzaBuilder {
    private Pizza pizza = new Pizza();

    public PizzaBuilder setMassa(String massa) {
        pizza.setMassa(massa);
        return this;
    }

    public PizzaBuilder setTamanho(String tamanho) {
        pizza.setTamanho(tamanho);
        return this;
    }

    public PizzaBuilder setIngrediente(String ingrediente) {
        pizza.setIngrediente(ingrediente);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}
