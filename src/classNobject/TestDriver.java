package classNobject;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class TestDriver {
    public static void main(String[] args){
        /*MotorCar motorcar = new MotorCar();
        motorcar.designEngine();*/

        /*Car car = new MotorCar();
        car.start();*/
        Car car = new Car() {
            @Override
            public void start() {
                System.out.println("Car should have start features. 1");
            }

            @Override
            public void stop() {
                System.out.println("Car should have stop features... ");
            }
        };
        car.start();
        car.stop();

        Vehicle value  = () -> System.out.println("Car should have diff. values");

/*        Vehicle lambdaVehicle = new Vehicle() {
            @Override
            public void move() {
                    System.out.println("Car should gave lambda start features");
                }
            };*/

        Vehicle lambdaVehicle = ()-> System.out.println("Car should have lambda start feature");
        lambdaVehicle.move();

        Engine lambdaEngine = (i1,i2)-> System.out.println(i1 + i2);
        lambdaEngine.fly(10,20);

        Engine lambdaEngine1 = (i1,i2)-> System.out.println(i1 * 10);
        lambdaEngine1.fly(10,40);

        RideSharing ridesharing = (s)-> System.out.println(s);
        ridesharing.rideOnDemand("Need a ride.!");
    }
}
