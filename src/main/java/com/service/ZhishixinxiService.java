package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhishixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhishixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhishixinxiView;


/**
 * 知识信息
 *
 * @author 
 * @email 
 * @date 2021-05-16 21:27:25
 */
public interface ZhishixinxiService extends IService<ZhishixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhishixinxiVO> selectListVO(Wrapper<ZhishixinxiEntity> wrapper);
   	
   	ZhishixinxiVO selectVO(@Param("ew") Wrapper<ZhishixinxiEntity> wrapper);
   	
   	List<ZhishixinxiView> selectListView(Wrapper<ZhishixinxiEntity> wrapper);
   	
   	ZhishixinxiView selectView(@Param("ew") Wrapper<ZhishixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhishixinxiEntity> wrapper);
   	
}

