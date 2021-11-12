package github.guisofiati.hangman;

public class LettersWord {
	
	private String letter;
	private boolean thereis = false;
	
	public String getLetter() {
		return letter;
	}
	
	public void setLetter(String letter) {
		this.letter = letter;
	}
	
	public boolean isThereis() {
		return thereis;
	}
	
	public void setThereis(boolean thereis) {
		this.thereis = thereis;
	}
}