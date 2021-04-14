package com.imcode.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuzhengkai
 * @since 2020-02-17
 */
@TableName("sys_area")
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer parentId;

    /**
     * 国0  省1  市2  区3
     */
    private Integer type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Area{" +
            "name=" + name +
            ", parentId=" + parentId +
            ", type=" + type +
        "}";
    }
}
