package com.example.entity;

import java.math.BigDecimal;
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
@TableName("t_cust")
public class Cust implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    private String userId;

    private String custNo;

    /**
     * 客户总监
     */
    private String empKhzj;

    /**
     * 客户名称
     */
    private String empKhzjName;

    /**
     * 首席大客户经理
     */
    private String empSx;

    /**
     * 首席大客户名
     */
    private String empSxName;

    /**
     * 主办大客户
     */
    private String empZb;

    /**
     * 主办大客户经理名
     */
    private String empZbName;

    /**
     * 落地服务团队
     */
    private String empTeam;

    /**
     * 落地服务团队名
     */
    private String empTeamName;

    /**
     * 客户类型 枚举值：1集团大客户、2分公司大客户
     */
    private String custType;

    /**
     * 客户姓名
     */
    private String custName;

    /**
     * 社会信用代码
     */
    private String scocialCreditCode;

    /**
     * 企业性质
     */
    private String enterpriseNature;

    /**
     * 主营业务
     */
    private String mainBusiness;

    /**
     * 总部城市:省code
     */
    private String provinceCode;

    /**
     * 总部城市：省名称
     */
    private String provinceName;

    /**
     * 总部城市：城市code
     */
    private String cityCode;

    /**
     * 总部城市：城市name
     */
    private String cityName;

    /**
     * 总部城市：区县code
     */
    private String quCode;

    /**
     * 总部城市：区县名称
     */
    private String quName;

    /**
     * 资产规模(亿元)
     */
    private String assetScale1;

    /**
     * 资产规模(亿元)
     */
    private String assetScale2;

    /**
     * 营业收入(元)
     */
    private String businessIncome;

    /**
     * 营业利润(元)
     */
    private String businessProfit;

    /**
     * 车险保险费(万元)
     */
    private String vehicleInsurancePremium;

    /**
     * 非车险保费(万元)
     */
    private String norVehicleInsurancePremium;

    /**
     * 子公司数量
     */
    private String subcompanyNumber;

    /**
     * 主要子公司
     */
    private String mainSubcompany;

    /**
     * 上年度财富500强排名
     */
    private String fortuneRanking;

    /**
     * 员工人数
     */
    private String employeeNumber;

    /**
     * 既有合作情况
     */
    private String existingCooperation;

    /**
     * 未来合作方向
     */
    private String futureCooperation;

    /**
     * 战略资源投入情况
     */
    private String strategicResources;

    /**
     * 主要领导1
     */
    private String mainLeader1;

    /**
     * 主要领导2
     */
    private String mainLeader2;

    /**
     * 主要领导3
     */
    private String mainLeader3;

    /**
     * 子公司明细表-单位名称
     */
    private String subcompanyUnitName;

    /**
     * 客户类型：1政府2金融3企业
     */
    private String level;

    /**
     * 子公司主营业务
     */
    private String subcompanyMainBusiness;

    /**
     * 一揽子金融保险服务方案(附件上传)
     */
    private String insuranceCase;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 删除表示1：有效 0：无效
     */
    private String deleteFlg;

    /**
     * 列入战略客户年份
     */
    private String custYear;

    /**
     * 寿险保费（万元）
     */
    private String lifeInsurancePremium;

    /**
     * 上年度GDP增长率
     */
    private String gdpGrowthLastYear;

    /**
     * 上年度GDP总量
     */
    private String totalGdpPreviousYear;

    /**
     * 总人口
     */
    private String totalPopulation;

    /**
     * 总面积
     */
    private String totalArea;

    /**
     * 行政区县情况
     */
    private String situationDistrictCounty;

    /**
     * 客户层级
     */
    private String levelNew;

    /**
     * 客户机构号
     */
    private String custNameRegNo;

    /**
     * 统一社会信用代码
     */
    private String scocialCreditCodeNew;

    /**
     * 上年度保费（寿险）
     */
    private BigDecimal lastYearPremiumSx;

    /**
     * 上年度保费（产险）
     */
    private BigDecimal lastYearPremiumCx;

    /**
     * 本年度保费（寿险）
     */
    private BigDecimal thisYearPremiumSx;

    /**
     * 本年度保费（产险）
     */
    private BigDecimal thisYearPremiumCx;

    /**
     * 备注
     */
    private String remark;

    /**
     * 客户简称
     */
    private String custShortname;

    /**
     * 区域
     */
    private String area;

    /**
     * 导出开关：0打开，1关闭
     */
    private Integer exportFlag;

    /**
     * 是否签订战略合作协议
     */
    private String isSign;

    /**
     * 战略合作协议有效期
     */
    private String signDate;


}
