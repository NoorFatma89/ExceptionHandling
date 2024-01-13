package com.junit.exception.MoodAnalyzerProblem;


public class MoodAnalyzer {
	
	public String analyseMood(String message) {
		if(message=="Calling analyserMood Method")
			return "Welcome to Mood Analyzer Problem ! ";
		else
			return "Invalid String";
	}
		
}
