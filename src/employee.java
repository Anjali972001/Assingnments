/*   Write a program that would print the information
(name, year of joining, address) of three employees by creating a class named 'Employee'.
The output should be as follows:

Name      Year of joining     Address

Aman         2021	        Chandigarh
Sunil        2000           Mathura
Rohan        2010            Agra

 */
public class employee {
    String name;
    double joiningYear;
    String address;
    employee(String name, double joiningYear , String address)
    {
        this.name=name;
        this.joiningYear=joiningYear;
        this.address=address;
    }

    public static void main(String[] args) {
        employee e1 = new employee("Aman", 2021, "Chandigarh");
        employee e2 = new employee ("Sunil", 2000, "Mathura");
        employee e3 = new employee ("Rohan", 2010, "Agra");
        System.out.println(e1.name+" "+ e1.joiningYear+" "+ e1.address);
        System.out.println(e2.name+" "+ e2.joiningYear+" "+ e2.address);
        System.out.println(e3.name+" "+ e3.joiningYear+" "+ e3.address);
    }



}
