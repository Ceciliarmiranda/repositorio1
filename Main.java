import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int numero;

    System.out.println("Digite um número: ");
    numero = entrada.nextInt();

    if (numero < 0) {
      System.out.println("O número para se iniciar deve ser maior que zero");
  }
    for(int i = numero; i >= 0; i--){
      System.out.println(i);
    }
  }
}