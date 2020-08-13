package com.mall.shopweb.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "demo_po")
public class DemoPo {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


}
