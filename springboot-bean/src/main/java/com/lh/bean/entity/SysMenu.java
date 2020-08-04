package com.lh.bean.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "com-lh-bean-entity-SysMenu")
@Data
public class SysMenu implements Serializable {
    /**
     * ID主键
     */
    @ApiModelProperty(value = "ID主键")
    private Long id;

    /**
     * 父ID
     */
    @ApiModelProperty(value = "父ID")
    private Long pid;

    /**
     * 菜单名称
     */
    @ApiModelProperty(value = "菜单名称")
    private String menuName;

    /**
     * 菜单顺序
     */
    @ApiModelProperty(value = "菜单顺序")
    private Integer order;

    /**
     * 权限标识
     */
    @ApiModelProperty(value = "权限标识")
    private String perms;

    /**
     * 菜单URL
     */
    @ApiModelProperty(value = "菜单URL")
    private String url;

    /**
     * 菜单状态（0隐藏 1显示）
     */
    @ApiModelProperty(value = "菜单状态（0隐藏 1显示）")
    private Integer visible;

    /**
     * 菜单类型（0目录 1菜单 2按钮）
     */
    @ApiModelProperty(value = "菜单类型（0目录 1菜单 2按钮）")
    private Integer menuType;

    /**
     * 图标地址
     */
    @ApiModelProperty(value = "图标地址")
    private String icon;

    /**
     * 菜单描述
     */
    @ApiModelProperty(value = "菜单描述")
    private String description;

    /**
     * 创建人
     */
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建人")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 修改人
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "修改人")
    private String updateBy;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
