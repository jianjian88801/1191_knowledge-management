package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhishixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhishixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhishixinxiView;


/**
 * 知识信息评论表
 *
 * @author 
 * @email 
 * @date 2021-05-16 21:27:26
 */
public interface DiscusszhishixinxiService extends IService<DiscusszhishixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhishixinxiVO> selectListVO(Wrapper<DiscusszhishixinxiEntity> wrapper);
   	
   	DiscusszhishixinxiVO selectVO(@Param("ew") Wrapper<DiscusszhishixinxiEntity> wrapper);
   	
   	List<DiscusszhishixinxiView> selectListView(Wrapper<DiscusszhishixinxiEntity> wrapper);
   	
   	DiscusszhishixinxiView selectView(@Param("ew") Wrapper<DiscusszhishixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhishixinxiEntity> wrapper);
   	
}

