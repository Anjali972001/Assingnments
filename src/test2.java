public class test2 {
    void show(int a)
    {
        System.out.println("int method.");

    }
    void show(String b){
        System.out.println("String method.");
    }

    public static void main(String[] args) {
        test2 tt = new test2();
        tt.show('a');
    }// output :- int method (there is automatic promotion from char to int.)

}
