package Assignment3;

class test
{
    public static void main(String[] args) 
    {
        int A=Integer.parseInt(args[0]);
        int B=Integer.parseInt(args[1]);
        int C;
        System.out.println("Value before swap A :"+A+" and B :"+B);
        
        C=A;
        A=B;
        B=C;
        System.out.println("Value after swap A :"+A+" and B :"+B);
    }
}                                                    
