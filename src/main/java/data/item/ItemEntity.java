package data.item;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "item")
@Data
@AllArgsConstructor
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;
    private String name;
    private int amount;
    private int price;
    private int storagePeriod;

    @Column(insertable = false)
    private Timestamp receivedDate;

    public ItemEntity() {

    }

    public ItemEntity(String name, int amount, int price, int storagePeriod, Timestamp timestamp) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.storagePeriod = storagePeriod;
        this.receivedDate = timestamp;
    }
}
