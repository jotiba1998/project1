class you{
    int accno;
    int password;
   void data()
    {
      accno=14356;
      password=123409;
        System.out.println(accno);
        System.out.println(password);

    }
}
class friend extends you {
    void changedata() {
        accno = 9090;
        password = 8909;
    }

    void disp() {
        System.out.println(accno);
        System.out.println(password);
    }
}

public class inheritanceSingle {
    public static void main(String[] args) {
        friend f=new friend();
        f.data();
        f.changedata();
        f.disp();
    }
}
