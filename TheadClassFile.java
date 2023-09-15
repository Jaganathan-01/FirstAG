//class Animal implements Runnable{
//    public void run(){
//
//
//    }
//}
//class Human implements Runnable{
//    public void run(){
//
//    }
//}



public class TheadClassFile {
    public static void main(String arg[])
    {
        Runnable a=()->{
                for(int i=0;i<10;i++) {
                    try {
                        System.out.println("tiger");
                        Thread.sleep(10);
                    }
                    catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };
        Runnable b=()->{
                for(int i=0;i<10;i++) {
                    try {
                        System.out.println("jaga");
                        Thread.sleep(10);
                    }
                    catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        };
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
    }
}
