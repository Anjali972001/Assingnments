/*Questions---->  Write a program to create a class named shape.
 It should contain 2 methods, draw() and erase() that prints “Drawing Shape” and “Erasing Shape” respectively.
 */
public class shape2 {
    void draw()
    {
        System.out.println("Drawing shapes");
    }
    void erase(){
        System.out.println("Erasing shapes");
    }

    public static void main(String[] args) {
        shape2 s =new shape2();
        s.draw();
        s.erase();

    }
}
