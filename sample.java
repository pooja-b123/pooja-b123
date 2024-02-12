 public class sample
 {
    public static void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args)
    {
        sample obj=new sample();
        obj.add(20,50);
        obj.add(45,90,45);
    }
 }