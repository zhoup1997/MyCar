package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "product_car")
public class ProductCar {
    @Id
    private Integer id;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "car_id")
    private Integer carId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return product_id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * @return car_id
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * @param carId
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }
}