package view;

/*
 * This class is used to transfer data to/from doctor templates
 *  for registering new doctor and updating doctor profile.
 */
public class DoctorView {
	
	private int id;   // unique id generated by database.
	private String lastName;
	private String firstName;
	private String specialty;
	private String practiceSinceYear;  // yyyy  The year doctor started in practice.
	private String ssn;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getPracticeSinceYear() {
		return practiceSinceYear;
	}
	public void setPracticeSinceYear(String practiceSinceYear) {
		this.practiceSinceYear = practiceSinceYear;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", specialty="
				+ specialty + ", practiceSinceYear=" + practiceSinceYear + ", ssn=" + ssn + "]";
	}
}
