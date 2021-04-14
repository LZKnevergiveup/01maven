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
public class Contract implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 合同
     */
    @TableId(value = "contract_id", type = IdType.AUTO)
    private Integer contractId;

    private Integer customerId;

    private Integer adminId;

    private Integer houseId;

    /**
     * 备注
     */
    private String contractRemarks;

    /**
     * 0为没审批1:已审批2:失效
     */
    private Integer contractDisplay;

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }
    public String getContractRemarks() {
        return contractRemarks;
    }

    public void setContractRemarks(String contractRemarks) {
        this.contractRemarks = contractRemarks;
    }
    public Integer getContractDisplay() {
        return contractDisplay;
    }

    public void setContractDisplay(Integer contractDisplay) {
        this.contractDisplay = contractDisplay;
    }

    @Override
    public String toString() {
        return "Contract{" +
            "contractId=" + contractId +
            ", customerId=" + customerId +
            ", adminId=" + adminId +
            ", houseId=" + houseId +
            ", contractRemarks=" + contractRemarks +
            ", contractDisplay=" + contractDisplay +
        "}";
    }
}
