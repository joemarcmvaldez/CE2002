public class AdminMgr extends CourseMgr {

	private Admin admin;

	/**
	 * 
	 * @param matricNum
	 * @param start
	 * @param end
	 */
	public String editStudentAccessPeriod(String matricNum, String start, String end) {
		// TODO - implement AdminMgr.editStudentAccessPeriod
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param time
	 */
	private Calendar timeStringToCalendar(String time) {
		// TODO - implement AdminMgr.timeStringToCalendar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param username
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param matricNum
	 * @param gender
	 * @param nationality
	 * @param mobileNum
	 * @param email
	 * @param start
	 * @param end
	 */
	public String addStudent(String username, String password, String firstName, String lastName, String matricNum, char gender, String nationality, int mobileNum, String email, Calendar start, Calendar end) {
		// TODO - implement AdminMgr.addStudent
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param matricNum
	 */
	public String deleteStudent(String matricNum) {
		// TODO - implement AdminMgr.deleteStudent
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param courseCode
	 * @param courseName
	 * @param AU
	 * @param school
	 * @param courseType
	 * @param examDate
	 * @param examTime
	 */
	public String addCourse(String courseCode, String courseName, int AU, String school, String courseType, String examDate, String examTime) {
		// TODO - implement AdminMgr.addCourse
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param courseCode
	 * @param newCourseCode
	 */
	public String updateCourseCode(String courseCode, String newCourseCode) {
		// TODO - implement AdminMgr.updateCourseCode
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param courseCode
	 * @param newCourseName
	 */
	public String updateCourseName(String courseCode, String newCourseName) {
		// TODO - implement AdminMgr.updateCourseName
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param courseCode
	 * @param newAU
	 */
	public String updateAU(String courseCode, int newAU) {
		// TODO - implement AdminMgr.updateAU
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param courseCode
	 * @param newSchool
	 */
	public String updateSchool(String courseCode, String newSchool) {
		// TODO - implement AdminMgr.updateSchool
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param courseCode
	 * @param newType
	 */
	public String updateType(String courseCode, String newType) {
		// TODO - implement AdminMgr.updateType
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param courseCode
	 * @param indexNum
	 * @param tutorialGrp
	 * @param vacancy
	 */
	public String addIndex(String courseCode, int indexNum, String tutorialGrp, int vacancy) {
		// TODO - implement AdminMgr.addIndex
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param courseCode
	 * @param indexNum
	 */
	public String deleteIndex(String courseCode, int indexNum) {
		// TODO - implement AdminMgr.deleteIndex
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param courseCode
	 * @param newVacancy
	 */
	public String updateVacancy(String courseCode, int newVacancy) {
		// TODO - implement AdminMgr.updateVacancy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param courseCode
	 * @param indexNum
	 */
	public ArrayList<Student> printStudentListByIndex(String courseCode, int indexNum) {
		// TODO - implement AdminMgr.printStudentListByIndex
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param courseCode
	 */
	public ArrayList<Student> printStudentListByCourse(String courseCode) {
		// TODO - implement AdminMgr.printStudentListByCourse
		throw new UnsupportedOperationException();
	}

}