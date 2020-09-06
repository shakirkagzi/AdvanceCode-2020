package classNobject;

public abstract class MotorCar /*implements Car*/{

    public void designEngine(){
        System.out.println("It is a motor vehicle that can drive.");
    }

   /* @Override*/
    public void start() {
        System.out.println("Car should have start features");
    }

    public abstract void drive(String road);
}
