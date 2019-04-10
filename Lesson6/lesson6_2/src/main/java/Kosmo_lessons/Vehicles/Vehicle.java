package Kosmo_lessons.Vehicles;

public class Vehicle {
    protected String name;
    protected double loadCapacity; // грузоподъемность
    protected double weight; // вес
    protected double height; // высота
    protected double length; // длина
    protected double width; // ширина
    protected double x, y, z; // параметры для указания координат

    //Возможность двигаться
    public void move(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public Vehicle(String name,
                   double loadCapacity,
                   double weight,
                   double height,
                   double length,
                   double width) {
        this.name = name;
        this.loadCapacity = loadCapacity;
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.width = width;
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
