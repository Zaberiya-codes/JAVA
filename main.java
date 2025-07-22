class Car {
    //attributes (data)
    String brand;
    int speed;

    //method(behaviour)
    void start(){
        System.out.println(brand+"is starting.");
    }
    void accelerate(){
        speed+=10;
        System.out.println(brand+ " is now running "+ speed+ " km/h");
    }
}

public class main {
    public static void main(String[] args) {
        Car myCar = new Car(); //creating object of car class
        myCar.brand= "Toyota";
        myCar.speed= 50;
        myCar.start();//toyota is starting.
        myCar.accelerate();//toyota is running at 60 km/h
    }
}