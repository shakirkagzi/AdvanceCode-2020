package design.pattern.singlton;

public class Singlton {
    private static Singlton singlton=null;
    private Singlton(){

    }
    public static synchronized Singlton getInstance(){
        if (singlton==null){
            singlton=new Singlton();
        }
        return singlton;
    }
    public String getDetails(){
        return "Singlton Demo";
    }
}
