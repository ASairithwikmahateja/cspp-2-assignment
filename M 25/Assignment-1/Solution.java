import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
class Task {
	
	String title;
	String assignedTo;
	int timeToComplete;
	boolean important;
	boolean urgent;
	String status;
    
    Task(final String title, String assignedTo,
    	int timeToComplete, boolean important, boolean urgent, String status) {
    
    	this.title = title;
    	this.assignedTo = assignedTo;
    	this.timeToComplete = timeToComplete;
    	this.important = important;
    	this.urgent = urgent;
    	this.status = status; 
    }

	public String toString() {
		String str = "";
        String imp = "";
        String urg = "";
        if (title.length() == 0) {
            return "Title not provided";
        } else if (timeToComplete < 0) {
            return "Invalid timeToComplete " + timeToComplete;
        } else if (!(status.equals("todo") || status.equals("done"))) {
            return "Invalid status " + status;
        } else {
        if (important == true) {
            imp = "Important";
        } else {
            imp = "Not Important";
        }
        if (urgent == true) {
            urg = "Urgent";
        } else {
            urg = "Not Urgent";
        }
    }
        str = title + ", " + assignedTo + ", " + timeToComplete + ", "
            + imp + ", " + urg +  ", " + status;        
        return str;
	}
}
class Todoist {
    
    Task[] tskarr;
    int size;
    
    Todoist() {
        final int thirty = 30;
        tskarr = new Task[thirty];
        size = 0;
    }

    public void addTask(Task tk) {
        tskarr[size++] = tk;
    }
    
    public String toStringist() {
        String st = "";
        int i;
        for (i = 0; i < size - 1; i++) {
            st += tskarr[i] + "\n";
        } st += tskarr[i];
        return st;
    }
    
//     public Task getNextTask(String personname) {
//         Task tk;
//         // if (personname.equals(tk)) {
        
//         // }
//         return tk;
//     }
//     public Task[] getNextTask(String perrsonname, int number) {
//         Task[] tk = new Task[20];
//         return tk;
//     }
 
}
/**
 * Class for todoist main.
 */
public class Solution {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
                case "task":
                Task tk = new Task(tokens[1], tokens[2], Integer.parseInt(tokens[3]),
                    Boolean.parseBoolean(tokens[4]), Boolean.parseBoolean(tokens[5]), tokens[6]);
                    testTask(tokens);
                break;
                case "add-task":
                    testAddTask(todo, tokens);
                break;
                case "print-todoist":
                    System.out.println(todo.toStringist());
                break;
                // case "get-next":
                //     System.out.println(todo.getNextTask(tokens[1]));
                // break;
                // case "get-next-n":
                //     int n = Integer.parseInt(tokens[2]);
                //     Task[] tasks = todo.getNextTask(tokens[1], n);
                //     System.out.println(Arrays.deepToString(tasks));
                // break;
                // case "total-time":
                    // System.out.println(todo.totalTime4Completion());
                // break;
                default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(
            title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
