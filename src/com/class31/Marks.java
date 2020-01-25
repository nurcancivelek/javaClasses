package com.class31;

public abstract class Marks {
	
	public abstract double getPercentage();	
	}
	

class A extends Marks{
		double mathScore,englishScore,scienceScore;
		A (double mathScore,double englishScore,double scienceScore){
			this.mathScore=mathScore;
			this.englishScore=englishScore;
			this.scienceScore=scienceScore;
		}
		public double getPercentage() {
			return ((mathScore+englishScore+scienceScore)/3);
		}	
		}
	

class B extends Marks{
		double mathScore,englishScore,scienceScore,historyScore;
		B (double mathScore,double englishScore,double scienceScore,double historyScore){
			this.mathScore=mathScore;
			this.englishScore=englishScore;
			this.scienceScore=scienceScore;
			this.historyScore=historyScore;
		}
		public double getPercentage() {
			return ((mathScore+englishScore+scienceScore+historyScore)/4);
		}	

}
