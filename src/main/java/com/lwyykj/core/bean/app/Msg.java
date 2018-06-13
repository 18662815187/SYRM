package com.lwyykj.core.bean.app;

import java.io.Serializable;

public class Msg implements Serializable {
    private Integer id;

    /**
     * 提问,问诊留言ID
     */
    private Integer msgId;

    /**
     * 上级回复留言ID
     */
    private Integer upId;

    /**
     * 内容
     */
    private String content;

    /**
     * 1医生发送给用户；2用户发送给医生
     */
    private Integer style;

    /**
     * 用户id
     */
    private Integer uid;

    private Integer docId;

    /**
     * 接收者ID
     */
    private Integer readerid;

    /**
     * 是否已读
     */
    private Integer isread;

    private Integer addtime;

    private String pic;

    private String readio;
    /*
     * 消息中的用户属性
     */
    private User user;
    
    /*
     * 消息中的医生
     */
    private Doctor doctor;
    
    
    

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public Integer getUpId() {
        return upId;
    }

    public void setUpId(Integer upId) {
        this.upId = upId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public Integer getReaderid() {
        return readerid;
    }

    public void setReaderid(Integer readerid) {
        this.readerid = readerid;
    }

    public Integer getIsread() {
        return isread;
    }

    public void setIsread(Integer isread) {
        this.isread = isread;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getReadio() {
        return readio;
    }

    public void setReadio(String readio) {
        this.readio = readio == null ? null : readio.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", msgId=").append(msgId);
        sb.append(", upId=").append(upId);
        sb.append(", content=").append(content);
        sb.append(", style=").append(style);
        sb.append(", uid=").append(uid);
        sb.append(", docId=").append(docId);
        sb.append(", readerid=").append(readerid);
        sb.append(", isread=").append(isread);
        sb.append(", addtime=").append(addtime);
        sb.append(", pic=").append(pic);
        sb.append(", readio=").append(readio);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}