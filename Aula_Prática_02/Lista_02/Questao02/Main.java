import java.util.HashSet;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Write a phrase:");
		String phrase = input.nextLine();

		String wordsArray[] = phrase.split(" ");
		HashSet<String> words = new HashSet<String>();

		for (String word : wordsArray){
			words.add(word);
		}

		for (String i : words){
			int count = 0;
			for(String j : wordsArray){
				if(i.equals(j)){
					count++;
				}
			}
			System.out.println(i + " : " + count);
		}
	}
}
