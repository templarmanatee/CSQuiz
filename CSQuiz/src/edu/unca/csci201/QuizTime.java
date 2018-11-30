package edu.unca.csci201;
import edu.unca.csci201.questiontypes.MultipleChoiceQuestion;
import edu.unca.csci201.questiontypes.ShortAnswerQuestion;
import edu.unca.csci201.questiontypes.TrueFalseQuestion; 

public class QuizTime {

	public static void main(String[] args) {
		/* MultipleChoiceQuestion(String questionText, String choiceA, String choiceB, String choiceC, String choiceD, String correctAnswer)
		 * TrueFalseQuestion(String questionText, boolean correctAnswer)
		   ShortAnswerQuestion(String questionText, String correctAnswer) 															      */
		MultipleChoiceQuestion one 		= new MultipleChoiceQuestion("Are you happy? \nA. Yes \nB. No \nC. Maybe? \nD. Mind your business \n", "d");
		MultipleChoiceQuestion two 		= new MultipleChoiceQuestion("Are you sure? \nA. Yes \nB. No \nC. Maybe? \nD. Mind your business \n", "d");
		MultipleChoiceQuestion three 	= new MultipleChoiceQuestion("Do you need a hug? \n A. Yes \n B. No \n C. Maybe? \n D. Mind your business \n", "a");
		TrueFalseQuestion four 			= new TrueFalseQuestion("Squirrels are cool.", true);
		ShortAnswerQuestion five 		= new ShortAnswerQuestion("What's the best bird?", "penguin");
		ShortAnswerQuestion six 		= new ShortAnswerQuestion("Who's a good boy?", "you are");
		TrueFalseQuestion seven 		= new TrueFalseQuestion("Is it socially acceptable to wear underwear over your pants?", false);
		MultipleChoiceQuestion eight 	= new MultipleChoiceQuestion("How many friends do you have? A. 0, B. 2, C. 6, D. 45,000", "a");
		TrueFalseQuestion nine			= new TrueFalseQuestion("Dogs.", true);
		ShortAnswerQuestion ten 		= new ShortAnswerQuestion("What's the best comeback?", "no u");
		ShortAnswerQuestion eleven 		= new ShortAnswerQuestion("Why'd the chicken cross the road?", "to get to the other side");
		TrueFalseQuestion twelve 		= new TrueFalseQuestion("That joke is bad.", true);
		
		Quiz quiz = new Quiz();
		quiz.addQuestion(one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve);
		
		System.out.println(quiz.giveQuiz());
	}
}