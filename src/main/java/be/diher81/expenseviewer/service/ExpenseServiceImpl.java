package be.diher81.expenseviewer.service;

import be.diher81.expenseviewer.entity.Expense;
import be.diher81.expenseviewer.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public List<Expense> findAllExpenses() {
        return expenseRepository.findAllExpenses();
    }
}