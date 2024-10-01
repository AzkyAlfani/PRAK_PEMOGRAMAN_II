import java.util.Scanner;
public class PRAK104_MuhammadPutraAzkyAlfani_2310817210026 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String[] rondeAbu = {input.next(), input.next(), input.next()};

        System.out.print("Tangan Bagas: ");
        String[] rondeBagas = {input.next(), input.next(), input.next()};

        int poinAbu = 0;
        int poinBagas = 0;

        for (int i = 0; i < 3; i++) {
            if (!rondeAbu[i].equals(rondeBagas[i])) {
                if ((rondeAbu[i].equals("B") && rondeBagas[i].equals("G")) ||
                    (rondeAbu[i].equals("G") && rondeBagas[i].equals("K")) ||
                    (rondeAbu[i].equals("K") && rondeBagas[i].equals("B"))) {
                    poinAbu++;
                } else {
                    poinBagas++;
                }
            }
        }

        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
        input.close();
    }
}

