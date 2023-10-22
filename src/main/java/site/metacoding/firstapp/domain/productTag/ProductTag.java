package site.metacoding.firstapp.domain.productTag;

import java.sql.Timestamp;

import lombok.Getter;

@Getter
public class ProductTag {
    private Integer productTagId;
    private String productTagName;
    private Integer productId;
}