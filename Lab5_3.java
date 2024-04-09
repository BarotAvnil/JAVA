import java.util.Scanner;

class sentences {
    int count_a;
    int count_e;
    int count_i;
    int count_o;
    int count_u;

    public sentences() {
        this.count_a = 0;
        this.count_e = 0;
        this.count_i = 0;
        this.count_o = 0;
        this.count_u = 0;
    }

    public void processSentences(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'A') {
                count_a++;
            }
            if (s1.charAt(i) == 'e' || s1.charAt(i) == 'E') {
                count_e++;
            }
            if (s1.charAt(i) == 'i' || s1.charAt(i) == 'I') {
                count_i++;
            }
            if (s1.charAt(i) == 'o' || s1.charAt(i) == 'O') {
                count_o++;
            }
            if (s1.charAt(i) == 'u' || s1.charAt(i) == 'U') {
                count_u++;
            }
        }
    }
}

public class Lab5_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sentences sentence = new sentences();
        while (true) {
            System.out.println("Please Enter Sentence : ");
            String s1 = sc.nextLine();
            if (s1.equalsIgnoreCase("quit")) {
                break;
            } else {
                sentence.processSentences(s1);
            }
        }
        System.out.println("a = " + sentence.count_a + "\n e = " + sentence.count_e + "\n i = " + sentence.count_i
                + "\n o = " + sentence.count_o + "\n u = " + sentence.count_u);
    }
}