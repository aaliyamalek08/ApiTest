package org.acme;


//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.List;

@RegisterForReflection
//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class MockRecord {
    //GetCustomerRecord
    private int rimNo;
    private int rowVersion;
    private String rimType;
    private int classCode;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String preferredName;
    private String tin;
    private String motherMaidenName;
    private String birthDt;
    private String rimStatus;
    private String sex;
    private int branchNo;
    private int restrictId;
    private int rimLanguageId;
    private String branchName;
    private int rsmId;
    private String rsmName;
    private String phone1;
    private String phone1Ext;
    private String phone2;
    private String phone2Ext;
    private String phone3;
    private String phone3Ext;
    private String faxPhone;
    private String faxPhoneExt;
    private String addrLine1;
    private String addrLine2;
    private String addrLine3;
    private String city;
    private String state;
    private String postalCode;
    private String countryCode;
    private String province;
    private String territory;
    private String republic;
    private String town;
    private String district;
    private String region;
    private String country;
    private String emailAddr1;
    private String emailAddr2;

    //GetAccountsRecord

    private List<MockGetAccountsRecordResponse> record;

    //DpAccountEnquiry
    private float curBal;
    private String depositStatus;
    private float availBal;
    private float availLocBal;
    private float curBalBegin;
    private float lastDepAmt;
    private String lastDepDt;
    private float lastWdrlAmt;
    private String lastWdrlDt;
    private float origAmt;
    private String issueDt;
    private String matDt;
    private String ibaCr;
    private String nsfItemsPending;
    private String passbook;
    private float pBBalance;
    private float pBCredits;
    private float pBDebits;
    private String pBLastLine;
    private String pBDiscrepancyDate;
    private String iSOCurrency;
    private String trm;
    private String period;
    private float memoNet;
    private float acctAvail;
    private float ucfAmt;
    private float currentRateTier;
    private float intYtd;
    private float intPdLstYr;
    private float holdBal;
    private int noSignatures;
    private String acctDesc;
    private String title1;
    private String title2;
    private String ClassDescription;
    private float memoFloat;
    private float interestFloat;

    //Hold
    private int holdId;
    private int ptid;
    private String authCode;
    private String errorMessage;

    //transactional posting
    private String tranAmt;
    private String isoCrncy;
    private String tranExchRate;
    private String lOCBal;
    private String exchRate1;
    private String sysExchRate1;
    private String exchRateType1;
    private String pkgAdjustment1;
    private String rimAdjustment1;
    private String treasuryRate1;
    private String treasuryRateType1;
    private String exchRate2;
    private String sysExchRate2;
    private String exchRateType2;
    private String pkgAdjustment2;
    private String rimAdjustment2;
    private String treasuryRate2;
    private String treasuryRateType2;
    private String localEquivalentAmt;
    private String uSDEquivalentAmt;
    private String expTaxAmt;
    private String expTaxLocalEquivAmt;
    private String expTaxUSDEquivAmt;
    private String postedWarning;

    public int getRimNo() {
        return rimNo;
    }

    public void setRimNo(int rimNo) {
        this.rimNo = rimNo;
    }

    public int getRowVersion() {
        return rowVersion;
    }

    public void setRowVersion(int rowVersion) {
        this.rowVersion = rowVersion;
    }

    public String getRimType() {
        return rimType;
    }

    public void setRimType(String rimType) {
        this.rimType = rimType;
    }

    public int getClassCode() {
        return classCode;
    }

    public void setClassCode(int classCode) {
        this.classCode = classCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getMotherMaidenName() {
        return motherMaidenName;
    }

    public void setMotherMaidenName(String motherMaidenName) {
        this.motherMaidenName = motherMaidenName;
    }

    public String getBirthDt() {
        return birthDt;
    }

    public void setBirthDt(String birthDt) {
        this.birthDt = birthDt;
    }

    public String getRimStatus() {
        return rimStatus;
    }

    public void setRimStatus(String rimStatus) {
        this.rimStatus = rimStatus;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(int branchNo) {
        this.branchNo = branchNo;
    }

    public int getRestrictId() {
        return restrictId;
    }

    public void setRestrictId(int restrictId) {
        this.restrictId = restrictId;
    }

    public int getRimLanguageId() {
        return rimLanguageId;
    }

    public void setRimLanguageId(int rimLanguageId) {
        this.rimLanguageId = rimLanguageId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getRsmId() {
        return rsmId;
    }

    public void setRsmId(int rsmId) {
        this.rsmId = rsmId;
    }

    public String getRsmName() {
        return rsmName;
    }

    public void setRsmName(String rsmName) {
        this.rsmName = rsmName;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone1Ext() {
        return phone1Ext;
    }

    public void setPhone1Ext(String phone1Ext) {
        this.phone1Ext = phone1Ext;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone2Ext() {
        return phone2Ext;
    }

    public void setPhone2Ext(String phone2Ext) {
        this.phone2Ext = phone2Ext;
    }

    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    public String getPhone3Ext() {
        return phone3Ext;
    }

    public void setPhone3Ext(String phone3Ext) {
        this.phone3Ext = phone3Ext;
    }

    public String getFaxPhone() {
        return faxPhone;
    }

    public void setFaxPhone(String faxPhone) {
        this.faxPhone = faxPhone;
    }

    public String getFaxPhoneExt() {
        return faxPhoneExt;
    }

    public void setFaxPhoneExt(String faxPhoneExt) {
        this.faxPhoneExt = faxPhoneExt;
    }

    public String getAddrLine1() {
        return addrLine1;
    }

    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public String getAddrLine2() {
        return addrLine2;
    }

    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public String getAddrLine3() {
        return addrLine3;
    }

    public void setAddrLine3(String addrLine3) {
        this.addrLine3 = addrLine3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getRepublic() {
        return republic;
    }

    public void setRepublic(String republic) {
        this.republic = republic;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmailAddr1() {
        return emailAddr1;
    }

    public void setEmailAddr1(String emailAddr1) {
        this.emailAddr1 = emailAddr1;
    }

    public String getEmailAddr2() {
        return emailAddr2;
    }

    public void setEmailAddr2(String emailAddr2) {
        this.emailAddr2 = emailAddr2;
    }

    public List<MockGetAccountsRecordResponse> getRecord() {
        return record;
    }

    public void setRecord(List<MockGetAccountsRecordResponse> record) {
        this.record = record;
    }

    public float getCurBal() {
        return curBal;
    }

    public void setCurBal(float curBal) {
        this.curBal = curBal;
    }

    public String getDepositStatus() {
        return depositStatus;
    }

    public void setDepositStatus(String depositStatus) {
        this.depositStatus = depositStatus;
    }

    public float getAvailBal() {
        return availBal;
    }

    public void setAvailBal(float availBal) {
        this.availBal = availBal;
    }

    public float getAvailLocBal() {
        return availLocBal;
    }

    public void setAvailLocBal(float availLocBal) {
        this.availLocBal = availLocBal;
    }

    public float getCurBalBegin() {
        return curBalBegin;
    }

    public void setCurBalBegin(float curBalBegin) {
        this.curBalBegin = curBalBegin;
    }

    public float getLastDepAmt() {
        return lastDepAmt;
    }

    public void setLastDepAmt(float lastDepAmt) {
        this.lastDepAmt = lastDepAmt;
    }

    public String getLastDepDt() {
        return lastDepDt;
    }

    public void setLastDepDt(String lastDepDt) {
        this.lastDepDt = lastDepDt;
    }

    public float getLastWdrlAmt() {
        return lastWdrlAmt;
    }

    public void setLastWdrlAmt(float lastWdrlAmt) {
        this.lastWdrlAmt = lastWdrlAmt;
    }

    public String getLastWdrlDt() {
        return lastWdrlDt;
    }

    public void setLastWdrlDt(String lastWdrlDt) {
        this.lastWdrlDt = lastWdrlDt;
    }

    public float getOrigAmt() {
        return origAmt;
    }

    public void setOrigAmt(float origAmt) {
        this.origAmt = origAmt;
    }

    public String getIssueDt() {
        return issueDt;
    }

    public void setIssueDt(String issueDt) {
        this.issueDt = issueDt;
    }

    public String getMatDt() {
        return matDt;
    }

    public void setMatDt(String matDt) {
        this.matDt = matDt;
    }

    public String getIbaCr() {
        return ibaCr;
    }

    public void setIbaCr(String ibaCr) {
        this.ibaCr = ibaCr;
    }

    public String getNsfItemsPending() {
        return nsfItemsPending;
    }

    public void setNsfItemsPending(String nsfItemsPending) {
        this.nsfItemsPending = nsfItemsPending;
    }

    public String getPassbook() {
        return passbook;
    }

    public void setPassbook(String passbook) {
        this.passbook = passbook;
    }

    public float getpBBalance() {
        return pBBalance;
    }

    public void setpBBalance(float pBBalance) {
        this.pBBalance = pBBalance;
    }

    public float getpBCredits() {
        return pBCredits;
    }

    public void setpBCredits(float pBCredits) {
        this.pBCredits = pBCredits;
    }

    public float getpBDebits() {
        return pBDebits;
    }

    public void setpBDebits(float pBDebits) {
        this.pBDebits = pBDebits;
    }

    public String getpBLastLine() {
        return pBLastLine;
    }

    public void setpBLastLine(String pBLastLine) {
        this.pBLastLine = pBLastLine;
    }

    public String getpBDiscrepancyDate() {
        return pBDiscrepancyDate;
    }

    public void setpBDiscrepancyDate(String pBDiscrepancyDate) {
        this.pBDiscrepancyDate = pBDiscrepancyDate;
    }

    public String getiSOCurrency() {
        return iSOCurrency;
    }

    public void setiSOCurrency(String iSOCurrency) {
        this.iSOCurrency = iSOCurrency;
    }

    public String getTrm() {
        return trm;
    }

    public void setTrm(String trm) {
        this.trm = trm;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public float getMemoNet() {
        return memoNet;
    }

    public void setMemoNet(float memoNet) {
        this.memoNet = memoNet;
    }

    public float getAcctAvail() {
        return acctAvail;
    }

    public void setAcctAvail(float acctAvail) {
        this.acctAvail = acctAvail;
    }

    public float getUcfAmt() {
        return ucfAmt;
    }

    public void setUcfAmt(float ucfAmt) {
        this.ucfAmt = ucfAmt;
    }

    public float getCurrentRateTier() {
        return currentRateTier;
    }

    public void setCurrentRateTier(float currentRateTier) {
        this.currentRateTier = currentRateTier;
    }

    public float getIntYtd() {
        return intYtd;
    }

    public void setIntYtd(float intYtd) {
        this.intYtd = intYtd;
    }

    public float getIntPdLstYr() {
        return intPdLstYr;
    }

    public void setIntPdLstYr(float intPdLstYr) {
        this.intPdLstYr = intPdLstYr;
    }

    public float getHoldBal() {
        return holdBal;
    }

    public void setHoldBal(float holdBal) {
        this.holdBal = holdBal;
    }

    public int getNoSignatures() {
        return noSignatures;
    }

    public void setNoSignatures(int noSignatures) {
        this.noSignatures = noSignatures;
    }

    public String getAcctDesc() {
        return acctDesc;
    }

    public void setAcctDesc(String acctDesc) {
        this.acctDesc = acctDesc;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getClassDescription() {
        return ClassDescription;
    }

    public void setClassDescription(String classDescription) {
        ClassDescription = classDescription;
    }

    public float getMemoFloat() {
        return memoFloat;
    }

    public void setMemoFloat(float memoFloat) {
        this.memoFloat = memoFloat;
    }

    public float getInterestFloat() {
        return interestFloat;
    }

    public void setInterestFloat(float interestFloat) {
        this.interestFloat = interestFloat;
    }

    public int getHoldId() {
        return holdId;
    }

    public void setHoldId(int holdId) {
        this.holdId = holdId;
    }

    public int getPtid() {
        return ptid;
    }

    public void setPtid(int ptid) {
        this.ptid = ptid;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(String tranAmt) {
        this.tranAmt = tranAmt;
    }

    public String getIsoCrncy() {
        return isoCrncy;
    }

    public void setIsoCrncy(String isoCrncy) {
        this.isoCrncy = isoCrncy;
    }

    public String getTranExchRate() {
        return tranExchRate;
    }

    public void setTranExchRate(String tranExchRate) {
        this.tranExchRate = tranExchRate;
    }

    public String getlOCBal() {
        return lOCBal;
    }

    public void setlOCBal(String lOCBal) {
        this.lOCBal = lOCBal;
    }

    public String getExchRate1() {
        return exchRate1;
    }

    public void setExchRate1(String exchRate1) {
        this.exchRate1 = exchRate1;
    }

    public String getSysExchRate1() {
        return sysExchRate1;
    }

    public void setSysExchRate1(String sysExchRate1) {
        this.sysExchRate1 = sysExchRate1;
    }

    public String getExchRateType1() {
        return exchRateType1;
    }

    public void setExchRateType1(String exchRateType1) {
        this.exchRateType1 = exchRateType1;
    }

    public String getPkgAdjustment1() {
        return pkgAdjustment1;
    }

    public void setPkgAdjustment1(String pkgAdjustment1) {
        this.pkgAdjustment1 = pkgAdjustment1;
    }

    public String getRimAdjustment1() {
        return rimAdjustment1;
    }

    public void setRimAdjustment1(String rimAdjustment1) {
        this.rimAdjustment1 = rimAdjustment1;
    }

    public String getTreasuryRate1() {
        return treasuryRate1;
    }

    public void setTreasuryRate1(String treasuryRate1) {
        this.treasuryRate1 = treasuryRate1;
    }

    public String getTreasuryRateType1() {
        return treasuryRateType1;
    }

    public void setTreasuryRateType1(String treasuryRateType1) {
        this.treasuryRateType1 = treasuryRateType1;
    }

    public String getExchRate2() {
        return exchRate2;
    }

    public void setExchRate2(String exchRate2) {
        this.exchRate2 = exchRate2;
    }

    public String getSysExchRate2() {
        return sysExchRate2;
    }

    public void setSysExchRate2(String sysExchRate2) {
        this.sysExchRate2 = sysExchRate2;
    }

    public String getExchRateType2() {
        return exchRateType2;
    }

    public void setExchRateType2(String exchRateType2) {
        this.exchRateType2 = exchRateType2;
    }

    public String getPkgAdjustment2() {
        return pkgAdjustment2;
    }

    public void setPkgAdjustment2(String pkgAdjustment2) {
        this.pkgAdjustment2 = pkgAdjustment2;
    }

    public String getRimAdjustment2() {
        return rimAdjustment2;
    }

    public void setRimAdjustment2(String rimAdjustment2) {
        this.rimAdjustment2 = rimAdjustment2;
    }

    public String getTreasuryRate2() {
        return treasuryRate2;
    }

    public void setTreasuryRate2(String treasuryRate2) {
        this.treasuryRate2 = treasuryRate2;
    }

    public String getTreasuryRateType2() {
        return treasuryRateType2;
    }

    public void setTreasuryRateType2(String treasuryRateType2) {
        this.treasuryRateType2 = treasuryRateType2;
    }

    public String getLocalEquivalentAmt() {
        return localEquivalentAmt;
    }

    public void setLocalEquivalentAmt(String localEquivalentAmt) {
        this.localEquivalentAmt = localEquivalentAmt;
    }

    public String getuSDEquivalentAmt() {
        return uSDEquivalentAmt;
    }

    public void setuSDEquivalentAmt(String uSDEquivalentAmt) {
        this.uSDEquivalentAmt = uSDEquivalentAmt;
    }

    public String getExpTaxAmt() {
        return expTaxAmt;
    }

    public void setExpTaxAmt(String expTaxAmt) {
        this.expTaxAmt = expTaxAmt;
    }

    public String getExpTaxLocalEquivAmt() {
        return expTaxLocalEquivAmt;
    }

    public void setExpTaxLocalEquivAmt(String expTaxLocalEquivAmt) {
        this.expTaxLocalEquivAmt = expTaxLocalEquivAmt;
    }

    public String getExpTaxUSDEquivAmt() {
        return expTaxUSDEquivAmt;
    }

    public void setExpTaxUSDEquivAmt(String expTaxUSDEquivAmt) {
        this.expTaxUSDEquivAmt = expTaxUSDEquivAmt;
    }

    public String getPostedWarning() {
        return postedWarning;
    }

    public void setPostedWarning(String postedWarning) {
        this.postedWarning = postedWarning;
    }

    @Override
    public String toString() {
        return "Record{" +
                "rimNo=" + rimNo +
                ", rowVersion=" + rowVersion +
                ", rimType='" + rimType + '\'' +
                ", classCode=" + classCode +
                ", firstName='" + firstName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", lastName='" + lastName + '\'' +
                ", preferredName='" + preferredName + '\'' +
                ", tin='" + tin + '\'' +
                ", motherMaidenName='" + motherMaidenName + '\'' +
                ", birthDt='" + birthDt + '\'' +
                ", rimStatus='" + rimStatus + '\'' +
                ", sex='" + sex + '\'' +
                ", branchNo=" + branchNo +
                ", restrictId=" + restrictId +
                ", rimLanguageId=" + rimLanguageId +
                ", branchName='" + branchName + '\'' +
                ", rsmId=" + rsmId +
                ", rsmName='" + rsmName + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone1Ext='" + phone1Ext + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", phone2Ext='" + phone2Ext + '\'' +
                ", phone3='" + phone3 + '\'' +
                ", phone3Ext='" + phone3Ext + '\'' +
                ", faxPhone='" + faxPhone + '\'' +
                ", faxPhoneExt='" + faxPhoneExt + '\'' +
                ", addrLine1='" + addrLine1 + '\'' +
                ", addrLine2='" + addrLine2 + '\'' +
                ", addrLine3='" + addrLine3 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", province='" + province + '\'' +
                ", territory='" + territory + '\'' +
                ", republic='" + republic + '\'' +
                ", town='" + town + '\'' +
                ", district='" + district + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", emailAddr1='" + emailAddr1 + '\'' +
                ", emailAddr2='" + emailAddr2 + '\'' +
                ", record=" + record +
                ", curBal=" + curBal +
                ", depositStatus='" + depositStatus + '\'' +
                ", availBal=" + availBal +
                ", availLocBal=" + availLocBal +
                ", curBalBegin=" + curBalBegin +
                ", lastDepAmt=" + lastDepAmt +
                ", lastDepDt='" + lastDepDt + '\'' +
                ", lastWdrlAmt=" + lastWdrlAmt +
                ", lastWdrlDt='" + lastWdrlDt + '\'' +
                ", origAmt=" + origAmt +
                ", issueDt='" + issueDt + '\'' +
                ", matDt='" + matDt + '\'' +
                ", ibaCr='" + ibaCr + '\'' +
                ", nsfItemsPending='" + nsfItemsPending + '\'' +
                ", passbook='" + passbook + '\'' +
                ", pBBalance=" + pBBalance +
                ", pBCredits=" + pBCredits +
                ", pBDebits=" + pBDebits +
                ", pBLastLine='" + pBLastLine + '\'' +
                ", pBDiscrepancyDate='" + pBDiscrepancyDate + '\'' +
                ", iSOCurrency='" + iSOCurrency + '\'' +
                ", trm='" + trm + '\'' +
                ", period='" + period + '\'' +
                ", memoNet=" + memoNet +
                ", acctAvail=" + acctAvail +
                ", ucfAmt=" + ucfAmt +
                ", currentRateTier=" + currentRateTier +
                ", intYtd=" + intYtd +
                ", intPdLstYr=" + intPdLstYr +
                ", holdBal=" + holdBal +
                ", noSignatures=" + noSignatures +
                ", acctDesc='" + acctDesc + '\'' +
                ", title1='" + title1 + '\'' +
                ", title2='" + title2 + '\'' +
                ", ClassDescription='" + ClassDescription + '\'' +
                ", memoFloat=" + memoFloat +
                ", interestFloat=" + interestFloat +
                ", holdId=" + holdId +
                ", ptid=" + ptid +
                ", authCode='" + authCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", tranAmt='" + tranAmt + '\'' +
                ", isoCrncy='" + isoCrncy + '\'' +
                ", tranExchRate='" + tranExchRate + '\'' +
                ", lOCBal='" + lOCBal + '\'' +
                ", exchRate1='" + exchRate1 + '\'' +
                ", sysExchRate1='" + sysExchRate1 + '\'' +
                ", exchRateType1='" + exchRateType1 + '\'' +
                ", pkgAdjustment1='" + pkgAdjustment1 + '\'' +
                ", rimAdjustment1='" + rimAdjustment1 + '\'' +
                ", treasuryRate1='" + treasuryRate1 + '\'' +
                ", treasuryRateType1='" + treasuryRateType1 + '\'' +
                ", exchRate2='" + exchRate2 + '\'' +
                ", sysExchRate2='" + sysExchRate2 + '\'' +
                ", exchRateType2='" + exchRateType2 + '\'' +
                ", pkgAdjustment2='" + pkgAdjustment2 + '\'' +
                ", rimAdjustment2='" + rimAdjustment2 + '\'' +
                ", treasuryRate2='" + treasuryRate2 + '\'' +
                ", treasuryRateType2='" + treasuryRateType2 + '\'' +
                ", localEquivalentAmt='" + localEquivalentAmt + '\'' +
                ", uSDEquivalentAmt='" + uSDEquivalentAmt + '\'' +
                ", expTaxAmt='" + expTaxAmt + '\'' +
                ", expTaxLocalEquivAmt='" + expTaxLocalEquivAmt + '\'' +
                ", expTaxUSDEquivAmt='" + expTaxUSDEquivAmt + '\'' +
                ", postedWarning='" + postedWarning + '\'' +
                '}';
    }
}
