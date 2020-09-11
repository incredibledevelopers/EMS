package in.co.cognizant.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.cognizant.ems.model.EmployeeDailyActivity;

@Repository
public interface EmployeeDailyActivityRepository extends JpaRepository<EmployeeDailyActivity, Long>{

}
