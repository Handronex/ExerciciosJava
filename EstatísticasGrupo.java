import java.util.Scanner;

public class EstatísticasGrupo {
    public static void main(String[] args){
        int sexo; 
        int qtmulheres = 0;
        int qthomens = 0;
        double altura;
        double somaH = 0;
        double mediaHomens = 0;
        double maior = 0;
        double menor = 0;
        
        Scanner leia = new Scanner(System.in);
        
        for(int i = 1; i<=5; i++) {
            
            System.out.println("");
            
            System.out.print("Qual o sexo da pessoa? [1 - Mulher, 2 - Homem]: ");
            sexo = leia.nextInt();
           
            System.out.println("");

            System.out.print("Digite a altura: ");
            altura = leia.nextDouble();

            if (sexo == 1){
                qtmulheres++;
            }else if(sexo == 2){
                qthomens++;
                somaH += altura;
            }else {
                System.out.println("Opção Inválida");
            }
            
            if (i == 1){
                maior = altura;
                menor = altura;
            }
            
            if (altura > maior){
                maior = altura;
            }else if (altura < menor){
                menor = altura;
            }
        }
        mediaHomens = somaH / qthomens;

        System.out.println("");

        System.out.println("=============== ESTATÍSTICAS ===============");

        System.out.println("");
        System.out.println("A maior altura do grupo é de " + maior + " M");
        System.out.println("");
        System.out.println("A menor altura do grupo é de " + menor + " M");
        System.out.println("");
        System.out.println("A média de altura dos homens é " + mediaHomens + " M");
        System.out.println("");
        System.out.println("O número de mulheres é " + qtmulheres);
        System.out.println("");

        leia.close();
    }
}