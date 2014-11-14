import java.util.Scanner;

class TempoCalculator 
{
	public static void main(String[] args) 
	{
		double twelfthRootOfTwo = 0;
		double tempo;
		double[] tempoArr = new double[120];
		String input;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the tempo:");
		
		tempo = Double.parseDouble(sc.nextLine());
		
		tempoArr[47] = tempo;
		twelfthRootOfTwo = Math.pow(2.0, 1.0/12.0);
		
		for(int i = 0; i < 120; i++) {

			tempoArr[i] = tempo * Math.pow(twelfthRootOfTwo, i-47);
			System.out.println(String.format("%d,%f", i, tempoArr[i]));
		}
	}
}
