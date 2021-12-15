package cn.liuxianglin.study.springboot.service.impl;

import cn.liuxianglin.study.springboot.dao.BaseDao;
import cn.liuxianglin.study.springboot.service.BaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *
 * </p>
 *
 * @author LiuXiangLin
 * @date 2021/12/14 10:51
 * @since 1.0
 */
public abstract class BaseServiceImpl<D extends BaseDao<T>, T> extends ServiceImpl<D, T> implements BaseService<T> {
    @Autowired
    protected D baseDao;
}
