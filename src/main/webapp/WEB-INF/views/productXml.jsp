<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
  PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="site.metacoding.firstapp.domain.product.ProductDao">

   <select id="findById"
      resultType="site.metacoding.firstapp.domain.product.Product">
      SELECT * FROM product WHERE product_id = #{productId}
   </select>

   <select id="findAll"
      resultType="site.metacoding.firstapp.domain.product.Product">
      SELECT * FROM product ORDER BY product_id DESC
   </select>

   <insert id="insert">
      INSERT INTO product(product_name, product_price, product_qty, user_id)
      VALUES(#{productName}, #{productPrice}, #{productQty}, #{userId})
   </insert>

   <update id="update">
      UPDATE product
        SET
        product_name = #{productName},
      product_price = #{productPrice},
      product_qty = #{productQty},
        user_id = #{userId}
      WHERE product_id = #{productId}
   </update>

   <delete id="delete">
      DELETE FROM product WHERE product_id = #{productId}
   </delete>

</mapper>