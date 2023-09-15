interface Store{
      int details(int i, int j);
}

public class LamdaFile {
    public  static  void main(String arg[])
    {
        Store  s=(i,j)-> i*j;

        int ans=s.details(5,8);
        System.out.println(ans);
    }
}
