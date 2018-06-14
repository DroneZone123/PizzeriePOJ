package models;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Pizza> pizzas = new ArrayList<Pizza>();
    private String address;
    private double sum;

    public Order(String address, List<Pizza> pizzas) { //konstruktor
        this.address = address;
        for(Pizza pizza : pizzas){                     //petla po liscie zamowionych pizz, wyliczanie sumy zamowienia za pizze
            sum += pizza.getPrice();
        }
        if(address != null){                            //dodanie ceny dowozu do sumy zamowienia
            sum += 3;
        }
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
