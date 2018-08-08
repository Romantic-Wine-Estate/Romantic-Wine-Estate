package com.romantic.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Create with IntelliJ IDEA
 * Author:LiNingKang
 * Data:2018/8/8
 * Time:13:36
 */

public class TbGoodsDesc {

    private Long id;

    private long goodsId;

    private String goodsTitle;

    private BigDecimal goodsPrice;

    private String placeOfArea;

    private String category;

    private String taste;

    private String goodsMinType;

    private String brand;

    private String sendTimeType;

    private String goodsImage;

    private String smallPic;

    private Date dateOfManufacture;

    private String qualityDate;

    private String sweetness;

    private String material;

    private Float alcoholicStrength;

    private String storageMethod;

    private Integer capacity;

    private Date createTime;

    private Date updateTime;

    private String isAlive;


    public TbGoodsDesc(Long id, long goodsId, String goodsTitle, BigDecimal goodsPrice, String placeOfArea, String category, String taste, String goodsMinType, String brand, String sendTimeType, String goodsImage, String smallPic, Date dateOfManufacture, String qualityDate, String sweetness, String material, Float alcoholicStrength, String storageMethod, Integer capacity, Date createTime, Date updateTime, String isAlive) {
        this.id = id;
        this.goodsId = goodsId;
        this.goodsTitle = goodsTitle;
        this.goodsPrice = goodsPrice;
        this.placeOfArea = placeOfArea;
        this.category = category;
        this.taste = taste;
        this.goodsMinType = goodsMinType;
        this.brand = brand;
        this.sendTimeType = sendTimeType;
        this.goodsImage = goodsImage;
        this.smallPic = smallPic;
        this.dateOfManufacture = dateOfManufacture;
        this.qualityDate = qualityDate;
        this.sweetness = sweetness;
        this.material = material;
        this.alcoholicStrength = alcoholicStrength;
        this.storageMethod = storageMethod;
        this.capacity = capacity;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isAlive = isAlive;
    }


    public TbGoodsDesc() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getPlaceOfArea() {
        return placeOfArea;
    }

    public void setPlaceOfArea(String placeOfArea) {
        this.placeOfArea = placeOfArea;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getGoodsMinType() {
        return goodsMinType;
    }

    public void setGoodsMinType(String goodsMinType) {
        this.goodsMinType = goodsMinType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSendTimeType() {
        return sendTimeType;
    }

    public void setSendTimeType(String sendTimeType) {
        this.sendTimeType = sendTimeType;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public String getSmallPic() {
        return smallPic;
    }

    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getQualityDate() {
        return qualityDate;
    }

    public void setQualityDate(String qualityDate) {
        this.qualityDate = qualityDate;
    }

    public String getSweetness() {
        return sweetness;
    }

    public void setSweetness(String sweetness) {
        this.sweetness = sweetness;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Float getAlcoholicStrength() {
        return alcoholicStrength;
    }

    public void setAlcoholicStrength(Float alcoholicStrength) {
        this.alcoholicStrength = alcoholicStrength;
    }

    public String getStorageMethod() {
        return storageMethod;
    }

    public void setStorageMethod(String storageMethod) {
        this.storageMethod = storageMethod;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(String isAlive) {
        this.isAlive = isAlive;
    }
}
