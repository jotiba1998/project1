class animal1 {
    void var() {
        System.out.println("varieties of animals by their color");
    }
}
class dog1 extends animal1
    {
        void dogcol() {
            System.out.println("we have a white color dog");
        }
    }
    class babydog extends animal1
    {
        void babydogcol(){
                System.out.println("we have a black color babydog");
        }
    }

public class inheritnceHierarchical {
    public static void main(String[] args) {
        babydog by=new babydog();
        //dog1 d=new dog1();
        by.var();
        by.babydogcol();
        //d.var();
       // d.dogcol();
    }
}
