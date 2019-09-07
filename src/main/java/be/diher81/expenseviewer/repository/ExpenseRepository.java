package be.diher81.expenseviewer.repository;

import be.diher81.expenseviewer.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
