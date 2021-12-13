import java.util.Random;

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

public class Warrior
{

	private String nickName = "unknown";
	private int lifeForce = 10;
	private int damage = 0;
	
	String[] armory = {"Exploding Pumpkin", "Candy Corn", "Paper Bag"};
	
	public void reSpawn() {
		lifeForce = 10;
	}
	
	public void takeDamage(int n)
	{
		damage += n;
		if (damage >= 10)
		{
			lifeForce--;
			damage = 0;
		}
	}
	
	public void reaction()
	{
		Random r = new Random();
		String[] sound = {"OW!", "Wham!", "POW!", "Boffo!!", "KaPow!", "That one hurt!"};
		System.out.println(sound[r.nextInt(sound.length)]);
	}
	
	public boolean isDead()
	{
		if (lifeForce <= 0) return true;
		else return false;
	}
	
	public boolean isAlive()
	{
		if (lifeForce > 0) return true;
		else return false;
	}

	public void printInfo()
	{
		System.out.println("Name = " + nickName);
		System.out.println("Life Force = " + lifeForce);
		System.out.println("Damage = " + damage);
	}

	public void setName(String name)
	{
		this.nickName = name;
	}

	public void setRandomDamage()
	{
		Random random = new Random();
		lifeForce -= random.nextInt(9);
	}
}





