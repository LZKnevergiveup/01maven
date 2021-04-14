package com.imcode.sys.entity;

import java.time.LocalTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuzhengkai
 * @since 2020-04-19
 */
public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer newsId;

    private String newsText;

    private Integer newsForm;

    private Integer newsTo;

    private LocalTime creatTime;

    /**
     * 0是未读1为已读
     */
    private Integer newsDisplay;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }
    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }
    public Integer getNewsForm() {
        return newsForm;
    }

    public void setNewsForm(Integer newsForm) {
        this.newsForm = newsForm;
    }
    public Integer getNewsTo() {
        return newsTo;
    }

    public void setNewsTo(Integer newsTo) {
        this.newsTo = newsTo;
    }
    public LocalTime getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(LocalTime creatTime) {
        this.creatTime = creatTime;
    }
    public Integer getNewsDisplay() {
        return newsDisplay;
    }

    public void setNewsDisplay(Integer newsDisplay) {
        this.newsDisplay = newsDisplay;
    }

    @Override
    public String toString() {
        return "News{" +
            "newsId=" + newsId +
            ", newsText=" + newsText +
            ", newsForm=" + newsForm +
            ", newsTo=" + newsTo +
            ", creatTime=" + creatTime +
            ", newsDisplay=" + newsDisplay +
        "}";
    }
}
