package be.diher81.expenseviewer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Expense {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String category;

    @Column
    private String description;

    @Column
    private LocalDate date;
}
