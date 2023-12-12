package projectspring.restful.controller;

import projectspring.restful.entity.Product;
import projectspring.restful.model.Response;
import projectspring.restful.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    private ProductService productService; // Dependency Injection
    @GetMapping(
            path = "/api/products",
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Response<List<Product>> getAllProductsHandler() {
        var products = productService.getAllProduct();
        return Response.<List<Product>>builder().data(products).build();
    }
}
