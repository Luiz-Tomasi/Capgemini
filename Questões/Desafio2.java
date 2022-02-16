/**
* @author Luiz Cirilo Tomasi Neto
* @lastversion 16/02/2022 7 a.m
*/
import java.util.Scanner;//Importação das bibliotecas
class Main {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    String specialCharacter ="!@#$%^&*()-+"; // Define valores para caracteres especiais
    int num=0, upperCase=0, lowerCase=0, special=0, specialNumberCode= 0;
    System.out.print("Digite uma senha: ");
    String password = scan.nextLine();
    
    if(password.length() > 0){ // Caso a variavel password seja maior que zero da inicio a verificação de senha
      for(int i=0; i < password.length(); i++){ //O for() junto com o charAt, divide a string em códigos da tabela ASCII de forma que podemos análisar        
        int letterNumberCode = (char)password.charAt(i);

        for(int j=0; j < specialCharacter.length(); j++){ // O for faz a verificação do código do input do usuario atrás
        specialNumberCode = (char)specialCharacter.charAt(j); // de caracteres especiais armazenados na variavel "specialCharacter"
          if (letterNumberCode == specialNumberCode){
          special++;
        }
      }
        if (letterNumberCode >= 48 && letterNumberCode<= 57 ){ // o if compara se o caractere é numerico através da tabela ASCII
          num++;
        } else if(letterNumberCode >= 65 && letterNumberCode <=90){ // o if compara se o caractere é maiúsculo através da tabela ASCII
          upperCase++;
        } else if (letterNumberCode >=97 && letterNumberCode <= 122){ // o if compara se o caractere é minúsculo através da tabela ASCII
          lowerCase++;
        }
      }
    }
    if(num >= 1 && upperCase >= 1 && lowerCase >=1 && special >= 1 && (num+upperCase+lowerCase+special) >=6){ // o if compara se a senha tem todos os requisitos para ser uma senha forte
      System.out.println("A senha foi verificada com sucesso, atendendo todos os requisitos");
    } else if ((num+upperCase+lowerCase+special) < 6){ // o if compara se a quantidade minima de caracteres (6) não foi atingida
      System.out.println("A senha precisa de pelo menos 6 caracteres, está faltando: "+ (6-(num+upperCase+lowerCase+special)) +" caracteres.");
    } else if (upperCase <= 0){ // o if compara se a quantidade minima de letras maiúsculas não foi atendida
      System.out.println("A senha precisa de pelo menos uma letra maiúscula.");
    } else if (lowerCase <= 0) { // o if compara se a quantidade minima de letras minúsculas não foi atendida
      System.out.println("A senha precisa de pelo menos uma letra minúscula.");
    } else if (special <= 0) { // o if compara se a quantidade minima de caracteres especiais não foi atendida
      System.out.println("A senha precisa de pelo menos um caractere especial.");
    }
  } 
}