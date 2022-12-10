package objectsAndClass;

class rectangle{
    int length; // Data Member
    int breadth;

        void input(int x, int y)
        {
            length = x;
            breadth = y;
        }
        void area()
        {
            int a = length * breadth;
            System.out.println("\n"+a+"\n");
        }
}

class rect {
    public static void main(String[] ar){
        rectangle r1 = new rectangle();
        r1.input(10,12);
        r1.area();
    }
}
