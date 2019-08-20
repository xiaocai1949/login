package cn.wasu.login.domain;

import javax.persistence.*;

/**
 * @ClassName BusinessModel
 * @Description
 * @Author Administrator
 * @Date 2019/8/16 9:35
 * @Version 1.0
 **/


@Entity
@Table(name = "business_model", schema = "hd_znjj", catalog = "")
public class BusinessModel {
    private int id;
    private String gid;
    private String thirdCloudModel;
    private Integer thirdCloudId;
    private Integer gatewayModelId;
    private String productId;
    private String companyId;
    private String modelId;
    private Integer bindTypeId;
    private String modelName;
    private Integer modelType;
    private Integer status;
    private String description;
    private Integer bindLimit;
    private String iconFid;
    private String creater;
    private String modifyTime;
    private String requestTime;
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
    @Column(name = "gid")
    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    @Basic
    @Column(name = "third_cloud_model")
    public String getThirdCloudModel() {
        return thirdCloudModel;
    }

    public void setThirdCloudModel(String thirdCloudModel) {
        this.thirdCloudModel = thirdCloudModel;
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
    @Column(name = "gateway_model_id")
    public Integer getGatewayModelId() {
        return gatewayModelId;
    }

    public void setGatewayModelId(Integer gatewayModelId) {
        this.gatewayModelId = gatewayModelId;
    }

    @Basic
    @Column(name = "product_id")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "company_id")
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "model_id")
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    @Basic
    @Column(name = "bind_type_id")
    public Integer getBindTypeId() {
        return bindTypeId;
    }

    public void setBindTypeId(Integer bindTypeId) {
        this.bindTypeId = bindTypeId;
    }

    @Basic
    @Column(name = "model_name")
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Basic
    @Column(name = "model_type")
    public Integer getModelType() {
        return modelType;
    }

    public void setModelType(Integer modelType) {
        this.modelType = modelType;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "bind_limit")
    public Integer getBindLimit() {
        return bindLimit;
    }

    public void setBindLimit(Integer bindLimit) {
        this.bindLimit = bindLimit;
    }

    @Basic
    @Column(name = "icon_fid")
    public String getIconFid() {
        return iconFid;
    }

    public void setIconFid(String iconFid) {
        this.iconFid = iconFid;
    }

    @Basic
    @Column(name = "creater")
    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
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
    @Column(name = "request_time")
    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
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

        BusinessModel that = (BusinessModel) o;

        if (id != that.id) return false;
        if (gid != null ? !gid.equals(that.gid) : that.gid != null) return false;
        if (thirdCloudModel != null ? !thirdCloudModel.equals(that.thirdCloudModel) : that.thirdCloudModel != null)
            return false;
        if (thirdCloudId != null ? !thirdCloudId.equals(that.thirdCloudId) : that.thirdCloudId != null) return false;
        if (gatewayModelId != null ? !gatewayModelId.equals(that.gatewayModelId) : that.gatewayModelId != null)
            return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (modelId != null ? !modelId.equals(that.modelId) : that.modelId != null) return false;
        if (bindTypeId != null ? !bindTypeId.equals(that.bindTypeId) : that.bindTypeId != null) return false;
        if (modelName != null ? !modelName.equals(that.modelName) : that.modelName != null) return false;
        if (modelType != null ? !modelType.equals(that.modelType) : that.modelType != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (bindLimit != null ? !bindLimit.equals(that.bindLimit) : that.bindLimit != null) return false;
        if (iconFid != null ? !iconFid.equals(that.iconFid) : that.iconFid != null) return false;
        if (creater != null ? !creater.equals(that.creater) : that.creater != null) return false;
        if (modifyTime != null ? !modifyTime.equals(that.modifyTime) : that.modifyTime != null) return false;
        if (requestTime != null ? !requestTime.equals(that.requestTime) : that.requestTime != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (gid != null ? gid.hashCode() : 0);
        result = 31 * result + (thirdCloudModel != null ? thirdCloudModel.hashCode() : 0);
        result = 31 * result + (thirdCloudId != null ? thirdCloudId.hashCode() : 0);
        result = 31 * result + (gatewayModelId != null ? gatewayModelId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (modelId != null ? modelId.hashCode() : 0);
        result = 31 * result + (bindTypeId != null ? bindTypeId.hashCode() : 0);
        result = 31 * result + (modelName != null ? modelName.hashCode() : 0);
        result = 31 * result + (modelType != null ? modelType.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (bindLimit != null ? bindLimit.hashCode() : 0);
        result = 31 * result + (iconFid != null ? iconFid.hashCode() : 0);
        result = 31 * result + (creater != null ? creater.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        result = 31 * result + (requestTime != null ? requestTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
