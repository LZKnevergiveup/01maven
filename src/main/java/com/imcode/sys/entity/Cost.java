package com.imcode.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuzhengkai
 * @since 2020-04-19
 */
public class Cost implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cost_id", type = IdType.AUTO)
    private Integer costId;

    private Integer adminId;

    private Integer payUid;

    private LocalDate moneyTime;

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
    public Integer getPayUid() {
        return payUid;
    }

    public void setPayUid(Integer payUid) {
        this.payUid = payUid;
    }
    public LocalDate getMoneyTime() {
        return moneyTime;
    }

    public void setMoneyTime(LocalDate moneyTime) {
        this.moneyTime = moneyTime;
    }

    @Override
    public String toString() {
        return "Cost{" +
            "costId=" + costId +
            ", adminId=" + adminId +
            ", payUid=" + payUid +
            ", moneyTime=" + moneyTime +
        "}";
    }
}
