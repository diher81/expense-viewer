package be.diher81.expenseviewer.controller;

import be.diher81.expenseviewer.entity.Expense;
import be.diher81.expenseviewer.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expenses")
class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/findall")
    public ResponseEntity<Object> findAllExpenses() {
        return ResponseEntity.ok(expenseService.findAllExpenses());
    }

    @PostMapping("/save")
    public ResponseEntity<Object> saveExpense(@RequestBody Expense expense) {
        return ResponseEntity.ok(expenseService.save(expense));
    }
}
