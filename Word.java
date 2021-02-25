//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Julian Matuszewski

import static java.lang.System.*;

public class Word
{
  private static String vowels = "AEIOUaeiou";
	//why is this here? This stores all vowels for reference of the class
	//why is it static? It is shared by all Word object

  //add an instance variable...

	private String str;

	//create 2 constructors...

	//No Argument Constructor:
	public Word()
	{
		this.str = ""; //empty String
	}

	//Normal Word Constructor:
	public Word (String str)
	{
		this.str = str;
	}

	//Get Word
	public String getWord()
	{
		return str;
	}

	//Get Num Vowels
	public int getNumVowels ()
	{
  	//counter integer
		int counter = 0;
 		//use for loop iterating through str
		for (int i = 0; i < str.length(); i++) //iterate through all letters in str and
 			for (int j = 0; j < vowels.length(); j++) //compare to all letters in vowels
				//if it matches with a vowel...
				if (str.charAt(i) == vowels.charAt(j))
					counter++; //...incr counter
 		//return counter
		return counter;
	}

	//Get Length
	public int getLength()
	{
  	return str.length();
	}

	//Set Word
	public void setWord(String str)
	{
		this.str = str;
	}

	//toString
	public String toString()
	{
  	return str;
	}

}