public class Question{
  private String question;
  private String[] answer;
  private int rightAnswer;

  //private final field questionNumber
  private final int questionNumber;
  private static int nextQuestionNumber = 1;

  Question(String string, String[] strings){
    //initialize questionNumber
    questionNumber = nextQuestionNumber;
    nextQuestionNumber++;
    
    //if rightAnswer is less than 1 or greater than the number of answers, throw a new IllegalArgumentException
    if(rightAnswer < 1 || rightAnswer > answer.length){
      throw new IllegalArgumentException("The right answer must be between 1 and the number of answers");
    }
  }
  

@Override
  public String toString(){
    //return the question number, the question, and then the answers in a for loop
    for(int i = 0; i < answer.length;){
      return questionNumber + ". " + question + "%n" + (i + 1) + ". " + answer[i];

  }
    return null;
  }



}
