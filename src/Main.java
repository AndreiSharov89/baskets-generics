public class Main {
    public static void main(String[] args) {
        Basket appleBasket = new Basket<>();
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());
        System.out.println("Apple basket wight= " + appleBasket.getWeight());

        Basket orangeBasket = new Basket<>();
        orangeBasket.add(new Orange());
        orangeBasket.add(new Orange());
        System.out.println("Orange basket wight= " + orangeBasket.getWeight());

        Basket orangeBasket2 = new Basket<>();
        orangeBasket2.add(new Orange());
        orangeBasket2.add(new Orange());
        orangeBasket2.add(new Orange());
        System.out.println("Orange basket 2 wight= " + orangeBasket2.getWeight());

        Basket fruitBasket = new Basket<>();
        fruitBasket.add(new Orange());
        fruitBasket.add(new Apple());
        System.out.println("Fruit basket wight= " + fruitBasket.getWeight());



        System.out.println("");
    }
}
