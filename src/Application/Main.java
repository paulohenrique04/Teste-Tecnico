package Application;

import java.util.Scanner;

import Questions.QuestionsAndAnswers;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num;
	    do {
	        System.out.println("= = = = = = Menu = = = = = =");
	        System.out.println("1 - Resposta da questão 1.");
	        System.out.println("2 - Resposta da questão 2.");
	        System.out.println("3 - Resposta da questão 3.");
	        System.out.println("4 - Resposta da questão 4.");
	        System.out.println("5 - Resposta da questão 5.");
	        System.out.println("6 - Encerrar.");
	        System.out.print("Insira o número correspondente da questão para visualizar a resposta: ");
	        num = sc.nextInt();
	        sc.nextLine();
	        
	        switch(num) {
	            case 1:
	                QuestionsAndAnswers.questionOne(sc);
	                break;
	            case 2:
	                QuestionsAndAnswers.questionTwo(sc);
	                break;
                case 3:
                    QuestionsAndAnswers.questionTree();
                    break;
                case 4: 
                    QuestionsAndAnswers.questionFour();
                    break;
                case 5:
                    QuestionsAndAnswers.questionFive();
                    break;
                case 6:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
	        }
	    } while(num != 6);
	    sc.close();
	}
}

