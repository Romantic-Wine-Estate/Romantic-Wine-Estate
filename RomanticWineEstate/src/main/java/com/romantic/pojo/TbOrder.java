package com.romantic.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Create with IntelliJ IDEA
 * Author: liufugen
 * Date:{2018/8/11}
 * Time:{12:29}
 */
public class TbOrder {
    private long id;
    private String orderNum;
    private String sellerId;
    private BigDecimal payment;
    private String paymentType;
    private BigDecimal postFee;
    private String status;
    private Date paymentTime;
    private Date consignTime;
    private Date endTime;
    private Date closeTime;
    private String shippingName;

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    private String shippingCode;
    private String userId;
    private String buyerMessage;
    private String buyerNick;
    private String buyerRate;
    private String receiverAreaAame;
    private String receiverMobile;
    private String receiver;
    private Date expire;
    private Date createTime;
    private Timestamp updateTime;
    private String isAlive;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public BigDecimal getPostFee() {
        return postFee;
    }

    public void setPostFee(BigDecimal postFee) {
        this.postFee = postFee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }


    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerRate() {
        return buyerRate;
    }

    public void setBuyerRate(String buyerRate) {
        this.buyerRate = buyerRate;
    }

    public String getReceiverAreaAame() {
        return receiverAreaAame;
    }

    public void setReceiverAreaAame(String receiverAreaAame) {
        this.receiverAreaAame = receiverAreaAame;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
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


    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public String toString() {
        return "TbOrder{" +
                "id=" + id +
                ", orderNum='" + orderNum + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", payment=" + payment +
                ", paymentType='" + paymentType + '\'' +
                ", postFee=" + postFee +
                ", status='" + status + '\'' +
                ", paymentTime=" + paymentTime +
                ", consignTime=" + consignTime +
                ", endTime=" + endTime +
                ", closeTime=" + closeTime +
                ", shippingTame='" + shippingName + '\'' +
                ", shippingCode='" + shippingCode + '\'' +
                ", userId='" + userId + '\'' +
                ", buyerMessage='" + buyerMessage + '\'' +
                ", buyerNick='" + buyerNick + '\'' +
                ", buyerRate='" + buyerRate + '\'' +
                ", receiverAreaAame='" + receiverAreaAame + '\'' +
                ", receiverMobile='" + receiverMobile + '\'' +
                ", receiver='" + receiver + '\'' +
                ", expire=" + expire +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isAlive='" + isAlive + '\'' +
                '}';
    }
}
