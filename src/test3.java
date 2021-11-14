public class test3 {
    void show(Object a)
    {
        System.out.println("Object method.");
    }
    void show (String b)
    {
        System.out.println("String method.");
    }

    public static void main(String[] args) {
        test3 ttt = new test3();
        ttt.show('a');// object is the parent class of all the classes in java.(automatic promotion)
        ttt.show("anjali");
        // output :- Object method and string method
    }
}
