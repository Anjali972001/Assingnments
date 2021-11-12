/* Questions ---->  Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),width(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result.
The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.  */

public class Patient {
    String patientName;
    double height;
    double weight;
     public Patient(String patientName,double height,double width ) {
         this.patientName = patientName;
         this.height = height;
         this.weight =weight ;
     }
         void computeBMI()
         {
             System.out.println(patientName);
              double BMI= weight / (height*height);
             System.out.println(BMI);
         }

    public static void main(String[] args) {
        Patient p = new Patient("Anjali",156 ,50);
        p.computeBMI();
    }


}
