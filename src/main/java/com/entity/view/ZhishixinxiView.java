package com.entity.view;

import com.entity.ZhishixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 知识信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 21:27:25
 */
@TableName("zhishixinxi")
public class ZhishixinxiView  extends ZhishixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhishixinxiView(){
	}
 
 	public ZhishixinxiView(ZhishixinxiEntity zhishixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhishixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
