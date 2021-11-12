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


}
