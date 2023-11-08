package controller.admin;

import entity.Characteristica;
import entity.Client;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с клиентом", description = "В этом контроллере описаны CRUD операции для взаимодействия с клиентом")
@RequestMapping("/admin/client")
public class ClientController {

    @Operation(
            summary = "возращает всех клиентов"
    )
    @GetMapping(value = "get")
    public List<Client> getAllClients(){return Arrays.asList(new Client(), new Client());}


    @Operation(
            summary = "добавляет нового клиента в бд"
    )
    @PostMapping("/create")
    public void createClient(@RequestBody Client client) {

    }

    @Operation(
            summary = "изменяет клиента в бд"
    )
    @PutMapping("/update")
    public void updateClient(@RequestBody Client client){

    }

    @Operation(
            summary = "удаляет клиента из бд"
    )
    @DeleteMapping("/delete")
    public void deleteClient(@RequestBody Client client){

    }

}
