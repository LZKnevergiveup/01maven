package com.imcode.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuzhengkai
 * @since 2020-02-17
 */
public class House implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "house_id", type = IdType.AUTO)
    private Integer houseId;

    private String houseName;

    private Integer houseSize;

    private Integer houseMoney;

    private Integer houseEngineering;

    /**
     * 0:未上市1:还有2:已出售
     */
    private Integer houseDisplay;

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }
    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
    public Integer getHouseSize() {
        return houseSize;
    }

    public void setHouseSize(Integer houseSize) {
        this.houseSize = houseSize;
    }
    public Integer getHouseMoney() {
        return houseMoney;
    }

    public void setHouseMoney(Integer houseMoney) {
        this.houseMoney = houseMoney;
    }
    public Integer getHouseEngineering() {
        return houseEngineering;
    }

    public void setHouseEngineering(Integer houseEngineering) {
        this.houseEngineering = houseEngineering;
    }
    public Integer getHouseDisplay() {
        return houseDisplay;
    }

    public void setHouseDisplay(Integer houseDisplay) {
        this.houseDisplay = houseDisplay;
    }

    @Override
    public String toString() {
        return "House{" +
            "houseId=" + houseId +
            ", houseName=" + houseName +
            ", houseSize=" + houseSize +
            ", houseMoney=" + houseMoney +
            ", houseEngineering=" + houseEngineering +
            ", houseDisplay=" + houseDisplay +
        "}";
    }
}
