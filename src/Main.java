import fabric.Fabric;
import fabric.IFabric;
import models.Order;
import models.Pizza;

import java.util.ArrayList;
import java.util.List;



public class Main
{

    public static void main(String[] args)
    {


        Fabric fabric = new Fabric();  //obiekt intefejsu do wywolywania metod

        List<Pizza> pizzas = new ArrayList<Pizza>();  //tworzenie listy typu pizza

        pizzas.add(fabric.makeVegetarianPizza(1,4)); // metody
        pizzas.add(fabric.makeCapriciosaPizza(3,2));
        pizzas.add(fabric.makePepperoniPizza(2,13));

        Order order = new Order("Zamiejska 1/23", pizzas);  //tworzenie obiektu zamowienie, przy tworzeniu obiektu musza byc zawarte atrybuty

        double sum = 0;



        order.setPizzas(pizzas);        //do listy pizz w zamowieniu dodaje liste pizz powyzej nadanych

        System.out.print("Twoje zamówienie: "); //petla sluzaca do wyswietlania pizz z zamowienia
        for(Pizza pizza : pizzas)
        {
            System.out.print(pizza.getName() + " ");
            System.out.print(pizza.getPrice() + " zł ");
        }
        System.out.println("Razem: " + order.getSum());  //koszt calego zamowienia


    }
}
