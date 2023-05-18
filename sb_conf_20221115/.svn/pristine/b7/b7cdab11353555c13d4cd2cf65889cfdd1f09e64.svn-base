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
@Entity(name = "app")
public class AppEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String secretKey;

	/**
	 * @see EnableStatusEnum
	 */
	private Integer enableStatus;

	private Date createTime;
}
