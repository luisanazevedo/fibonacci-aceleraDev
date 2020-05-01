package br.com.codenation.desafioexe;

import java.util.*;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> sequenciaFibonacci = new ArrayList<>();
		sequenciaFibonacci.add(0);
		sequenciaFibonacci.add(1);


		do{
			int ultimoElemento = sequenciaFibonacci.get(sequenciaFibonacci.size()-1);
			int penultimoElemento = sequenciaFibonacci.get(sequenciaFibonacci.size()-2);
			sequenciaFibonacci.add(ultimoElemento+penultimoElemento);
		}while(sequenciaFibonacci.get(sequenciaFibonacci.size()-1)< 350);

		return sequenciaFibonacci;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}