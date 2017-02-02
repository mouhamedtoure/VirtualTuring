package fr.demos.formation.virtualturing.utilitaire;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lecteur {

	private static Scanner consoleEnLecture;
	private static String ligneLue = null;
	
	
	

	public static String lireLigne() {

		consoleEnLecture = new Scanner(System.in);
		ligneLue = consoleEnLecture.nextLine();

		return ligneLue;

	}

	public static ArrayList <String> recupLigne() {
		
		ArrayList <String> maDonnee= new ArrayList <String> (); 
		
		StringTokenizer token = new StringTokenizer(Lecteur.ligneLue, " ,;:.!'\"");
		
		while (token.hasMoreTokens()){
			
			maDonnee.add(token.nextToken());
			
		}
		return maDonnee;
	}
	
	
	

}
