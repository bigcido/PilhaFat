package controller;
import model.PilhaInt;

public class FatPilha {

	public FatPilha() {
		super();
	}
	
	public int fatorial(int a){
		PilhaInt Pi = new PilhaInt();	
		int fat=1;
		
		while (a > 1) {
			Pi.push(a);
			a--;
		}
	while(!Pi.isEmpty()) {
		try {
			fat = fat*Pi.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	return fat;
	}
}