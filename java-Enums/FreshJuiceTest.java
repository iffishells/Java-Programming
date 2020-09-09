// 
class FreshJuice {
    public static  void main (String args[])
    {
        System.out.println("Fresj juice has been callled");
    }
    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
// 
    FreshJuiceSize size;
}
// 
public class FreshJuiceTest {
// 
public static void main(String args[]) {
    FreshJuice juice = new FreshJuice();
    juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
    System.out.println("Size: " + juice.size);
}
}
// 












