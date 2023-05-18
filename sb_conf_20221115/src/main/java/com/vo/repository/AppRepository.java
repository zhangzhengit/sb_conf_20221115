package com.vo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vo.entity.AppEntity;
import com.vo.entity.ConfEntity;

/**
 *
 *
 * @author zhangzhen
 * @date 2022年11月15日
 *
 */
public interface AppRepository extends JpaRepository<AppEntity, Integer> {

}
