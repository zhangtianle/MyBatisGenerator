package com.cqupt.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class SettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettingExample() {
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

        public Criteria andSettingidIsNull() {
            addCriterion("settingId is null");
            return (Criteria) this;
        }

        public Criteria andSettingidIsNotNull() {
            addCriterion("settingId is not null");
            return (Criteria) this;
        }

        public Criteria andSettingidEqualTo(Integer value) {
            addCriterion("settingId =", value, "settingid");
            return (Criteria) this;
        }

        public Criteria andSettingidNotEqualTo(Integer value) {
            addCriterion("settingId <>", value, "settingid");
            return (Criteria) this;
        }

        public Criteria andSettingidGreaterThan(Integer value) {
            addCriterion("settingId >", value, "settingid");
            return (Criteria) this;
        }

        public Criteria andSettingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("settingId >=", value, "settingid");
            return (Criteria) this;
        }

        public Criteria andSettingidLessThan(Integer value) {
            addCriterion("settingId <", value, "settingid");
            return (Criteria) this;
        }

        public Criteria andSettingidLessThanOrEqualTo(Integer value) {
            addCriterion("settingId <=", value, "settingid");
            return (Criteria) this;
        }

        public Criteria andSettingidIn(List<Integer> values) {
            addCriterion("settingId in", values, "settingid");
            return (Criteria) this;
        }

        public Criteria andSettingidNotIn(List<Integer> values) {
            addCriterion("settingId not in", values, "settingid");
            return (Criteria) this;
        }

        public Criteria andSettingidBetween(Integer value1, Integer value2) {
            addCriterion("settingId between", value1, value2, "settingid");
            return (Criteria) this;
        }

        public Criteria andSettingidNotBetween(Integer value1, Integer value2) {
            addCriterion("settingId not between", value1, value2, "settingid");
            return (Criteria) this;
        }

        public Criteria andSettingnameIsNull() {
            addCriterion("settingName is null");
            return (Criteria) this;
        }

        public Criteria andSettingnameIsNotNull() {
            addCriterion("settingName is not null");
            return (Criteria) this;
        }

        public Criteria andSettingnameEqualTo(String value) {
            addCriterion("settingName =", value, "settingname");
            return (Criteria) this;
        }

        public Criteria andSettingnameNotEqualTo(String value) {
            addCriterion("settingName <>", value, "settingname");
            return (Criteria) this;
        }

        public Criteria andSettingnameGreaterThan(String value) {
            addCriterion("settingName >", value, "settingname");
            return (Criteria) this;
        }

        public Criteria andSettingnameGreaterThanOrEqualTo(String value) {
            addCriterion("settingName >=", value, "settingname");
            return (Criteria) this;
        }

        public Criteria andSettingnameLessThan(String value) {
            addCriterion("settingName <", value, "settingname");
            return (Criteria) this;
        }

        public Criteria andSettingnameLessThanOrEqualTo(String value) {
            addCriterion("settingName <=", value, "settingname");
            return (Criteria) this;
        }

        public Criteria andSettingnameLike(String value) {
            addCriterion("settingName like", value, "settingname");
            return (Criteria) this;
        }

        public Criteria andSettingnameNotLike(String value) {
            addCriterion("settingName not like", value, "settingname");
            return (Criteria) this;
        }

        public Criteria andSettingnameIn(List<String> values) {
            addCriterion("settingName in", values, "settingname");
            return (Criteria) this;
        }

        public Criteria andSettingnameNotIn(List<String> values) {
            addCriterion("settingName not in", values, "settingname");
            return (Criteria) this;
        }

        public Criteria andSettingnameBetween(String value1, String value2) {
            addCriterion("settingName between", value1, value2, "settingname");
            return (Criteria) this;
        }

        public Criteria andSettingnameNotBetween(String value1, String value2) {
            addCriterion("settingName not between", value1, value2, "settingname");
            return (Criteria) this;
        }

        public Criteria andSettingvalueIsNull() {
            addCriterion("settingValue is null");
            return (Criteria) this;
        }

        public Criteria andSettingvalueIsNotNull() {
            addCriterion("settingValue is not null");
            return (Criteria) this;
        }

        public Criteria andSettingvalueEqualTo(String value) {
            addCriterion("settingValue =", value, "settingvalue");
            return (Criteria) this;
        }

        public Criteria andSettingvalueNotEqualTo(String value) {
            addCriterion("settingValue <>", value, "settingvalue");
            return (Criteria) this;
        }

        public Criteria andSettingvalueGreaterThan(String value) {
            addCriterion("settingValue >", value, "settingvalue");
            return (Criteria) this;
        }

        public Criteria andSettingvalueGreaterThanOrEqualTo(String value) {
            addCriterion("settingValue >=", value, "settingvalue");
            return (Criteria) this;
        }

        public Criteria andSettingvalueLessThan(String value) {
            addCriterion("settingValue <", value, "settingvalue");
            return (Criteria) this;
        }

        public Criteria andSettingvalueLessThanOrEqualTo(String value) {
            addCriterion("settingValue <=", value, "settingvalue");
            return (Criteria) this;
        }

        public Criteria andSettingvalueLike(String value) {
            addCriterion("settingValue like", value, "settingvalue");
            return (Criteria) this;
        }

        public Criteria andSettingvalueNotLike(String value) {
            addCriterion("settingValue not like", value, "settingvalue");
            return (Criteria) this;
        }

        public Criteria andSettingvalueIn(List<String> values) {
            addCriterion("settingValue in", values, "settingvalue");
            return (Criteria) this;
        }

        public Criteria andSettingvalueNotIn(List<String> values) {
            addCriterion("settingValue not in", values, "settingvalue");
            return (Criteria) this;
        }

        public Criteria andSettingvalueBetween(String value1, String value2) {
            addCriterion("settingValue between", value1, value2, "settingvalue");
            return (Criteria) this;
        }

        public Criteria andSettingvalueNotBetween(String value1, String value2) {
            addCriterion("settingValue not between", value1, value2, "settingvalue");
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