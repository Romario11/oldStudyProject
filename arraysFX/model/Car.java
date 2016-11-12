package homeWorks.work_9.arraysFX.model;

import java.util.Comparator;

public class Car implements Comparable<Car>
{
    String type;  // 1
    int price;    // 2
    int speed;    // 3
    String color; // 4
    int id;       // 5

    public Car(String type, int price, int speed, String color, int id) {
        this.color = color;
        this.id = id;
        this.price = price;
        this.speed = speed;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Car anotherCar) {
        //return this.price - ((Car)o).price;
        return this.type.compareTo(anotherCar.type);
    }


    public static class CarComparatorBy implements Comparator<Car>
    {
        private String compareMethod;

        public CarComparatorBy(String compareMethod) {
            this.compareMethod = compareMethod;
        }

        public int compare(Car o1, Car o2) {
            if(compareMethod.equals("type"))
                return o1.type.compareTo(o2.type);
            else if(compareMethod.equals("price"))
                return o1.price - o2.price;
            else if(compareMethod.equals("speed"))
                return o1.speed - o2.speed;
            else if(compareMethod.equals("color"))
                return o1.color.compareTo(o2.color);
            else if(compareMethod.equals("id"))
                return o1.id - o2.id;
            else
                return o1.price - o2.price;
        }
    }
}

