package com.akadatsky;
/*
1) На базе примера добавить 2 недостающих фрукта.
И вывести суммарную стоимость(суммув чека). Округлить стоимость каждого фрукта до копеек.
*) Сделать это задание путем форка оригинально репозитория на github, доработать и сделать push в свой fork.
Также можно послать pull request со своими доработками.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*Fruit redApple = new Fruit();
        redApple.setType(Fruit.Type.APPLE);
        redApple.setColor(Color.RED);
        redApple.setWeight(232);
        redApple.setPricePerKg(11.5);
        System.out.println(redApple);*/

        Fruit redApple = new Fruit(Fruit.Type.APPLE, Color.RED, 11.5, 232);
        Fruit greenApple = new Fruit(Fruit.Type.APPLE, Color.GREEN, 22.90, 230);
        Fruit yellowLemon = new Fruit(Fruit.Type.LEMON, Color.YELLOW, 30.90, 228);
        Fruit yellowBanana = new Fruit(Fruit.Type.BANANA, Color.YELLOW, 28.80, 230);

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(redApple);
        fruits.add(greenApple);
        fruits.add(yellowLemon);
        fruits.add(yellowBanana);
        // lemon  228g, 30.90
        // banana  230g, 28.80

        double sum = 0;

        for (int i = 0; i < fruits.size(); i++) {
            Fruit fruit = fruits.get(i);
            sum += fruit.getPricePerKg() * fruit.getWeight() / 1000.0;
        }
        // System.out.println(sum);
        System.out.printf("Purchase cost: " + "%.2f", sum);

    }
}
