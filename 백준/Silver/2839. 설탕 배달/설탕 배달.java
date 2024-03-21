import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int kg = Integer.parseInt(br.readLine());

        int bagOfFive = kg / 5;
        double bagOfThree = (kg % 5.0) / 3;

        if (bagOfThree % 1 != 0) {
            int bagOfFiveMinus = bagOfFive - 1;
            boolean found = false;

            while (bagOfFiveMinus > 0) {
                int newKg = (kg - bagOfFiveMinus * 5);
                if (newKg % 3 == 0) {
                    bw.write(String.valueOf(bagOfFiveMinus + newKg / 3));
                    found = true;
                    break;
                } else if (newKg % 3 != 0) {
                    bagOfFiveMinus--;
                }
            }

            if (kg % 3 == 0 && found == false) {
                bw.write(String.valueOf(kg / 3));
                found = true;
            }


            if (found == false) {
                bw.write("-1");
            }
        } else
            bw.write(String.valueOf(bagOfFive + (int)bagOfThree));

        bw.flush();
        bw.close();
    }
}