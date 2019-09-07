package be.diher81.expenseviewer.service;

import be.diher81.expenseviewer.entity.Expense;

import java.util.List;

public interface ExpenseService {

    List<Expense> findAllExpenses();

}
