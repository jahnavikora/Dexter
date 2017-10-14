
public class IfElseDemo {

	public static void main(String[] args) {
			
			int age = 20;
			boolean male = true;
			
			
			if(age>=21) 
			{
				System.out.println("The person can get a drink");
			
			}
			else if( male==true && age>=20) 
			{
				System.out.println("The male person above 20 can get a drink");
			
			}
			else 
			{
				System.out.println("The person can not get the drink");
			}

		}



	}

}
