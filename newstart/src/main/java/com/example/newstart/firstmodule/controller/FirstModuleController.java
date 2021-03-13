package com.example.newstart.firstmodule.controller;


import com.example.newstart.firstmodule.entity.FirstModuleInfo;
import com.example.newstart.firstmodule.service.FirstModuleService;
import com.example.newstart.util.AppResponse;
import com.example.newstart.util.RandomUtil;
import com.example.newstart.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program
 * @Description
 * @Author 百未央
 * @create 2021-02-02 20:26
 *
 **/

@RestController
@RequestMapping("/firstmodule")
public class FirstModuleController {
    public static final Logger logger =
            LoggerFactory.getLogger(FirstModuleController.class);

    @Resource
    private FirstModuleService firstModuleService;

    /**
     * 新增商品信息
     * @param
     * @author 百未央
     * @return
     * @date 2021/2/3 9:44
     */
   @RequestMapping(value = "addMessage")
   public AppResponse addMessage(FirstModuleInfo firstModuleInfo){
       try {
           AppResponse appResponse = firstModuleService.addMessage(firstModuleInfo);
           return appResponse;
       }catch (Exception e){
          logger.error("商品新增失败",e);
           System.out.println(e.toString());
           throw e;
       }
   }

   /**
    * 修改商品信息
    * @param 
    * @author 百未央
    * @return 
    * @date 2021/2/4 11:07
    */
   @PostMapping("updateGoods")
    public AppResponse updateGoods(FirstModuleInfo firstModuleInfo){
       try {

           return firstModuleService.updateGoods(firstModuleInfo);
       }catch (Exception e){
           logger.error("修改商品信息失败",e);
           System.out.println(e.toString());
           throw e;
       }
   }

   /**
    * 查询商品信息
    * @param
    * @author 百未央
    * @return
    * @date 2021/2/4 15:04
    */
   @RequestMapping(value = "listGoods")
    public AppResponse listGoods(FirstModuleInfo firstModuleInfo){
       try {
           return firstModuleService.listGoods(firstModuleInfo);
       }catch (Exception e){
           logger.error("查询商品列表异常",e);
           System.out.println(e.toString());
           throw  e;
       }
   }

   /**
    * 删除商品信息
    * @param
    * @author 百未央
    * @return
    * @date 2021/2/4 19:48
    */
    @PostMapping("deleteGoods")
    public AppResponse deleteGoods(String id){
        try {
         return firstModuleService.deleteGoods(id);
        }catch (Exception e){
            logger.error("删除商品错误",e);
            System.out.println(e.toString());
            throw e;
        }
    }


}
