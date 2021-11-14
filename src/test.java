public class test {
    void show()
    {
        System.out.println("I am running.");
    }
    void show(int a)
    {
        System.out.println("I am eating.");
    }
    void show (int a, int b, String c)
    {
        System.out.println("I am sleeping.");
    }

    public static void main(String[] args) {
        test a = new test();
        a.show();
        a.show(12);
        a.show(13,12,"anjali");
    }
}// method overloading
