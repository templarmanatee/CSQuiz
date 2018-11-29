package edu.unca.csci201.questiontypes;

public class TrueFalseQuestion implements Question {
	String questionText;
	boolean correctAnswer;
	
	public TrueFalseQuestion(String questionText, boolean correctAnswer) {
		this.questionText  = questionText + " Answer true or false.";
		this.correctAnswer = correctAnswer;  
	}

	public String getTheQuestionText() {
		return questionText;
	}

	public boolean isCorrectAnswer(String answer) {
		if (answer.equals(String.valueOf(correctAnswer)))
			return true;
		else 
			return false; 
	}

	public String getCorrectAnswer() {
		return String.valueOf(correctAnswer);
	}

}
