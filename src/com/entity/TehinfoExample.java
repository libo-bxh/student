package com.entity;

import java.util.ArrayList;
import java.util.List;

public class TehinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TehinfoExample() {
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

        public Criteria andTehidIsNull() {
            addCriterion("tehid is null");
            return (Criteria) this;
        }

        public Criteria andTehidIsNotNull() {
            addCriterion("tehid is not null");
            return (Criteria) this;
        }

        public Criteria andTehidEqualTo(Integer value) {
            addCriterion("tehid =", value, "tehid");
            return (Criteria) this;
        }

        public Criteria andTehidNotEqualTo(Integer value) {
            addCriterion("tehid <>", value, "tehid");
            return (Criteria) this;
        }

        public Criteria andTehidGreaterThan(Integer value) {
            addCriterion("tehid >", value, "tehid");
            return (Criteria) this;
        }

        public Criteria andTehidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tehid >=", value, "tehid");
            return (Criteria) this;
        }

        public Criteria andTehidLessThan(Integer value) {
            addCriterion("tehid <", value, "tehid");
            return (Criteria) this;
        }

        public Criteria andTehidLessThanOrEqualTo(Integer value) {
            addCriterion("tehid <=", value, "tehid");
            return (Criteria) this;
        }

        public Criteria andTehidIn(List<Integer> values) {
            addCriterion("tehid in", values, "tehid");
            return (Criteria) this;
        }

        public Criteria andTehidNotIn(List<Integer> values) {
            addCriterion("tehid not in", values, "tehid");
            return (Criteria) this;
        }

        public Criteria andTehidBetween(Integer value1, Integer value2) {
            addCriterion("tehid between", value1, value2, "tehid");
            return (Criteria) this;
        }

        public Criteria andTehidNotBetween(Integer value1, Integer value2) {
            addCriterion("tehid not between", value1, value2, "tehid");
            return (Criteria) this;
        }

        public Criteria andTehghIsNull() {
            addCriterion("tehgh is null");
            return (Criteria) this;
        }

        public Criteria andTehghIsNotNull() {
            addCriterion("tehgh is not null");
            return (Criteria) this;
        }

        public Criteria andTehghEqualTo(Integer value) {
            addCriterion("tehgh =", value, "tehgh");
            return (Criteria) this;
        }

        public Criteria andTehghNotEqualTo(Integer value) {
            addCriterion("tehgh <>", value, "tehgh");
            return (Criteria) this;
        }

        public Criteria andTehghGreaterThan(Integer value) {
            addCriterion("tehgh >", value, "tehgh");
            return (Criteria) this;
        }

        public Criteria andTehghGreaterThanOrEqualTo(Integer value) {
            addCriterion("tehgh >=", value, "tehgh");
            return (Criteria) this;
        }

        public Criteria andTehghLessThan(Integer value) {
            addCriterion("tehgh <", value, "tehgh");
            return (Criteria) this;
        }

        public Criteria andTehghLessThanOrEqualTo(Integer value) {
            addCriterion("tehgh <=", value, "tehgh");
            return (Criteria) this;
        }

        public Criteria andTehghIn(List<Integer> values) {
            addCriterion("tehgh in", values, "tehgh");
            return (Criteria) this;
        }

        public Criteria andTehghNotIn(List<Integer> values) {
            addCriterion("tehgh not in", values, "tehgh");
            return (Criteria) this;
        }

        public Criteria andTehghBetween(Integer value1, Integer value2) {
            addCriterion("tehgh between", value1, value2, "tehgh");
            return (Criteria) this;
        }

        public Criteria andTehghNotBetween(Integer value1, Integer value2) {
            addCriterion("tehgh not between", value1, value2, "tehgh");
            return (Criteria) this;
        }

        public Criteria andTehpwdIsNull() {
            addCriterion("tehpwd is null");
            return (Criteria) this;
        }

        public Criteria andTehpwdIsNotNull() {
            addCriterion("tehpwd is not null");
            return (Criteria) this;
        }

        public Criteria andTehpwdEqualTo(String value) {
            addCriterion("tehpwd =", value, "tehpwd");
            return (Criteria) this;
        }

        public Criteria andTehpwdNotEqualTo(Integer value) {
            addCriterion("tehpwd <>", value, "tehpwd");
            return (Criteria) this;
        }

        public Criteria andTehpwdGreaterThan(String value) {
            addCriterion("tehpwd >", value, "tehpwd");
            return (Criteria) this;
        }

        public Criteria andTehpwdGreaterThanOrEqualTo(String value) {
            addCriterion("tehpwd >=", value, "tehpwd");
            return (Criteria) this;
        }

        public Criteria andTehpwdLessThan(String value) {
            addCriterion("tehpwd <", value, "tehpwd");
            return (Criteria) this;
        }

        public Criteria andTehpwdLessThanOrEqualTo(String value) {
            addCriterion("tehpwd <=", value, "tehpwd");
            return (Criteria) this;
        }

        public Criteria andTehpwdIn(List<String> values) {
            addCriterion("tehpwd in", values, "tehpwd");
            return (Criteria) this;
        }

        public Criteria andTehpwdNotIn(List<String> values) {
            addCriterion("tehpwd not in", values, "tehpwd");
            return (Criteria) this;
        }

        public Criteria andTehpwdBetween(String value1, String value2) {
            addCriterion("tehpwd between", value1, value2, "tehpwd");
            return (Criteria) this;
        }

        public Criteria andTehpwdNotBetween(String value1, String value2) {
            addCriterion("tehpwd not between", value1, value2, "tehpwd");
            return (Criteria) this;
        }

        public Criteria andTehnameIsNull() {
            addCriterion("tehname is null");
            return (Criteria) this;
        }

        public Criteria andTehnameIsNotNull() {
            addCriterion("tehname is not null");
            return (Criteria) this;
        }

        public Criteria andTehnameEqualTo(String value) {
            addCriterion("tehname =", value, "tehname");
            return (Criteria) this;
        }

        public Criteria andTehnameNotEqualTo(String value) {
            addCriterion("tehname <>", value, "tehname");
            return (Criteria) this;
        }

        public Criteria andTehnameGreaterThan(String value) {
            addCriterion("tehname >", value, "tehname");
            return (Criteria) this;
        }

        public Criteria andTehnameGreaterThanOrEqualTo(String value) {
            addCriterion("tehname >=", value, "tehname");
            return (Criteria) this;
        }

        public Criteria andTehnameLessThan(String value) {
            addCriterion("tehname <", value, "tehname");
            return (Criteria) this;
        }

        public Criteria andTehnameLessThanOrEqualTo(String value) {
            addCriterion("tehname <=", value, "tehname");
            return (Criteria) this;
        }

        public Criteria andTehnameLike(String value) {
            addCriterion("tehname like", value, "tehname");
            return (Criteria) this;
        }

        public Criteria andTehnameNotLike(String value) {
            addCriterion("tehname not like", value, "tehname");
            return (Criteria) this;
        }

        public Criteria andTehnameIn(List<String> values) {
            addCriterion("tehname in", values, "tehname");
            return (Criteria) this;
        }

        public Criteria andTehnameNotIn(List<String> values) {
            addCriterion("tehname not in", values, "tehname");
            return (Criteria) this;
        }

        public Criteria andTehnameBetween(String value1, String value2) {
            addCriterion("tehname between", value1, value2, "tehname");
            return (Criteria) this;
        }

        public Criteria andTehnameNotBetween(String value1, String value2) {
            addCriterion("tehname not between", value1, value2, "tehname");
            return (Criteria) this;
        }

        public Criteria andTehsexIsNull() {
            addCriterion("tehsex is null");
            return (Criteria) this;
        }

        public Criteria andTehsexIsNotNull() {
            addCriterion("tehsex is not null");
            return (Criteria) this;
        }

        public Criteria andTehsexEqualTo(String value) {
            addCriterion("tehsex =", value, "tehsex");
            return (Criteria) this;
        }

        public Criteria andTehsexNotEqualTo(String value) {
            addCriterion("tehsex <>", value, "tehsex");
            return (Criteria) this;
        }

        public Criteria andTehsexGreaterThan(String value) {
            addCriterion("tehsex >", value, "tehsex");
            return (Criteria) this;
        }

        public Criteria andTehsexGreaterThanOrEqualTo(String value) {
            addCriterion("tehsex >=", value, "tehsex");
            return (Criteria) this;
        }

        public Criteria andTehsexLessThan(String value) {
            addCriterion("tehsex <", value, "tehsex");
            return (Criteria) this;
        }

        public Criteria andTehsexLessThanOrEqualTo(String value) {
            addCriterion("tehsex <=", value, "tehsex");
            return (Criteria) this;
        }

        public Criteria andTehsexLike(String value) {
            addCriterion("tehsex like", value, "tehsex");
            return (Criteria) this;
        }

        public Criteria andTehsexNotLike(String value) {
            addCriterion("tehsex not like", value, "tehsex");
            return (Criteria) this;
        }

        public Criteria andTehsexIn(List<String> values) {
            addCriterion("tehsex in", values, "tehsex");
            return (Criteria) this;
        }

        public Criteria andTehsexNotIn(List<String> values) {
            addCriterion("tehsex not in", values, "tehsex");
            return (Criteria) this;
        }

        public Criteria andTehsexBetween(String value1, String value2) {
            addCriterion("tehsex between", value1, value2, "tehsex");
            return (Criteria) this;
        }

        public Criteria andTehsexNotBetween(String value1, String value2) {
            addCriterion("tehsex not between", value1, value2, "tehsex");
            return (Criteria) this;
        }

        public Criteria andTahtelIsNull() {
            addCriterion("tahtel is null");
            return (Criteria) this;
        }

        public Criteria andTahtelIsNotNull() {
            addCriterion("tahtel is not null");
            return (Criteria) this;
        }

        public Criteria andTahtelEqualTo(Integer value) {
            addCriterion("tahtel =", value, "tahtel");
            return (Criteria) this;
        }

        public Criteria andTahtelNotEqualTo(Integer value) {
            addCriterion("tahtel <>", value, "tahtel");
            return (Criteria) this;
        }

        public Criteria andTahtelGreaterThan(Integer value) {
            addCriterion("tahtel >", value, "tahtel");
            return (Criteria) this;
        }

        public Criteria andTahtelGreaterThanOrEqualTo(Integer value) {
            addCriterion("tahtel >=", value, "tahtel");
            return (Criteria) this;
        }

        public Criteria andTahtelLessThan(Integer value) {
            addCriterion("tahtel <", value, "tahtel");
            return (Criteria) this;
        }

        public Criteria andTahtelLessThanOrEqualTo(Integer value) {
            addCriterion("tahtel <=", value, "tahtel");
            return (Criteria) this;
        }

        public Criteria andTahtelIn(List<Integer> values) {
            addCriterion("tahtel in", values, "tahtel");
            return (Criteria) this;
        }

        public Criteria andTahtelNotIn(List<Integer> values) {
            addCriterion("tahtel not in", values, "tahtel");
            return (Criteria) this;
        }

        public Criteria andTahtelBetween(Integer value1, Integer value2) {
            addCriterion("tahtel between", value1, value2, "tahtel");
            return (Criteria) this;
        }

        public Criteria andTahtelNotBetween(Integer value1, Integer value2) {
            addCriterion("tahtel not between", value1, value2, "tahtel");
            return (Criteria) this;
        }

        public Criteria andTehqqIsNull() {
            addCriterion("tehqq is null");
            return (Criteria) this;
        }

        public Criteria andTehqqIsNotNull() {
            addCriterion("tehqq is not null");
            return (Criteria) this;
        }

        public Criteria andTehqqEqualTo(Integer value) {
            addCriterion("tehqq =", value, "tehqq");
            return (Criteria) this;
        }

        public Criteria andTehqqNotEqualTo(Integer value) {
            addCriterion("tehqq <>", value, "tehqq");
            return (Criteria) this;
        }

        public Criteria andTehqqGreaterThan(Integer value) {
            addCriterion("tehqq >", value, "tehqq");
            return (Criteria) this;
        }

        public Criteria andTehqqGreaterThanOrEqualTo(Integer value) {
            addCriterion("tehqq >=", value, "tehqq");
            return (Criteria) this;
        }

        public Criteria andTehqqLessThan(Integer value) {
            addCriterion("tehqq <", value, "tehqq");
            return (Criteria) this;
        }

        public Criteria andTehqqLessThanOrEqualTo(Integer value) {
            addCriterion("tehqq <=", value, "tehqq");
            return (Criteria) this;
        }

        public Criteria andTehqqIn(List<Integer> values) {
            addCriterion("tehqq in", values, "tehqq");
            return (Criteria) this;
        }

        public Criteria andTehqqNotIn(List<Integer> values) {
            addCriterion("tehqq not in", values, "tehqq");
            return (Criteria) this;
        }

        public Criteria andTehqqBetween(Integer value1, Integer value2) {
            addCriterion("tehqq between", value1, value2, "tehqq");
            return (Criteria) this;
        }

        public Criteria andTehqqNotBetween(Integer value1, Integer value2) {
            addCriterion("tehqq not between", value1, value2, "tehqq");
            return (Criteria) this;
        }

        public Criteria andTehcourseIsNull() {
            addCriterion("tehcourse is null");
            return (Criteria) this;
        }

        public Criteria andTehcourseIsNotNull() {
            addCriterion("tehcourse is not null");
            return (Criteria) this;
        }

        public Criteria andTehcourseEqualTo(String value) {
            addCriterion("tehcourse =", value, "tehcourse");
            return (Criteria) this;
        }

        public Criteria andTehcourseNotEqualTo(String value) {
            addCriterion("tehcourse <>", value, "tehcourse");
            return (Criteria) this;
        }

        public Criteria andTehcourseGreaterThan(String value) {
            addCriterion("tehcourse >", value, "tehcourse");
            return (Criteria) this;
        }

        public Criteria andTehcourseGreaterThanOrEqualTo(String value) {
            addCriterion("tehcourse >=", value, "tehcourse");
            return (Criteria) this;
        }

        public Criteria andTehcourseLessThan(String value) {
            addCriterion("tehcourse <", value, "tehcourse");
            return (Criteria) this;
        }

        public Criteria andTehcourseLessThanOrEqualTo(String value) {
            addCriterion("tehcourse <=", value, "tehcourse");
            return (Criteria) this;
        }

        public Criteria andTehcourseLike(String value) {
            addCriterion("tehcourse like", value, "tehcourse");
            return (Criteria) this;
        }

        public Criteria andTehcourseNotLike(String value) {
            addCriterion("tehcourse not like", value, "tehcourse");
            return (Criteria) this;
        }

        public Criteria andTehcourseIn(List<String> values) {
            addCriterion("tehcourse in", values, "tehcourse");
            return (Criteria) this;
        }

        public Criteria andTehcourseNotIn(List<String> values) {
            addCriterion("tehcourse not in", values, "tehcourse");
            return (Criteria) this;
        }

        public Criteria andTehcourseBetween(String value1, String value2) {
            addCriterion("tehcourse between", value1, value2, "tehcourse");
            return (Criteria) this;
        }

        public Criteria andTehcourseNotBetween(String value1, String value2) {
            addCriterion("tehcourse not between", value1, value2, "tehcourse");
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