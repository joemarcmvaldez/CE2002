public class Course {

	private String courseCode;
	private String courseName;
	private int AU;
	private String school;
	private String courseType;
	private Calendar examDate;
	private ArrayList<Index> indexList;

	/**
	 * 
	 * @param courseCode
	 * @param courseName
	 * @param AU
	 * @param school
	 * @param courseType
	 * @param examDate
	 * @param indexList
	 */
	public void Course(String courseCode, String courseName, int AU, String school, String courseType, Calendar examDate, ArrayList<Index> indexList) {
		// TODO - implement Course.Course
		throw new UnsupportedOperationException();
	}

	public String getCourseCode() {
		return this.courseCode;
	}

	/**
	 * 
	 * @param courseCode
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return this.courseName;
	}

	/**
	 * 
	 * @param courseName
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getAU() {
		// TODO - implement Course.getAU
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param AU
	 */
	public void setAU(int AU) {
		// TODO - implement Course.setAU
		throw new UnsupportedOperationException();
	}

	public String getSchool() {
		return this.school;
	}

	/**
	 * 
	 * @param school
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	public String getCourseType() {
		return this.courseType;
	}

	/**
	 * 
	 * @param courseType
	 */
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public Calendar getExamDate() {
		return this.examDate;
	}

	/**
	 * 
	 * @param examDate
	 */
	public void setExamDate(Calendar examDate) {
		this.examDate = examDate;
	}

	public ArrayList<Index> getIndexList() {
		return this.indexList;
	}

	/**
	 * 
	 * @param indexList
	 */
	public void setIndexList(ArrayList<Index> indexList) {
		this.indexList = indexList;
	}

}