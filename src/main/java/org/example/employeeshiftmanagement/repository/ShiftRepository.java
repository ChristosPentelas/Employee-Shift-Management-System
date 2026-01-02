package org.example.employeeshiftmanagement.repository;

import org.example.employeeshiftmanagement.model.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ShiftRepository extends JpaRepository<Shift, Integer> {

    List<Shift> findByUserId(Integer userId);

    List<Shift> findByUserIdAndDateBetweenOrderByDateAsc(Integer userId, LocalDate startDate, LocalDate endDate);
}
