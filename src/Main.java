import builders.PizzaBuilder;
import builders.VeiculoBuilder;

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

        var carro = new VeiculoBuilder()
                .setTipo("Carro")
                .setCor("Vermelho")
                .setRodas(4)
                .build();

        var moto = new VeiculoBuilder()
                .setTipo("Moto")
                .setCor("Azul")
                .setRodas(2)
                .build();

        System.out.println(carro);
        System.out.println(moto);

        // ---------------------------------------------
    }
}