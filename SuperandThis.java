class First{
    public First(){
        System.out.println("F cons");     //1
    }
    public First(int n)
    {
        this();
        System.out.println(n+"F cons");   //2
    }
}
class Second extends First{
    public Second(){
        super(10);
        System.out.println("S cons");     //3
    }
    public Second(int n)
    {
        this();
        System.out.println(n+" S cons");  //4
    }
}


public class SuperandThis {
    public  static void main(String arg[])
    {

        Second ob=new Second(5);
    }
}
