package in.co.cognizant.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ems_tbl_dailyactivity")
public class EmployeeDailyActivity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ems_dailyactivity_id", length = 8, nullable = false)
	private long activityId;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ems_employee_eid", nullable=false)
    private Employee employee;
	
	@Column(name = "ems_dailyactivity_activitydesc", length = 500, nullable = false)
	private String activityDescription;
	
	@Column(name = "ems_dailyactivity_activitytype", length = 30, nullable = false)
	private String activityType;
	
	@Column(name = "ems_dailyactivity_activitysubtype", length = 30, nullable = false)
	private String activitySubType;
	
	@Column(name = "ems_dailyactivity_module", length = 50, nullable = false)
	private String activityModule;
	
	@Column(name = "ems_dailyactivity_environment", length = 10, nullable = false)
	private String activityEnvironment;
	
	@Column(name = "ems_dailyactivity_itemid", length = 15, nullable = false)
	private String activityItemId;
	
	@Column(name = "ems_dailyactivity_actualefforts", length = 2, nullable = false)
	private String actualEfforts;
	
	@Column(name = "ems_dailyactivity_status", length = 10, nullable = false)
	private String activityStatus;
	
	@Column(name = "ems_dailyactivity_work", length = 10, nullable = false)
	private String activityWorkType;
	
	@Column(name = "ems_dailyactivity_comments", length = 100, nullable = false)
	private String activityComments;

	public long getActivityId() {
		return activityId;
	}

	public void setActivityId(long activityId) {
		this.activityId = activityId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getActivityDescription() {
		return activityDescription;
	}

	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getActivitySubType() {
		return activitySubType;
	}

	public void setActivitySubType(String activitySubType) {
		this.activitySubType = activitySubType;
	}

	public String getActivityModule() {
		return activityModule;
	}

	public void setActivityModule(String activityModule) {
		this.activityModule = activityModule;
	}

	public String getActivityEnvironment() {
		return activityEnvironment;
	}

	public void setActivityEnvironment(String activityEnvironment) {
		this.activityEnvironment = activityEnvironment;
	}

	public String getActivityItemId() {
		return activityItemId;
	}

	public void setActivityItemId(String activityItemId) {
		this.activityItemId = activityItemId;
	}

	public String getActualEfforts() {
		return actualEfforts;
	}

	public void setActualEfforts(String actualEfforts) {
		this.actualEfforts = actualEfforts;
	}

	public String isActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	public String isActivityWorkType() {
		return activityWorkType;
	}

	public void setActivityWorkType(String activityWorkType) {
		this.activityWorkType = activityWorkType;
	}

	public String isActivityComments() {
		return activityComments;
	}

	public void setActivityComments(String activityComments) {
		this.activityComments = activityComments;
	}
	
}