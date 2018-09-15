import java.util.Scanner;
/**
 * Class for quiz.
 */
class Quiz {
    /**
     * Choice.
     */
    private String choice;
    /**
     * Score.
     */
    private int score;
    /**
     * Constructs the object.
     */
    Quiz() {

    }
    /**
     * Constructs the object.
     *
     * @param      choicee  The choice
     * @param      scoree   The score
     */
    Quiz(final String choicee, final int scoree) {
        this.choice = choicee;
        this.score = scoree;
    }
    /**
     *
     * @param      choicee  The choice
     */
    public void setchoice(final String choicee) {
        this.choice = choicee;
    }
    /**
     *
     * @return     choice
     */
    public String getchoice() {
        return this.choice;
    }
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
        	    startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s,
     final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        if (questionCount >= 1) {
        	System.out.println(questionCount + " are added to the quiz");
            displayQuiz(s, questionCount);
        } else {
        	System.out.println("Quiz doesnot have enough questions");
        }
    }

    public static void displayQuiz(final Scanner s, final int questionCount) {
    	int constant = questionCount;
        int cnt = 1;
        while (constant > 0) {
            String[] str = s.nextLine().split(":");
            int i;
            final int four = 4;
            for (i = 0; i < str.length - four; i++) {
                System.out.println(str[i] + "(" + cnt + ")");
                cnt = cnt + 1;
            } String[] temstr = str[i].split(",");
            int j;
            for (j = 0; j < temstr.length - 1; j++) {
        	    System.out.print(temstr[j] + "\t");
            } System.out.print(temstr[j]);
        constant--;
        }
    }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s,
     final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        String[] str = s.nextLine().split(" ");
        quiz.setchoice(str[0]);
    }

    /**
     * Displays the score report.
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
        Quiz q = new Quiz();
        int totalscore = 0;
        Scanner s = new Scanner(System.in);
        String[] str = s.nextLine().split(" ");
        if (quiz.getchoice().equals(str[1])) {
            System.out.println("Correct Answer!" + " - " + "Marks Awarded:" + Integer.parseInt(str[1]));
            totalscore += Integer.parseInt(str[1]);
        } else {
            System.out.println("Wrong Answer!" + " - " + "Penalty:" + Integer.parseInt(str[1]));
            totalscore -= Integer.parseInt(str[1]);
        } if (totalscore < 0) {
            System.out.println("Invalid max marks");
        } else {
            System.out.println("Invalid Penalty");
        }
        System.out.println("Total Score:" + totalscore);
    }
}
