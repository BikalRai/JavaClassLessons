package enumLearn;

public class EnumExample {
	// enums are a set of predefined values

	public static void main(String[] args) {
		DaysOfTheWeek day = DaysOfTheWeek.SATURDAY;
		
		System.out.println("Tiredness: " + DaysOfTheWeek.THURSDAY.levelOfTiredness);

		if (day == DaysOfTheWeek.FRIDAY) {
			System.out.println("TGIF");
		} else if (day == DaysOfTheWeek.SATURDAY || day == DaysOfTheWeek.SUNDAY) {
			System.out.println("It's a holiday");
		} else {
			System.out.println("Long way to go till Friday!!");
		}
		
		System.out.println("Checking: " + DaysOfTheWeek.SATURDAY.checkWeekend());
	}

}
