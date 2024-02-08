package com.techpalle.main;

import com.techpalle.jdbc.TrainerServices;
import com.techpalle.model.TrainerModel;

public class TrainerApplication {

	public static void main(String[] args) {
		
		int i = 1;
		String n = "Akarsh";
		int s = 500000;
		String c = "B.E";
		String l = "Banglore";
		
		TrainerModel t = new TrainerModel(i,n,s,c,l);
		
		TrainerServices.insertTrainer(t);

	}

}
