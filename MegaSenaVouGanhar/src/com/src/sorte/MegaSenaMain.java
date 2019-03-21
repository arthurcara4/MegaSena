package com.src.sorte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.src.sorte.Sorteia;



public class MegaSenaMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String args[]) throws IOException{
		System.out.println("Bem vindo ao jogo da Loteria. \n\n O jogo vai de 01 até:");
		String totalNum = lerConsole();
		
		System.out.println("Digite o número de dezenas que serão sorteadas :");
		String numDezenas = lerConsole();
		
		
		System.out.println("Quantos jogos você quer fazer?");
		String numJogos = lerConsole();
		
		Sorteia sorteia = new Sorteia();
		sorteia.sortear(new Integer(numDezenas), new Integer(totalNum), new Integer(numJogos));
	}
	
	public static String lerConsole() throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  
		String in;  
		    in = reader.readLine();  
		    
		return in;
	}

}
