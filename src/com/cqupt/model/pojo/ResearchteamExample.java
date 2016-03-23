package com.cqupt.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResearchteamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResearchteamExample() {
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

        public Criteria andResearchteamidIsNull() {
            addCriterion("researchTeamId is null");
            return (Criteria) this;
        }

        public Criteria andResearchteamidIsNotNull() {
            addCriterion("researchTeamId is not null");
            return (Criteria) this;
        }

        public Criteria andResearchteamidEqualTo(Integer value) {
            addCriterion("researchTeamId =", value, "researchteamid");
            return (Criteria) this;
        }

        public Criteria andResearchteamidNotEqualTo(Integer value) {
            addCriterion("researchTeamId <>", value, "researchteamid");
            return (Criteria) this;
        }

        public Criteria andResearchteamidGreaterThan(Integer value) {
            addCriterion("researchTeamId >", value, "researchteamid");
            return (Criteria) this;
        }

        public Criteria andResearchteamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("researchTeamId >=", value, "researchteamid");
            return (Criteria) this;
        }

        public Criteria andResearchteamidLessThan(Integer value) {
            addCriterion("researchTeamId <", value, "researchteamid");
            return (Criteria) this;
        }

        public Criteria andResearchteamidLessThanOrEqualTo(Integer value) {
            addCriterion("researchTeamId <=", value, "researchteamid");
            return (Criteria) this;
        }

        public Criteria andResearchteamidIn(List<Integer> values) {
            addCriterion("researchTeamId in", values, "researchteamid");
            return (Criteria) this;
        }

        public Criteria andResearchteamidNotIn(List<Integer> values) {
            addCriterion("researchTeamId not in", values, "researchteamid");
            return (Criteria) this;
        }

        public Criteria andResearchteamidBetween(Integer value1, Integer value2) {
            addCriterion("researchTeamId between", value1, value2, "researchteamid");
            return (Criteria) this;
        }

        public Criteria andResearchteamidNotBetween(Integer value1, Integer value2) {
            addCriterion("researchTeamId not between", value1, value2, "researchteamid");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNull() {
            addCriterion("TeamName is null");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNotNull() {
            addCriterion("TeamName is not null");
            return (Criteria) this;
        }

        public Criteria andTeamnameEqualTo(String value) {
            addCriterion("TeamName =", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotEqualTo(String value) {
            addCriterion("TeamName <>", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThan(String value) {
            addCriterion("TeamName >", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThanOrEqualTo(String value) {
            addCriterion("TeamName >=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThan(String value) {
            addCriterion("TeamName <", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThanOrEqualTo(String value) {
            addCriterion("TeamName <=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLike(String value) {
            addCriterion("TeamName like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotLike(String value) {
            addCriterion("TeamName not like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameIn(List<String> values) {
            addCriterion("TeamName in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotIn(List<String> values) {
            addCriterion("TeamName not in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameBetween(String value1, String value2) {
            addCriterion("TeamName between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotBetween(String value1, String value2) {
            addCriterion("TeamName not between", value1, value2, "teamname");
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