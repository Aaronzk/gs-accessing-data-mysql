package com.lakala.bigdata.rt.cdc.generator.entity;

import javax.persistence.*;
import java.time.Instant;

@Table(name = "mms_org_info", indexes = {
        @Index(name = "idx_is_branch_company", columnList = "is_branch_company"),
        @Index(name = "index_org_path", columnList = "org_path"),
        @Index(name = "idx_mms_org_parent_id", columnList = "org_parent_id")
})
@Entity
public class MmsOrgInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "org_id", nullable = false)
    private Integer id;

    @Column(name = "org_code", length = 20)
    private String orgCode;

    @Column(name = "org_name", nullable = false, length = 80)
    private String orgName;

    @Column(name = "org_path", length = 512)
    private String orgPath;

    @Column(name = "org_parent_id")
    private Integer orgParentId;

    @Column(name = "org_category", length = 50)
    private String orgCategory;

    @Column(name = "org_addr", length = 200)
    private String orgAddr;

    @Column(name = "org_zipcode", length = 10)
    private String orgZipcode;

    @Column(name = "org_tele", length = 20)
    private String orgTele;

    @Column(name = "org_fax", length = 20)
    private String orgFax;

    @Column(name = "org_email", length = 150)
    private String orgEmail;

    @Column(name = "is_agency")
    private Integer isAgency;

    @Column(name = "agency_type", length = 50)
    private String agencyType;

    @Column(name = "agency_development")
    private Integer agencyDevelopment;

    @Column(name = "agency_developer")
    private Integer agencyDeveloper;

    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "area_manager")
    private Integer areaManager;

    @Column(name = "org_type", length = 50)
    private String orgType;

    @Column(name = "profit_level")
    private Integer profitLevel;

    @Column(name = "max_type", length = 64)
    private String maxType;

    @Column(name = "min_type", length = 64)
    private String minType;

    @Column(name = "branch_company")
    private Integer branchCompany;

    @Column(name = "district", length = 64)
    private String district;

    @Column(name = "profit_model")
    private Integer profitModel;

    @Column(name = "account_name", length = 64)
    private String accountName;

    @Column(name = "account_no", length = 64)
    private String accountNo;

    @Column(name = "account_bank", length = 64)
    private String accountBank;

    @Column(name = "is_profit")
    private Integer isProfit;

    @Column(name = "is_one_agent")
    private Integer isOneAgent;

    @Column(name = "is_sync")
    private Integer isSync;

    @Column(name = "mpos_flag", length = 128)
    private String mposFlag;

    @Column(name = "branch_flag")
    private Integer branchFlag;

    @Column(name = "is_coorperation")
    private Integer isCoorperation;

    @Column(name = "is_tp")
    private Integer isTp;

    @Column(name = "is_no_card_partner")
    private Integer isNoCardPartner;

    @Column(name = "org_level")
    private Integer orgLevel;

    @Column(name = "account_bank_name", length = 100)
    private String accountBankName;

    @Column(name = "account_bank_head", length = 12)
    private String accountBankHead;

    @Column(name = "account_bank_head_name", length = 100)
    private String accountBankHeadName;

    @Column(name = "STATUS", length = 10)
    private String status;

    @Column(name = "CREATE_TM", nullable = false)
    private Instant createTm;

    @Column(name = "CREATE_USER")
    private Integer createUser;

    @Column(name = "LAST_MODIFY_TM", nullable = false)
    private Instant lastModifyTm;

    @Column(name = "LAST_MODIFY_USER")
    private Integer lastModifyUser;

    @Column(name = "VER")
    private Integer ver;

    @Column(name = "create_user_name", length = 64)
    private String createUserName;

    @Column(name = "modify_user_name", length = 64)
    private String modifyUserName;

    @Column(name = "agency_developer_name", length = 64)
    private String agencyDeveloperName;

    @Column(name = "area_manager_name", length = 64)
    private String areaManagerName;

    @Column(name = "branch_company_path", length = 512)
    private String branchCompanyPath;

    @Column(name = "is_branch_company")
    private Integer isBranchCompany;

    public Integer getIsBranchCompany() {
        return isBranchCompany;
    }

    public void setIsBranchCompany(Integer isBranchCompany) {
        this.isBranchCompany = isBranchCompany;
    }

    public String getBranchCompanyPath() {
        return branchCompanyPath;
    }

    public void setBranchCompanyPath(String branchCompanyPath) {
        this.branchCompanyPath = branchCompanyPath;
    }

    public String getAreaManagerName() {
        return areaManagerName;
    }

    public void setAreaManagerName(String areaManagerName) {
        this.areaManagerName = areaManagerName;
    }

    public String getAgencyDeveloperName() {
        return agencyDeveloperName;
    }

    public void setAgencyDeveloperName(String agencyDeveloperName) {
        this.agencyDeveloperName = agencyDeveloperName;
    }

    public String getModifyUserName() {
        return modifyUserName;
    }

    public void setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Integer getVer() {
        return ver;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
    }

    public Integer getLastModifyUser() {
        return lastModifyUser;
    }

    public void setLastModifyUser(Integer lastModifyUser) {
        this.lastModifyUser = lastModifyUser;
    }

    public Instant getLastModifyTm() {
        return lastModifyTm;
    }

    public void setLastModifyTm(Instant lastModifyTm) {
        this.lastModifyTm = lastModifyTm;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Instant getCreateTm() {
        return createTm;
    }

    public void setCreateTm(Instant createTm) {
        this.createTm = createTm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccountBankHeadName() {
        return accountBankHeadName;
    }

    public void setAccountBankHeadName(String accountBankHeadName) {
        this.accountBankHeadName = accountBankHeadName;
    }

    public String getAccountBankHead() {
        return accountBankHead;
    }

    public void setAccountBankHead(String accountBankHead) {
        this.accountBankHead = accountBankHead;
    }

    public String getAccountBankName() {
        return accountBankName;
    }

    public void setAccountBankName(String accountBankName) {
        this.accountBankName = accountBankName;
    }

    public Integer getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(Integer orgLevel) {
        this.orgLevel = orgLevel;
    }

    public Integer getIsNoCardPartner() {
        return isNoCardPartner;
    }

    public void setIsNoCardPartner(Integer isNoCardPartner) {
        this.isNoCardPartner = isNoCardPartner;
    }

    public Integer getIsTp() {
        return isTp;
    }

    public void setIsTp(Integer isTp) {
        this.isTp = isTp;
    }

    public Integer getIsCoorperation() {
        return isCoorperation;
    }

    public void setIsCoorperation(Integer isCoorperation) {
        this.isCoorperation = isCoorperation;
    }

    public Integer getBranchFlag() {
        return branchFlag;
    }

    public void setBranchFlag(Integer branchFlag) {
        this.branchFlag = branchFlag;
    }

    public String getMposFlag() {
        return mposFlag;
    }

    public void setMposFlag(String mposFlag) {
        this.mposFlag = mposFlag;
    }

    public Integer getIsSync() {
        return isSync;
    }

    public void setIsSync(Integer isSync) {
        this.isSync = isSync;
    }

    public Integer getIsOneAgent() {
        return isOneAgent;
    }

    public void setIsOneAgent(Integer isOneAgent) {
        this.isOneAgent = isOneAgent;
    }

    public Integer getIsProfit() {
        return isProfit;
    }

    public void setIsProfit(Integer isProfit) {
        this.isProfit = isProfit;
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getProfitModel() {
        return profitModel;
    }

    public void setProfitModel(Integer profitModel) {
        this.profitModel = profitModel;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getBranchCompany() {
        return branchCompany;
    }

    public void setBranchCompany(Integer branchCompany) {
        this.branchCompany = branchCompany;
    }

    public String getMinType() {
        return minType;
    }

    public void setMinType(String minType) {
        this.minType = minType;
    }

    public String getMaxType() {
        return maxType;
    }

    public void setMaxType(String maxType) {
        this.maxType = maxType;
    }

    public Integer getProfitLevel() {
        return profitLevel;
    }

    public void setProfitLevel(Integer profitLevel) {
        this.profitLevel = profitLevel;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public Integer getAreaManager() {
        return areaManager;
    }

    public void setAreaManager(Integer areaManager) {
        this.areaManager = areaManager;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getAgencyDeveloper() {
        return agencyDeveloper;
    }

    public void setAgencyDeveloper(Integer agencyDeveloper) {
        this.agencyDeveloper = agencyDeveloper;
    }

    public Integer getAgencyDevelopment() {
        return agencyDevelopment;
    }

    public void setAgencyDevelopment(Integer agencyDevelopment) {
        this.agencyDevelopment = agencyDevelopment;
    }

    public String getAgencyType() {
        return agencyType;
    }

    public void setAgencyType(String agencyType) {
        this.agencyType = agencyType;
    }

    public Integer getIsAgency() {
        return isAgency;
    }

    public void setIsAgency(Integer isAgency) {
        this.isAgency = isAgency;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public String getOrgFax() {
        return orgFax;
    }

    public void setOrgFax(String orgFax) {
        this.orgFax = orgFax;
    }

    public String getOrgTele() {
        return orgTele;
    }

    public void setOrgTele(String orgTele) {
        this.orgTele = orgTele;
    }

    public String getOrgZipcode() {
        return orgZipcode;
    }

    public void setOrgZipcode(String orgZipcode) {
        this.orgZipcode = orgZipcode;
    }

    public String getOrgAddr() {
        return orgAddr;
    }

    public void setOrgAddr(String orgAddr) {
        this.orgAddr = orgAddr;
    }

    public String getOrgCategory() {
        return orgCategory;
    }

    public void setOrgCategory(String orgCategory) {
        this.orgCategory = orgCategory;
    }

    public Integer getOrgParentId() {
        return orgParentId;
    }

    public void setOrgParentId(Integer orgParentId) {
        this.orgParentId = orgParentId;
    }

    public String getOrgPath() {
        return orgPath;
    }

    public void setOrgPath(String orgPath) {
        this.orgPath = orgPath;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}