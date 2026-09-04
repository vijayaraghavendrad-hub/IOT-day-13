package IOT12;

public class max_sal {
	public static void main(String[] args) {

        int[] salary = {25000, 40000, 30000, 50000};

        int max = salary[0];

        for (int i = 1; i < salary.length; i++) {
            if (salary[i] > max) {
                max = salary[i];
            }
        }

        System.out.println("Maximum salary: " + max);
    }
}
