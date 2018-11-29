package edu.unca.csci201;
import java.util.Scanner;

import edu.unca.csci201.questiontypes.Question;

public class Quiz {
	
	int questionCounter = 0;
	int correctAnswers = 0;
	int totalQuestionsAnswered = 0;
	Question[] quesArray = new Question[13];
	
	static Scanner scan = new Scanner(System.in);
	
	public void addQuestion(Question q) {
		questionCounter++;
		quesArray[questionCounter] = q; 
	}
	
	public double giveQuiz() {
		System.out.println("The Medium to Average Sized Quiz of 2018! Please answer without using capitals or punctuation. \n");
		for (int i = 1; i <= questionCounter; i++) {
			System.out.println("#" + i + ". "  + quesArray[i].getTheQuestionText());
			String input = scan.nextLine();
			if (quesArray[i].isCorrectAnswer(input))
				correctAnswers++;
			totalQuestionsAnswered++;
		}
		double score = 100 * correctAnswers / totalQuestionsAnswered;
		scan.close();
		return score;
	}
}
