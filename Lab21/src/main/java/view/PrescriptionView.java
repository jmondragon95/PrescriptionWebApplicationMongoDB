package view;

import java.time.LocalDate;

/*
 * This class is used to transfer data to/from prescription template pages.
 */
public class PrescriptionView {
	
	private int rxid;  // primary key generated by database.
	// following fields are set when doctor creates a prescription.
	private String drugName;
	private int quantity;
	private int patientId;
	private String patientFirstName;
	private String patientLastName;
	private int doctorId;
	private String doctorFirstName;
	private String doctorLastName;
	private String dateCreated = LocalDate.now().toString();
	// following fields will be null or blank until prescription has been filled.
	private int pharmacyID;    
	private String pharmacyAddress; 
	private String pharmacyPhone;
	private String pharmacyName;
	private String dateFilled;    
	private String cost;
	private int refills;
	private int refillsRemaining;
	
	
	public int getRxid() {
		return rxid;
	}
	public void setRxid(int rxid) {
		this.rxid = rxid;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientFirstName() {
		return patientFirstName;
	}
	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}
	public String getPatientLastName() {
		return patientLastName;
	}
	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorFirstName() {
		return doctorFirstName;
	}
	public void setDoctorFirstName(String doctorFirstName) {
		this.doctorFirstName = doctorFirstName;
	}
	public String getDoctorLastName() {
		return doctorLastName;
	}
	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public int getPharmacyID() {
		return pharmacyID;
	}
	public void setPharmacyID(int pharmacyID) {
		this.pharmacyID = pharmacyID;
	}
	public String getPharmacyAddress() {
		return pharmacyAddress;
	}
	public void setPharmacyAddress(String pharmacyAddress) {
		this.pharmacyAddress = pharmacyAddress;
	}
	public String getPharmacyPhone() {
		return pharmacyPhone;
	}
	public void setPharmacyPhone(String pharmacyPhone) {
		this.pharmacyPhone = pharmacyPhone;
	}
	public String getPharmacyName() {
		return pharmacyName;
	}
	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}
	public String getDateFilled() {
		return dateFilled;
	}
	public void setDateFilled(String dateFilled) {
		this.dateFilled = dateFilled;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public int getRefills() {
		return refills;
	}
	public void setRefills(int refills) {
		this.refills = refills;
	}
	public int getRefillsRemaining() {
		return refillsRemaining;
	}
	public void setRefillsRemaining(int refillsRemaining) {
		this.refillsRemaining = refillsRemaining;
	}
	@Override
	public String toString() {
		return "Prescription [rxid=" + rxid + ", drugName=" + drugName + ", quantity=" + quantity + ", patientId="
				+ patientId + ", patientFirstName=" + patientFirstName + ", patientLastName=" + patientLastName
				+ ", doctorId=" + doctorId + ", doctorFirstName=" + doctorFirstName + ", doctorLastName="
				+ doctorLastName + ", dateCreated=" + dateCreated + ", pharmacyID=" + pharmacyID + ", pharmacyAddress="
				+ pharmacyAddress + ", pharmacyPhone=" + pharmacyPhone + ", pharmacyName=" + pharmacyName
				+ ", dateFilled=" + dateFilled + ", cost=" + cost + ", refills=" + refills + ", refillsRemaining="
				+ refillsRemaining + "]";
	}

}
