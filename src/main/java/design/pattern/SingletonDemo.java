package design.pattern;

import design.pattern.singlton.Singlton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singlton singlton = Singlton.getInstance();
        Singlton singlton1 = Singlton.getInstance();
        Singlton singlton2 = Singlton.getInstance();
    }
}
