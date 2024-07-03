package com.entity.view;

import com.entity.DiscusszhishixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 知识信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 21:27:26
 */
@TableName("discusszhishixinxi")
public class DiscusszhishixinxiView  extends DiscusszhishixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhishixinxiView(){
	}
 
 	public DiscusszhishixinxiView(DiscusszhishixinxiEntity discusszhishixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhishixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
