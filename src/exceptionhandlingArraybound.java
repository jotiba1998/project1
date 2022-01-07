public class exceptionhandlingArraybound {
    public static void main(String[] args) {
       // Scanner scan=new Scanner(System.in);
        int a[]={1,2,3};
        try {
            System.out.println("array is"+a[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("arrayindexboundexception>="+e.getMessage());
        }
    }
}
