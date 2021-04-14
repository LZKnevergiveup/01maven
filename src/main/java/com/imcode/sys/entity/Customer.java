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
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "customer_id", type = IdType.AUTO)
    private Integer customerId;

    private String customerName;

    private String customerPhone;

    private String customerLike;

    private Integer customerSaleid;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
    public String getCustomerLike() {
        return customerLike;
    }

    public void setCustomerLike(String customerLike) {
        this.customerLike = customerLike;
    }
    public Integer getCustomerSaleid() {
        return customerSaleid;
    }

    public void setCustomerSaleid(Integer customerSaleid) {
        this.customerSaleid = customerSaleid;
    }

    @Override
    public String toString() {
        return "Customer{" +
            "customerId=" + customerId +
            ", customerName=" + customerName +
            ", customerPhone=" + customerPhone +
            ", customerLike=" + customerLike +
            ", customerSaleid=" + customerSaleid +
        "}";
    }
}
