package com.vo.api.admin;

import java.util.List;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vo.entity.AppEntity;
import com.vo.repository.AppRepository;
import com.vo.service.AppService;

/**
 *
 *
 * @author zhangzhen
 * @date 2022年11月15日
 *
 */
@Controller
public class AdminAPI {

	@Autowired
	private AppRepository appRepository;
	@Autowired
	private AppService appService;

	@GetMapping
	public String index(final Model model) {
		System.out.println(
				java.time.LocalDateTime.now() + "\t" + Thread.currentThread().getName() + "\t" + "AdminAPI.index()");


		final List<AppEntity> appList = this.appRepository.findAll();

		model.addAttribute("appList", appList);

		return "index";
	}



}
