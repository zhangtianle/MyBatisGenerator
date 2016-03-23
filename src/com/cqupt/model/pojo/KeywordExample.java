package com.cqupt.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class KeywordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KeywordExample() {
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

        public Criteria andKeywordidIsNull() {
            addCriterion("keyWordId is null");
            return (Criteria) this;
        }

        public Criteria andKeywordidIsNotNull() {
            addCriterion("keyWordId is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordidEqualTo(Integer value) {
            addCriterion("keyWordId =", value, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidNotEqualTo(Integer value) {
            addCriterion("keyWordId <>", value, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidGreaterThan(Integer value) {
            addCriterion("keyWordId >", value, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("keyWordId >=", value, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidLessThan(Integer value) {
            addCriterion("keyWordId <", value, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidLessThanOrEqualTo(Integer value) {
            addCriterion("keyWordId <=", value, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidIn(List<Integer> values) {
            addCriterion("keyWordId in", values, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidNotIn(List<Integer> values) {
            addCriterion("keyWordId not in", values, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidBetween(Integer value1, Integer value2) {
            addCriterion("keyWordId between", value1, value2, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidNotBetween(Integer value1, Integer value2) {
            addCriterion("keyWordId not between", value1, value2, "keywordid");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionidIsNull() {
            addCriterion("researchDirectionId is null");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionidIsNotNull() {
            addCriterion("researchDirectionId is not null");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionidEqualTo(Integer value) {
            addCriterion("researchDirectionId =", value, "researchdirectionid");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionidNotEqualTo(Integer value) {
            addCriterion("researchDirectionId <>", value, "researchdirectionid");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionidGreaterThan(Integer value) {
            addCriterion("researchDirectionId >", value, "researchdirectionid");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("researchDirectionId >=", value, "researchdirectionid");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionidLessThan(Integer value) {
            addCriterion("researchDirectionId <", value, "researchdirectionid");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionidLessThanOrEqualTo(Integer value) {
            addCriterion("researchDirectionId <=", value, "researchdirectionid");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionidIn(List<Integer> values) {
            addCriterion("researchDirectionId in", values, "researchdirectionid");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionidNotIn(List<Integer> values) {
            addCriterion("researchDirectionId not in", values, "researchdirectionid");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionidBetween(Integer value1, Integer value2) {
            addCriterion("researchDirectionId between", value1, value2, "researchdirectionid");
            return (Criteria) this;
        }

        public Criteria andResearchdirectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("researchDirectionId not between", value1, value2, "researchdirectionid");
            return (Criteria) this;
        }

        public Criteria andKeywordnameIsNull() {
            addCriterion("keyWordName is null");
            return (Criteria) this;
        }

        public Criteria andKeywordnameIsNotNull() {
            addCriterion("keyWordName is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordnameEqualTo(String value) {
            addCriterion("keyWordName =", value, "keywordname");
            return (Criteria) this;
        }

        public Criteria andKeywordnameNotEqualTo(String value) {
            addCriterion("keyWordName <>", value, "keywordname");
            return (Criteria) this;
        }

        public Criteria andKeywordnameGreaterThan(String value) {
            addCriterion("keyWordName >", value, "keywordname");
            return (Criteria) this;
        }

        public Criteria andKeywordnameGreaterThanOrEqualTo(String value) {
            addCriterion("keyWordName >=", value, "keywordname");
            return (Criteria) this;
        }

        public Criteria andKeywordnameLessThan(String value) {
            addCriterion("keyWordName <", value, "keywordname");
            return (Criteria) this;
        }

        public Criteria andKeywordnameLessThanOrEqualTo(String value) {
            addCriterion("keyWordName <=", value, "keywordname");
            return (Criteria) this;
        }

        public Criteria andKeywordnameLike(String value) {
            addCriterion("keyWordName like", value, "keywordname");
            return (Criteria) this;
        }

        public Criteria andKeywordnameNotLike(String value) {
            addCriterion("keyWordName not like", value, "keywordname");
            return (Criteria) this;
        }

        public Criteria andKeywordnameIn(List<String> values) {
            addCriterion("keyWordName in", values, "keywordname");
            return (Criteria) this;
        }

        public Criteria andKeywordnameNotIn(List<String> values) {
            addCriterion("keyWordName not in", values, "keywordname");
            return (Criteria) this;
        }

        public Criteria andKeywordnameBetween(String value1, String value2) {
            addCriterion("keyWordName between", value1, value2, "keywordname");
            return (Criteria) this;
        }

        public Criteria andKeywordnameNotBetween(String value1, String value2) {
            addCriterion("keyWordName not between", value1, value2, "keywordname");
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