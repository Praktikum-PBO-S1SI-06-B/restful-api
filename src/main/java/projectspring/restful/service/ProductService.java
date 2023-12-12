package projectspring.restful.service;

import org.apache.catalina.User;
import projectspring.restful.entity.Product;
import projectspring.restful.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository; // Dependency Injection
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
