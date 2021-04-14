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
public class Engineering implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "engineering_id", type = IdType.AUTO)
    private Integer engineeringId;

    private String engineeringName;

    private Integer engineeringMoney;

    /**
     * 进度
     */
    private String engineeringProgress;

    /**
     * 参与人数
     */
    private Integer engineeringNumber;

    /**
     * 0:审核中1:正在进行中2:项目已完成
     */
    private Integer engineeringDisplay;

    public Integer getEngineeringId() {
        return engineeringId;
    }

    public void setEngineeringId(Integer engineeringId) {
        this.engineeringId = engineeringId;
    }
    public String getEngineeringName() {
        return engineeringName;
    }

    public void setEngineeringName(String engineeringName) {
        this.engineeringName = engineeringName;
    }
    public Integer getEngineeringMoney() {
        return engineeringMoney;
    }

    public void setEngineeringMoney(Integer engineeringMoney) {
        this.engineeringMoney = engineeringMoney;
    }
    public String getEngineeringProgress() {
        return engineeringProgress;
    }

    public void setEngineeringProgress(String engineeringProgress) {
        this.engineeringProgress = engineeringProgress;
    }
    public Integer getEngineeringNumber() {
        return engineeringNumber;
    }

    public void setEngineeringNumber(Integer engineeringNumber) {
        this.engineeringNumber = engineeringNumber;
    }
    public Integer getEngineeringDisplay() {
        return engineeringDisplay;
    }

    public void setEngineeringDisplay(Integer engineeringDisplay) {
        this.engineeringDisplay = engineeringDisplay;
    }

    @Override
    public String toString() {
        return "Engineering{" +
            "engineeringId=" + engineeringId +
            ", engineeringName=" + engineeringName +
            ", engineeringMoney=" + engineeringMoney +
            ", engineeringProgress=" + engineeringProgress +
            ", engineeringNumber=" + engineeringNumber +
            ", engineeringDisplay=" + engineeringDisplay +
        "}";
    }
}
