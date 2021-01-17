import java.util.Scanner;

public class Main {

    public static double roczneWynagrodzenie(double godziny, double stawka, int wakacje){
        int wak = wakacje * 8;
        double godzWSumie = godziny * 52 - wak;
        double zarobki = godzWSumie * stawka;
        return zarobki;
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbe przepracowanych godzin w tygodniu: ");
        Scanner input = new Scanner(System.in);
        double przepracowaneGodziny = input.nextDouble();
        System.out.println("Podaj stawke: ");
        double stawkaGodz = input.nextDouble();
        System.out.println("Podaj ilosc dni urlopowych: ");
        int urlop = input.nextInt();
        double roczneZarobki = roczneWynagrodzenie(przepracowaneGodziny, stawkaGodz, urlop);
        System.out.println("Twoje roczne zarobki: " + roczneZarobki);
    }

}
