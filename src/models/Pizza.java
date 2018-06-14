package models;

import fabric.IFabric;

import java.util.ArrayList;
import java.util.List;

public class Pizza
{

    private String name;
    private double price;
    private List<String> components = new ArrayList<String>();
    private int size;
    private int hot;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public List<String> getComponents()
    {
        return components;
    }

    public void setComponents(List<String> components)
    {
        this.components = components;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public int getHot()
    {
        return hot;
    }

    public void setHot(int hot)
    {
        this.hot = hot;
    }
}
