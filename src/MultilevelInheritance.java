class gghg {
    void show()
    {
        System.out.println("I am eating.");
    }
}
class b extends gghg
{
   void show1()
   {
       System.out.println("I am running .");
   }

}
class c extends b{
    void show2()
    {
        System.out.println("I am sleeping");
    }

    public static void main(String[] args) {
       gghg mi = new gghg();
        mi.show();
        b aa = new b();
        aa.show();
        aa.show1();
        c bb = new c();
        bb.show();
        bb.show1();
        bb.show2();
    }
}