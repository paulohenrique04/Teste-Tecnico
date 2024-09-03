package Questions;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class QuestionsAndAnswers {
    public static Boolean ehFibonnaci(int value, int a, int b) {
        if(value == a) {
            return true;
        } else if(value < a) {
            return false;
        } else {
            return ehFibonnaci(value, b, a+b);
        }
    }
    
    public static void questionOne(Scanner sc) {
        System.out.println("");
    	System.out.println("1ª - Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.");
    	System.out.print("Digite um número para saber se ele está na sequência de Fibonacci: ");
    	int input = sc.nextInt();
    	
    	if(ehFibonnaci(input, 0, 1)) {
    	    System.out.println("O número " +input+ " faz parte da sequência de Fibonacci.");
    	    System.out.println("");
    	} else {
    	    System.out.println("O número " +input+ " NÃO faz parte da sequência de Fibonacci.");
    	    System.out.println("");
    	}
    }
        
    public static String removeAccents(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("");
    }
    
    public static void questionTwo(Scanner sc) {
        System.out.println("2ª - Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.");
        System.out.print("Digite uma palvra: ");
        String input = sc.nextLine();
        input = removeAccents(input).toLowerCase();
        
        if(input.contains("a")) {
            int count = input.length() - input.replace("a", "").length();
            System.out.println("=== RESPOSTA ===");
            System.out.println("A letra 'a' aparece " +count+ " vez(es) na palavra " +input);
            System.out.println("");
        } else {
            System.out.println("=== RESPOSTA ===");
            System.out.println("A palavra " +input+ " não contém letra(s) 'a'.");
            System.out.println("");
        }
    }
    
    public static void questionTree() {
        System.out.println("");
        System.out.println("3ª - Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);");
        int soma = 0;
        int k = 1;
        while(k < 12) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println("");
        System.out.println("=== RESPOSTA ===");
        System.out.println("No fim do loop, a variável soma terá o seguinte valor: " +soma);
        System.out.println("");
    }
    
    public static void questionFour() {
        System.out.println("");
        System.out.println("Descubra a lógica e complete o próximo elemento:");
        System.out.println("a) 1, 3, 5, 7, ___");
        System.out.println("b) 2, 4, 8, 16, 32, 64, ____");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, ____");
        System.out.println("d) 4, 16, 36, 64, ____");
        System.out.println("e) 1, 1, 2, 3, 5, 8, ____");
        System.out.println("f) 2,10, 12, 16, 17, 18, 19, ____");
        System.out.println("=================================");
        System.out.println("======== Respostas ==============");
        System.out.println("a) 1, 3, 5, 7, _9_ -> sequência de números ímpares");
        System.out.println("b) 2, 4, 8, 16, 32, 64, _128_ -> a sequência é sempre o dobro do número anterior");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, _49_ -> a sequência são os números de 0 à 7 elevados ao quadrado");
        System.out.println("d) 4, 16, 36, 64, _100_ -> sequência dos números pares consecutivos ao quadrado, 2^2, 4^2, 6^2, 8^2, 10^2...");
        System.out.println("e) 1, 1, 2, 3, 5, 8, _13_ -> sequência de Fibonacci");
        System.out.println("f) 2,10, 12, 16, 17, 18, 19, _200_ -> sequência dos números que começam com a letra 'd': dois, dez, doze, dezesseis...");
        System.out.println("");
    }
    
    public static void questionFive() {
        System.out.println("");
        System.out.println("A resposta da questão consiste nos seguintes passos:");
        System.out.println("1 - Ligar dois interruptores (interruptores A e B, por exemplo).");
        System.out.println("2 - Deixar os interruptores acesos por um tempo considerável, depois apagar apenas um (apaga o interruptor A, por exemplo).");
        System.out.println("3 - Ir até à sala das lâmpadas e analisar qual lâmpada está quente, essa lâmpada será a do interruptor A.");
        System.out.println("4 - A lâmpada acesa será do interruptor B e a lâmpada que está fria será do interruptor C, assim, será necessário apenas uma ida à sala.");
        System.out.println("");
    }
}
