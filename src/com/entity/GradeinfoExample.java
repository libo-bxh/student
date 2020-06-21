package com.entity;

import java.util.ArrayList;
import java.util.List;

public class GradeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeinfoExample() {
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

        public Criteria andGaidIsNull() {
            addCriterion("gaid is null");
            return (Criteria) this;
        }

        public Criteria andGaidIsNotNull() {
            addCriterion("gaid is not null");
            return (Criteria) this;
        }

        public Criteria andGaidEqualTo(Integer value) {
            addCriterion("gaid =", value, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidNotEqualTo(Integer value) {
            addCriterion("gaid <>", value, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidGreaterThan(Integer value) {
            addCriterion("gaid >", value, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gaid >=", value, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidLessThan(Integer value) {
            addCriterion("gaid <", value, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidLessThanOrEqualTo(Integer value) {
            addCriterion("gaid <=", value, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidIn(List<Integer> values) {
            addCriterion("gaid in", values, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidNotIn(List<Integer> values) {
            addCriterion("gaid not in", values, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidBetween(Integer value1, Integer value2) {
            addCriterion("gaid between", value1, value2, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidNotBetween(Integer value1, Integer value2) {
            addCriterion("gaid not between", value1, value2, "gaid");
            return (Criteria) this;
        }

        public Criteria andGanameIsNull() {
            addCriterion("ganame is null");
            return (Criteria) this;
        }

        public Criteria andGanameIsNotNull() {
            addCriterion("ganame is not null");
            return (Criteria) this;
        }

        public Criteria andGanameEqualTo(String value) {
            addCriterion("ganame =", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameNotEqualTo(String value) {
            addCriterion("ganame <>", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameGreaterThan(String value) {
            addCriterion("ganame >", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameGreaterThanOrEqualTo(String value) {
            addCriterion("ganame >=", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameLessThan(String value) {
            addCriterion("ganame <", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameLessThanOrEqualTo(String value) {
            addCriterion("ganame <=", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameLike(String value) {
            addCriterion("ganame like", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameNotLike(String value) {
            addCriterion("ganame not like", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameIn(List<String> values) {
            addCriterion("ganame in", values, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameNotIn(List<String> values) {
            addCriterion("ganame not in", values, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameBetween(String value1, String value2) {
            addCriterion("ganame between", value1, value2, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameNotBetween(String value1, String value2) {
            addCriterion("ganame not between", value1, value2, "ganame");
            return (Criteria) this;
        }

        public Criteria andGaclassIsNull() {
            addCriterion("gaclass is null");
            return (Criteria) this;
        }

        public Criteria andGaclassIsNotNull() {
            addCriterion("gaclass is not null");
            return (Criteria) this;
        }

        public Criteria andGaclassEqualTo(String value) {
            addCriterion("gaclass =", value, "gaclass");
            return (Criteria) this;
        }

        public Criteria andGaclassNotEqualTo(String value) {
            addCriterion("gaclass <>", value, "gaclass");
            return (Criteria) this;
        }

        public Criteria andGaclassGreaterThan(String value) {
            addCriterion("gaclass >", value, "gaclass");
            return (Criteria) this;
        }

        public Criteria andGaclassGreaterThanOrEqualTo(String value) {
            addCriterion("gaclass >=", value, "gaclass");
            return (Criteria) this;
        }

        public Criteria andGaclassLessThan(String value) {
            addCriterion("gaclass <", value, "gaclass");
            return (Criteria) this;
        }

        public Criteria andGaclassLessThanOrEqualTo(String value) {
            addCriterion("gaclass <=", value, "gaclass");
            return (Criteria) this;
        }

        public Criteria andGaclassLike(String value) {
            addCriterion("gaclass like", value, "gaclass");
            return (Criteria) this;
        }

        public Criteria andGaclassNotLike(String value) {
            addCriterion("gaclass not like", value, "gaclass");
            return (Criteria) this;
        }

        public Criteria andGaclassIn(List<String> values) {
            addCriterion("gaclass in", values, "gaclass");
            return (Criteria) this;
        }

        public Criteria andGaclassNotIn(List<String> values) {
            addCriterion("gaclass not in", values, "gaclass");
            return (Criteria) this;
        }

        public Criteria andGaclassBetween(String value1, String value2) {
            addCriterion("gaclass between", value1, value2, "gaclass");
            return (Criteria) this;
        }

        public Criteria andGaclassNotBetween(String value1, String value2) {
            addCriterion("gaclass not between", value1, value2, "gaclass");
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