 class test implements runnable
 {
    public void run()
    {
        System.out.println("thread is running");

    }
    public static void main(String[] args)
    {
        test t=new test();
        Thread t1=new Thread(t);
        t1.start();
    }
 }