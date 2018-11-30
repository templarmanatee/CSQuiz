package edu.unca.csci201.questiontypes;

public class MultipleChoiceQuestion implements Question {
	String questionText;
	String correctAnswer; 
	
	public MultipleChoiceQuestion(String questionText, String correctAnswer) {
		this.questionText  = questionText + "\nSelect a letter.";
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
