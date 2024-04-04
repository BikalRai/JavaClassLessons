package enumLearn;

public enum DaysOfTheWeek {
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY(0);
	
	// we can define properties
	int levelOfTiredness; // make this final so that it cannot be mutated
	
	private DaysOfTheWeek(int level) {
		// TODO Auto-generated constructor stub
		this.levelOfTiredness = level;
	}
	
	// it is also possible to create methods
	public boolean checkWeekend() {
		return this == SATURDAY || this == SUNDAY;
	}
	

}
