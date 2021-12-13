/*
Update the Warrior class (attached) to include a printInfo() method that will print all of the information in the Warrior object.
Write a Java program that creates an array of five Warrior objects. Assign each Warrior a different nickName.
Give each warrior a random amount of damage between 1 and 10 (inclusive). Print the information for each of the five Warriors by using the printInfo() function of the Warrior class.
 */


/**
 * @Author Preston C. Wertz
 * @Section CSC160 - 179
 * @Instructor Doug Lundin
 * @Date 2021-11-07
 *
 * @Description
 *
 * HW # 10 Array of Warrior
 *
 */
public class Main
{

	public static void main(String[] args)
	{
		Warrior[] warriors = new Warrior[5];

		warriors[0] = new Warrior();
		warriors[0].setName("Freg");

		warriors[1] = new Warrior();
		warriors[1].setName("Breg");

		warriors[2] = new Warrior();
		warriors[2].setName("Streg");

		warriors[3] = new Warrior();
		warriors[3].setName("Dreg");

		warriors[4] = new Warrior();
		warriors[4].setName("Reg");

		for (int i = 0; i < 5; i++)
		{
			warriors[i].setRandomDamage();
		}

		for (int i = 0; i < 5; i++)
		{
			warriors[i].printInfo();
		}
	}

}
