package data.item;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/item")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    private List<ItemDto> getItemList() {
        return itemService.getItemList();
    }

    @PostMapping
    private String newItem(@RequestBody ItemDto dto) {
        return itemService.newItem(dto);
    }
}
