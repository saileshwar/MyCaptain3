import java.util.*;
class SwitchCase
{
	public static void main(String[] args)
	{
		int choice;
		System.out.println("Select One : 1.Pizza\t 2.Burger\t 3.Cake");
		Scanner s  = new Scanner(System.in);
		choice = s.nextInt();
		switch(choice)
		{
		case 1 : System.out.println("Pizza added to cart");
					break;
		case 2 : System.out.println("Burger added to cart");
					break;
		case 3 : System.out.println("Cake added to cart");
					break;
		default : System.out.println("None Selected");
		}
	}
}
