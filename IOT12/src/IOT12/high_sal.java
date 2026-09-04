package IOT12;
import java.util.Scanner;
public class high_sal {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Salaries : ");
			int max = 0;
			
				for(int i=0; i<4; i++) {
					int salary = sc.nextInt();
					if(salary > max) {
						max = salary;
					}
				}
			
			System.out.println("Highest Salary is : " +max);
		}
}
