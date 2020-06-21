package com.entity;

import java.util.ArrayList;
import java.util.List;

public class ExaminfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminfoExample() {
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

        public Criteria andEmidIsNull() {
            addCriterion("emid is null");
            return (Criteria) this;
        }

        public Criteria andEmidIsNotNull() {
            addCriterion("emid is not null");
            return (Criteria) this;
        }

        public Criteria andEmidEqualTo(Integer value) {
            addCriterion("emid =", value, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidNotEqualTo(Integer value) {
            addCriterion("emid <>", value, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidGreaterThan(Integer value) {
            addCriterion("emid >", value, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("emid >=", value, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidLessThan(Integer value) {
            addCriterion("emid <", value, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidLessThanOrEqualTo(Integer value) {
            addCriterion("emid <=", value, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidIn(List<Integer> values) {
            addCriterion("emid in", values, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidNotIn(List<Integer> values) {
            addCriterion("emid not in", values, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidBetween(Integer value1, Integer value2) {
            addCriterion("emid between", value1, value2, "emid");
            return (Criteria) this;
        }

        public Criteria andEmidNotBetween(Integer value1, Integer value2) {
            addCriterion("emid not between", value1, value2, "emid");
            return (Criteria) this;
        }

        public Criteria andEmnameIsNull() {
            addCriterion("emname is null");
            return (Criteria) this;
        }

        public Criteria andEmnameIsNotNull() {
            addCriterion("emname is not null");
            return (Criteria) this;
        }

        public Criteria andEmnameEqualTo(String value) {
            addCriterion("emname =", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameNotEqualTo(String value) {
            addCriterion("emname <>", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameGreaterThan(String value) {
            addCriterion("emname >", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameGreaterThanOrEqualTo(String value) {
            addCriterion("emname >=", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameLessThan(String value) {
            addCriterion("emname <", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameLessThanOrEqualTo(String value) {
            addCriterion("emname <=", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameLike(String value) {
            addCriterion("emname like", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameNotLike(String value) {
            addCriterion("emname not like", value, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameIn(List<String> values) {
            addCriterion("emname in", values, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameNotIn(List<String> values) {
            addCriterion("emname not in", values, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameBetween(String value1, String value2) {
            addCriterion("emname between", value1, value2, "emname");
            return (Criteria) this;
        }

        public Criteria andEmnameNotBetween(String value1, String value2) {
            addCriterion("emname not between", value1, value2, "emname");
            return (Criteria) this;
        }

        public Criteria andEmtimeIsNull() {
            addCriterion("emtime is null");
            return (Criteria) this;
        }

        public Criteria andEmtimeIsNotNull() {
            addCriterion("emtime is not null");
            return (Criteria) this;
        }

        public Criteria andEmtimeEqualTo(String value) {
            addCriterion("emtime =", value, "emtime");
            return (Criteria) this;
        }

        public Criteria andEmtimeNotEqualTo(String value) {
            addCriterion("emtime <>", value, "emtime");
            return (Criteria) this;
        }

        public Criteria andEmtimeGreaterThan(String value) {
            addCriterion("emtime >", value, "emtime");
            return (Criteria) this;
        }

        public Criteria andEmtimeGreaterThanOrEqualTo(String value) {
            addCriterion("emtime >=", value, "emtime");
            return (Criteria) this;
        }

        public Criteria andEmtimeLessThan(String value) {
            addCriterion("emtime <", value, "emtime");
            return (Criteria) this;
        }

        public Criteria andEmtimeLessThanOrEqualTo(String value) {
            addCriterion("emtime <=", value, "emtime");
            return (Criteria) this;
        }

        public Criteria andEmtimeLike(String value) {
            addCriterion("emtime like", value, "emtime");
            return (Criteria) this;
        }

        public Criteria andEmtimeNotLike(String value) {
            addCriterion("emtime not like", value, "emtime");
            return (Criteria) this;
        }

        public Criteria andEmtimeIn(List<String> values) {
            addCriterion("emtime in", values, "emtime");
            return (Criteria) this;
        }

        public Criteria andEmtimeNotIn(List<String> values) {
            addCriterion("emtime not in", values, "emtime");
            return (Criteria) this;
        }

        public Criteria andEmtimeBetween(String value1, String value2) {
            addCriterion("emtime between", value1, value2, "emtime");
            return (Criteria) this;
        }

        public Criteria andEmtimeNotBetween(String value1, String value2) {
            addCriterion("emtime not between", value1, value2, "emtime");
            return (Criteria) this;
        }

        public Criteria andEmtypeIsNull() {
            addCriterion("emtype is null");
            return (Criteria) this;
        }

        public Criteria andEmtypeIsNotNull() {
            addCriterion("emtype is not null");
            return (Criteria) this;
        }

        public Criteria andEmtypeEqualTo(String value) {
            addCriterion("emtype =", value, "emtype");
            return (Criteria) this;
        }

        public Criteria andEmtypeNotEqualTo(String value) {
            addCriterion("emtype <>", value, "emtype");
            return (Criteria) this;
        }

        public Criteria andEmtypeGreaterThan(String value) {
            addCriterion("emtype >", value, "emtype");
            return (Criteria) this;
        }

        public Criteria andEmtypeGreaterThanOrEqualTo(String value) {
            addCriterion("emtype >=", value, "emtype");
            return (Criteria) this;
        }

        public Criteria andEmtypeLessThan(String value) {
            addCriterion("emtype <", value, "emtype");
            return (Criteria) this;
        }

        public Criteria andEmtypeLessThanOrEqualTo(String value) {
            addCriterion("emtype <=", value, "emtype");
            return (Criteria) this;
        }

        public Criteria andEmtypeLike(String value) {
            addCriterion("emtype like", value, "emtype");
            return (Criteria) this;
        }

        public Criteria andEmtypeNotLike(String value) {
            addCriterion("emtype not like", value, "emtype");
            return (Criteria) this;
        }

        public Criteria andEmtypeIn(List<String> values) {
            addCriterion("emtype in", values, "emtype");
            return (Criteria) this;
        }

        public Criteria andEmtypeNotIn(List<String> values) {
            addCriterion("emtype not in", values, "emtype");
            return (Criteria) this;
        }

        public Criteria andEmtypeBetween(String value1, String value2) {
            addCriterion("emtype between", value1, value2, "emtype");
            return (Criteria) this;
        }

        public Criteria andEmtypeNotBetween(String value1, String value2) {
            addCriterion("emtype not between", value1, value2, "emtype");
            return (Criteria) this;
        }

        public Criteria andEmgradeIsNull() {
            addCriterion("emgrade is null");
            return (Criteria) this;
        }

        public Criteria andEmgradeIsNotNull() {
            addCriterion("emgrade is not null");
            return (Criteria) this;
        }

        public Criteria andEmgradeEqualTo(String value) {
            addCriterion("emgrade =", value, "emgrade");
            return (Criteria) this;
        }

        public Criteria andEmgradeNotEqualTo(String value) {
            addCriterion("emgrade <>", value, "emgrade");
            return (Criteria) this;
        }

        public Criteria andEmgradeGreaterThan(String value) {
            addCriterion("emgrade >", value, "emgrade");
            return (Criteria) this;
        }

        public Criteria andEmgradeGreaterThanOrEqualTo(String value) {
            addCriterion("emgrade >=", value, "emgrade");
            return (Criteria) this;
        }

        public Criteria andEmgradeLessThan(String value) {
            addCriterion("emgrade <", value, "emgrade");
            return (Criteria) this;
        }

        public Criteria andEmgradeLessThanOrEqualTo(String value) {
            addCriterion("emgrade <=", value, "emgrade");
            return (Criteria) this;
        }

        public Criteria andEmgradeLike(String value) {
            addCriterion("emgrade like", value, "emgrade");
            return (Criteria) this;
        }

        public Criteria andEmgradeNotLike(String value) {
            addCriterion("emgrade not like", value, "emgrade");
            return (Criteria) this;
        }

        public Criteria andEmgradeIn(List<String> values) {
            addCriterion("emgrade in", values, "emgrade");
            return (Criteria) this;
        }

        public Criteria andEmgradeNotIn(List<String> values) {
            addCriterion("emgrade not in", values, "emgrade");
            return (Criteria) this;
        }

        public Criteria andEmgradeBetween(String value1, String value2) {
            addCriterion("emgrade between", value1, value2, "emgrade");
            return (Criteria) this;
        }

        public Criteria andEmgradeNotBetween(String value1, String value2) {
            addCriterion("emgrade not between", value1, value2, "emgrade");
            return (Criteria) this;
        }

        public Criteria andEmclassIsNull() {
            addCriterion("emclass is null");
            return (Criteria) this;
        }

        public Criteria andEmclassIsNotNull() {
            addCriterion("emclass is not null");
            return (Criteria) this;
        }

        public Criteria andEmclassEqualTo(String value) {
            addCriterion("emclass =", value, "emclass");
            return (Criteria) this;
        }

        public Criteria andEmclassNotEqualTo(String value) {
            addCriterion("emclass <>", value, "emclass");
            return (Criteria) this;
        }

        public Criteria andEmclassGreaterThan(String value) {
            addCriterion("emclass >", value, "emclass");
            return (Criteria) this;
        }

        public Criteria andEmclassGreaterThanOrEqualTo(String value) {
            addCriterion("emclass >=", value, "emclass");
            return (Criteria) this;
        }

        public Criteria andEmclassLessThan(String value) {
            addCriterion("emclass <", value, "emclass");
            return (Criteria) this;
        }

        public Criteria andEmclassLessThanOrEqualTo(String value) {
            addCriterion("emclass <=", value, "emclass");
            return (Criteria) this;
        }

        public Criteria andEmclassLike(String value) {
            addCriterion("emclass like", value, "emclass");
            return (Criteria) this;
        }

        public Criteria andEmclassNotLike(String value) {
            addCriterion("emclass not like", value, "emclass");
            return (Criteria) this;
        }

        public Criteria andEmclassIn(List<String> values) {
            addCriterion("emclass in", values, "emclass");
            return (Criteria) this;
        }

        public Criteria andEmclassNotIn(List<String> values) {
            addCriterion("emclass not in", values, "emclass");
            return (Criteria) this;
        }

        public Criteria andEmclassBetween(String value1, String value2) {
            addCriterion("emclass between", value1, value2, "emclass");
            return (Criteria) this;
        }

        public Criteria andEmclassNotBetween(String value1, String value2) {
            addCriterion("emclass not between", value1, value2, "emclass");
            return (Criteria) this;
        }

        public Criteria andEmsubjectIsNull() {
            addCriterion("emsubject is null");
            return (Criteria) this;
        }

        public Criteria andEmsubjectIsNotNull() {
            addCriterion("emsubject is not null");
            return (Criteria) this;
        }

        public Criteria andEmsubjectEqualTo(String value) {
            addCriterion("emsubject =", value, "emsubject");
            return (Criteria) this;
        }

        public Criteria andEmsubjectNotEqualTo(String value) {
            addCriterion("emsubject <>", value, "emsubject");
            return (Criteria) this;
        }

        public Criteria andEmsubjectGreaterThan(String value) {
            addCriterion("emsubject >", value, "emsubject");
            return (Criteria) this;
        }

        public Criteria andEmsubjectGreaterThanOrEqualTo(String value) {
            addCriterion("emsubject >=", value, "emsubject");
            return (Criteria) this;
        }

        public Criteria andEmsubjectLessThan(String value) {
            addCriterion("emsubject <", value, "emsubject");
            return (Criteria) this;
        }

        public Criteria andEmsubjectLessThanOrEqualTo(String value) {
            addCriterion("emsubject <=", value, "emsubject");
            return (Criteria) this;
        }

        public Criteria andEmsubjectLike(String value) {
            addCriterion("emsubject like", value, "emsubject");
            return (Criteria) this;
        }

        public Criteria andEmsubjectNotLike(String value) {
            addCriterion("emsubject not like", value, "emsubject");
            return (Criteria) this;
        }

        public Criteria andEmsubjectIn(List<String> values) {
            addCriterion("emsubject in", values, "emsubject");
            return (Criteria) this;
        }

        public Criteria andEmsubjectNotIn(List<String> values) {
            addCriterion("emsubject not in", values, "emsubject");
            return (Criteria) this;
        }

        public Criteria andEmsubjectBetween(String value1, String value2) {
            addCriterion("emsubject between", value1, value2, "emsubject");
            return (Criteria) this;
        }

        public Criteria andEmsubjectNotBetween(String value1, String value2) {
            addCriterion("emsubject not between", value1, value2, "emsubject");
            return (Criteria) this;
        }

        public Criteria andEmremarkIsNull() {
            addCriterion("emremark is null");
            return (Criteria) this;
        }

        public Criteria andEmremarkIsNotNull() {
            addCriterion("emremark is not null");
            return (Criteria) this;
        }

        public Criteria andEmremarkEqualTo(String value) {
            addCriterion("emremark =", value, "emremark");
            return (Criteria) this;
        }

        public Criteria andEmremarkNotEqualTo(String value) {
            addCriterion("emremark <>", value, "emremark");
            return (Criteria) this;
        }

        public Criteria andEmremarkGreaterThan(String value) {
            addCriterion("emremark >", value, "emremark");
            return (Criteria) this;
        }

        public Criteria andEmremarkGreaterThanOrEqualTo(String value) {
            addCriterion("emremark >=", value, "emremark");
            return (Criteria) this;
        }

        public Criteria andEmremarkLessThan(String value) {
            addCriterion("emremark <", value, "emremark");
            return (Criteria) this;
        }

        public Criteria andEmremarkLessThanOrEqualTo(String value) {
            addCriterion("emremark <=", value, "emremark");
            return (Criteria) this;
        }

        public Criteria andEmremarkLike(String value) {
            addCriterion("emremark like", value, "emremark");
            return (Criteria) this;
        }

        public Criteria andEmremarkNotLike(String value) {
            addCriterion("emremark not like", value, "emremark");
            return (Criteria) this;
        }

        public Criteria andEmremarkIn(List<String> values) {
            addCriterion("emremark in", values, "emremark");
            return (Criteria) this;
        }

        public Criteria andEmremarkNotIn(List<String> values) {
            addCriterion("emremark not in", values, "emremark");
            return (Criteria) this;
        }

        public Criteria andEmremarkBetween(String value1, String value2) {
            addCriterion("emremark between", value1, value2, "emremark");
            return (Criteria) this;
        }

        public Criteria andEmremarkNotBetween(String value1, String value2) {
            addCriterion("emremark not between", value1, value2, "emremark");
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