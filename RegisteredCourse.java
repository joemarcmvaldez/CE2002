public class RegisteredCourse {

	private Student student;
	private Course course;
	private Index index;
	private String status;

	/**
	 * 
	 * @param student
	 * @param course
	 * @param index
	 * @param status
	 */
	public void RegisteredCourse(Student student, Course course, Index index, String status) {
		// TODO - implement RegisteredCourse.RegisteredCourse
		throw new UnsupportedOperationException();
	}

	public Student getStudent() {
		return this.student;
	}

	/**
	 * 
	 * @param student
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return this.course;
	}

	/**
	 * 
	 * @param course
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	public Index getIndex() {
		return this.index;
	}

	/**
	 * 
	 * @param index
	 */
	public void setIndex(Index index) {
		this.index = index;
	}

	public String getStatus() {
		return this.status;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}