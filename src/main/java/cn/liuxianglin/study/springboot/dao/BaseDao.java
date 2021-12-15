package cn.liuxianglin.study.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 基础dao层所有的dao都要继承此类
 * </p>
 *
 * @author LiuXiangLin
 * @date 2021/12/14 10:49
 * @since 1.0
 */
public interface BaseDao<T> extends BaseMapper<T> {
	
}
