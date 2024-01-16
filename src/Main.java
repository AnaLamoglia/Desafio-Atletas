import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			int qtdatletas = 0;
			String nome = "";
			char sexo;
			double altura = 0.0;
			double peso = 0.0;
			double pesototal = 0.0;
			double pesomedio = 0.0;
			String nomeMaisAlto = ";";
			double maiorAltura = 0.0;
			double percHomens = 0.0;
			int totAtlMulheres = 0;
			double totAlturaMulheres = 0.0;
			
		    Locale.setDefault(Locale.US);
			Scanner sc = new Scanner (System.in);
			
			System.out.printf("Qual a quantidade de atletas? =>");
			qtdatletas = sc.nextInt();
		
					
			for (int totAtletasLidos = 1; totAtletasLidos <= qtdatletas; totAtletasLidos++){
				System.out.printf("Digite os dados do atleta numero %d:", totAtletasLidos);
				System.out.printf("\nNome:");
				nome = sc.nextLine();
				nome = sc.nextLine();
				
				System.out.printf("Sexo:");
				sexo = sc.next().charAt(0);
								
				while (sexo != 'F' && sexo != 'M') {
					System.out.printf("\n Valor invalido! Favor digitar F ou M: ");
					sexo = sc.next().charAt(0);
				}
	
				System.out.printf("Altura:");
				altura = sc.nextDouble();

				while (altura <= 0.0) {
					System.out.printf("Valor invalido! Favor digitar um valor positivo: ");
					altura = sc.nextDouble();
				}
				
								
				System.out.printf("Peso:");
				peso = sc.nextDouble();

				while (peso <= 0.0) {
					System.out.printf("Valor invalido! Favor digitar um valor positivo: ");
					peso = sc.nextDouble();
				}
				
				// prepara totalizações
				if (sexo == 'F' ) {
					totAtlMulheres ++;
					totAlturaMulheres += altura;
				}

				pesototal += peso;
				
				if (altura > maiorAltura) {
					nomeMaisAlto = nome;
					maiorAltura = altura;
				}
			}
			
			
			sc.close();
			
			percHomens = (((qtdatletas - totAtlMulheres) * 100) / (double)qtdatletas);

			System.out.println("\n RELATÓRIO: \n");
			System.out.printf("Peso médio dos atletas: %.2f:\n", (pesototal / qtdatletas));
			System.out.printf("Atleta mais Alto: %s%n", nomeMaisAlto);
			System.out.printf("Porcentagem de homens:  %.1f %%%n", percHomens );
			
			if (totAtlMulheres == 0) {
				System.out.println("Não há mulheres cadastradas!"); 
			}
			else{
				System.out.printf("Altura média das mulheres %.2f%n", (totAtlMulheres > 0)? totAlturaMulheres/(double)totAtlMulheres : 0 );
				}
			}
	}

