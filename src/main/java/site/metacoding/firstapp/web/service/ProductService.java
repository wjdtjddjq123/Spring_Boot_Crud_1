package site.metacoding.firstapp.web.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.product.Product;
import site.metacoding.firstapp.domain.product.ProductDao;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductDao productDao;

    public Product findById(Integer productId) {
        Product productPS = productDao.findById(productId);
        return productPS;
    }

}