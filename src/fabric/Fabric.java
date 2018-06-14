package fabric;

import models.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Fabric implements IFabric {

    @Override
    public Pizza makeVegetarianPizza(int size, int howMany) { //tworzenie obiektu pizza oraz nadawanie atrybutow
        Pizza pizza = new Pizza();
        pizza.setName("Wegetariańska");
        pizza.setHot(0);
        pizza.setSize(size);

        if(pizza.getSize() == 1){
            pizza.setPrice(howMany * 20);       //zaleznie od wielkosci pizzy ustalana jest cena za jedna oraz ich ilosc
        }
        else if(pizza.getSize() == 2){
            pizza.setPrice(howMany * 25);
        }
        else{
            pizza.setPrice(howMany * 30);
        }
        List<String> components = new ArrayList<String>();
        components.add("papryka");
        components.add("pomidor");
        components.add("ser");
        pizza.setComponents(components);
        return pizza;
    }

    @Override
    public Pizza makeCapriciosaPizza(int size, int howMany) {
        Pizza pizza = new Pizza();
        pizza.setName("Capriciosa");
        pizza.setHot(1);
        pizza.setSize(size);
        if(pizza.getSize() == 1){
            pizza.setPrice(howMany * 22);
        }
        else if(pizza.getSize() == 2){
            pizza.setPrice(howMany * 27);
        }
        else{
            pizza.setPrice(howMany * 32);
        }
        List<String> components = new ArrayList<String>();
        components.add("pieczarki");
        components.add("sos");
        components.add("szynka");
        pizza.setComponents(components);
        return pizza;
    }

    @Override
    public Pizza makePepperoniPizza(int size, int howMany) {
        Pizza pizza = new Pizza();
        pizza.setName("Pepperoni");
        pizza.setHot(5);
        if(pizza.getSize() == 1){
            pizza.setPrice(howMany * 25);
        }
        else if(pizza.getSize() == 2){
            pizza.setPrice(howMany * 30);
        }
        else{
            pizza.setPrice(howMany * 35);
        }
        List<String> components = new ArrayList<String>();
        components.add("salami");
        components.add("papryka ostra");
        components.add("cebula");
        components.add("ser");
        pizza.setComponents(components);
        return pizza;
    }
}
