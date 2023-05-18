package com.vo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 *
 * @author zhangzhen
 * @date 2022年11月15日
 *
 */
@Getter
@AllArgsConstructor
public enum EnableStatusEnum {


	QI_YONG(1),

	TING_YONG(2),
	;

	private Integer status;

}
