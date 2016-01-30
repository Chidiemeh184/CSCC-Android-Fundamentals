package week02;

public class Main {

	public static void main(String[] args) {
		String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		int[] temps = {45, 29, 10, 22, 41, 28, 33};
		int[] precipitation = {95, 60, 25, 5, 0, 75, 90};
		
		for (int i = 0; i < weekDays.length; i++){
			if((temps[i] < 32) && (precipitation[i] > 50)) {
				System.out.println("It is likely to snow on " + weekDays[i]);
			}
		}
		
		int index = 0;
		for (String day: weekDays){
			if((temps[index] < 32) && (precipitation[index] > 50)) {
				System.out.println("It is likely to snow on " + day);
			}	
			index++;
		}
	}
}

