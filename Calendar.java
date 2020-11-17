public class Calendar {

	private int dateDay;
	private int dateMonth;
	private int dateYear;
	private int timeHour;
	private int timeMinute;

	/**
	 * 
	 * @param date
	 * @param time
	 */
	public void Calendar(String date, String time) {
		// TODO - implement Calendar.Calendar
		throw new UnsupportedOperationException();
	}

	public int getDateDay() {
		return this.dateDay;
	}

	/**
	 * 
	 * @param dateDay
	 */
	public void setDateDay(int dateDay) {
		this.dateDay = dateDay;
	}

	public int getDateMonth() {
		return this.dateMonth;
	}

	/**
	 * 
	 * @param dateMonth
	 */
	public void setDateMonth(int dateMonth) {
		this.dateMonth = dateMonth;
	}

	public int getDateYear() {
		return this.dateYear;
	}

	/**
	 * 
	 * @param dateYear
	 */
	public void setDateYear(int dateYear) {
		this.dateYear = dateYear;
	}

	public int getTimeHour() {
		return this.timeHour;
	}

	/**
	 * 
	 * @param timeHour
	 */
	public void setTimeHour(int timeHour) {
		this.timeHour = timeHour;
	}

	public int getTimeMinute() {
		return this.timeMinute;
	}

	/**
	 * 
	 * @param timeMinute
	 */
	public void setTimeMinute(int timeMinute) {
		this.timeMinute = timeMinute;
	}

}