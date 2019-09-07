package be.diher81.expenseviewer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Expense {

    @Id
    @GeneratedValue
    private int id;
    private String description;


}
