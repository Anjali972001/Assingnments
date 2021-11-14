public class SingleInheritance {
    void show1()
    {
        System.out.println("Method 1.");
    }
}
 class B extends SingleInheritance{
    void show2()
    {
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        SingleInheritance s= new SingleInheritance();
        s.show1();
        // output = Method 1.
    }
}
