package controller.admin;

import entity.Gallery;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с галерея", description = "В этом контроллере описаны CRUD операции для взаимодействия с галереей")
@RequestMapping("/admin/gallery")
public class GalleryController {

    @Operation(
            summary = "возвращает все видео/изображения"
    )
    @GetMapping(value = "get")
    public List<Gallery> getAllGalleries(){
        return Arrays.asList(new Gallery(), new Gallery());}

    @Operation(
            summary = "добавляет новое видео/изображение в бд"
    )
    @PostMapping("/create")
    public void createGallery(@RequestBody Gallery gallery){

    }

    @Operation(
            summary = "изменяет видео/изображение в бд"
    )
    @PutMapping("/update")
    public void updateGallery(@RequestBody Gallery gallery){

    }

    @Operation(
            summary = "удаляет видео/изображение из бд"
    )
    @DeleteMapping("/delete")
    public  void  deleteGallery(@RequestBody Gallery gallery){

    }
}
