package com.vo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.vo.enums.EnableStatusEnum;

import lombok.Data;

/**
 *
 *
 * @author zhangzhen
 * @date 2022年11月15日
 *
 */
@Data
@Entity(name = "config")
public class ConfEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer appId;

	private String name;
	private String value;

	private Integer status;

	/**
	 * @see EnableStatusEnum
	 */
	private Integer enableStatus;

	private Date createTime;
}
