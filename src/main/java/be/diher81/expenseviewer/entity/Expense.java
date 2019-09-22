package be.diher81.expenseviewer.entity;

import be.diher81.expenseviewer.enums.Actor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    @Column
    private String category;

    @Column
    private String description;

    @Column
    private BigDecimal price;

    @Column
    private Actor actor;

    @Column
    private LocalDateTime timestamp;

    public UUID getUuid() {
        return uuid;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Actor getActor() {
        return actor;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Expense setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
}
