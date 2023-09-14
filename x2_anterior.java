public class x2_anterior {
    public static void main(String[] args) {
        int somatotal = 0;
        System.out.println("================== DOBRO DO ANTERIOR ==================");
        for (int i = 1; i <= 64; i++) {
            somatotal += (i-1) * 2;
        }
        System.out.println("Soma total: " + somatotal);
        System.out.println("=======================================================");
    }
}


