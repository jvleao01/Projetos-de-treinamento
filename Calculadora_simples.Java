import java.util.*;
public class texte {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Calculadora Simples");
    float num1, num2, soma, sub, mult, div;
    int operador;

    System.out.println("Digite o Primeiro número: ");
    num1 = sc.nextFloat();
    System.out.println("Digiteo segundo número: ");
    num2 = sc.nextFloat();

    System.out.println("Digite qual conta deseja realizar: ");
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");
    operador = sc.nextInt();

    switch(operador) {
        case 1:
            soma = num1+num2;
            System.out.println("Soma dos números: "+soma);
            break;
        case 2: 
            sub = num1 - num2;
            System.out.println("Subtração dos números: "+ sub);
            break;
        case 3: 
            mult = num1 * num2;
            System.out.println("Multiplicação dos números: "+mult);
            break;
        case 4:
            div = num1 / num2;
            System.out.println("Divisão dos números: "+div);
            break;        
        default:
            System.out.println("ERRO!!");
            break;
    }
    
    sc.close();
  }
}
