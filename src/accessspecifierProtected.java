class fruit {
    protected String name;

    protected void disp()
    {
        System.out.println(name);
    }
}
    class apple extends fruit
    {

    }

 public class accessspecifierProtected{
     public static void main(String[] args) {
    apple A=new apple();
         A.name="abc";
         A.disp();
     }
     }



