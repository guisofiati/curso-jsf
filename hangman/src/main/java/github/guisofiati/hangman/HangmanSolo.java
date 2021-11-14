package github.guisofiati.hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "hangmanSoloBean")
public class HangmanSolo {
	
	private static final Random RANDOM = new Random();
	
	private static final String[] WORDS = {"APPLE", "BANANA", "ORANGE"};
	private String word;
	private LettersWord lettersword;
	private List<LettersWord> letters = new ArrayList<LettersWord>();
	private String letterReleased;
	private int remainingChances;
	
	public void startGame() {
		
		remainingChances = 6;
		letters.clear();
		
		Random random = new Random();
		int nextWord = random.nextInt(WORDS.length);
		word = WORDS[nextWord];
		
		for (int i = 0; i < word.length(); i++) {
			lettersword = new LettersWord();
			lettersword.setLetter(word.substring(i, i + 1));
			letters.add(lettersword);
		}
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
			remainingChances--;
		}
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
	
	public int getRemainingChances() {
		return remainingChances;
	}
	
	public void setRemainingChances(int remainingChances) {
		this.remainingChances = remainingChances;
	}
	
	public static Random getRandom() {
		return RANDOM;
	}
	
	public static String[] getWords() {
		return WORDS;
	}
}