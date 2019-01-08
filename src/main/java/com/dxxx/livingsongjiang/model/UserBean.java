package com.dxxx.livingsongjiang.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "userinfo")
//忽略不存在的字段
@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonIgnoreProperties({ "internalId", "secretKey" })
//指定的字段不会被序列化和反序列化。
public class UserBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_id")
    private int u_id;
    @Column(name = "u_userName")
    private String u_userName;
    @Column(name = "u_pwd")
    private String u_pwd;
    //施工单位id
    @Column(name = "u_uid")
    private String u_uid;
    //电力公司id
//    @SerializedName("xsxq_uid")
    @Column(name = "xsxq_uid")
    private String gsid;
    //u_type 0系统包括电力公司 1内场施工单位 2外场施工人员 3超级用户  4工单改造-施工人员 5工单改造-领导
    @Column(name = "u_type")
    private String u_type;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_userName() {
        return u_userName;
    }

    public String getU_uid() {
        return u_uid;
    }

    public void setU_uid(String u_uid) {
        this.u_uid = u_uid;
    }

    public String getGsid() {
        return gsid;
    }

    public void setGsid(String gsid) {
        this.gsid = gsid;
    }

    public String getU_type() {
        return u_type;
    }

    public void setU_type(String u_type) {
        this.u_type = u_type;
    }

    public void setU_userName(String u_userName) {
        this.u_userName = u_userName;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }
}
