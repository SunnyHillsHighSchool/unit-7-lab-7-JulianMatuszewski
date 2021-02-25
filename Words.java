//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Julian Matuszewski

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList)
	{
		words = new ArrayList<Word>();
		for (String str: wordList) {
			words.add(new Word(str)); //creates new Word for each string in the parameter
		}
	}

	public int countWordsWithXChars(int size)
	{
		//Using getLength from Word class
		//make int count
		int count = 0;
		//for loop iterating through all words in array
		for (Word w: words)
			//if size of String = x
			if (w.getLength() == size)
				//count++
				count++;
		//return count
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		//Using getLength from Word class
		//make int count
		int count = 0;
		//for loop iterating through all words in array
		for (int i = words.size() - 1; i >= 0; i--) //iterates backwards so it doesnt skip any when two elements are changed next to eachother
		//if size of String = size
			if (words.get(i).getLength() == size) {
				//add to sum of the vowels in all words removed
				count += words.get(i).getNumVowels();
				//remove element of index
				words.remove(i);
			}
		return count;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		//Using getNumVowels from Word class
		//make int count
		int count = 0;
		//for loop iterating through all words in array
		for (Word w: words)
			//for loop iterating through each word
			if (w.getNumVowels() == numVowels)
				//count++
				count++;
		//return count
		return count;
	}
	
	//add in a toString
	public String toString () {
		String str = "[" + words.get(0).toString(); //adds this one outside loop, so it formats correctly
		String s;
		for (int i = 1; i < words.size(); i++) { //iterates, adding ", " and word String
			s = words.get(i).toString();
			str += ", " + s;
		}
		str += "]";
		return str;
	}
}