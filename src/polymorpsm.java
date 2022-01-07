class bike{
    public void color()
    {
        System.out.println("the bike color ");
    }
}
class passionpro extends bike{
    public void color()
    {
        System.out.println("passionpro color is red");
    }
}
class delux extends bike{
    public void color()
    {
        System.out.println("delux color is white");
    }
}
public class polymorpsm {
    public static void main(String[] args) {
        bike b=new bike();
        bike p=new passionpro();
        bike d=new delux();
        b.color();
        p.color();
        d.color();

    }
}
