package be.diher81.expenseviewer.repository;

import be.diher81.expenseviewer.entity.Expense;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ExpenseRepository extends Repository<Expense, Long> {

    List<Expense> findAllExpenses();

}
