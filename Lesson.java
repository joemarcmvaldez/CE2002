public class Lesson {

	private String lessonType;
	private int lessonDay;
	private String lessonVenue;
	private Calendar lessonStart;
	private Calendar lessonEnd;

	/**
	 * 
	 * @param lessonType
	 * @param lessonDay
	 * @param lessonVenue
	 * @param lessonStart
	 * @param lessonEnd
	 */
	public void Lesson(String lessonType, int lessonDay, String lessonVenue, Calendar lessonStart, Calendar lessonEnd) {
		// TODO - implement Lesson.Lesson
		throw new UnsupportedOperationException();
	}

	public String getLessonType() {
		return this.lessonType;
	}

	/**
	 * 
	 * @param lessonType
	 */
	public void setLessonType(String lessonType) {
		this.lessonType = lessonType;
	}

	public int getLessonDay() {
		return this.lessonDay;
	}

	/**
	 * 
	 * @param lessonDay
	 */
	public void setLessonDay(int lessonDay) {
		this.lessonDay = lessonDay;
	}

	public String getLessonVenue() {
		return this.lessonVenue;
	}

	/**
	 * 
	 * @param lessonVenue
	 */
	public void setLessonVenue(String lessonVenue) {
		this.lessonVenue = lessonVenue;
	}

	public Calendar getLessonStart() {
		return this.lessonStart;
	}

	/**
	 * 
	 * @param lessonStart
	 */
	public void setLessonStart(Calendar lessonStart) {
		this.lessonStart = lessonStart;
	}

	public Calendar getLessonEnd() {
		return this.lessonEnd;
	}

	/**
	 * 
	 * @param lessonEnd
	 */
	public void setLessonEnd(Calendar lessonEnd) {
		this.lessonEnd = lessonEnd;
	}

}