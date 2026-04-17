package PizzaDecorator;

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new PlainPizza();
        System.out.println("Description : " + pizza1.getDescription());
        System.out.println("Cost        : " + pizza1.getCost());
        System.out.println();

        Pizza pizza2 = new Cheese(new PlainPizza());
        System.out.println("Description : " + pizza2.getDescription());
        System.out.println("Cost        : " + pizza2.getCost());
        System.out.println();

        Pizza pizza3 = new Mushroom(new Cheese(new PlainPizza()));
        System.out.println("Description : " + pizza3.getDescription());
        System.out.println("Cost        : " + pizza3.getCost());
        System.out.println();

        Pizza pizza4 = new Olive(new Mushroom(new Cheese(new PlainPizza())));
        System.out.println("Description : " + pizza4.getDescription());
        System.out.println("Cost        : " + pizza4.getCost());
    }
}
