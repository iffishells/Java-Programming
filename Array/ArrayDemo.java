class ArrayDemo
{
    public static void main(String args[])
    {
        int[] anArray;
        
        anArray = new int[10];

        anArray[0] = 101;
        anArray[1] = 102;
        anArray[2] = 103;
        anArray[3] = 104;
        anArray[4] = 104;
        anArray[5] = 104;
        anArray[6] = 106;


        for(int i=0 ; i<6 ; i++)
        {
            System.out.println( anArray[i]);
        }
    }
}