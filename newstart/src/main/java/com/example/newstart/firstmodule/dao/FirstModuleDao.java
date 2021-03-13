package com.example.newstart.firstmodule.dao;

import com.example.newstart.firstmodule.entity.FirstModuleInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Dao类
 * @param
 * @author 百未央
 * @return
 * @date 2021/2/3 17:14
 */


public interface FirstModuleDao {
    /**
     * 新增信息
     * @param
     * @author 百未央
     * @return
     * @date 2021/2/3 17:15
     */
   int addMessage(FirstModuleInfo firstModuleInfo);

   /**
    * 修改商品信息
    * @param
    * @author 百未央
    * @return
    * @date 2021/2/4 10:40
    */
   int updateGoods(FirstModuleInfo firstModuleInfo);

   /**
    * 查询商品信息
    * @param
    * @author 百未央
    * @return
    * @date 2021/2/4 14:28
    */
   List<FirstModuleInfo> listGoods(FirstModuleInfo firstModuleInfo);

   /**
    * 删除商品信息
    * @param
    * @author 百未央
    * @return
    * @date 2021/2/4 19:24
    */
   int deleteGoods(@Param("listCode") List<String> listCode);


}
