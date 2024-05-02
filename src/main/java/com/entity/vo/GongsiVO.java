package com.entity.vo;

import com.entity.GongsiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 公司
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongsi")
public class GongsiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 公司名称
     */

    @TableField(value = "gongsi_name")
    private String gongsiName;


    /**
     * 所在行业
     */

    @TableField(value = "hanye_types")
    private Integer hanyeTypes;


    /**
     * 联系方式
     */

    @TableField(value = "gongsi_phone")
    private String gongsiPhone;


    /**
     * 邮箱
     */

    @TableField(value = "gongsi_email")
    private String gongsiEmail;


    /**
     * 营业执照展示
     */

    @TableField(value = "gongsi_photo")
    private String gongsiPhoto;


    /**
     * 公司简介
     */

    @TableField(value = "gongsi_content")
    private String gongsiContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "gongsi_delete")
    private Integer gongsiDelete;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：公司名称
	 */
    public String getGongsiName() {
        return gongsiName;
    }


    /**
	 * 获取：公司名称
	 */

    public void setGongsiName(String gongsiName) {
        this.gongsiName = gongsiName;
    }
    /**
	 * 设置：所在行业
	 */
    public Integer getHanyeTypes() {
        return hanyeTypes;
    }


    /**
	 * 获取：所在行业
	 */

    public void setHanyeTypes(Integer hanyeTypes) {
        this.hanyeTypes = hanyeTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getGongsiPhone() {
        return gongsiPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setGongsiPhone(String gongsiPhone) {
        this.gongsiPhone = gongsiPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getGongsiEmail() {
        return gongsiEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setGongsiEmail(String gongsiEmail) {
        this.gongsiEmail = gongsiEmail;
    }
    /**
	 * 设置：营业执照展示
	 */
    public String getGongsiPhoto() {
        return gongsiPhoto;
    }


    /**
	 * 获取：营业执照展示
	 */

    public void setGongsiPhoto(String gongsiPhoto) {
        this.gongsiPhoto = gongsiPhoto;
    }
    /**
	 * 设置：公司简介
	 */
    public String getGongsiContent() {
        return gongsiContent;
    }


    /**
	 * 获取：公司简介
	 */

    public void setGongsiContent(String gongsiContent) {
        this.gongsiContent = gongsiContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getGongsiDelete() {
        return gongsiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setGongsiDelete(Integer gongsiDelete) {
        this.gongsiDelete = gongsiDelete;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
