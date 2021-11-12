/* Question ----> Create a base class Fruit which has name, taste and size as its attributes.
   A method called eat() is created which describes the name of the fruit and its taste.
   Inherit the same in 2 other classes Apple and Orange and override to eat() method to represent each fruit taste.
 */
public class Fruit {

    String name ;
    String taste ;
    String size;
     Fruit(String n, String t,String s){
         name=n;
         taste=t;
         size=s;
     }



    void eat()
    {
        System.out.println(name+" "+taste);
    }

}
class Apple extends Fruit {
     Apple(String n,String t,String s){
         super(n,t,s);

     }
}
class Orange extends Fruit{
    Orange(String n,String t,String s){
        super(n,t,s);

    }
    public static void main(String[] args) {
        Fruit a = new Apple("Apple","tasty","small");
        Fruit o = new Orange("orange","Sour","big");
        o.eat();
        a.eat();
    }
}



