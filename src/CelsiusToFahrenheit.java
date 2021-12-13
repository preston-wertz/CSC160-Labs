import java.util.Scanner;

/**
 * @Author Preston C. Wertz
 * @Section CSC160 - 179
 * @Instructor Doug Lundin
 * @Date 2021-09-10
 *
 * @Description
 *
 * HW # 2
 *
 */
public class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double c = input.nextDouble();

        double f = (9.0/5) * c + 32;

        System.out.println(c + " Celsius is " + f + " Fahrenheit");
    }
}
