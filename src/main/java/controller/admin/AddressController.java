package controller.admin;

import entity.Address;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с адресами", description = "В этом контроллере описаны CRUD операции для взаимодействия с адресами")
@RequestMapping("/admin/addresses")
public class AddressController {
    @Operation(
            summary = "возвращает все адреса"
    )
    @GetMapping(value = "get")
    public List<Address> getAllAddresses(){
        return Arrays.asList(new Address(), new Address());}

    @Operation(
            summary = "добавляет новый адрес в бд"
    )
    @PostMapping("/create")
    public void createAddress(@RequestBody Address address){

    }

    @Operation(
            summary = "изменяет адрес в бд"
    )
    @PutMapping("/update")
    public void updateAddress(@RequestBody Address address){

    }

    @Operation(
            summary = "удаляет адрес из бд"
    )
    @DeleteMapping("/delete")
    public  void  deleteAddress(@RequestBody Address address){

    }
}
