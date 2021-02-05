package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author pankaiqiang
 * @since 2021-02-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_Businessinfo")
public class Businessinfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 单位名称
     */
    private String companyName;

    /**
     * 客户号
     */
    private String custNo;

    /**
     * 客户名称
     */
    private String custName;

    /**
     * 首席大客户经理
     */
    private String empSx;

    /**
     * 首席大客户经理名
     */
    private String empSxName;

    /**
     * 主办大客户经理
     */
    private String empZb;

    /**
     * 主办大客户经理名
     */
    private String empZbName;

    /**
     * 客户总监
     */
    private String empKhzj;

    /**
     * 客户总监名
     */
    private String empKhzjName;

    /**
     * 落地服务团队
     */
    private String empTeam;

    /**
     * 层级
     */
    private String companyLevel;

    /**
     * 社会信用代码
     */
    private String creditCode;

    /**
     * 产品服务大类type
     */
    private String pServerType;

    /**
     * 产品服务大类名
     */
    private String pServerName;

    /**
     * 所属年度
     */
    private String year;

    /**
     * 风险金额
     */
    private Double riskAmount;

    /**
     * 成交金额
     */
    private Double strikeAmount;

    /**
     * 我司收入
     */
    private Double takeInAmount;

    /**
     * 成交时间
     */
    private LocalDateTime strikeTime;

    /**
     * 业务归属子公司
     */
    private String businessZgsName;

    /**
     * 业务归属分公司
     */
    private String businessFgsName;

    /**
     * 业务落地机构或团队
     */
    private String businessOrgTeam;

    /**
     * 操作状态
     */
    private String status;

    /**
     * 显示操作名称
     */
    private String statusName;

    /**
     * 审核时间
     */
    private LocalDateTime examTime;

    /**
     * 备注信息
     */
    private String examInfo;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 更新时间
     */
    private LocalDateTime updateDate;

    /**
     * 客户类型
     */
    private String custLevel;

    /**
     * 账户余额
     */
    private String accountAlance;

    /**
     * 定期存款
     */
    private String timeDeposit;

    /**
     * 投资股票
     */
    private String invInStocks;

    /**
     * 投资金融债
     */
    private String invFinanceDebt;

    /**
     * 托管资产
     */
    private String assetUnderCustody;

    /**
     * 授信额度
     */
    private String lineOfCredit;


}
