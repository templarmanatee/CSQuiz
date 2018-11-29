package edu.unca.csci201.questiontypes;

public interface Question {

	public String getTheQuestionText();
	
	public boolean isCorrectAnswer(String answer);
	
	public String getCorrectAnswer();
	
}
