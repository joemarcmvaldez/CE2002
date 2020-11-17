public class Record {

	private ArrayList<Student> studentList;
	private ArrayList<Admin> adminList;
	private ArrayList<Course> courseList;

	/**
	 * 
	 * @param studentList
	 * @param adminList
	 * @param courseList
	 */
	public void Record(ArrayList<Student> studentList, ArrayList<Admin> adminList, ArrayList<Course> courseList) {
		// TODO - implement Record.Record
		throw new UnsupportedOperationException();
	}

	public ArrayList<Student> getStudentList() {
		return this.studentList;
	}

	/**
	 * 
	 * @param studentList
	 */
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Admin> getAdminList() {
		return this.adminList;
	}

	/**
	 * 
	 * @param adminList
	 */
	public void setAdminList(ArrayList<Admin> adminList) {
		this.adminList = adminList;
	}

	public ArrayList<Course> getCourseList() {
		return this.courseList;
	}

	/**
	 * 
	 * @param courseList
	 */
	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}

}