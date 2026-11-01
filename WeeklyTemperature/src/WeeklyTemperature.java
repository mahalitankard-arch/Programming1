import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperature {
    public static void main(String[] args) {
        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Integer> dailyTemperatures = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
			daysOfWeek.add("Monday");
			daysOfWeek.add("Tuesday");
			daysOfWeek.add("Wednesday");
			daysOfWeek.add("Thursday");
			daysOfWeek.add("Friday");
			daysOfWeek.add("Saturday");
			daysOfWeek.add("Sunday");
			for (int i = 0; i < daysOfWeek.size(); i++) {
			    System.out.print("Enter the average temperature for " + daysOfWeek.get(i));
			    dailyTemperatures.add(scanner.nextInt());
			}
			scanner.nextLine();
			
			while (true) {
			    System.out.println("Enter weekday (Monday-Sunday) to get its average temperature or 'Week' for the weeks average temperature.");
			    String input = scanner.nextLine();
			    if (input.equals("Week")) {
			        double totalTemp = 0;
			        
			        for (int i = 0; i < daysOfWeek.size(); i++) {
			            System.out.println(daysOfWeek.get(i) + dailyTemperatures.get(i));
			            totalTemp += dailyTemperatures.get(i);
			        }
			        double weeklyAverage = (double) totalTemp / daysOfWeek.size();
			        System.out.println("Weekly Average Temperature: " + weeklyAverage);
			    } 
			    else {
			        for (int i = 0; i < daysOfWeek.size(); i++) {
			            if (daysOfWeek.get(i).equals(input)) {
			                System.out.println("Average Temperature: "+ daysOfWeek.get(i)+  dailyTemperatures.get(i));
			                break;
			            }
			        }
			    }
			}
		}
    }
}

