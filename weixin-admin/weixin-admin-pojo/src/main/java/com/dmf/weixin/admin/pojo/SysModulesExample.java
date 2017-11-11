package com.dmf.weixin.admin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysModulesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysModulesExample() {
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

        public Criteria andModuleFidIsNull() {
            addCriterion("MODULE_FID is null");
            return (Criteria) this;
        }

        public Criteria andModuleFidIsNotNull() {
            addCriterion("MODULE_FID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleFidEqualTo(Long value) {
            addCriterion("MODULE_FID =", value, "moduleFid");
            return (Criteria) this;
        }

        public Criteria andModuleFidNotEqualTo(Long value) {
            addCriterion("MODULE_FID <>", value, "moduleFid");
            return (Criteria) this;
        }

        public Criteria andModuleFidGreaterThan(Long value) {
            addCriterion("MODULE_FID >", value, "moduleFid");
            return (Criteria) this;
        }

        public Criteria andModuleFidGreaterThanOrEqualTo(Long value) {
            addCriterion("MODULE_FID >=", value, "moduleFid");
            return (Criteria) this;
        }

        public Criteria andModuleFidLessThan(Long value) {
            addCriterion("MODULE_FID <", value, "moduleFid");
            return (Criteria) this;
        }

        public Criteria andModuleFidLessThanOrEqualTo(Long value) {
            addCriterion("MODULE_FID <=", value, "moduleFid");
            return (Criteria) this;
        }

        public Criteria andModuleFidIn(List<Long> values) {
            addCriterion("MODULE_FID in", values, "moduleFid");
            return (Criteria) this;
        }

        public Criteria andModuleFidNotIn(List<Long> values) {
            addCriterion("MODULE_FID not in", values, "moduleFid");
            return (Criteria) this;
        }

        public Criteria andModuleFidBetween(Long value1, Long value2) {
            addCriterion("MODULE_FID between", value1, value2, "moduleFid");
            return (Criteria) this;
        }

        public Criteria andModuleFidNotBetween(Long value1, Long value2) {
            addCriterion("MODULE_FID not between", value1, value2, "moduleFid");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("MODULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("MODULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("MODULE_NAME =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("MODULE_NAME <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("MODULE_NAME >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_NAME >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("MODULE_NAME <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("MODULE_NAME <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("MODULE_NAME like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("MODULE_NAME not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("MODULE_NAME in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("MODULE_NAME not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("MODULE_NAME between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("MODULE_NAME not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleKeyIsNull() {
            addCriterion("MODULE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andModuleKeyIsNotNull() {
            addCriterion("MODULE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andModuleKeyEqualTo(String value) {
            addCriterion("MODULE_KEY =", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyNotEqualTo(String value) {
            addCriterion("MODULE_KEY <>", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyGreaterThan(String value) {
            addCriterion("MODULE_KEY >", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_KEY >=", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyLessThan(String value) {
            addCriterion("MODULE_KEY <", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyLessThanOrEqualTo(String value) {
            addCriterion("MODULE_KEY <=", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyLike(String value) {
            addCriterion("MODULE_KEY like", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyNotLike(String value) {
            addCriterion("MODULE_KEY not like", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyIn(List<String> values) {
            addCriterion("MODULE_KEY in", values, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyNotIn(List<String> values) {
            addCriterion("MODULE_KEY not in", values, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyBetween(String value1, String value2) {
            addCriterion("MODULE_KEY between", value1, value2, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyNotBetween(String value1, String value2) {
            addCriterion("MODULE_KEY not between", value1, value2, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleUrlIsNull() {
            addCriterion("MODULE_URL is null");
            return (Criteria) this;
        }

        public Criteria andModuleUrlIsNotNull() {
            addCriterion("MODULE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andModuleUrlEqualTo(String value) {
            addCriterion("MODULE_URL =", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotEqualTo(String value) {
            addCriterion("MODULE_URL <>", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlGreaterThan(String value) {
            addCriterion("MODULE_URL >", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_URL >=", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlLessThan(String value) {
            addCriterion("MODULE_URL <", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlLessThanOrEqualTo(String value) {
            addCriterion("MODULE_URL <=", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlLike(String value) {
            addCriterion("MODULE_URL like", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotLike(String value) {
            addCriterion("MODULE_URL not like", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlIn(List<String> values) {
            addCriterion("MODULE_URL in", values, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotIn(List<String> values) {
            addCriterion("MODULE_URL not in", values, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlBetween(String value1, String value2) {
            addCriterion("MODULE_URL between", value1, value2, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotBetween(String value1, String value2) {
            addCriterion("MODULE_URL not between", value1, value2, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andMdOrderIsNull() {
            addCriterion("MD_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andMdOrderIsNotNull() {
            addCriterion("MD_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andMdOrderEqualTo(Integer value) {
            addCriterion("MD_ORDER =", value, "mdOrder");
            return (Criteria) this;
        }

        public Criteria andMdOrderNotEqualTo(Integer value) {
            addCriterion("MD_ORDER <>", value, "mdOrder");
            return (Criteria) this;
        }

        public Criteria andMdOrderGreaterThan(Integer value) {
            addCriterion("MD_ORDER >", value, "mdOrder");
            return (Criteria) this;
        }

        public Criteria andMdOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("MD_ORDER >=", value, "mdOrder");
            return (Criteria) this;
        }

        public Criteria andMdOrderLessThan(Integer value) {
            addCriterion("MD_ORDER <", value, "mdOrder");
            return (Criteria) this;
        }

        public Criteria andMdOrderLessThanOrEqualTo(Integer value) {
            addCriterion("MD_ORDER <=", value, "mdOrder");
            return (Criteria) this;
        }

        public Criteria andMdOrderIn(List<Integer> values) {
            addCriterion("MD_ORDER in", values, "mdOrder");
            return (Criteria) this;
        }

        public Criteria andMdOrderNotIn(List<Integer> values) {
            addCriterion("MD_ORDER not in", values, "mdOrder");
            return (Criteria) this;
        }

        public Criteria andMdOrderBetween(Integer value1, Integer value2) {
            addCriterion("MD_ORDER between", value1, value2, "mdOrder");
            return (Criteria) this;
        }

        public Criteria andMdOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("MD_ORDER not between", value1, value2, "mdOrder");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
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