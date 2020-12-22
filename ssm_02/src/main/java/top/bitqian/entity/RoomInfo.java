package top.bitqian.entity;

import java.util.Date;

/**
 * @author echo lovely
 * @date 2020/12/21 17:38
 */

public class RoomInfo {

    /**
     * 客房id
     */
    private Integer roomId;

    /**
     * 房号
     */
    private String roomNo;

    /**
     * 创建事件
     */
    private Date createDate;

    /**
     * 客房类型 1.单间 2. 标间 3. 套间
     */
    private Integer roomType;

    /**
     * 入驻状态 0,未入住 1. 已经入住
     */
    private Integer roomStatus;


    /**
     * 价格
     */
    private Double price;

    public RoomInfo() {}


    public RoomInfo(Integer roomId, String roomNo, Date createDate,
                    Integer roomType, Integer roomStatus, Double price) {
        this.roomId = roomId;
        this.roomNo = roomNo;
        this.createDate = createDate;
        this.roomType = roomType;
        this.roomStatus = roomStatus;
        this.price = price;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public Integer getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RoomInfo{" +
                "roomId=" + roomId +
                ", roomNo=" + roomNo +
                ", createDate=" + createDate +
                ", roomType=" + roomType +
                ", roomStatus=" + roomStatus +
                ", price=" + price +
                '}';
    }
}
