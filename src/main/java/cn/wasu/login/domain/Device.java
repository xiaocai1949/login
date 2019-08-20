package cn.wasu.login.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @ClassName Device
 * @Description
 * @Author Administrator
 * @Date 2019/8/16 9:35
 * @Version 1.0
 **/


@Entity
public class Device {
    private String deviceUid;
    private String deviceId;
    private String wifiId;
    private Integer thirdCloudId;
    private String deviceName;
    private String gatewayId;
    private String deviceCookie;
    private String gid;
    private String version;
    private String moduleVersion;
    private String note;
    private Integer faultStatus;
    private String faultTime;
    private Integer alarmStatus;
    private String alarmTime;
    private int online;
    private String modifyTime;
    private String createTime;
    private String lastLoginTime;

    @Id
    @Column(name = "device_uid")
    public String getDeviceUid() {
        return deviceUid;
    }

    public void setDeviceUid(String deviceUid) {
        this.deviceUid = deviceUid;
    }

    @Basic
    @Column(name = "device_id")
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "wifi_id")
    public String getWifiId() {
        return wifiId;
    }

    public void setWifiId(String wifiId) {
        this.wifiId = wifiId;
    }

    @Basic
    @Column(name = "third_cloud_id")
    public Integer getThirdCloudId() {
        return thirdCloudId;
    }

    public void setThirdCloudId(Integer thirdCloudId) {
        this.thirdCloudId = thirdCloudId;
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
    @Column(name = "gateway_id")
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    @Basic
    @Column(name = "device_cookie")
    public String getDeviceCookie() {
        return deviceCookie;
    }

    public void setDeviceCookie(String deviceCookie) {
        this.deviceCookie = deviceCookie;
    }

    @Basic
    @Column(name = "gid")
    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    @Basic
    @Column(name = "version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Basic
    @Column(name = "module_version")
    public String getModuleVersion() {
        return moduleVersion;
    }

    public void setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "fault_status")
    public Integer getFaultStatus() {
        return faultStatus;
    }

    public void setFaultStatus(Integer faultStatus) {
        this.faultStatus = faultStatus;
    }

    @Basic
    @Column(name = "fault_time")
    public String getFaultTime() {
        return faultTime;
    }

    public void setFaultTime(String faultTime) {
        this.faultTime = faultTime;
    }

    @Basic
    @Column(name = "alarm_status")
    public Integer getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(Integer alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    @Basic
    @Column(name = "alarm_time")
    public String getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Basic
    @Column(name = "online")
    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }

    @Basic
    @Column(name = "modify_time")
    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Basic
    @Column(name = "create_time")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "last_login_time")
    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (online != device.online) return false;
        if (deviceUid != null ? !deviceUid.equals(device.deviceUid) : device.deviceUid != null) return false;
        if (deviceId != null ? !deviceId.equals(device.deviceId) : device.deviceId != null) return false;
        if (wifiId != null ? !wifiId.equals(device.wifiId) : device.wifiId != null) return false;
        if (thirdCloudId != null ? !thirdCloudId.equals(device.thirdCloudId) : device.thirdCloudId != null)
            return false;
        if (deviceName != null ? !deviceName.equals(device.deviceName) : device.deviceName != null) return false;
        if (gatewayId != null ? !gatewayId.equals(device.gatewayId) : device.gatewayId != null) return false;
        if (deviceCookie != null ? !deviceCookie.equals(device.deviceCookie) : device.deviceCookie != null)
            return false;
        if (gid != null ? !gid.equals(device.gid) : device.gid != null) return false;
        if (version != null ? !version.equals(device.version) : device.version != null) return false;
        if (moduleVersion != null ? !moduleVersion.equals(device.moduleVersion) : device.moduleVersion != null)
            return false;
        if (note != null ? !note.equals(device.note) : device.note != null) return false;
        if (faultStatus != null ? !faultStatus.equals(device.faultStatus) : device.faultStatus != null) return false;
        if (faultTime != null ? !faultTime.equals(device.faultTime) : device.faultTime != null) return false;
        if (alarmStatus != null ? !alarmStatus.equals(device.alarmStatus) : device.alarmStatus != null) return false;
        if (alarmTime != null ? !alarmTime.equals(device.alarmTime) : device.alarmTime != null) return false;
        if (modifyTime != null ? !modifyTime.equals(device.modifyTime) : device.modifyTime != null) return false;
        if (createTime != null ? !createTime.equals(device.createTime) : device.createTime != null) return false;
        if (lastLoginTime != null ? !lastLoginTime.equals(device.lastLoginTime) : device.lastLoginTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deviceUid != null ? deviceUid.hashCode() : 0;
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (wifiId != null ? wifiId.hashCode() : 0);
        result = 31 * result + (thirdCloudId != null ? thirdCloudId.hashCode() : 0);
        result = 31 * result + (deviceName != null ? deviceName.hashCode() : 0);
        result = 31 * result + (gatewayId != null ? gatewayId.hashCode() : 0);
        result = 31 * result + (deviceCookie != null ? deviceCookie.hashCode() : 0);
        result = 31 * result + (gid != null ? gid.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (moduleVersion != null ? moduleVersion.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (faultStatus != null ? faultStatus.hashCode() : 0);
        result = 31 * result + (faultTime != null ? faultTime.hashCode() : 0);
        result = 31 * result + (alarmStatus != null ? alarmStatus.hashCode() : 0);
        result = 31 * result + (alarmTime != null ? alarmTime.hashCode() : 0);
        result = 31 * result + online;
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (lastLoginTime != null ? lastLoginTime.hashCode() : 0);
        return result;
    }
}
