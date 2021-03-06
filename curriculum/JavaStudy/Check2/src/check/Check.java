package check;

import constants.Constants;

public class Check
{

	private static String firstName = "颯真";
	private static String lastName = "宗廣";

	private static void printName(String First_Name, String Last_Name)
	{
		System.out.println(Last_Name + First_Name);
	}

	public static void main(String[] args)
	{

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);

		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);

		System.out.print("printNameメソッド → ");
		printName(firstName, lastName);

		pet.introduce();
		robotPet.introduce();

	}

}
