package com.src.sorte;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Random;

public class Sorteia {

	public void sorteia(){
			
	}
		
	public void sortear(int numDezenas, int totalNum, int numJogos){		
		
		ArrayList vetorDaSorte = new ArrayList();
		Random rand = new Random();
		Hashtable vetorDaSorte2 = new Hashtable();
		for(int dx=0; dx < numJogos; dx++){
			
			for(int i=0; i<numDezenas; i++){
				int randnum = 0;
				do{
					randnum = rand.nextInt();
				}while (randnum <= 0);
				int numeroDaMegaSena = randnum % (totalNum + 1);
					if(!vetorDaSorte.contains(numeroDaMegaSena) && numeroDaMegaSena != 0){
						vetorDaSorte.add(numeroDaMegaSena);
					}else{
						i--;
				}
			}
			
		Collections.sort(vetorDaSorte);
		vetorDaSorte2.put(dx, vetorDaSorte);
		vetorDaSorte = new ArrayList();
		}
		for(int j=0; j<numJogos; j++){
			System.out.println(vetorDaSorte2.get(j).toString());
		}
		
		
		System.out.println(vetorDaSorte);
	}
}