package data.item;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "item")
@Data
@RequiredArgsConstructor
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    private String name;
    private int amount;
    private int price;
    private int storagePeriod;
    private Timestamp receivedDate;

}
