package edu.unca.csci201.questiontypes;

public class ShortAnswerQuestion implements Question {
	String questionText;
	String correctAnswer; 
	
	public ShortAnswerQuestion(String questionText, String correctAnswer) {
		this.questionText  = questionText;
		this.correctAnswer = correctAnswer;  
	}

	public String getTheQuestionText() {
		return questionText;
	}

	public boolean isCorrectAnswer(String answer) {
		if (answer.equals(correctAnswer))
			return true;
		else 
			return false; 
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

}