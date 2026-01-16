package org.example.employeeshiftmanagement.repository;

import org.example.employeeshiftmanagement.model.LeaveRequest;
import org.example.employeeshiftmanagement.model.LeaveStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer> {

    List<LeaveRequest> findByUserId(Integer userId);
    List<LeaveRequest> findByStatus(LeaveStatus status);
    List<LeaveRequest> findByUserIdAndStatus(Integer userId, LeaveStatus status);
}
