import java.util.Scanner;

/**
 * @Author Preston C. Wertz
 * @Section CSC160 - 179
 * @Instructor Doug Lundin
 * @Date 2021-09-19
 *
 * @Description
 *
 * HW # 4 PhoneKeyPad
 *
 */
public class PhoneKeyPad
{
    public static void main(String[] args)
    {
        // Create a scanner for input.
        Scanner input = new Scanner(System.in);

        // Run forever.
        while(true)
        {
            // Prompt the user for a letter.
            System.out.print("Enter a letter: ");
            String s = input.next();
            char c = s.charAt(0);

            // Check for proper input.
            if (s.length() == 1 && (('a' <= c && c <= 'z') || ('A'<= c && c <= 'Z')))
            {
                int i = (int)c;
                System.out.println("The corresponding number is: " + i);
            }
            else
            {
                System.out.println(s + " is an invalid input.");
            }

        }
    }
}
