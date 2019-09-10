package be.diher81.expenseviewer.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "expenses")
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
