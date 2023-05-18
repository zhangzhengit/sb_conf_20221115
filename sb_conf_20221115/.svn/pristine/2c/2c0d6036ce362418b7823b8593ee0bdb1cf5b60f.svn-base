package com.vo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vo.entity.AppEntity;
import com.vo.entity.ConfEntity;
import com.vo.entity.ConfRepository;
import com.vo.repository.AppRepository;

import cn.hutool.core.bean.BeanUtil;

/**
 *
 *
 * @author zhangzhen
 * @date 2022年11月15日
 *
 */
@Service
public class AppService {

	@Autowired
	private ConfRepository confRepository;
	@Autowired
	private AppRepository appRepository;

	public AppResultDTO findById(final Integer id) {
		final Optional<AppEntity> o = this.appRepository.findById(id);
		if (!o.isPresent()) {
			return null;
		}

		final AppEntity appEntity = o.get();

		final List<ConfEntity> cList = this.confRepository.findByAppId(appEntity.getId());

		final AppResultDTO resultDTO = new AppResultDTO();
		BeanUtil.copyProperties(appEntity, resultDTO);
		resultDTO.setConfList(cList);

		return resultDTO;
	}

}
