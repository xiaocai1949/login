package cn.wasu.login.domain;

import javax.persistence.*;

/**
 * @ClassName UserDevice
 * @Description
 * @Author Administrator
 * @Date 2019/8/16 9:35
 * @Version 1.0
 **/


@Entity
@Table(name = "user_device", schema = "hd_znjj", catalog = "")
public class UserDevice {
    private int id;
    private String uid;
    private String deviceUid;
    private String deviceName;
    private String shareFrom;
    private String bindTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "device_uid")
    public String getDeviceUid() {
        return deviceUid;
    }

    public void setDeviceUid(String deviceUid) {
        this.deviceUid = deviceUid;
    }

    @Basic
    @Column(name = "device_name")
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Basic
    @Column(name = "share_from")
    public String getShareFrom() {
        return shareFrom;
    }

    public void setShareFrom(String shareFrom) {
        this.shareFrom = shareFrom;
    }

    @Basic
    @Column(name = "bind_time")
    public String getBindTime() {
        return bindTime;
    }

    public void setBindTime(String bindTime) {
        this.bindTime = bindTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDevice that = (UserDevice) o;

        if (id != that.id) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (deviceUid != null ? !deviceUid.equals(that.deviceUid) : that.deviceUid != null) return false;
        if (deviceName != null ? !deviceName.equals(that.deviceName) : that.deviceName != null) return false;
        if (shareFrom != null ? !shareFrom.equals(that.shareFrom) : that.shareFrom != null) return false;
        if (bindTime != null ? !bindTime.equals(that.bindTime) : that.bindTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (deviceUid != null ? deviceUid.hashCode() : 0);
        result = 31 * result + (deviceName != null ? deviceName.hashCode() : 0);
        result = 31 * result + (shareFrom != null ? shareFrom.hashCode() : 0);
        result = 31 * result + (bindTime != null ? bindTime.hashCode() : 0);
        return result;
    }
}
