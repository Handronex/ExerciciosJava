import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        int num = 1, maiorNum = 0, repete = 1, numRepete = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("============ NÃO DIGITE ZERO ============");

        while (num != 0){

            System.out.print("Digite um número inteiro: ");
            num = leia.nextInt();
    
            if (num > maiorNum) {
                maiorNum = num;   
            } else if (num == maiorNum) {
                repete++;
                numRepete = maiorNum;
            }
        }
        System.out.println("");
        System.out.println("============ MAIOR NÚMERO ============");
        
        if (repete > 0 && maiorNum == numRepete && maiorNum != 0) {
            System.out.println("Maior número digitado: " + maiorNum);
            System.out.println("Foi digitado: " + repete + " vezes");
        } else {
            System.out.println("Maior número digitado: " + maiorNum);
        }    
    }
}
