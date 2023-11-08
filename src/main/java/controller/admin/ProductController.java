package controller.admin;

import entity.Category;
import entity.Product;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с товаром",description = "В этом контроллере описаны CRUD операции для взаимодействия с товаром")
@RequestMapping("/admin/product")
public class ProductController {

    @Operation(
            summary = "возвращает все товары"
    )
    @GetMapping(value = "get")
    public List<Product> getAllProducts() {
        return Arrays.asList(new Product(), new Product());
    }

    @Operation(
            summary = "возвращает все товары из определенной категории",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(ref = "Category")
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Успешный запрос",
                    content = @io.swagger.v3.oas.annotations.media.Content),
            @ApiResponse(responseCode = "400", description = "Неверный запрос",
                    content = @io.swagger.v3.oas.annotations.media.Content),
            @ApiResponse(responseCode = "404", description = "Ресурс не найден",
                    content = @io.swagger.v3.oas.annotations.media.Content)
    })

    @GetMapping(value = "products")
    public List<Product> getAllProductsFromCategory(@RequestBody Category category) {
        return null;
    }

    @Operation(
            summary = "добавляет новый товар в бд"
    )

    @PostMapping("/create")
    public void createProduct(@RequestBody Product product) {

    }

    @Operation(
            summary = "изменяет товар в бд"
    )

    @PutMapping("/update")
    public void updateProduct(@RequestBody Product product){

    }

    @Operation(
            summary = "удаляет товар из бд"
    )

    @DeleteMapping("/delete")
    public void deleteProduct(@RequestBody Product product){

    }
}