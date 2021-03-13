package com.example.newstart.firstmodule.service;

import com.example.newstart.firstmodule.dao.FirstModuleDao;
import com.example.newstart.firstmodule.entity.FirstModuleInfo;
import com.example.newstart.util.AppResponse;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 百未央
 * @program
 * @description
 * @date 2021-02-03 16:53
 **/
@Service
public class FirstModuleService {

    //映射资源
    @Resource
    private FirstModuleDao firstModuleDao;

    /**
     * 新增信息
     * @param
     * @author 百未央
     * @return
     * @date 2021/2/3 17:11
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addMessage(FirstModuleInfo firstModuleInfo){
        int count = firstModuleDao.addMessage(firstModuleInfo);
        if(count == 0){
            return AppResponse.bizError("新增失败，请重试!");
        }
        return AppResponse.success("新增成功");
    }

    /**
     * 修改商品信息
     * @param
     * @author 百未央
     * @return
     * @date 2021/2/4 10:37
     */
     @Transactional(rollbackFor = Exception.class)
    public AppResponse updateGoods (FirstModuleInfo firstModuleInfo){
         int count = firstModuleDao.updateGoods(firstModuleInfo);
         if(count == 0){
             return AppResponse.success("数据有变化，请刷新！");
         }
         AppResponse appResponse = AppResponse.success("修改成功!");
         return appResponse;
     }


     /**
      * 查询商品信息
      * @param
      * @author 百未央
      * @return
      * @date 2021/2/4 14:31
      */
     @RequestMapping(value = "listGood")
    public AppResponse listGoods(FirstModuleInfo firstModuleInfo){
         PageHelper.startPage(firstModuleInfo.getPageNum(),firstModuleInfo.getPageSize());
         List<FirstModuleInfo> firstModuleInfoList = firstModuleDao.listGoods(firstModuleInfo);
         PageInfo<FirstModuleInfo> pageData = new PageInfo<FirstModuleInfo>(firstModuleInfoList);
         AppResponse appResponse = AppResponse.success("查询成功!",pageData);
         return appResponse;
     }

     /**
      * 删除商品信息
      * @param
      * @author 百未央
      * @return
      * @date 2021/2/4 19:34
      */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteGoods(String id){
        List<String> listCode = Arrays.asList(id.split(","));
        if(id == null){
            return AppResponse.bizError("商品编号不能为空！！！");
        }
        int count = firstModuleDao.deleteGoods(listCode);
        if(count == 0){
            return AppResponse.bizError("删除失败，请重试!");
        }
        AppResponse appResponse = AppResponse.success("删除成功! ");
        return  appResponse;
    }




}
