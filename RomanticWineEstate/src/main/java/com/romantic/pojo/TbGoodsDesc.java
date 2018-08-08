package com.romantic.pojo;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * IntelliJ IDEA
 * Author:Hu HaoRan
 * <p>
 * Data:2018-08-08
 * Time:12:02
 */
public class TbGoodsDesc {
    private long id;
    private String goodsId;
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
    private float alcoholicStrength;
    private String storageMethod;
    private int capacity;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String isAlive;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
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

    public float getAlcoholicStrength() {
        return alcoholicStrength;
    }

    public void setAlcoholicStrength(float alcoholicStrength) {
        this.alcoholicStrength = alcoholicStrength;
    }

    public String getStorageMethod() {
        return storageMethod;
    }

    public void setStorageMethod(String storageMethod) {
        this.storageMethod = storageMethod;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(String isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        return "TbGoodsDesc{" +
                "id=" + id +
                ", goodsId='" + goodsId + '\'' +
                ", goodsTitle='" + goodsTitle + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", placeOfArea='" + placeOfArea + '\'' +
                ", category='" + category + '\'' +
                ", taste='" + taste + '\'' +
                ", goodsMinType='" + goodsMinType + '\'' +
                ", brand='" + brand + '\'' +
                ", sendTimeType='" + sendTimeType + '\'' +
                ", goodsImage='" + goodsImage + '\'' +
                ", smallPic='" + smallPic + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", qualityDate='" + qualityDate + '\'' +
                ", sweetness='" + sweetness + '\'' +
                ", material='" + material + '\'' +
                ", alcoholicStrength=" + alcoholicStrength +
                ", storageMethod='" + storageMethod + '\'' +
                ", capacity=" + capacity +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isAlive='" + isAlive + '\'' +
                '}';
    }
}
