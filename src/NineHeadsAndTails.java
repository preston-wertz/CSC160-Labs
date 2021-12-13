import java.util.Scanner;

/**
 * @Author Preston C. Wertz
 * @Section CSC160 - 179
 * @Instructor Doug Lundin
 * @Date 2021-10-24
 *
 * @Description
 *
 * HW # 8 Nine Headso and Tails
 *
 */
public class NineHeadsAndTails
{
    public static void main(String[] args)
    {
        // Initialize variables.
        int i = -1;
        Scanner sc = new Scanner(System.in);

        // Get input.
        while (i < 0 || i > 511)
        {
            System.out.print("Enter a number between 0 and 511: ");
            i = sc.nextInt();
        }

        // Convert to padded string.
        String s = Integer.toBinaryString(i);
        String p = String.format("%9s", s).replace(' ', '0');

        // System.out.println("i = " + i);
        // System.out.println("s = " + s);
        // System.out.println("p = " + p);

        // Convert 0s and 1s to heads and tails.
        char[][] m = new char[3][3];
        for (int r=0; r<3; r++)
        {
            for (int c=0; c<3; c++)
            {
                m[r][c] = (p.charAt(r*3 + c) == '0' ? 'H' : 'T');
            }
        }

        // Print out matrix.
        System.out.println(m[0]);
        System.out.println(m[1]);
        System.out.println(m[2]);
    }
}
