import java.util.Scanner;
import java.util.Arrays;

/**
 * @Author Preston C. Wertz
 * @Section CSC160 - 179
 * @Instructor Doug Lundin
 * @Date 2021-10-17
 *
 * @Description
 *
 * HW # 7 String Sorter
 *
 */
public class StringSorter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.println(sort(s));
    }

    public static String sort(String s)
    {
        char[] ch = s.toCharArray();
/*
        for (int i = 0; i < ch.length; i++)
        {
            for (int j = 0; j < ch.length - 1; j++)
            {
                // Swaps characters.
                if (ch[j] > ch[j+1])
                {
                    char c = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = c;
                }
            }
        }
 */     Arrays.sort(ch);
        return new String(ch);
    }
}
