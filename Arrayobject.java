class Bank{
    String name;
    int amount;
}
public class Arrayobject {
    public static  void main(String arg[])
    {
        Bank b1=new Bank();
        b1.name="jagan";
        b1.amount=10000;

        Bank b2=new Bank();
        b2.name="sathya";
        b2.amount=20000;

        Bank b3=new Bank();
        b3.name="karthi";
        b3.amount=30000;

        Bank bank[]=new Bank[3];
        bank[0]=b1;
        bank[1]=b2;
        bank[2]=b3;

        for(int i=0;i<bank.length;i++)
            System.out.println(bank[i].name+":"+bank[i].amount);


    }
}
