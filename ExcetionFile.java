class JaganException extends Exception{
    public JaganException(String msg)
    {
        super(msg);
    }
}


public class ExcetionFile {
    public static void main(String arg[])
    {
        int mark=10;
        int per=20;
        int ans=0;

        try{
            ans=mark/per;
            if(ans==0)
              throw new JaganException("something wrong...");   //throw can be used
        }
        catch (JaganException e){                               //handle exception
            System.out.println("Jagan throw an excetion..:"+e);
        }
        catch (Exception e) {                                   //unhandle exception
            System.out.println("something happens..:" + e);
        }
        System.out.println(ans);
    }
}
