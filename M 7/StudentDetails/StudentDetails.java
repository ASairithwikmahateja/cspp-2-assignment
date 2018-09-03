import java.util.Scanner;
    /**
    @author Mahateja
    */
class Student {
    /*Write the atrributes and methods.*/
    /**
     * @String  strnew
     * @String  rollnew
     * @String  marks
     */
    private String strnew;
    private String rollnonew;
    private float[] marksnew;
    /**
    @default constructor
    */
    /**
     *
     * @param      str    String
     * @param      rollno String
     * @param      marks  float
     */
    Student(final String str, final String rollno, final float[] marks) {
        strnew = str;
        rollnonew = rollno;
        marksnew = marks; 
    }
}
/**
 * Main class.
 */
public final class StudentDetails {
	/*
    Do not modify the main function
    */
    /**
    @default constructor
    */
    private StudentDetails() { }
    /**
     *
     * @param      args    String
     */
	public static void main(final String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	String rollno = sc.nextLine();
        float[] marks = new float[3];
        float sum = 0, gpa = 0;
        for (int i = 0; i < 3; i++) {
        	marks[i] = Float.parseFloat(sc.nextLine());
            sum += marks[i];
        } gpa = sum / 3;
        System.out.println(gpa);
    	Student stu = new Student(str, rollno, marks);
    }
}
