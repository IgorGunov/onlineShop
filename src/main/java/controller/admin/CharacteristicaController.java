package controller.admin;

import entity.Characteristica;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с характеристикой товара", description = "В этом контроллере описаны CRUD операции для взаимодействия с характеристикой товара")
@RequestMapping("/admin/characteristica")
public class CharacteristicaController {

    @Operation(
            summary = "возвращает все характеристики"
    )
    @GetMapping(value = "get")
    public List<Characteristica> getAllCharacteristics(){return Arrays.asList(new Characteristica(), new Characteristica());}

    @Operation(
            summary = "добавляет новую характеристику в бд"
    )
    @PostMapping("/create")
    public void createCharacteristica(@RequestBody Characteristica characteristica){

    }

    @Operation(
            summary = "изменяет характеристику в бд"
    )
    @PutMapping("/update")
    public void updateCharacteristica(@RequestBody Characteristica characteristica){

    }

    @Operation(
            summary = "удаляет характеристику из бд"
    )
    @DeleteMapping("/delete")
    public void deleteCharacteristica(@RequestBody Characteristica characteristica){

    }


}
