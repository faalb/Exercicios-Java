/**
* Desafio: [Count Letters in a Word Search]
* 
* Enunciado (Link Original): 
* [https://edabit.com/challenge/Sej5nsmmjBAXv6hHv]
*
* @version 1.0
*/

public class Program {
	
	public static int letterCounter(char [][] matrizLetters, char letter) {
		
		int i = 0;
		
		for (char[] arrL : matrizLetters) {
			
			for (char l : arrL) {
				if(l == letter) {
					i++;
				}
			}
		}
		
		return i;
	}
}
