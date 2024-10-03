import builders.PizzaBuilder;
import builders.RelatorioBuilder;
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

        var simples = new RelatorioBuilder()
                .setTitulo("Olá Mundo!")
                .setCorpo("Lorem ipsum dolor sit amet.")
                .build();

        var completo = new RelatorioBuilder()
                .setTitulo("PIzza")
                .setCorpo("3 14 15 92 65 35 89 79 32...")
                .setRodape("By: π")
                .build();

        System.out.println(simples);
        System.out.println(completo);

        System.out.println("--------------------------------------------");

        try {
            var errado = new RelatorioBuilder()
                    .setCorpo("Hello?")
                    .build();
        } catch (IllegalStateException ex) {
            System.out.println("[ERRO]: " + ex.getMessage());
        }
    }
}