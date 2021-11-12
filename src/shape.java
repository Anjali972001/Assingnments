public class shape {
     void draw()
    {
        System.out.println("Drawing Shapes.");
    }
    void erase()
    {
        System.out.println("Erasing shapes.");
    }

}
  class triangle extends shape{
    void draw()
    {
        System.out.println("Drawing triangle");
    }
    void erase()
    {
        System.out.println("Erasing Triangle.");
    }
    static class circle extends shape
    {
        void draw() {
            System.out.println("Drawing circle.");
        }

        void erase() {
            System.out.println("Erasing circle.");
        }
    }
    static class square extends shape{
        void draw()
        {
            System.out.println("Drawing square.");
        }
        void erase()
        {
            System.out.println("Erasing square");
        }
    }

        public static void main(String[] args) {
            shape t = new triangle();
            shape c = new circle();
            shape s = new square();
            t.erase();
            t.draw();
            c.erase();
            c.draw();
            s.draw();
            s.erase();
        }


}/* question-- Write a program to create a class named shape. It should contain 2 methods- draw() and erase() which should print “Drawing Shape” and “Erasing Shape” respectively.
For this class we have three subclasses- Circle, Triangle and Square and each class override the parent class functions- draw () and erase ().
The draw() method should print “Drawing Circle”, “Drawing Triangle”, “Drawing Square” respectively.
To erase() method should print “Erasing Circle”, “Erasing Triangle”, “Erasing Square” respectively.
Create objects of Circle, Triangle and Square in the following way and observe the polymorphic nature of the class by calling draw() and erase() method using each object.
Shape c=new Circle();
Shape t=new Triangle();
Shape s=new Square();
   */
