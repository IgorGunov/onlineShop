package controller.admin;

import entity.Category;
import entity.ContactShop;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с контактами магазина",description = "В этом контроллере описаны CRUD операции для взаимодействия с контактами магазина")
@RequestMapping("/admin/contatshop")
public class ContactShopController {

    @Operation(
            summary = "возвращает все контакты магазина"
    )
    @GetMapping(value = "get")
    public List<ContactShop> getAllContactShop(){
        return Arrays.asList(new ContactShop(), new ContactShop());}

    @Operation(
            summary = "добавляет новые контакты магазина в бд"
    )
    @PostMapping("/create")
    public void createContactShop(@RequestBody ContactShop contactShop){

    }

    @Operation(
            summary = "изменяет контакты магазина в бд"
    )
    @PutMapping("/update")
    public void updateContactShop(@RequestBody ContactShop contactShop){

    }

    @Operation(
            summary = "удаляет контакты магазина из бд"
    )
    @DeleteMapping("/delete")
    public  void  deleteContactShop(@RequestBody ContactShop contactShop){

    }
}

