/**
* @author Luiz Cirilo Tomasi Neto
* @lastversion 16/02/2022 7 a.m
*/
import java.util.Scanner;//Importação das bibliotecas
class Main {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    System.out.print("Quantos degraus deve ter a escada: ");
    int n = scan.nextInt();
      for (int i = 1; i<=n; i++){    // O primeiro for() funciona para botar os degraus da escada
        for (int j = i; j<=n; j++){  // Já o segundo for() coloca os espaçõs antes de cada degrau
        System.out.print(" ");       // Assim criando 2 triangulos um oposto ao outro, um com espaçõs vazios
        }                            // e o outro com * formando a escada
        for (int j = 1; j<=i; j++){
        System.out.print("*"); 
        }        
        System.out.println();
      }
  } 
}