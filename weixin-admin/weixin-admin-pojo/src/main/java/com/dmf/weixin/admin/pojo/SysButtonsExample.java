package com.dmf.weixin.admin.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysButtonsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysButtonsExample() {
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

        public Criteria andModuleIdIsNull() {
            addCriterion("MODULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("MODULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(Integer value) {
            addCriterion("MODULE_ID =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(Integer value) {
            addCriterion("MODULE_ID <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(Integer value) {
            addCriterion("MODULE_ID >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MODULE_ID >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(Integer value) {
            addCriterion("MODULE_ID <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("MODULE_ID <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<Integer> values) {
            addCriterion("MODULE_ID in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<Integer> values) {
            addCriterion("MODULE_ID not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(Integer value1, Integer value2) {
            addCriterion("MODULE_ID between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MODULE_ID not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andButtonNameIsNull() {
            addCriterion("BUTTON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andButtonNameIsNotNull() {
            addCriterion("BUTTON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andButtonNameEqualTo(String value) {
            addCriterion("BUTTON_NAME =", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameNotEqualTo(String value) {
            addCriterion("BUTTON_NAME <>", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameGreaterThan(String value) {
            addCriterion("BUTTON_NAME >", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_NAME >=", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameLessThan(String value) {
            addCriterion("BUTTON_NAME <", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_NAME <=", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameLike(String value) {
            addCriterion("BUTTON_NAME like", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameNotLike(String value) {
            addCriterion("BUTTON_NAME not like", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameIn(List<String> values) {
            addCriterion("BUTTON_NAME in", values, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameNotIn(List<String> values) {
            addCriterion("BUTTON_NAME not in", values, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameBetween(String value1, String value2) {
            addCriterion("BUTTON_NAME between", value1, value2, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameNotBetween(String value1, String value2) {
            addCriterion("BUTTON_NAME not between", value1, value2, "buttonName");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNull() {
            addCriterion("IMAGE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNotNull() {
            addCriterion("IMAGE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andImagePathEqualTo(String value) {
            addCriterion("IMAGE_PATH =", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotEqualTo(String value) {
            addCriterion("IMAGE_PATH <>", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThan(String value) {
            addCriterion("IMAGE_PATH >", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_PATH >=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThan(String value) {
            addCriterion("IMAGE_PATH <", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_PATH <=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLike(String value) {
            addCriterion("IMAGE_PATH like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotLike(String value) {
            addCriterion("IMAGE_PATH not like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathIn(List<String> values) {
            addCriterion("IMAGE_PATH in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotIn(List<String> values) {
            addCriterion("IMAGE_PATH not in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathBetween(String value1, String value2) {
            addCriterion("IMAGE_PATH between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotBetween(String value1, String value2) {
            addCriterion("IMAGE_PATH not between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andOnclickIsNull() {
            addCriterion("ONCLICK is null");
            return (Criteria) this;
        }

        public Criteria andOnclickIsNotNull() {
            addCriterion("ONCLICK is not null");
            return (Criteria) this;
        }

        public Criteria andOnclickEqualTo(String value) {
            addCriterion("ONCLICK =", value, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickNotEqualTo(String value) {
            addCriterion("ONCLICK <>", value, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickGreaterThan(String value) {
            addCriterion("ONCLICK >", value, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickGreaterThanOrEqualTo(String value) {
            addCriterion("ONCLICK >=", value, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickLessThan(String value) {
            addCriterion("ONCLICK <", value, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickLessThanOrEqualTo(String value) {
            addCriterion("ONCLICK <=", value, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickLike(String value) {
            addCriterion("ONCLICK like", value, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickNotLike(String value) {
            addCriterion("ONCLICK not like", value, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickIn(List<String> values) {
            addCriterion("ONCLICK in", values, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickNotIn(List<String> values) {
            addCriterion("ONCLICK not in", values, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickBetween(String value1, String value2) {
            addCriterion("ONCLICK between", value1, value2, "onclick");
            return (Criteria) this;
        }

        public Criteria andOnclickNotBetween(String value1, String value2) {
            addCriterion("ONCLICK not between", value1, value2, "onclick");
            return (Criteria) this;
        }

        public Criteria andButtonKeyIsNull() {
            addCriterion("BUTTON_KEY is null");
            return (Criteria) this;
        }

        public Criteria andButtonKeyIsNotNull() {
            addCriterion("BUTTON_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andButtonKeyEqualTo(String value) {
            addCriterion("BUTTON_KEY =", value, "buttonKey");
            return (Criteria) this;
        }

        public Criteria andButtonKeyNotEqualTo(String value) {
            addCriterion("BUTTON_KEY <>", value, "buttonKey");
            return (Criteria) this;
        }

        public Criteria andButtonKeyGreaterThan(String value) {
            addCriterion("BUTTON_KEY >", value, "buttonKey");
            return (Criteria) this;
        }

        public Criteria andButtonKeyGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_KEY >=", value, "buttonKey");
            return (Criteria) this;
        }

        public Criteria andButtonKeyLessThan(String value) {
            addCriterion("BUTTON_KEY <", value, "buttonKey");
            return (Criteria) this;
        }

        public Criteria andButtonKeyLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_KEY <=", value, "buttonKey");
            return (Criteria) this;
        }

        public Criteria andButtonKeyLike(String value) {
            addCriterion("BUTTON_KEY like", value, "buttonKey");
            return (Criteria) this;
        }

        public Criteria andButtonKeyNotLike(String value) {
            addCriterion("BUTTON_KEY not like", value, "buttonKey");
            return (Criteria) this;
        }

        public Criteria andButtonKeyIn(List<String> values) {
            addCriterion("BUTTON_KEY in", values, "buttonKey");
            return (Criteria) this;
        }

        public Criteria andButtonKeyNotIn(List<String> values) {
            addCriterion("BUTTON_KEY not in", values, "buttonKey");
            return (Criteria) this;
        }

        public Criteria andButtonKeyBetween(String value1, String value2) {
            addCriterion("BUTTON_KEY between", value1, value2, "buttonKey");
            return (Criteria) this;
        }

        public Criteria andButtonKeyNotBetween(String value1, String value2) {
            addCriterion("BUTTON_KEY not between", value1, value2, "buttonKey");
            return (Criteria) this;
        }

        public Criteria andButtonUrlIsNull() {
            addCriterion("BUTTON_URL is null");
            return (Criteria) this;
        }

        public Criteria andButtonUrlIsNotNull() {
            addCriterion("BUTTON_URL is not null");
            return (Criteria) this;
        }

        public Criteria andButtonUrlEqualTo(String value) {
            addCriterion("BUTTON_URL =", value, "buttonUrl");
            return (Criteria) this;
        }

        public Criteria andButtonUrlNotEqualTo(String value) {
            addCriterion("BUTTON_URL <>", value, "buttonUrl");
            return (Criteria) this;
        }

        public Criteria andButtonUrlGreaterThan(String value) {
            addCriterion("BUTTON_URL >", value, "buttonUrl");
            return (Criteria) this;
        }

        public Criteria andButtonUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_URL >=", value, "buttonUrl");
            return (Criteria) this;
        }

        public Criteria andButtonUrlLessThan(String value) {
            addCriterion("BUTTON_URL <", value, "buttonUrl");
            return (Criteria) this;
        }

        public Criteria andButtonUrlLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_URL <=", value, "buttonUrl");
            return (Criteria) this;
        }

        public Criteria andButtonUrlLike(String value) {
            addCriterion("BUTTON_URL like", value, "buttonUrl");
            return (Criteria) this;
        }

        public Criteria andButtonUrlNotLike(String value) {
            addCriterion("BUTTON_URL not like", value, "buttonUrl");
            return (Criteria) this;
        }

        public Criteria andButtonUrlIn(List<String> values) {
            addCriterion("BUTTON_URL in", values, "buttonUrl");
            return (Criteria) this;
        }

        public Criteria andButtonUrlNotIn(List<String> values) {
            addCriterion("BUTTON_URL not in", values, "buttonUrl");
            return (Criteria) this;
        }

        public Criteria andButtonUrlBetween(String value1, String value2) {
            addCriterion("BUTTON_URL between", value1, value2, "buttonUrl");
            return (Criteria) this;
        }

        public Criteria andButtonUrlNotBetween(String value1, String value2) {
            addCriterion("BUTTON_URL not between", value1, value2, "buttonUrl");
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