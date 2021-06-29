package encapsulation;

public class EncapsTest{
    public static void main(String args[]){
         Encapsulation encap = new Encapsulation();
         encap.setEmpName("Mario");
         encap.setEmpAge(32);
         encap.setEmpSSN(112233);
         System.out.println("Employee Name: " + encap.getEmpName());
         System.out.println("Employee SSN: " + encap.getEmpSSN());
         System.out.println("Employee Age: " + encap.getEmpAge());
    } 
}