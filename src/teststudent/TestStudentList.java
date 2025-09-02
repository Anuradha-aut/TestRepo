package teststudent;

import java.util.Scanner;

/**
 *
 * @author anusingh
 */
public class TestStudentList {
    public static void main(String[] args) {
        // Changed the student array to 3
        TestStudent[] students = new TestStudent[3];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < students.length; i++){
            System.out.println("Enter Student's name: ");
            String name = input.nextLine();
            TestStudent student = new TestStudent(name);
            students[i] = student;            
        }
        
        System.out.println("Printing the Students");
        for (TestStudent st: students){
            System.out.println("The student name is: "+ st.getName());
        }
        
    }
    
}
