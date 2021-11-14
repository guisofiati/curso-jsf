package github.guisofiati.hangman;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "hangmanMultiplayerBean")
public class HangmanMultiplayer {
	
	private String word;
	private LettersWord lettersword;
	private List<LettersWord> letters = new ArrayList<LettersWord>();
	private String letterReleased;
	private int chances;
	
	public void startGame() {
		
		letters.clear();
		word = word.toUpperCase();
		
		for (int i = 0; i < word.length(); i++) {
			lettersword = new LettersWord();
			lettersword.setLetter(word.substring(i, i + 1));
			letters.add(lettersword);
		}
		word = "";
	}
	
	public void showLetter() {
		
		boolean rightAnswer = false;
		
		for (int i = 0; i < letters.size(); i++) {
			if (letters.get(i).getLetter().equalsIgnoreCase(letterReleased)) {
				rightAnswer = true;
				letters.get(i).setThereis(true);
			}
		}
		
		if (!rightAnswer) {
			chances--;
		}
		
		letterReleased = "";
	}
	
	public boolean isRightAnswer() {
		if (letters.isEmpty()) {
			return false;
		}
		
		for (int i = 0; i < letters.size(); i++) {
			if (!letters.get(i).isThereis()) {
				return false;
			}
		}
		
		return true;
	}
	
	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public LettersWord getLettersword() {
		return lettersword;
	}
	
	public void setLettersword(LettersWord lettersword) {
		this.lettersword = lettersword;
	}
	
	public List<LettersWord> getLetters() {
		return letters;
	}
	
	public void setLetters(List<LettersWord> letters) {
		this.letters = letters;
	}
	
	public String getLetterReleased() {
		return letterReleased;
	}
	
	public void setLetterReleased(String letterReleased) {
		this.letterReleased = letterReleased;
	}
	
	public int getChances() {
		return chances;
	}
	
	public void setChances(int chances) {
		this.chances = chances;
	}

	public void setRemainingChances(int chances) {
		this.chances = chances;
	}
}