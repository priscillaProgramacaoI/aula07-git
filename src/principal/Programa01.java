package principal;

import modelo.DataHora;

public class Programa01 {

	public static void main(String[] args) {
		
		DataHora dtH1,dtH2, dtH3;
		dtH1 = new DataHora(8,9,2012);
		dtH2 = new DataHora(12,12,1950,6,15,0);
		dtH3 = new DataHora(15,10,2000);
		System.out.println("Data 1: "+dtH1);
		System.out.println("Data 2: "+dtH2);
		System.out.println("Data 3: "+dtH3);
	}

}
