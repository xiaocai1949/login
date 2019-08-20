package cn.wasu.login.domain;

import javax.persistence.*;

/**
 * @ClassName UserRoom
 * @Description
 * @Author Administrator
 * @Date 2019/8/16 9:35
 * @Version 1.0
 **/


@Entity
@Table(name = "user_room", schema = "hd_znjj", catalog = "")
public class UserRoom {
    private int id;
    private String name;
    private String uid;
    private String modifyTime;
    private String createTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRoom userRoom = (UserRoom) o;

        if (id != userRoom.id) return false;
        if (name != null ? !name.equals(userRoom.name) : userRoom.name != null) return false;
        if (uid != null ? !uid.equals(userRoom.uid) : userRoom.uid != null) return false;
        if (modifyTime != null ? !modifyTime.equals(userRoom.modifyTime) : userRoom.modifyTime != null) return false;
        if (createTime != null ? !createTime.equals(userRoom.createTime) : userRoom.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
