package com.dxxx.livingsongjiang.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "bx_meterbox")
//忽略不存在的字段
@JsonIgnoreProperties(ignoreUnknown = true)
public class SanHuBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_id")
    private int m_id;
    @Column(name = "m_no")
    private String m_no;
    @Column(name = "m_gps")
    private String m_gps;
    @Column(name = "m_gzimg")
    private String m_gzimg;
    @Column(name = "m_beforegu")
    private String m_beforegu;
    @Column(name = "m_beforeping")
    private String m_beforeping;
    @Column(name = "m_beforetotal")
    private String m_beforetotal;
    @Column(name = "m_beforebximg")
    private String m_beforebximg;
    @Column(name = "m_beforeimg")
    private String m_beforeimg;
    @Column(name = "m_aftergu")
    private String m_aftergu;
    @Column(name = "m_afterping")
    private String m_afterping;
    @Column(name = "m_aftertotal")
    private String m_aftertotal;
    @Column(name = "m_afterimg")
    private String m_afterimg;
    @Column(name = "m_afterno")
    private String m_afterno;
    @Column(name = "m_afterbxno")
    private String m_afterbxno;
    @Column(name = "m_afterbximg")
    private String m_afterbximg;
    @Column(name = "m_completetime")
    private String m_completetime;

    @Column(name = "m_uploadtime")
    private String m_uploadtime;
    @Column(name = "m_uid")
    private int m_uid;
    @Column(name = "m_gid")
    private int m_gid;
    @Column(name = "m_dlgs")
    private String m_dlgs;

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getM_no() {
        return m_no;
    }

    public void setM_no(String m_no) {
        this.m_no = m_no;
    }

    public String getM_gps() {
        return m_gps;
    }

    public void setM_gps(String m_gps) {
        this.m_gps = m_gps;
    }

    public String getM_gzimg() {
        return m_gzimg;
    }

    public void setM_gzimg(String m_gzimg) {
        this.m_gzimg = m_gzimg;
    }

    public String getM_beforegu() {
        return m_beforegu;
    }

    public void setM_beforegu(String m_beforegu) {
        this.m_beforegu = m_beforegu;
    }

    public String getM_beforeping() {
        return m_beforeping;
    }

    public void setM_beforeping(String m_beforeping) {
        this.m_beforeping = m_beforeping;
    }

    public String getM_beforetotal() {
        return m_beforetotal;
    }

    public void setM_beforetotal(String m_beforetotal) {
        this.m_beforetotal = m_beforetotal;
    }

    public String getM_beforebximg() {
        return m_beforebximg;
    }

    public void setM_beforebximg(String m_beforebximg) {
        this.m_beforebximg = m_beforebximg;
    }

    public String getM_beforeimg() {
        return m_beforeimg;
    }

    public void setM_beforeimg(String m_beforeimg) {
        this.m_beforeimg = m_beforeimg;
    }

    public String getM_aftergu() {
        return m_aftergu;
    }

    public void setM_aftergu(String m_aftergu) {
        this.m_aftergu = m_aftergu;
    }

    public String getM_afterping() {
        return m_afterping;
    }

    public void setM_afterping(String m_afterping) {
        this.m_afterping = m_afterping;
    }

    public String getM_aftertotal() {
        return m_aftertotal;
    }

    public void setM_aftertotal(String m_aftertotal) {
        this.m_aftertotal = m_aftertotal;
    }

    public String getM_afterimg() {
        return m_afterimg;
    }

    public void setM_afterimg(String m_afterimg) {
        this.m_afterimg = m_afterimg;
    }

    public String getM_afterno() {
        return m_afterno;
    }

    public void setM_afterno(String m_afterno) {
        this.m_afterno = m_afterno;
    }

    public String getM_afterbxno() {
        return m_afterbxno;
    }

    public void setM_afterbxno(String m_afterbxno) {
        this.m_afterbxno = m_afterbxno;
    }

    public String getM_afterbximg() {
        return m_afterbximg;
    }

    public void setM_afterbximg(String m_afterbximg) {
        this.m_afterbximg = m_afterbximg;
    }

    public String getM_completetime() {
        return m_completetime;
    }

    public void setM_completetime(String m_completetime) {
        this.m_completetime = m_completetime;
    }

    public String getM_uploadtime() {
        return m_uploadtime;
    }

    public void setM_uploadtime(String m_uploadtime) {
        this.m_uploadtime = m_uploadtime;
    }

    public int getM_uid() {
        return m_uid;
    }

    public void setM_uid(int m_uid) {
        this.m_uid = m_uid;
    }

    public int getM_gid() {
        return m_gid;
    }

    public void setM_gid(int m_gid) {
        this.m_gid = m_gid;
    }

    public String getM_dlgs() {
        return m_dlgs;
    }

    public void setM_dlgs(String m_dlgs) {
        this.m_dlgs = m_dlgs;
    }
}
