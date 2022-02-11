package co.edu.unbosque.model;

import java.util.ArrayList;

public class notas {
 
	public ArrayList<Double> notas;
	
	public double calculoPromedio(ArrayList<Double> lista){
		int count = 0;
		
		for(int i =0;i<lista.size();i++ ) {
		
			count += lista.get(i);
			
		}
		count = count/3;
		
		return count;
	}
	
}
