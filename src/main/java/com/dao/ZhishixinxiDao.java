package com.dao;

import com.entity.ZhishixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhishixinxiVO;
import com.entity.view.ZhishixinxiView;


/**
 * 知识信息
 * 
 * @author 
 * @email 
 * @date 2021-05-16 21:27:25
 */
public interface ZhishixinxiDao extends BaseMapper<ZhishixinxiEntity> {
	
	List<ZhishixinxiVO> selectListVO(@Param("ew") Wrapper<ZhishixinxiEntity> wrapper);
	
	ZhishixinxiVO selectVO(@Param("ew") Wrapper<ZhishixinxiEntity> wrapper);
	
	List<ZhishixinxiView> selectListView(@Param("ew") Wrapper<ZhishixinxiEntity> wrapper);

	List<ZhishixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhishixinxiEntity> wrapper);
	
	ZhishixinxiView selectView(@Param("ew") Wrapper<ZhishixinxiEntity> wrapper);
	
}
