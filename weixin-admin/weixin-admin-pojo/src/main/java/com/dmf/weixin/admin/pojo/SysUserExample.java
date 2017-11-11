package com.dmf.weixin.admin.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("LOGIN_NAME like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginPassIsNull() {
            addCriterion("LOGIN_PASS is null");
            return (Criteria) this;
        }

        public Criteria andLoginPassIsNotNull() {
            addCriterion("LOGIN_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPassEqualTo(String value) {
            addCriterion("LOGIN_PASS =", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassNotEqualTo(String value) {
            addCriterion("LOGIN_PASS <>", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassGreaterThan(String value) {
            addCriterion("LOGIN_PASS >", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_PASS >=", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassLessThan(String value) {
            addCriterion("LOGIN_PASS <", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_PASS <=", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassLike(String value) {
            addCriterion("LOGIN_PASS like", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassNotLike(String value) {
            addCriterion("LOGIN_PASS not like", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassIn(List<String> values) {
            addCriterion("LOGIN_PASS in", values, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassNotIn(List<String> values) {
            addCriterion("LOGIN_PASS not in", values, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassBetween(String value1, String value2) {
            addCriterion("LOGIN_PASS between", value1, value2, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassNotBetween(String value1, String value2) {
            addCriterion("LOGIN_PASS not between", value1, value2, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("LOGIN_IP is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("LOGIN_IP is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("LOGIN_IP =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("LOGIN_IP <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("LOGIN_IP >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_IP >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("LOGIN_IP <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_IP <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("LOGIN_IP like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("LOGIN_IP not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("LOGIN_IP in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("LOGIN_IP not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("LOGIN_IP between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("LOGIN_IP not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("MOBILEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("MOBILEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("MOBILEPHONE =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("MOBILEPHONE <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("MOBILEPHONE >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILEPHONE >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("MOBILEPHONE <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILEPHONE <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("MOBILEPHONE like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("MOBILEPHONE not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("MOBILEPHONE in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("MOBILEPHONE not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("MOBILEPHONE between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("MOBILEPHONE not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("IS_DEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("IS_DEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Integer value) {
            addCriterion("IS_DEFAULT =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Integer value) {
            addCriterion("IS_DEFAULT <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Integer value) {
            addCriterion("IS_DEFAULT >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_DEFAULT >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Integer value) {
            addCriterion("IS_DEFAULT <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Integer value) {
            addCriterion("IS_DEFAULT <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Integer> values) {
            addCriterion("IS_DEFAULT in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Integer> values) {
            addCriterion("IS_DEFAULT not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Integer value1, Integer value2) {
            addCriterion("IS_DEFAULT between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_DEFAULT not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andOperateSerialIsNull() {
            addCriterion("OPERATE_SERIAL is null");
            return (Criteria) this;
        }

        public Criteria andOperateSerialIsNotNull() {
            addCriterion("OPERATE_SERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andOperateSerialEqualTo(String value) {
            addCriterion("OPERATE_SERIAL =", value, "operateSerial");
            return (Criteria) this;
        }

        public Criteria andOperateSerialNotEqualTo(String value) {
            addCriterion("OPERATE_SERIAL <>", value, "operateSerial");
            return (Criteria) this;
        }

        public Criteria andOperateSerialGreaterThan(String value) {
            addCriterion("OPERATE_SERIAL >", value, "operateSerial");
            return (Criteria) this;
        }

        public Criteria andOperateSerialGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_SERIAL >=", value, "operateSerial");
            return (Criteria) this;
        }

        public Criteria andOperateSerialLessThan(String value) {
            addCriterion("OPERATE_SERIAL <", value, "operateSerial");
            return (Criteria) this;
        }

        public Criteria andOperateSerialLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_SERIAL <=", value, "operateSerial");
            return (Criteria) this;
        }

        public Criteria andOperateSerialLike(String value) {
            addCriterion("OPERATE_SERIAL like", value, "operateSerial");
            return (Criteria) this;
        }

        public Criteria andOperateSerialNotLike(String value) {
            addCriterion("OPERATE_SERIAL not like", value, "operateSerial");
            return (Criteria) this;
        }

        public Criteria andOperateSerialIn(List<String> values) {
            addCriterion("OPERATE_SERIAL in", values, "operateSerial");
            return (Criteria) this;
        }

        public Criteria andOperateSerialNotIn(List<String> values) {
            addCriterion("OPERATE_SERIAL not in", values, "operateSerial");
            return (Criteria) this;
        }

        public Criteria andOperateSerialBetween(String value1, String value2) {
            addCriterion("OPERATE_SERIAL between", value1, value2, "operateSerial");
            return (Criteria) this;
        }

        public Criteria andOperateSerialNotBetween(String value1, String value2) {
            addCriterion("OPERATE_SERIAL not between", value1, value2, "operateSerial");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNull() {
            addCriterion("LAST_LOGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNotNull() {
            addCriterion("LAST_LOGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateEqualTo(Date value) {
            addCriterion("LAST_LOGIN_DATE =", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotEqualTo(Date value) {
            addCriterion("LAST_LOGIN_DATE <>", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThan(Date value) {
            addCriterion("LAST_LOGIN_DATE >", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN_DATE >=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThan(Date value) {
            addCriterion("LAST_LOGIN_DATE <", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN_DATE <=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIn(List<Date> values) {
            addCriterion("LAST_LOGIN_DATE in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotIn(List<Date> values) {
            addCriterion("LAST_LOGIN_DATE not in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN_DATE between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN_DATE not between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andCredentialsSaltIsNull() {
            addCriterion("CREDENTIALS_SALT is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsSaltIsNotNull() {
            addCriterion("CREDENTIALS_SALT is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsSaltEqualTo(String value) {
            addCriterion("CREDENTIALS_SALT =", value, "credentialsSalt");
            return (Criteria) this;
        }

        public Criteria andCredentialsSaltNotEqualTo(String value) {
            addCriterion("CREDENTIALS_SALT <>", value, "credentialsSalt");
            return (Criteria) this;
        }

        public Criteria andCredentialsSaltGreaterThan(String value) {
            addCriterion("CREDENTIALS_SALT >", value, "credentialsSalt");
            return (Criteria) this;
        }

        public Criteria andCredentialsSaltGreaterThanOrEqualTo(String value) {
            addCriterion("CREDENTIALS_SALT >=", value, "credentialsSalt");
            return (Criteria) this;
        }

        public Criteria andCredentialsSaltLessThan(String value) {
            addCriterion("CREDENTIALS_SALT <", value, "credentialsSalt");
            return (Criteria) this;
        }

        public Criteria andCredentialsSaltLessThanOrEqualTo(String value) {
            addCriterion("CREDENTIALS_SALT <=", value, "credentialsSalt");
            return (Criteria) this;
        }

        public Criteria andCredentialsSaltLike(String value) {
            addCriterion("CREDENTIALS_SALT like", value, "credentialsSalt");
            return (Criteria) this;
        }

        public Criteria andCredentialsSaltNotLike(String value) {
            addCriterion("CREDENTIALS_SALT not like", value, "credentialsSalt");
            return (Criteria) this;
        }

        public Criteria andCredentialsSaltIn(List<String> values) {
            addCriterion("CREDENTIALS_SALT in", values, "credentialsSalt");
            return (Criteria) this;
        }

        public Criteria andCredentialsSaltNotIn(List<String> values) {
            addCriterion("CREDENTIALS_SALT not in", values, "credentialsSalt");
            return (Criteria) this;
        }

        public Criteria andCredentialsSaltBetween(String value1, String value2) {
            addCriterion("CREDENTIALS_SALT between", value1, value2, "credentialsSalt");
            return (Criteria) this;
        }

        public Criteria andCredentialsSaltNotBetween(String value1, String value2) {
            addCriterion("CREDENTIALS_SALT not between", value1, value2, "credentialsSalt");
            return (Criteria) this;
        }

        public Criteria andAccountSidIsNull() {
            addCriterion("ACCOUNT_SID is null");
            return (Criteria) this;
        }

        public Criteria andAccountSidIsNotNull() {
            addCriterion("ACCOUNT_SID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountSidEqualTo(String value) {
            addCriterion("ACCOUNT_SID =", value, "accountSid");
            return (Criteria) this;
        }

        public Criteria andAccountSidNotEqualTo(String value) {
            addCriterion("ACCOUNT_SID <>", value, "accountSid");
            return (Criteria) this;
        }

        public Criteria andAccountSidGreaterThan(String value) {
            addCriterion("ACCOUNT_SID >", value, "accountSid");
            return (Criteria) this;
        }

        public Criteria andAccountSidGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_SID >=", value, "accountSid");
            return (Criteria) this;
        }

        public Criteria andAccountSidLessThan(String value) {
            addCriterion("ACCOUNT_SID <", value, "accountSid");
            return (Criteria) this;
        }

        public Criteria andAccountSidLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_SID <=", value, "accountSid");
            return (Criteria) this;
        }

        public Criteria andAccountSidLike(String value) {
            addCriterion("ACCOUNT_SID like", value, "accountSid");
            return (Criteria) this;
        }

        public Criteria andAccountSidNotLike(String value) {
            addCriterion("ACCOUNT_SID not like", value, "accountSid");
            return (Criteria) this;
        }

        public Criteria andAccountSidIn(List<String> values) {
            addCriterion("ACCOUNT_SID in", values, "accountSid");
            return (Criteria) this;
        }

        public Criteria andAccountSidNotIn(List<String> values) {
            addCriterion("ACCOUNT_SID not in", values, "accountSid");
            return (Criteria) this;
        }

        public Criteria andAccountSidBetween(String value1, String value2) {
            addCriterion("ACCOUNT_SID between", value1, value2, "accountSid");
            return (Criteria) this;
        }

        public Criteria andAccountSidNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_SID not between", value1, value2, "accountSid");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("TOKEN =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("TOKEN <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("TOKEN >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("TOKEN <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("TOKEN <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("TOKEN like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("TOKEN not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("TOKEN in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("TOKEN not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("TOKEN between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("TOKEN not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andImageCodeIsNull() {
            addCriterion("IMAGE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andImageCodeIsNotNull() {
            addCriterion("IMAGE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andImageCodeEqualTo(String value) {
            addCriterion("IMAGE_CODE =", value, "imageCode");
            return (Criteria) this;
        }

        public Criteria andImageCodeNotEqualTo(String value) {
            addCriterion("IMAGE_CODE <>", value, "imageCode");
            return (Criteria) this;
        }

        public Criteria andImageCodeGreaterThan(String value) {
            addCriterion("IMAGE_CODE >", value, "imageCode");
            return (Criteria) this;
        }

        public Criteria andImageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_CODE >=", value, "imageCode");
            return (Criteria) this;
        }

        public Criteria andImageCodeLessThan(String value) {
            addCriterion("IMAGE_CODE <", value, "imageCode");
            return (Criteria) this;
        }

        public Criteria andImageCodeLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_CODE <=", value, "imageCode");
            return (Criteria) this;
        }

        public Criteria andImageCodeLike(String value) {
            addCriterion("IMAGE_CODE like", value, "imageCode");
            return (Criteria) this;
        }

        public Criteria andImageCodeNotLike(String value) {
            addCriterion("IMAGE_CODE not like", value, "imageCode");
            return (Criteria) this;
        }

        public Criteria andImageCodeIn(List<String> values) {
            addCriterion("IMAGE_CODE in", values, "imageCode");
            return (Criteria) this;
        }

        public Criteria andImageCodeNotIn(List<String> values) {
            addCriterion("IMAGE_CODE not in", values, "imageCode");
            return (Criteria) this;
        }

        public Criteria andImageCodeBetween(String value1, String value2) {
            addCriterion("IMAGE_CODE between", value1, value2, "imageCode");
            return (Criteria) this;
        }

        public Criteria andImageCodeNotBetween(String value1, String value2) {
            addCriterion("IMAGE_CODE not between", value1, value2, "imageCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIsNull() {
            addCriterion("SMS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIsNotNull() {
            addCriterion("SMS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSmsCodeEqualTo(String value) {
            addCriterion("SMS_CODE =", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeNotEqualTo(String value) {
            addCriterion("SMS_CODE <>", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeGreaterThan(String value) {
            addCriterion("SMS_CODE >", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_CODE >=", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeLessThan(String value) {
            addCriterion("SMS_CODE <", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeLessThanOrEqualTo(String value) {
            addCriterion("SMS_CODE <=", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeLike(String value) {
            addCriterion("SMS_CODE like", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeNotLike(String value) {
            addCriterion("SMS_CODE not like", value, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeIn(List<String> values) {
            addCriterion("SMS_CODE in", values, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeNotIn(List<String> values) {
            addCriterion("SMS_CODE not in", values, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeBetween(String value1, String value2) {
            addCriterion("SMS_CODE between", value1, value2, "smsCode");
            return (Criteria) this;
        }

        public Criteria andSmsCodeNotBetween(String value1, String value2) {
            addCriterion("SMS_CODE not between", value1, value2, "smsCode");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andAuthStatusIsNull() {
            addCriterion("AUTH_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuthStatusIsNotNull() {
            addCriterion("AUTH_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuthStatusEqualTo(Integer value) {
            addCriterion("AUTH_STATUS =", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusNotEqualTo(Integer value) {
            addCriterion("AUTH_STATUS <>", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusGreaterThan(Integer value) {
            addCriterion("AUTH_STATUS >", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUTH_STATUS >=", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusLessThan(Integer value) {
            addCriterion("AUTH_STATUS <", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusLessThanOrEqualTo(Integer value) {
            addCriterion("AUTH_STATUS <=", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusIn(List<Integer> values) {
            addCriterion("AUTH_STATUS in", values, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusNotIn(List<Integer> values) {
            addCriterion("AUTH_STATUS not in", values, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusBetween(Integer value1, Integer value2) {
            addCriterion("AUTH_STATUS between", value1, value2, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("AUTH_STATUS not between", value1, value2, "authStatus");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("BALANCE =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("BALANCE <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("BALANCE >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("BALANCE <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("BALANCE in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("BALANCE not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andMtPriceIsNull() {
            addCriterion("MT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andMtPriceIsNotNull() {
            addCriterion("MT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMtPriceEqualTo(BigDecimal value) {
            addCriterion("MT_PRICE =", value, "mtPrice");
            return (Criteria) this;
        }

        public Criteria andMtPriceNotEqualTo(BigDecimal value) {
            addCriterion("MT_PRICE <>", value, "mtPrice");
            return (Criteria) this;
        }

        public Criteria andMtPriceGreaterThan(BigDecimal value) {
            addCriterion("MT_PRICE >", value, "mtPrice");
            return (Criteria) this;
        }

        public Criteria andMtPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MT_PRICE >=", value, "mtPrice");
            return (Criteria) this;
        }

        public Criteria andMtPriceLessThan(BigDecimal value) {
            addCriterion("MT_PRICE <", value, "mtPrice");
            return (Criteria) this;
        }

        public Criteria andMtPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MT_PRICE <=", value, "mtPrice");
            return (Criteria) this;
        }

        public Criteria andMtPriceIn(List<BigDecimal> values) {
            addCriterion("MT_PRICE in", values, "mtPrice");
            return (Criteria) this;
        }

        public Criteria andMtPriceNotIn(List<BigDecimal> values) {
            addCriterion("MT_PRICE not in", values, "mtPrice");
            return (Criteria) this;
        }

        public Criteria andMtPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MT_PRICE between", value1, value2, "mtPrice");
            return (Criteria) this;
        }

        public Criteria andMtPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MT_PRICE not between", value1, value2, "mtPrice");
            return (Criteria) this;
        }

        public Criteria andMoPriceIsNull() {
            addCriterion("MO_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andMoPriceIsNotNull() {
            addCriterion("MO_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMoPriceEqualTo(BigDecimal value) {
            addCriterion("MO_PRICE =", value, "moPrice");
            return (Criteria) this;
        }

        public Criteria andMoPriceNotEqualTo(BigDecimal value) {
            addCriterion("MO_PRICE <>", value, "moPrice");
            return (Criteria) this;
        }

        public Criteria andMoPriceGreaterThan(BigDecimal value) {
            addCriterion("MO_PRICE >", value, "moPrice");
            return (Criteria) this;
        }

        public Criteria andMoPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MO_PRICE >=", value, "moPrice");
            return (Criteria) this;
        }

        public Criteria andMoPriceLessThan(BigDecimal value) {
            addCriterion("MO_PRICE <", value, "moPrice");
            return (Criteria) this;
        }

        public Criteria andMoPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MO_PRICE <=", value, "moPrice");
            return (Criteria) this;
        }

        public Criteria andMoPriceIn(List<BigDecimal> values) {
            addCriterion("MO_PRICE in", values, "moPrice");
            return (Criteria) this;
        }

        public Criteria andMoPriceNotIn(List<BigDecimal> values) {
            addCriterion("MO_PRICE not in", values, "moPrice");
            return (Criteria) this;
        }

        public Criteria andMoPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MO_PRICE between", value1, value2, "moPrice");
            return (Criteria) this;
        }

        public Criteria andMoPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MO_PRICE not between", value1, value2, "moPrice");
            return (Criteria) this;
        }

        public Criteria andTradeIsNull() {
            addCriterion("TRADE is null");
            return (Criteria) this;
        }

        public Criteria andTradeIsNotNull() {
            addCriterion("TRADE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeEqualTo(Integer value) {
            addCriterion("TRADE =", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotEqualTo(Integer value) {
            addCriterion("TRADE <>", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThan(Integer value) {
            addCriterion("TRADE >", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRADE >=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThan(Integer value) {
            addCriterion("TRADE <", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThanOrEqualTo(Integer value) {
            addCriterion("TRADE <=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeIn(List<Integer> values) {
            addCriterion("TRADE in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotIn(List<Integer> values) {
            addCriterion("TRADE not in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeBetween(Integer value1, Integer value2) {
            addCriterion("TRADE between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotBetween(Integer value1, Integer value2) {
            addCriterion("TRADE not between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("LOCATION =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("LOCATION <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("LOCATION >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("LOCATION <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("LOCATION <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("LOCATION like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("LOCATION not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("LOCATION in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("LOCATION not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("LOCATION between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("LOCATION not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("BUSINESS_LICENSE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("BUSINESS_LICENSE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("BUSINESS_LICENSE >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("BUSINESS_LICENSE <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("BUSINESS_LICENSE like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("BUSINESS_LICENSE not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andUnifiedCreditIdIsNull() {
            addCriterion("UNIFIED_CREDIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnifiedCreditIdIsNotNull() {
            addCriterion("UNIFIED_CREDIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnifiedCreditIdEqualTo(String value) {
            addCriterion("UNIFIED_CREDIT_ID =", value, "unifiedCreditId");
            return (Criteria) this;
        }

        public Criteria andUnifiedCreditIdNotEqualTo(String value) {
            addCriterion("UNIFIED_CREDIT_ID <>", value, "unifiedCreditId");
            return (Criteria) this;
        }

        public Criteria andUnifiedCreditIdGreaterThan(String value) {
            addCriterion("UNIFIED_CREDIT_ID >", value, "unifiedCreditId");
            return (Criteria) this;
        }

        public Criteria andUnifiedCreditIdGreaterThanOrEqualTo(String value) {
            addCriterion("UNIFIED_CREDIT_ID >=", value, "unifiedCreditId");
            return (Criteria) this;
        }

        public Criteria andUnifiedCreditIdLessThan(String value) {
            addCriterion("UNIFIED_CREDIT_ID <", value, "unifiedCreditId");
            return (Criteria) this;
        }

        public Criteria andUnifiedCreditIdLessThanOrEqualTo(String value) {
            addCriterion("UNIFIED_CREDIT_ID <=", value, "unifiedCreditId");
            return (Criteria) this;
        }

        public Criteria andUnifiedCreditIdLike(String value) {
            addCriterion("UNIFIED_CREDIT_ID like", value, "unifiedCreditId");
            return (Criteria) this;
        }

        public Criteria andUnifiedCreditIdNotLike(String value) {
            addCriterion("UNIFIED_CREDIT_ID not like", value, "unifiedCreditId");
            return (Criteria) this;
        }

        public Criteria andUnifiedCreditIdIn(List<String> values) {
            addCriterion("UNIFIED_CREDIT_ID in", values, "unifiedCreditId");
            return (Criteria) this;
        }

        public Criteria andUnifiedCreditIdNotIn(List<String> values) {
            addCriterion("UNIFIED_CREDIT_ID not in", values, "unifiedCreditId");
            return (Criteria) this;
        }

        public Criteria andUnifiedCreditIdBetween(String value1, String value2) {
            addCriterion("UNIFIED_CREDIT_ID between", value1, value2, "unifiedCreditId");
            return (Criteria) this;
        }

        public Criteria andUnifiedCreditIdNotBetween(String value1, String value2) {
            addCriterion("UNIFIED_CREDIT_ID not between", value1, value2, "unifiedCreditId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}