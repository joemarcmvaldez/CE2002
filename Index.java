public class Index {

	private int indexNum;
	private String tutorialGrp;
	private int vacancy;
	private ArrayList<Student> waitList;
	private ArrayList<Lesson> lessonList;

	/**
	 * 
	 * @param indexNum
	 * @param tutorialGrp
	 * @param vacancy
	 * @param waitList
	 * @param lessonList
	 */
	public void Index(int indexNum, String tutorialGrp, int vacancy, ArrayList<Student> waitList, ArrayList<Lesson> lessonList) {
		// TODO - implement Index.Index
		throw new UnsupportedOperationException();
	}

	public int getIndexNum() {
		return this.indexNum;
	}

	/**
	 * 
	 * @param indexNum
	 */
	public void setIndexNum(int indexNum) {
		this.indexNum = indexNum;
	}

	public String getTutorialGrp() {
		return this.tutorialGrp;
	}

	/**
	 * 
	 * @param tutorialGrp
	 */
	public void setTutorialGrp(String tutorialGrp) {
		this.tutorialGrp = tutorialGrp;
	}

	public int getVacancy() {
		return this.vacancy;
	}

	/**
	 * 
	 * @param vacancy
	 */
	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}

	public ArrayList<Student> getWaitList() {
		return this.waitList;
	}

	/**
	 * 
	 * @param waitList
	 */
	public void setWaitList(ArrayList<Student> waitList) {
		this.waitList = waitList;
	}

	public ArrayList<Lesson> getLessonList() {
		return this.lessonList;
	}

	/**
	 * 
	 * @param lessonList
	 */
	public void setLessonList(ArrayList<Lesson> lessonList) {
		this.lessonList = lessonList;
	}

}