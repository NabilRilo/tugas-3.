import java.util.*;
import java.time.*;

class demoCalcYearsOld{
    private int yourBirthYear;
    private int yearsRightNow = Year.now().getValue();

    void setYourBirthYear(){
        System.out.print("Masukkan tahun lahir: ");
        Scanner scanner = new Scanner(System.in);
        yourBirthYear = scanner.nextInt();
        scanner.close();
    }
    int getAge(){
        int i = yearsRightNow - yourBirthYear;
        return i;
    }
}

public class Main {
    public static void main(String[] args) {
        demoCalcYearsOld obj1 = new demoCalcYearsOld();
        obj1.setYourBirthYear();
        System.out.println("Umur anda sekarang: " + obj1.getAge() + " Tahun");
    }
}