package com.cqupt.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class PaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperExample() {
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

        public Criteria andPaperidIsNull() {
            addCriterion("paperId is null");
            return (Criteria) this;
        }

        public Criteria andPaperidIsNotNull() {
            addCriterion("paperId is not null");
            return (Criteria) this;
        }

        public Criteria andPaperidEqualTo(Integer value) {
            addCriterion("paperId =", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidNotEqualTo(Integer value) {
            addCriterion("paperId <>", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidGreaterThan(Integer value) {
            addCriterion("paperId >", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("paperId >=", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidLessThan(Integer value) {
            addCriterion("paperId <", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidLessThanOrEqualTo(Integer value) {
            addCriterion("paperId <=", value, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidIn(List<Integer> values) {
            addCriterion("paperId in", values, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidNotIn(List<Integer> values) {
            addCriterion("paperId not in", values, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidBetween(Integer value1, Integer value2) {
            addCriterion("paperId between", value1, value2, "paperid");
            return (Criteria) this;
        }

        public Criteria andPaperidNotBetween(Integer value1, Integer value2) {
            addCriterion("paperId not between", value1, value2, "paperid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPapertitleIsNull() {
            addCriterion("paperTitle is null");
            return (Criteria) this;
        }

        public Criteria andPapertitleIsNotNull() {
            addCriterion("paperTitle is not null");
            return (Criteria) this;
        }

        public Criteria andPapertitleEqualTo(String value) {
            addCriterion("paperTitle =", value, "papertitle");
            return (Criteria) this;
        }

        public Criteria andPapertitleNotEqualTo(String value) {
            addCriterion("paperTitle <>", value, "papertitle");
            return (Criteria) this;
        }

        public Criteria andPapertitleGreaterThan(String value) {
            addCriterion("paperTitle >", value, "papertitle");
            return (Criteria) this;
        }

        public Criteria andPapertitleGreaterThanOrEqualTo(String value) {
            addCriterion("paperTitle >=", value, "papertitle");
            return (Criteria) this;
        }

        public Criteria andPapertitleLessThan(String value) {
            addCriterion("paperTitle <", value, "papertitle");
            return (Criteria) this;
        }

        public Criteria andPapertitleLessThanOrEqualTo(String value) {
            addCriterion("paperTitle <=", value, "papertitle");
            return (Criteria) this;
        }

        public Criteria andPapertitleLike(String value) {
            addCriterion("paperTitle like", value, "papertitle");
            return (Criteria) this;
        }

        public Criteria andPapertitleNotLike(String value) {
            addCriterion("paperTitle not like", value, "papertitle");
            return (Criteria) this;
        }

        public Criteria andPapertitleIn(List<String> values) {
            addCriterion("paperTitle in", values, "papertitle");
            return (Criteria) this;
        }

        public Criteria andPapertitleNotIn(List<String> values) {
            addCriterion("paperTitle not in", values, "papertitle");
            return (Criteria) this;
        }

        public Criteria andPapertitleBetween(String value1, String value2) {
            addCriterion("paperTitle between", value1, value2, "papertitle");
            return (Criteria) this;
        }

        public Criteria andPapertitleNotBetween(String value1, String value2) {
            addCriterion("paperTitle not between", value1, value2, "papertitle");
            return (Criteria) this;
        }

        public Criteria andPapertypeIsNull() {
            addCriterion("paperType is null");
            return (Criteria) this;
        }

        public Criteria andPapertypeIsNotNull() {
            addCriterion("paperType is not null");
            return (Criteria) this;
        }

        public Criteria andPapertypeEqualTo(String value) {
            addCriterion("paperType =", value, "papertype");
            return (Criteria) this;
        }

        public Criteria andPapertypeNotEqualTo(String value) {
            addCriterion("paperType <>", value, "papertype");
            return (Criteria) this;
        }

        public Criteria andPapertypeGreaterThan(String value) {
            addCriterion("paperType >", value, "papertype");
            return (Criteria) this;
        }

        public Criteria andPapertypeGreaterThanOrEqualTo(String value) {
            addCriterion("paperType >=", value, "papertype");
            return (Criteria) this;
        }

        public Criteria andPapertypeLessThan(String value) {
            addCriterion("paperType <", value, "papertype");
            return (Criteria) this;
        }

        public Criteria andPapertypeLessThanOrEqualTo(String value) {
            addCriterion("paperType <=", value, "papertype");
            return (Criteria) this;
        }

        public Criteria andPapertypeLike(String value) {
            addCriterion("paperType like", value, "papertype");
            return (Criteria) this;
        }

        public Criteria andPapertypeNotLike(String value) {
            addCriterion("paperType not like", value, "papertype");
            return (Criteria) this;
        }

        public Criteria andPapertypeIn(List<String> values) {
            addCriterion("paperType in", values, "papertype");
            return (Criteria) this;
        }

        public Criteria andPapertypeNotIn(List<String> values) {
            addCriterion("paperType not in", values, "papertype");
            return (Criteria) this;
        }

        public Criteria andPapertypeBetween(String value1, String value2) {
            addCriterion("paperType between", value1, value2, "papertype");
            return (Criteria) this;
        }

        public Criteria andPapertypeNotBetween(String value1, String value2) {
            addCriterion("paperType not between", value1, value2, "papertype");
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