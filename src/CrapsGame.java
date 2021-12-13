import java.util.Random;

/**
 * @Author Preston C. Wertz
 * @Section CSC160 - 179
 * @Instructor Doug Lundin
 * @Date 2021-10-10
 *
 * @Description
 *
 * HW # 5 Craps Game
 *
 */
public class CrapsGame
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int point = 0; // "Off Point"

        while (true)
        {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);

            if (point == 0)
            {
                // "Off Point"
                switch (sum)
                {
                    case 2:
                    case 3:
                    case 12:
                        System.out.println("You lose");
                        System.exit(0);
                    case 7:
                    case 11:
                        System.out.println("You win");
                        System.exit(0);
                    default:
                        point = sum; // "On Point"
                        System.out.println("point is " + point);
                }
            }
            else
            {
                // "On Point"
                if (sum == point)
                {
                    System.out.println("You win");
                    System.exit(0);
                }
                else if (sum == 7)
                {
                    System.out.println("You lose");
                    System.exit(0);
                }
            }
        }
    }
}
