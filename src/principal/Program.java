package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		/*Fa�a um programa para gerar 3 n�meros aleat�rios para 3 dados, mostre a soma dos n�meros que sa�ram. 
		 * Se 2 dados sa�rem com a mesma numera��o o jogador ganha 2 pontos de b�nus, 
		 * Se os 3 dados sa�rem com a mesma numera��o ele ganha 6 pontos de b�nus e deve aparecer a mensagem "voc� � muito sortudo". 
		 * Se o total da soma dos dados mais o b�nus for menor que 15 o jogador perde e apresenta a mensagem "Lamento, mas voc� perdeu" , 
		 * Se for maior ou igual a 15 ele ganha e apresenta a mensagem "parab�ns, voc� ganhou!" .
		*/
		
		
		Random randon = new Random();
		
		int op = randon.nextInt(10);
		int op2 = randon.nextInt(10);
		int op3 = randon.nextInt(10);
		
		int bonus = 0;
		int saldoBonus = 0;
		int saldoBonus2 = 0;
		
		int somaDado = (op + op2 + op3);
		System.out.println("a soma dos dados � : "+op+" + "+op2+" + "+op3+" = "+somaDado);		
		System.out.println("");
		
		/*switch (somaDado) {
		case 1:*/ 
			if (op == op2 || op == op3 || op2 == op3) {
				saldoBonus = bonus + 2;
			System.out.println("Voc� ganhou 2 pontos pelos dados iguais, seu saldo de B�nus �: "+saldoBonus+" PONTOS");	
			}
			if(op == op2 && op == op2 && op2 == op3) {
				saldoBonus2 = saldoBonus + 6;
				System.out.println("voc� � muito sortudo!!");
			if(somaDado + saldoBonus < 15) {
				System.out.println("");
				System.out.println("Lamento, mas voc� perdeu!");
			}if(somaDado + saldoBonus >= 15) {
				System.out.println("");		
				System.out.println("Parab�ns, voc� ganhou!");
			}else {System.out.println("Nem ganhou nem perdeu - Dilma Rousseff");	
			/*
		case 2:			
			System.out.println("Caso 2");
			break;
			
		default:*/
			if (somaDado <= 0) {
				
			System.out.println(somaDado+" n�o � um n�mero inteiro!!");	
		
			}}//if	
	}//switch case
}//void main
}//Program
