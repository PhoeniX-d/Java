import java.io.*;
import java.util.*;

public class SerDeserObj {
   public static void main(String[] args) throws Exception{
       Employee e1 = new Employee(100, "Alex");
       Employee e2 = new Employee(200, "Woods");
       Employee e3 = new Employee(300, "Hudson");
       List<Employee> l1 = List.of(e1, e2 ,e3);
       System.out.println(l1);


       System.out.println("Serialization of List objects ....");
       FileOutputStream fos = new FileOutputStream("emp.ser");
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(l1);

       System.out.println("Deserialization of List objects ....");
       FileInputStream fis = new FileInputStream("emp.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       List<Employee> l2 = (List<Employee>)ois.readObject();
       System.out.println(l2);
   } 
}

class Employee implements Serializable{
    private int eno;
    private String ename;
    Employee(int eno, String ename){
        this.eno = eno;
        this.ename = ename;
    }

    public String toString(){
        return String.format("%d = %s", eno, ename);
    }
}