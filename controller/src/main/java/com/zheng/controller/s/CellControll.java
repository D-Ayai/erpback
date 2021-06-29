package com.zheng.controller.s;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zheng.pojo.s.Cell;
import com.zheng.service.s.CellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("cell")
public class CellControll {
    @Autowired
    CellService cellService;
    @RequestMapping("page.action")
    public IPage<Cell> cellIPage(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                 @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                 Cell cell){
        QueryWrapper<Cell> queryWrapper = new QueryWrapper<>();

        if(!StringUtils.isEmpty(cell.getCheckTag())){
            queryWrapper.like("CHECK_TAG",cell.getCheckTag());
        }

        //一级
        if (!StringUtils.isEmpty(cell.getFirstKindId()) &&  !"undefined".equals(cell.getFirstKindId()) ){
            queryWrapper.like("FIRST_KIND_ID",cell.getFirstKindId());
        }
        //二级
        if (!StringUtils.isEmpty(cell.getSecondKindId()) && !"undefined".equals(cell.getSecondKindId()) ){
            queryWrapper.like("second_kind_id",cell.getSecondKindId());
        }
        //三级
        if (!StringUtils.isEmpty(cell.getThirdKindId()) && !"undefined".equals(cell.getThirdKindId())){
            queryWrapper.like("third_kind_id",cell.getThirdKindId());
        }
        if (!StringUtils.isEmpty(cell.getCheckTime()) && !"undefined".equals(cell.getCheckTime())){
            queryWrapper.le("CHECK_TIME",cell.getCheckTime());
        }
        if (!StringUtils.isEmpty(cell.getRegisterTime()) && !"undefined".equals(cell.getRegisterTime())){
            queryWrapper.ge("REGISTER_TIME",cell.getRegisterTime());
        }
        if (!StringUtils.isEmpty(cell.getProductName()) && !"undefined".equals(cell.getProductName())){
            queryWrapper.like("PRODUCT_NAME",cell.getProductName());
        }

        return  cellService.page(new Page<Cell>(pageno,pagesize),queryWrapper);
    }
    @RequestMapping("byid.action")
    public Cell cellbyid(Integer id){
        return cellService.getById(id);
    }
    @RequestMapping("add.action")
    public Boolean add(Cell cell){
        return cellService.save(cell);
    }
    @RequestMapping("update.action")
    public Boolean update(Cell cell){
        return cellService.updateById(cell);
    }
}
