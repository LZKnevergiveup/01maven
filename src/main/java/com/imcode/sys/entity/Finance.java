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
public class Finance implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 财务账单
     */
    @TableId(value = "finance_id", type = IdType.AUTO)
    private Integer financeId;

    private String financeName;

    /**
     * 0为出账1为进账
     */
    private Integer financeInout;

    private Integer financeMoney;

    /**
     * 0为记录存在 1为记录失效
     */
    private Integer financeDisplay;

    public Integer getFinanceId() {
        return financeId;
    }

    public void setFinanceId(Integer financeId) {
        this.financeId = financeId;
    }
    public String getFinanceName() {
        return financeName;
    }

    public void setFinanceName(String financeName) {
        this.financeName = financeName;
    }
    public Integer getFinanceInout() {
        return financeInout;
    }

    public void setFinanceInout(Integer financeInout) {
        this.financeInout = financeInout;
    }
    public Integer getFinanceMoney() {
        return financeMoney;
    }

    public void setFinanceMoney(Integer financeMoney) {
        this.financeMoney = financeMoney;
    }
    public Integer getFinanceDisplay() {
        return financeDisplay;
    }

    public void setFinanceDisplay(Integer financeDisplay) {
        this.financeDisplay = financeDisplay;
    }

    @Override
    public String toString() {
        return "Finance{" +
            "financeId=" + financeId +
            ", financeName=" + financeName +
            ", financeInout=" + financeInout +
            ", financeMoney=" + financeMoney +
            ", financeDisplay=" + financeDisplay +
        "}";
    }
}
