package be.diher81.expenseviewer.service;

import be.diher81.expenseviewer.entity.Expense;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpenseService {

    List<Expense> findAllExpenses();

}
