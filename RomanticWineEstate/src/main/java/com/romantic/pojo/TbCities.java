package com.romantic.pojo;

import java.util.Date;

/**
 * Authot:{Lenovo}
 * Date:{2018/8/4}{16:45}
 */

public class TbCities {
    private long id;
    private String cityId;
    private String city  ;
    private String provinceId ;
    private Date createTime;
    private Date updateTime;
    private String isAlive;


    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
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


    @Override
    public String toString() {
        return "TbCities{" +
                "id=" + id +
                ", cityId='" + cityId + '\'' +
                ", city='" + city + '\'' +
                ", provinceId='" + provinceId + '\'' +
                ", createIime=" + createTime +
                ", updateIime=" + updateTime +
                ", isAlive='" + isAlive + '\'' +
                '}';
    }

}
