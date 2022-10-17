import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner scanner=new Scanner(System.in);
        System.out.println("havanın sıcaklığını girin");
        sicaklik= scanner.nextInt();

        if (sicaklik<=0){
            System.out.println("kayak veya kartopu. ");
        } else if (0<sicaklik && sicaklik<=15) {
            System.out.println("evde film izleyebilirsiniz.");
        } else if (15<sicaklik && sicaklik<=25) {
            System.out.println("piknik yapabilirsiniz.");
        }else {
            System.out.println("yüzmeye gidebilirsiniz.");
        }
    }
}