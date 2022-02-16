import java.util.Scanner;
import java.util.ArrayList; //Importação das bibliotecas
import java.util.Arrays;
import java.util.*;
/**
* @author Luiz Cirilo Tomasi Neto
* @lastversion 16/02/2022 7 a.m 
*/
class Main {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    int contador=0;
    int num=0;
    ArrayList<String> substrings = new ArrayList();

    System.out.print("Digite uma palavra: ");
    String word = scan.nextLine(); 
    word = word.replace(" ","").toLowerCase(); // Retira os espaços das palavras e coloca as palavras em minúsculo
  

    for(int i=0; i < word.length(); i++){
      for(int j=i; j < word.length(); j++){
        String cutWord = word.substring(i, j+1);
        char[] sortedCutWord = cutWord.toCharArray(); // 
        Arrays.sort(sortedCutWord);
        substrings.add(String.valueOf(sortedCutWord));
        /*Transforma a string em uma substring(entre os valores i e j) usando i para o espaço inicial e j para o espaço final*/
        
      }
    }
    for(int i=0; i < substrings.size(); i++){
      for(int j= i; j < substrings.size(); j++){ //Os 2 for servem para fazer uma comparação entre as substring e acionar o contador se forem iguais
        if(i!=j){ // O if retira a condição que faria o i e o j acionarem o contador por serem iguais quando tivesem o mesmo valor atingido no for (exemplo: 0,0)
          if(substrings.get(i).equals(substrings.get(j))){           
              contador++;
          }
        }}
      }
    System.out.println("A palavra tem: "+contador+" anagramas pares");
    
  } 
}