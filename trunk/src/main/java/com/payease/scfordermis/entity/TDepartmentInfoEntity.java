package com.payease.scfordermis.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * @Author : zhangwen
 * @Data : 2018/1/10
 * @Description :
 */
@Entity
@Table(name = "t_department_info")
public class TDepartmentInfoEntity {
    private long fId;
    private long fCompanyId;
    private long fParentId;
    private String fName;
    private String fLevel;
    private long fCreate;



    private long fOperate;
    private Date fCreateTime;
    private Date fUpdateTime;

    @Id
    @Column(name = "f_id", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    public long getfId() {
        return fId;
    }

    public void setfId(long fId) {
        this.fId = fId;
    }

    @Basic
    @Column(name = "f_company_id", nullable = false)
    public long getfCompanyId() {
        return fCompanyId;
    }

    public void setfCompanyId(long fCompanyId) {
        this.fCompanyId = fCompanyId;
    }

    @Basic
    @Column(name = "f_operate", nullable = true)
    public long getfOperate() {
        return fOperate;
    }

    public void setfOperate(long fOperate) {
        this.fOperate = fOperate;
    }
    @Basic
    @Column(name = "f_parent_id", nullable = false)
    public long getfParentId() {
        return fParentId;
    }

    public void setfParentId(long fParentId) {
        this.fParentId = fParentId;
    }

    @Basic
    @Column(name = "f_name", nullable = false, length = 20)
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Basic
    @Column(name = "f_level", nullable = false, length = 10)
    public String getfLevel() {
        return fLevel;
    }

    public void setfLevel(String fLevel) {
        this.fLevel = fLevel;
    }

    @Basic
    @Column(name = "f_create", nullable = false)
    public long getfCreate() {
        return fCreate;
    }

    public void setfCreate(long fCreate) {
        this.fCreate = fCreate;
    }

    @Basic
    @Column(name = "f_create_time", nullable = false)
    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }

    @Basic
    @Column(name = "f_update_time", nullable = false)
    public Date getfUpdateTime() {
        return fUpdateTime;
    }

    public void setfUpdateTime(Date fUpdateTime) {
        this.fUpdateTime = fUpdateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TDepartmentInfoEntity that = (TDepartmentInfoEntity) o;
        return fId == that.fId &&
                fCompanyId == that.fCompanyId &&
                fParentId == that.fParentId &&
                fCreate == that.fCreate &&
                Objects.equals(fName, that.fName) &&
                Objects.equals(fLevel, that.fLevel) &&
                Objects.equals(fCreateTime, that.fCreateTime) &&
                Objects.equals(fUpdateTime, that.fUpdateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fId, fCompanyId, fParentId, fName, fLevel, fCreate, fCreateTime, fUpdateTime);
    }
}
