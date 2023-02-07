public class Quizzer {
    public static void main(String[] args) {
        try{
            Quiz quiz = new Quiz();
            quiz.takeQuiz();
        } catch (Exception e){
            System.err.println(e.getMessage());
            System.exit(-1);
        }
    }
}
