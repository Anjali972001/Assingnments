public class inheritance {
    void eat()
    {
        System.out.println("I am eating . ");
    }
}
class dog extends inheritance{
    void run()
    {
        System.out.println("I am running .");
    }

    public static void main(String[] args) {
        inheritance i = new inheritance();
        i.eat();
        dog d = new dog ();
        d.eat();// i am eating. and I am eating
    }
}
