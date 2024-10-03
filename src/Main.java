import builders.PizzaBuilder;

public class Main {
    public static void main(String[] args) {
        var pizzaDeQueijo = new PizzaBuilder()
                .setMassa("Especial")
                .setTamanho("Pequena")
                .setIngrediente("Queijo")
                .build();

        var pizzaDoce = new PizzaBuilder()
                .setMassa("Normal")
                .setTamanho("Média")
                .setIngrediente("Chocolate")
                .build();

        System.out.println(pizzaDeQueijo);
        System.out.println(pizzaDoce);

        // ---------------------------------------------
    }
}