package com.imcode.sys.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuzhengkai
 * @since 2020-02-17
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userid;

    private String personNumber;

    private String personName;

    private String personSex;

    private String personPhone;

    private String personMail;

    private String personQq;

    private Integer personAddress;

    /**
     * 0:员工1:部长2:老板
     */
    private Integer personPosition;

    private Integer personMoney;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public String getPersonSex() {
        return personSex;
    }

    public void setPersonSex(String personSex) {
        this.personSex = personSex;
    }
    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }
    public String getPersonMail() {
        return personMail;
    }

    public void setPersonMail(String personMail) {
        this.personMail = personMail;
    }
    public String getPersonQq() {
        return personQq;
    }

    public void setPersonQq(String personQq) {
        this.personQq = personQq;
    }
    public Integer getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(Integer personAddress) {
        this.personAddress = personAddress;
    }
    public Integer getPersonPosition() {
        return personPosition;
    }

    public void setPersonPosition(Integer personPosition) {
        this.personPosition = personPosition;
    }
    public Integer getPersonMoney() {
        return personMoney;
    }

    public void setPersonMoney(Integer personMoney) {
        this.personMoney = personMoney;
    }

    @Override
    public String toString() {
        return "Person{" +
            "userid=" + userid +
            ", personNumber=" + personNumber +
            ", personName=" + personName +
            ", personSex=" + personSex +
            ", personPhone=" + personPhone +
            ", personMail=" + personMail +
            ", personQq=" + personQq +
            ", personAddress=" + personAddress +
            ", personPosition=" + personPosition +
            ", personMoney=" + personMoney +
        "}";
    }
}
