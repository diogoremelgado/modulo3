package pacote;
import java.util.Scanner;
public class M�diaAritm�tica {

	public static void main(String[] args) {
		{int N;
		double Med = 0;
		Scanner LerS = new Scanner (System.in);
		System.out.printf("Quantos elementos tem o vetor?");
		N = LerS.nextInt();
		double[]A= new double[N];
		for(int I=0; I<=N-1;I++)
		{System.out.printf("Elemento %d =", I+1);
		A[I]=LerS.nextDouble();}
		for(int I=0; I<=N-1;I++)
		Med+=A[I];
		Med=Med/N;
		System.out.printf(String.format("M�dia aritm�tica = %5.2f", Med));
				
		}
	}

}
