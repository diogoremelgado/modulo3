package bruxinhas;
import java.util.Scanner;
public class ProcedimentoseFunçoes {
static int menorde3(int x, int y, int z)
{if (x>y)
	x=y;
if (x>z)
	x=z;

return x ; }


	public static void main(String[] args) throws Exception
		{int x, y, z;
		Scanner LerS = new Scanner (System.in);
		System.out.print("Digite o 1º valor (x)");
		x=LerS.nextInt();
		System.out.print("Digite o 2º valor (y)");
		y=LerS.nextInt();
		System.out.print("Digite o 3º valor (z)");
		z=LerS.nextInt();
		System.out.print("Menor = " +menorde3 (x,y,z));


		}
}


