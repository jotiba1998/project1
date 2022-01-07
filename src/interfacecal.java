
interface arithmatic{
    void mul();
    void div();
    int a=10,b=5;

}
class perform implements arithmatic{
        public void mul(){
            int c=a*b;
            System.out.println("Multiplication is "+c);
        }
        public void div() {

           int c=a/b;
            System.out.println("division is "+c);
        }
        }
    public class interfacecal {
        public static void main(String[] args) {
            perform p=new perform();
            p.mul();
            p.div();
        }
    }

