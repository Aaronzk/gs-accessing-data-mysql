package com.lakala.bigdata.rt.cdc.generator.entity;

import java.time.Instant;

/**
 * @author aaron
 * @Description TODO
 * @createTime 2021-11-30 14:04:00
 */
public class MmsOrgInfoBuilder {

    public static MmsOrgInfo newOrg(String orgCode, Integer orgParentId) {
        MmsOrgInfo mmsOrgInfo = new MmsOrgInfo();
        mmsOrgInfo.setAccountBank("招商银行");
        mmsOrgInfo.setAccountBankHead("北京");
        mmsOrgInfo.setAccountBankHeadName("北京市");
        mmsOrgInfo.setAccountNo("123456789012345678");
        mmsOrgInfo.setAccountName("小黄人银行股份有限公司");
        mmsOrgInfo.setAgencyDeveloper(100);
        mmsOrgInfo.setAgencyDeveloperName("超人");
        mmsOrgInfo.setAgencyDevelopment(1);
        mmsOrgInfo.setAgencyType("二哈");
        mmsOrgInfo.setAreaManager(1000);
        mmsOrgInfo.setAreaManagerName("边牧");
        mmsOrgInfo.setBranchCompany(10000);
        mmsOrgInfo.setBranchCompanyPath("幸福大街");
        mmsOrgInfo.setBranchFlag(0);
        mmsOrgInfo.setCreateUser(100000);
        mmsOrgInfo.setCreateUserName("葫芦娃");
        mmsOrgInfo.setDistrict("13区");
        mmsOrgInfo.setEmployeeId(9);
        mmsOrgInfo.setIsAgency(1);
        mmsOrgInfo.setIsBranchCompany(1);
        mmsOrgInfo.setIsCoorperation(1);
        mmsOrgInfo.setIsNoCardPartner(1);
        mmsOrgInfo.setIsOneAgent(1);
        mmsOrgInfo.setIsProfit(1);
        mmsOrgInfo.setIsSync(1);
        mmsOrgInfo.setIsTp(1);
        mmsOrgInfo.setLastModifyUser(99);
        mmsOrgInfo.setMaxType("1");
        mmsOrgInfo.setMinType("0");
        mmsOrgInfo.setModifyUserName("贝塔");
        mmsOrgInfo.setMposFlag("90");
        mmsOrgInfo.setOrgAddr("北京市西城区五道口镇建设路100号");
        mmsOrgInfo.setOrgCategory("商户");
        mmsOrgInfo.setOrgCode(orgCode);
        mmsOrgInfo.setOrgEmail("springboot@xichengxiongdi.com");
        mmsOrgInfo.setOrgFax("010-9093832");
        mmsOrgInfo.setOrgLevel(10);
        mmsOrgInfo.setOrgName("西城小弟建设有限责任公司");
        mmsOrgInfo.setOrgParentId(orgParentId);
        mmsOrgInfo.setOrgPath(orgParentId + "," + orgCode);
        mmsOrgInfo.setOrgTele("01009039847");
        mmsOrgInfo.setOrgType("122");
        mmsOrgInfo.setOrgZipcode("100000");
        mmsOrgInfo.setProfitLevel(1);
        mmsOrgInfo.setProfitModel(100);
        mmsOrgInfo.setStatus("00");
        mmsOrgInfo.setVer(10);

        mmsOrgInfo.setCreateTm(Instant.now());
        mmsOrgInfo.setLastModifyTm(Instant.now());
        return mmsOrgInfo;
    }

}
