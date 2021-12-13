import java.util.Scanner;

/**
 * @Author Preston C. Wertz
 * @Section CSC160 - 179
 * @Instructor Doug Lundin
 * @Date 2021-09-12
 *
 * @Description
 *
 * HW # 3 Addition Quiz
 *
 */
public class AdditionQuiz
{
    public static void main(String[] args)
    {
        // 1. Generate two random single-digit integers
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        // 2. Prompt the student to answer "What is number1 + number2?"
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // 3. Grade the answer and display the result
        if (number1 + number2 == answer)
        {
            System.out.println("You are correct!");
        }
        else
        {
            System.out.println("Your answer is wrong");
            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
        }
    }
}
