package com.dao;

import com.entity.ZhishifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhishifenleiVO;
import com.entity.view.ZhishifenleiView;


/**
 * 知识分类
 * 
 * @author 
 * @email 
 * @date 2021-05-16 21:27:25
 */
public interface ZhishifenleiDao extends BaseMapper<ZhishifenleiEntity> {
	
	List<ZhishifenleiVO> selectListVO(@Param("ew") Wrapper<ZhishifenleiEntity> wrapper);
	
	ZhishifenleiVO selectVO(@Param("ew") Wrapper<ZhishifenleiEntity> wrapper);
	
	List<ZhishifenleiView> selectListView(@Param("ew") Wrapper<ZhishifenleiEntity> wrapper);

	List<ZhishifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhishifenleiEntity> wrapper);
	
	ZhishifenleiView selectView(@Param("ew") Wrapper<ZhishifenleiEntity> wrapper);
	
}
