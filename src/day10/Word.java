package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Word {
	
	private String word;
	private List<String> mean = new ArrayList<>();
	
	public Word() {}
	public Word(String word) {
		this.word = word;
	}
	
	public Word(String word, List<String> mean) {
		this.word = word;
		this.mean = mean;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public List<String> getMean() {
		return mean;
	}
	public void setMean(List<String> mean) {
		this.mean = mean;
	}
	@Override
	public String toString() {
		return word + " : " + mean;
	}
	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}
	
}