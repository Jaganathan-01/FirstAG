enum Country{
//    Run,Pend,Success,Fail;
    chennai(1),erode(2),dharmapuri(3),kerala(4);

    private int val;
    private Country(int val){
        this.val=val;
    }
}

public class EnumFile {
    public static void main(String arg[])
    {
        Country [] c=Country.values();
        for(Country s:c)
           System.out.println(s+":"+s.ordinal());
    }
}
