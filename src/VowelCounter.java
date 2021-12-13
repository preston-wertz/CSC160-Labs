import java.util.Scanner;

/**
 * @Author Preston C. Wertz
 * @Section CSC160 - 179
 * @Instructor Doug Lundin
 * @Date 2021-10-03
 *
 * @Description
 *
 * HW # 5 VowelCounter
 *
 */
public class VowelCounter
{
    public static void main(String[] args)
    {
        // Create a scanner for input.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string.
        System.out.print("Enter a string: ");
        String line = input.nextLine();

        // Initialize variables.
        int vowels = 0;
        int consonants = 0;

        // Loop over string.
        for(int i = 0;  i < line.length()  ; i++)
        {
            char c = Character.toLowerCase(line.charAt(i));
            //System.out.println(c);

            // Skip non-alphabetic characters.
            if  (c < 'a' || 'z' < c) continue;

            switch (c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
                default:
                    consonants++;
            }

        }

        // Print output.
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);

    }
}
