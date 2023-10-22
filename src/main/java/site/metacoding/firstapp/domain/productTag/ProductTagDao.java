package site.metacoding.firstapp.domain.productTag;

import java.util.List;

public interface ProductTagDao {

    public ProductTag findById(Integer productTagId);

    public List<ProductTag> findAll();

    public void insert(ProductTag productTag);

    public void update(ProductTag productTag);

    public void delete(ProductTag productTagId);
}