public class Quizzer {
    public static void main(String[] args) {
        //Start a try/catch clause with the try, Start a try/catch clause with the try.
        try{
            //create a new Quiz object
            Quiz quiz = new Quiz();
            //call the takeQuiz method
            quiz.takeQuiz();
        } catch (Exception e){
            //catch the IllegalArgumentException
            System.err.println(e.getMessage());
            System.exit(-1);
        }
    }
}
