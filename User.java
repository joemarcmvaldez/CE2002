public abstract class User {

	private String username;
	private String password;

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public void User(String username, String password) {
		// TODO - implement User.User
		throw new UnsupportedOperationException();
	}

	public String getUsername() {
		return this.username;
	}

	/**
	 * 
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}