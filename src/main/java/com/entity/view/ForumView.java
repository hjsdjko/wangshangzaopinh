package com.entity.view;

import com.entity.ForumEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 论坛
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("forum")
public class ForumView extends ForumEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 帖子状态的值
		*/
		private String forumStateValue;



		//级联表 gongsi
			/**
			* 公司名称
			*/
			private String gongsiName;
			/**
			* 所在行业
			*/
			private Integer hanyeTypes;
				/**
				* 所在行业的值
				*/
				private String hanyeValue;
			/**
			* 联系方式
			*/
			private String gongsiPhone;
			/**
			* 邮箱
			*/
			private String gongsiEmail;
			/**
			* 营业执照展示
			*/
			private String gongsiPhoto;
			/**
			* 公司简介
			*/
			private String gongsiContent;
			/**
			* 逻辑删除
			*/
			private Integer gongsiDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

		//级联表 users
			/**
			* 用户名
			*/
			private String uusername;
			/**
			* 密码
			*/
			private String upassword;
			/**
			* 角色
			*/
			private String urole;
			/**
			* 新增时间
			*/
			private Date uaddtime;

	public ForumView() {

	}

	public ForumView(ForumEntity forumEntity) {
		try {
			BeanUtils.copyProperties(this, forumEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 帖子状态的值
			*/
			public String getForumStateValue() {
				return forumStateValue;
			}
			/**
			* 设置： 帖子状态的值
			*/
			public void setForumStateValue(String forumStateValue) {
				this.forumStateValue = forumStateValue;
			}

































				//级联表的get和set gongsi

					/**
					* 获取： 公司名称
					*/
					public String getGongsiName() {
						return gongsiName;
					}
					/**
					* 设置： 公司名称
					*/
					public void setGongsiName(String gongsiName) {
						this.gongsiName = gongsiName;
					}

					/**
					* 获取： 所在行业
					*/
					public Integer getHanyeTypes() {
						return hanyeTypes;
					}
					/**
					* 设置： 所在行业
					*/
					public void setHanyeTypes(Integer hanyeTypes) {
						this.hanyeTypes = hanyeTypes;
					}


						/**
						* 获取： 所在行业的值
						*/
						public String getHanyeValue() {
							return hanyeValue;
						}
						/**
						* 设置： 所在行业的值
						*/
						public void setHanyeValue(String hanyeValue) {
							this.hanyeValue = hanyeValue;
						}

					/**
					* 获取： 联系方式
					*/
					public String getGongsiPhone() {
						return gongsiPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setGongsiPhone(String gongsiPhone) {
						this.gongsiPhone = gongsiPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getGongsiEmail() {
						return gongsiEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setGongsiEmail(String gongsiEmail) {
						this.gongsiEmail = gongsiEmail;
					}

					/**
					* 获取： 营业执照展示
					*/
					public String getGongsiPhoto() {
						return gongsiPhoto;
					}
					/**
					* 设置： 营业执照展示
					*/
					public void setGongsiPhoto(String gongsiPhoto) {
						this.gongsiPhoto = gongsiPhoto;
					}

					/**
					* 获取： 公司简介
					*/
					public String getGongsiContent() {
						return gongsiContent;
					}
					/**
					* 设置： 公司简介
					*/
					public void setGongsiContent(String gongsiContent) {
						this.gongsiContent = gongsiContent;
					}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getGongsiDelete() {
						return gongsiDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setGongsiDelete(Integer gongsiDelete) {
						this.gongsiDelete = gongsiDelete;
					}























				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}


















			//级联表的get和set users

					/**
					* 获取： 用户名
					*/
					public String getUusername() {
						return uusername;
					}
					/**
					* 设置： 用户名
					*/
					public void setUusername(String uusername) {
						this.uusername = uusername;
					}

					/**
					* 获取： 密码
					*/
					public String getUpassword() {
						return upassword;
					}
					/**
					* 设置： 密码
					*/
					public void setUpassword(String upassword) {
						this.upassword = upassword;
					}

					/**
					* 获取： 角色
					*/
					public String getUrole() {
						return urole;
					}
					/**
					* 设置： 角色
					*/
					public void setUrole(String urole) {
						this.urole = urole;
					}

					/**
					* 获取： 新增时间
					*/
					public Date getUaddtime() {
						return uaddtime;
					}
					/**
					* 设置： 新增时间
					*/
					public void setUaddtime(Date uaddtime) {
						this.uaddtime = uaddtime;
					}
}
