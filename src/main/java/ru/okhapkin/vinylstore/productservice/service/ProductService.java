package ru.okhapkin.vinylstore.productservice.service;

import org.springframework.stereotype.Service;
import ru.okhapkin.vinylstore.productservice.dto.ProductDTO;
import ru.okhapkin.vinylstore.productservice.model.Product;
import ru.okhapkin.vinylstore.productservice.repository.ProductRepository;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;


@Service
public class ProductService {

    private static final Logger logger = Logger.getLogger(ProductService.class.getName());

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void save(ProductDTO productDTO) {
        Product product = new Product();

        product.setId(UUID.randomUUID().toString());
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setListOfSongs(productDTO.getListOfSongs());
        product.setLabel(productDTO.getLabel());

        productRepository.save(product);
        logger.info(String.format("Saved product %s with id %s", product.getName(), product.getId()));
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

}
