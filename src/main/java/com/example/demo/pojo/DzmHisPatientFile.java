package com.example.demo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;


/**
 * 患者用户档案表
 * 
 * @author Autumn
 * @email 
 * @date 2019-11-03 21:27:15
 */
@Table(name = "dzm_his_patient_file")
public class DzmHisPatientFile implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    @Id
    private Integer fileId;
	
	    //患者id
    @Column(name = "patient_id")
    private Integer patientId;
	
	    //紧急联系人
    @Column(name = "emergency_contact_name")
    private String emergencyContactName;
	
	    //紧急联系人电话
    @Column(name = "emergency_contact_mobile")
    private String emergencyContactMobile;
	
	    //紧急联系人关系 1：爸爸  2：妈妈  3：儿子  4：女儿  5：亲戚  6：朋友
    @Column(name = "emergency_contact_relation")
    private Integer emergencyContactRelation;
	
	    //左耳听力 1：正常  2：耳聋
    @Column(name = "left_ear_hearing")
    private Integer leftEarHearing;
	
	    //右耳听力 1：正常  2：耳聋
    @Column(name = "right_ear_hearing")
    private Integer rightEarHearing;
	
	    //左眼视力
    @Column(name = "left_vision")
    private BigDecimal leftVision;
	
	    //修改时间
    @Column(name = "update_time")
    private Integer updateTime;
	
	    //右眼视力
    @Column(name = "right_vision")
    private BigDecimal rightVision;
	
	    //身高
    @Column(name = "height")
    private BigDecimal height;
	
	    //体重
    @Column(name = "weight")
    private BigDecimal weight;
	
	    //血型 1:A 2:B 3:AB 4:O    Rh血型 1:阴性 2:阳性
    @Column(name = "blood_type")
    private String bloodType;
	
	    //创建时间
    @Column(name = "create_time")
    private Integer createTime;
	
	    //个人史
    @Column(name = "personal_info")
    private String personalInfo;
	
	    //家族史
    @Column(name = "family_info")
    private String familyInfo;
	

	public DzmHisPatientFile() {
		super();
	}
	public DzmHisPatientFile(Integer fileId, Integer patientId, String emergencyContactName,
				String emergencyContactMobile, Integer emergencyContactRelation, Integer leftEarHearing,
				Integer rightEarHearing, BigDecimal leftVision, Integer updateTime, BigDecimal rightVision,
				BigDecimal height, BigDecimal weight, String bloodType, String personalInfo, String familyInfo) {
			super();
			this.fileId = fileId;
			this.patientId = patientId;
			this.emergencyContactName = emergencyContactName;
			this.emergencyContactMobile = emergencyContactMobile;
			this.emergencyContactRelation = emergencyContactRelation;
			this.leftEarHearing = leftEarHearing;
			this.rightEarHearing = rightEarHearing;
			this.leftVision = leftVision;
			this.updateTime = updateTime;
			this.rightVision = rightVision;
			this.height = height;
			this.weight = weight;
			this.bloodType = bloodType;
			this.personalInfo = personalInfo;
			this.familyInfo = familyInfo;
		}
	@Override
	public String toString() {
		return "DzmHisPatientFile [patientId=" + patientId + ", emergencyContactName=" + emergencyContactName
				+ ", emergencyContactMobile=" + emergencyContactMobile + ", emergencyContactRelation="
				+ emergencyContactRelation + ", leftEarHearing=" + leftEarHearing + ", rightEarHearing="
				+ rightEarHearing + ", leftVision=" + leftVision + ", updateTime=" + updateTime + ", rightVision="
				+ rightVision + ", height=" + height + ", weight=" + weight + ", bloodType=" + bloodType
				+ ", createTime=" + createTime + ", personalInfo=" + personalInfo + ", familyInfo=" + familyInfo + "]";
	}
	/**
	 * 设置：主键
	 */
	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}
	/**
	 * 获取：主键
	 */
	public Integer getFileId() {
		return fileId;
	}
	/**
	 * 设置：患者id
	 */
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	/**
	 * 获取：患者id
	 */
	public Integer getPatientId() {
		return patientId;
	}
	/**
	 * 设置：紧急联系人
	 */
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}
	/**
	 * 获取：紧急联系人
	 */
	public String getEmergencyContactName() {
		return emergencyContactName;
	}
	/**
	 * 设置：紧急联系人电话
	 */
	public void setEmergencyContactMobile(String emergencyContactMobile) {
		this.emergencyContactMobile = emergencyContactMobile;
	}
	/**
	 * 获取：紧急联系人电话
	 */
	public String getEmergencyContactMobile() {
		return emergencyContactMobile;
	}
	/**
	 * 设置：紧急联系人关系 1：爸爸  2：妈妈  3：儿子  4：女儿  5：亲戚  6：朋友
	 */
	public void setEmergencyContactRelation(Integer emergencyContactRelation) {
		this.emergencyContactRelation = emergencyContactRelation;
	}
	/**
	 * 获取：紧急联系人关系 1：爸爸  2：妈妈  3：儿子  4：女儿  5：亲戚  6：朋友
	 */
	public Integer getEmergencyContactRelation() {
		return emergencyContactRelation;
	}
	/**
	 * 设置：左耳听力 1：正常  2：耳聋
	 */
	public void setLeftEarHearing(Integer leftEarHearing) {
		this.leftEarHearing = leftEarHearing;
	}
	/**
	 * 获取：左耳听力 1：正常  2：耳聋
	 */
	public Integer getLeftEarHearing() {
		return leftEarHearing;
	}
	/**
	 * 设置：右耳听力 1：正常  2：耳聋
	 */
	public void setRightEarHearing(Integer rightEarHearing) {
		this.rightEarHearing = rightEarHearing;
	}
	/**
	 * 获取：右耳听力 1：正常  2：耳聋
	 */
	public Integer getRightEarHearing() {
		return rightEarHearing;
	}
	/**
	 * 设置：左眼视力
	 */
	public void setLeftVision(BigDecimal leftVision) {
		this.leftVision = leftVision;
	}
	/**
	 * 获取：左眼视力
	 */
	public BigDecimal getLeftVision() {
		return leftVision;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Integer getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：右眼视力
	 */
	public void setRightVision(BigDecimal rightVision) {
		this.rightVision = rightVision;
	}
	/**
	 * 获取：右眼视力
	 */
	public BigDecimal getRightVision() {
		return rightVision;
	}
	/**
	 * 设置：身高
	 */
	public void setHeight(BigDecimal height) {
		this.height = height;
	}
	/**
	 * 获取：身高
	 */
	public BigDecimal getHeight() {
		return height;
	}
	/**
	 * 设置：体重
	 */
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	/**
	 * 获取：体重
	 */
	public BigDecimal getWeight() {
		return weight;
	}
	/**
	 * 设置：血型 1:A 2:B 3:AB 4:O    Rh血型 1:阴性 2:阳性
	 */
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	/**
	 * 获取：血型 1:A 2:B 3:AB 4:O    Rh血型 1:阴性 2:阳性
	 */
	public String getBloodType() {
		return bloodType;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Integer getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：个人史
	 */
	public void setPersonalInfo(String personalInfo) {
		this.personalInfo = personalInfo;
	}
	/**
	 * 获取：个人史
	 */
	public String getPersonalInfo() {
		return personalInfo;
	}
	/**
	 * 设置：家族史
	 */
	public void setFamilyInfo(String familyInfo) {
		this.familyInfo = familyInfo;
	}
	/**
	 * 获取：家族史
	 */
	public String getFamilyInfo() {
		return familyInfo;
	}
}
