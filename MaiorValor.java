/**
 * MaiorValor
 */
 import java.util.Scanner;

 public class MaiorValor {

    public static void main(String[] args) {
        
        int num = 0, maiorNum = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("");

        System.out.println("============ MAIOR INTEIRO ============");
        
        for (int i = 1; i <= 3; i++) {
            
            System.out.print("Digite o " + i + "° Valor inteiro: ");
            num = leia.nextInt();
            
            if (num > maiorNum) {
                maiorNum = num;
            }
            
        }
        
        System.out.println("---------------------------------------");
        System.out.println("O maior valor é: " + maiorNum);

        System.out.println("");

    }
}