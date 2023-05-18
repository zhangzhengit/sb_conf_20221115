package com.vo.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 *
 * @author zhangzhen
 * @date 2022年11月15日
 *
 */
public interface ConfRepository extends JpaRepository<ConfEntity, Integer> {

	List<ConfEntity> findByAppId(Integer appId);
}
