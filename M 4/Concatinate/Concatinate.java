import java.util.Scanner;
    /*
    Do not modify this main function.
    */
    /**
    @author Mahateja
    */
public final class Concatinate {
    /* Fill the main function to print the number of 7's between 1 to n*/
    /**
    @default constructor
    */
    private Concatinate() { }
    /**
     *
     * @param      args    String
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String greet = "Hello ";
        //String append = "Hello " + name + "!";
        String append = greet.concat(name).concat("!");
        System.out.println(append);
    }
}
