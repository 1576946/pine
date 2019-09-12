package com.pine.controller;

import com.pine.bean.dto.BrandDO;
import com.pine.bean.dto.SpuDO;
import com.pine.bean.vo.SpuBean;
import com.pine.common.bean.bo.PageResultBean;
import com.pine.common.constant.ExceptionEnums;
import com.pine.common.exception.ZtlException;
import com.pine.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("spu")
public class GoodsController {


    @Autowired
    private GoodsService goodsService;
    /**
     * 新增商品
     * @param spu
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> saveGoods(@RequestBody SpuDO spu) {
        try {
            goodsService.saveGoods(spu);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("page")
    public ResponseEntity<PageResultBean<SpuBean>> querySpuByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows,
            @RequestParam(value = "saleable", defaultValue = "false") Boolean saleable,
            @RequestParam(value = "key", required = false) String key){
        PageResultBean<SpuBean> result = goodsService.querySpuByPage(page,rows,saleable,key);
        if (result == null || result.getItems().size() == 0) {
            throw new ZtlException(ExceptionEnums.CATEGORY_NOT_FOND);
        }
        return ResponseEntity.ok(result);
    }


}
