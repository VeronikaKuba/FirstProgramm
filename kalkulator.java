import java.util.Scanner;
public class kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Введіть дюйм");
 //       double inches = scanner.nextDouble();
 //       double meters = inches * 0.0254;
     //   System.out.println(meters);
           ///
        float a =scanner.nextInt();
       System.out.println(a + "число" );
       System.out.println("ВВедіть наступне число_");
        float b = scanner.nextInt();
       float c = a / b;
       System.out.println("Відповідь: " + c);

    }
}
