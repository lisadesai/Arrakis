package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Securities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SecuritiesRepository extends JpaRepository<Securities, Integer> {
    @Query(nativeQuery = true,
            value = "select * from securities where " +
                    "mature_date >= DATE_SUB(:today_date, INTERVAL 5 DAY) and" +
                    "mature_date <= DATE_ADD(:today_date, INTERVAL 5 DAY)")
    List<Securities> findByRecentAndNearMaturity(Securities today_date);

    @Query(nativeQuery = true,
            value = "select * from securities where " +
                    "mature_date >= :start_date and" +
                    "mature_date <= :end_date")
    List<Securities> findBySpecificDates(Securities start_date, Securities end_date);
}
