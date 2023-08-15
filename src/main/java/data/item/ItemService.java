package data.item;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<ItemDto> getItemList() {
        List<ItemEntity> list = itemRepository.findAll();
        List<ItemDto> dto = new ArrayList<>();

        for(ItemEntity item : list ) {
            ItemDto itemDto = new ItemDto(item.getName(),item.getAmount(),item.getPrice(),item.getReceivedDate(),item.getStoragePeriod());
            dto.add(itemDto);
        }

        return dto;
    }
}
