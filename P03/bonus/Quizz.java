import java.util.Scanner;

public class Quiz {   
    private Question[] questions;    
    public Quiz(){        
        loadQuiz();
    }
    
    private void loadQuiz(){
        
        Question q1 = new Question("What is the return type of a constructor?", new String[]{"-1", "null", "0", "Anything you want"});
        
        
        Question q2 = new Question("A final modifier ", new String[]{"cannot be accessible outside of a class", "is not shared to other classes", "cannot be changed once initialized", "can be inherited"});
        
        
        Question q3 = new Question("Debugger command step up is used to ", new String[]{"execute until the current method returns to its caller", "execute till the end of the program", "start execution of application's main class", "does not execute anything"});
        
        
        Question q4 = new Question("Debugger command catch is used to ", new String[]{"cancel 'catch' for the specified exception", "break when specified exception occurs", "discontinue watching access/modifications to a field", "watch access/modifications to a field"});
        
        
        Question q5 = new Question("Which of the following is not a kind of error in Java?", new String[]{"Compile-time errors", "Link-time errors", "Logic errors", "Temperature error"});
        
    }


    
    public double takeQuiz(){       
        Scanner input = new Scanner(System.in);       
        Question q = new Question(null, null);       
        int correct = 0;
        
        for(int i = 0; i < questions.length; i++){            
            System.out.println(q);            
            System.out.println("Enter your answer: ");            
            int proposedAnswer = input.nextInt();           
            q.checkAnswer(proposedAnswer);           
            if(q.checkAnswer(proposedAnswer) == true){
                correct++;
            }
        }
       
        return correct / questions.length;
    }

    
}
