public class Animal02
{
    int legs = 4 ;   //class member

    void ConstructTest()
    {
        System.out.println("Constructor test called ....");

        for(int  i = 0 ; i< 10 ; i++)
        {
            System.out.println("Inside loopping ......");
            if(i > 5)
            {
                System.out.println( i +" is greater then 5");
            }
        }
        
    }

    public  int getlegs()
    {
        return this.legs;
    }


    public static void main(String args[])
    {
        System.out.println("Main function called");
        Animal02 a = new Animal02();

        System.out.println("legs : " + a.getlegs());

        a.ConstructTest();

    }

}