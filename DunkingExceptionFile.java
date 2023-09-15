class Dress {
    public void color() throws ClassNotFoundException{
            Class.forName("Demo");
            
        }
}


public class DunkingExceptionFile {
    public  static void main(String arg[]){
        Dress d=new Dress();
        try{
            d.color();
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong..:"+e);
        }

    }
}
