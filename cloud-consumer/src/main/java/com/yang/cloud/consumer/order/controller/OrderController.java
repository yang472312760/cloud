package com.yang.cloud.consumer.order.controller;

import com.yang.cloud.base.annotation.SystemLog;
import com.yang.cloud.base.model.system.CommonResult;
import com.yang.cloud.base.model.system.Page;
import com.yang.cloud.base.model.system.PageParam;
import com.yang.cloud.consumer.order.feign.ProviderServiceClient;
import com.yang.cloud.consumer.order.model.Order;
import com.yang.cloud.consumer.order.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/order/order")
@Api(value = "/order/order", description = "角色接口")
public class OrderController {

    /**
     * <p>
     * Description: 角色服务
     * </p>
     */
    @Autowired
    private OrderService orderService;

    @Autowired
    private ProviderServiceClient providerServiceClient;

    /**
     * <p>
     * Description: 分页查询
     * </p>
     *
     * @param paging 分页信息
     * @param order   查询条件
     * @return Result 分页数据
     */
    @ApiOperation(value = "分页查询角色", notes = "分页查询角色")
    @GetMapping("/page")
    @SystemLog(logContent = "查询成功")
    public CommonResult<Page<Order>> page(PageParam paging, Order order) {
        List<Order> list = this.orderService.queryPage(paging, order);
        Page<Order> page = new Page<Order>(list);
        return new CommonResult<>().setSuccess(page);
    }

    /**
     * <p>
     * Description: 新增角色
     * </p>
     *
     * @param order 插入角色属性
     * @return Result 是否成功
     */
    @ApiOperation(value = "新增角色接口", notes = "新增角色接口")
    @PostMapping()
    public Boolean insert(@RequestBody Order order) {
        Boolean isOk = this.orderService.save(order);
        return isOk;
    }

    /**
     * <p>
     * Description: 修改角色
     * </p>
     *
     * @param order 要修改的角色，必须包含id
     * @return Result 修改是否成功
     */
    @ApiOperation(value = "修改角色接口", notes = "修改角色接口")
    @PutMapping()
    public Boolean update(@RequestBody Order order) {
        Boolean isOk = this.orderService.updateById(order);
        return isOk;
    }

    /**
     * <p>
     * Description: 删除角色
     * </p>
     *
     * @param id id 根据id删除角色
     * @return Result 是否删除成功
     */
    @ApiOperation(value = "删除角色接口", notes = "删除角色接口")
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("id") Integer id) {
        Boolean isOk = this.orderService.removeById(id);
        return isOk;
    }

    /**
     * <p>
     * Description: 根据ID获取角色接口
     * </p>
     *
     * @param id 用户ID
     * @return Result 角色信息
     */
    @ApiOperation(value = "根据ID获取角色接口", notes = "根据ID获取角色接口")
    @ApiImplicitParam(name = "id", value = "角色信息id", required = true, dataType = "Int", paramType = "path")
    @GetMapping("/{id}")
    public Order getRoleById(@PathVariable Integer id) {
        Order order = this.orderService.getById(id);
        return order;
    }

    @GetMapping("/role/page")
    public CommonResult getRole(){
        return providerServiceClient.getList();
    }


}
