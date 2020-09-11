package in.co.cognizant.ems.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ems_tbl_employee")
public class Employee {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ems_employee_eid")
	private long employeeId;
	
	@Column(name = "ems_employee_name", nullable = false)
	private String employeeName;
	
	@Column(name = "ems_employee_assetid", nullable = false)
	private String assetId;
	
	@Column(name = "ems_employee_deskno", nullable = false)
	private String deskNo;
	
	@Column(name = "ems_employee_contactno", nullable = false)
	private Integer contactNo;
	
	@Column(name = "ems_employee_address", nullable = false)
	private String address;
	
	@Column(name = "ems_employee_alternate_contactno", nullable = false)
	private Integer alternateContactNo;
	
	@Column(name = "ems_employee_emailid", nullable = false)
	private String emailId;
	
	@Column(name = "ems_employee_birthdate", nullable = false)
	private Date birthDate;
	
	@Column(name = "ems_isAdmin", nullable = false)
	private boolean isAdmin;
	
	@Column(name = "ems_isActive", nullable = false)
	private boolean isActive;
	
	@OneToMany(mappedBy = "employee")
    private List<EmployeeDailyActivity> employeeDailyActivity;

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getDeskNo() {
		return deskNo;
	}

	public void setDeskNo(String deskNo) {
		this.deskNo = deskNo;
	}

	public Integer getContactNo() {
		return contactNo;
	}

	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAlternateContactNo() {
		return alternateContactNo;
	}

	public void setAlternateContactNo(Integer alternateContactNo) {
		this.alternateContactNo = alternateContactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<EmployeeDailyActivity> getEmployeeDailyActivity() {
		return employeeDailyActivity;
	}

	public void setEmployeeDailyActivity(List<EmployeeDailyActivity> employeeDailyActivity) {
		this.employeeDailyActivity = employeeDailyActivity;
	}
}