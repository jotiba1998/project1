public class methodoverloading {

        void num(int a,int b)
        {
            System.out.println("int num is"+" "+a+" "+b);

        }
        void num(double a,double b)
        {
            System.out.println("double num is"+" "+a+" "+b);
        }
    public static void main(String[] args) {
            methodoverloading ab=new methodoverloading();
            ab.num(4,6);
            ab.num(4.7,8);
    }
}
