package com.imcode.sys.entity;

import java.time.LocalDate;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuzhengkai
 * @since 2020-02-17
 */
public class Notic implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer noticeId;

    private String noticeName;

    private String noticeContent;

    private Integer rid;

    private LocalDate createTime;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }
    public String getNoticeName() {
        return noticeName;
    }

    public void setNoticeName(String noticeName) {
        this.noticeName = noticeName;
    }
    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }
    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Notic{" +
            "noticeId=" + noticeId +
            ", noticeName=" + noticeName +
            ", noticeContent=" + noticeContent +
            ", rid=" + rid +
            ", createTime=" + createTime +
        "}";
    }
}
