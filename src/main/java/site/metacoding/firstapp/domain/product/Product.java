package site.metacoding.firstapp.domain.product;

import java.sql.Timestamp;

import lombok.Getter;

@Getter
public class Product {
    private Integer productId;
    private String productName;
    private Integer productPrice;
    private Integer productQty;
    private Integer userId;
    private Timestamp createdAt;
}