package com.vo.api.client;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vo.entity.CR;
import com.vo.service.AppResultDTO;
import com.vo.service.AppService;

/**
 *
 * 给client使用的http接口，用于client拉取配置信息
 *
 * @author zhangzhen
 * @date 2022年11月15日
 *
 */
@RestController
public class API {

	@Autowired
	private AppService appService;

	@GetMapping(value = "/app")
	public CR<AppResultDTO> index(
				@RequestParam
				@NotNull(message = "appId不能为空")
				@Min(value = 1, message = "appId不能小于1") final Integer appId) {

		System.out.println(
				java.time.LocalDateTime.now() + "\t" + Thread.currentThread().getName() + "\t" + "API.index()");

		final AppResultDTO resultDTO = this.appService.findById(appId);

		return CR.ok(resultDTO);
	}

}
