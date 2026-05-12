class Student {

    int rollNo;
    String name;
    
    // static variable
    static String Training_Center
        = "GFG"; 

    Student(int r, String n){
        
        rollNo = r;
        name = n;
    }

    void display(){
        
        System.out.println(rollNo + " " + name + " "
                           + Training_Center);
    }
}

public class GFG{
    
    public static void main(String[] args){
        
        Student s1 = new Student(101, "Ravi");
        Student s2 = new Student(102, "Amit");

        s1.display();
        s2.display();
    }
}