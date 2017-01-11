package com.publiccms.entities.sys;

// Generated 2016-5-16 18:15:59 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.sanluan.common.source.entity.MyColumn;

/**
 * SysConfig generated by hbm2java
 */
@Entity
@Table(name = "sys_config", uniqueConstraints = @UniqueConstraint(columnNames = { "site_id", "code", "subcode" }))
public class SysConfig implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "ID")
    private Integer id;
    @MyColumn(title = "站点", condition = true)
    private int siteId;
    @MyColumn(title = "编码", condition = true)
    private String code;
    @MyColumn(title = "子编码", condition = true)
    private String subcode;
    @MyColumn(title = "值")
    private String data;

    public SysConfig() {
    }

    public SysConfig(int siteId, String code, String subcode, String data) {
        this.siteId = siteId;
        this.code = code;
        this.subcode = subcode;
        this.data = data;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return this.siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Column(name = "code", nullable = false, length = 50)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "subcode", nullable = false, length = 50)
    public String getSubcode() {
        return this.subcode;
    }

    public void setSubcode(String subcode) {
        this.subcode = subcode;
    }

    @Column(name = "data", nullable = false)
    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

}