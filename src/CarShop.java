public class CarShop {

    public static void main(String[] args) {

        Car skoda = new Car("Skoda Octavia","Black", 110, 2010);

//        Car mustang = new Car();
//        mustang.brand = "Ford Mustang";
//        mustang.hp = 400;
//        mustang.year = 2019;
//        mustang.color = "Matte Grey";

        printCar(skoda);
//        printCar(mustang);

    }

    private static void printCar(Car c) {
        System.out.println(c.brand + " " + c.color + " " + c.year + " " + c.hp);
    }


}
