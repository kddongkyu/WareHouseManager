package data.item;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class ItemDto {
    private String name;
    private int amount;
    private int price;
    private Timestamp receivedDate;
    private int storagePeriod;
}
