package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) { // Jogo de  dados
		
		/*Faça um programa para gerar 3 números aleatórios para 3 dados, mostre a soma dos números que saíram. 
		 * Se 2 dados saírem com a mesma numeração o jogador ganha 2 pontos de bônus, 
		 * Se os 3 dados saírem com a mesma numeração ele ganha 6 pontos de bônus e deve aparecer a mensagem "você é muito sortudo". 
		 * Se o total da soma dos dados mais o bônus for menor que 15 o jogador perde e apresenta a mensagem "Lamento, mas você perdeu" , 
		 * Se for maior ou igual a 15 ele ganha e apresenta a mensagem "parabéns, você ganhou!" .
		*/
		
		
		Random randon = new Random();
		
		int op = randon.nextInt(10);
		int op2 = randon.nextInt(10);
		int op3 = randon.nextInt(10);
		
		int bonus = 0;
		int saldoBonus = 0;
		
		
		int somaDado = (op + op2 + op3);
		System.out.println("Iniciando Jogo de Dados -->");
		System.out.println("a soma dos dados é : "+op+" + "+op2+" + "+op3+" = "+somaDado);		
		System.out.println("");
		
		 
			if (op == op2 || op == op3 || op2 == op3) {
				saldoBonus = bonus + 2;
			System.out.println("Você ganhou 2 pontos pelos dados iguais, seu saldo de Bônus é: +"+saldoBonus+" PONTOS");	
			}
			if(op == op2 && op == op2 && op2 == op3) {
				saldoBonus = saldoBonus + 6;
				System.out.println("você é muito sortudo!!");}
			if(somaDado + saldoBonus < 15) {
				System.out.println();
				System.out.println("Soma dos Dados + Saldo de Bonus: "+(somaDado+saldoBonus+" é MENOR que 15 :("));
				System.out.println();
				System.out.println("Lamento, mas você perdeu!   *Saldo Bonus: "+saldoBonus);
			}else if(somaDado + saldoBonus == 15) {{
				System.out.println();
				System.out.println("Parabéns, Ganhou!!");
				System.out.println();
				System.out.println("Soma dos Dados + Saldo de Bonus: "+(somaDado+saldoBonus+" é IGUAL a 15 :D"));

			}
			}else {
			System.out.println();
			System.out.println("Parabéns, Ganhou!!");
			System.out.println();
			System.out.println("Soma dos Dados + Saldo de Bonus: "+(somaDado+saldoBonus+" é MAIOR que 15 :D"));
			
			if (somaDado <= 0) {
				
			System.out.println(somaDado+" não é um número inteiro!!");	
		
			}//if	
	}//else
}//void main
}//Program
