package com.entity;

import java.util.ArrayList;
import java.util.List;

public class StuinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuinfoExample() {
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

        public Criteria andStuidIsNull() {
            addCriterion("stuid is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuid is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("stuid =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("stuid <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("stuid >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuid >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("stuid <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("stuid <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("stuid in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("stuid not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("stuid between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuid not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuxhIsNull() {
            addCriterion("stuxh is null");
            return (Criteria) this;
        }

        public Criteria andStuxhIsNotNull() {
            addCriterion("stuxh is not null");
            return (Criteria) this;
        }

        public Criteria andStuxhEqualTo(Integer value) {
            addCriterion("stuxh =", value, "stuxh");
            return (Criteria) this;
        }

        public Criteria andStuxhNotEqualTo(Integer value) {
            addCriterion("stuxh <>", value, "stuxh");
            return (Criteria) this;
        }

        public Criteria andStuxhGreaterThan(Integer value) {
            addCriterion("stuxh >", value, "stuxh");
            return (Criteria) this;
        }

        public Criteria andStuxhGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuxh >=", value, "stuxh");
            return (Criteria) this;
        }

        public Criteria andStuxhLessThan(Integer value) {
            addCriterion("stuxh <", value, "stuxh");
            return (Criteria) this;
        }

        public Criteria andStuxhLessThanOrEqualTo(Integer value) {
            addCriterion("stuxh <=", value, "stuxh");
            return (Criteria) this;
        }

        public Criteria andStuxhIn(List<Integer> values) {
            addCriterion("stuxh in", values, "stuxh");
            return (Criteria) this;
        }

        public Criteria andStuxhNotIn(List<Integer> values) {
            addCriterion("stuxh not in", values, "stuxh");
            return (Criteria) this;
        }

        public Criteria andStuxhBetween(Integer value1, Integer value2) {
            addCriterion("stuxh between", value1, value2, "stuxh");
            return (Criteria) this;
        }

        public Criteria andStuxhNotBetween(Integer value1, Integer value2) {
            addCriterion("stuxh not between", value1, value2, "stuxh");
            return (Criteria) this;
        }

        public Criteria andStupwdIsNull() {
            addCriterion("stupwd is null");
            return (Criteria) this;
        }

        public Criteria andStupwdIsNotNull() {
            addCriterion("stupwd is not null");
            return (Criteria) this;
        }

        public Criteria andStupwdEqualTo(String value) {
            addCriterion("stupwd =", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdNotEqualTo(String value) {
            addCriterion("stupwd <>", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdGreaterThan(String value) {
            addCriterion("stupwd >", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdGreaterThanOrEqualTo(String value) {
            addCriterion("stupwd >=", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdLessThan(String value) {
            addCriterion("stupwd <", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdLessThanOrEqualTo(String value) {
            addCriterion("stupwd <=", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdLike(String value) {
            addCriterion("stupwd like", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdNotLike(String value) {
            addCriterion("stupwd not like", value, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdIn(List<String> values) {
            addCriterion("stupwd in", values, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdNotIn(List<String> values) {
            addCriterion("stupwd not in", values, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdBetween(String value1, String value2) {
            addCriterion("stupwd between", value1, value2, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStupwdNotBetween(String value1, String value2) {
            addCriterion("stupwd not between", value1, value2, "stupwd");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("stuname is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("stuname is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("stuname =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("stuname <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("stuname >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stuname >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("stuname <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("stuname <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("stuname like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("stuname not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("stuname in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("stuname not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("stuname between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("stuname not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStusexIsNull() {
            addCriterion("stusex is null");
            return (Criteria) this;
        }

        public Criteria andStusexIsNotNull() {
            addCriterion("stusex is not null");
            return (Criteria) this;
        }

        public Criteria andStusexEqualTo(String value) {
            addCriterion("stusex =", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotEqualTo(String value) {
            addCriterion("stusex <>", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexGreaterThan(String value) {
            addCriterion("stusex >", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexGreaterThanOrEqualTo(String value) {
            addCriterion("stusex >=", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLessThan(String value) {
            addCriterion("stusex <", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLessThanOrEqualTo(String value) {
            addCriterion("stusex <=", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLike(String value) {
            addCriterion("stusex like", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotLike(String value) {
            addCriterion("stusex not like", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexIn(List<String> values) {
            addCriterion("stusex in", values, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotIn(List<String> values) {
            addCriterion("stusex not in", values, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexBetween(String value1, String value2) {
            addCriterion("stusex between", value1, value2, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotBetween(String value1, String value2) {
            addCriterion("stusex not between", value1, value2, "stusex");
            return (Criteria) this;
        }

        public Criteria andStutelIsNull() {
            addCriterion("stutel is null");
            return (Criteria) this;
        }

        public Criteria andStutelIsNotNull() {
            addCriterion("stutel is not null");
            return (Criteria) this;
        }

        public Criteria andStutelEqualTo(Integer value) {
            addCriterion("stutel =", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelNotEqualTo(Integer value) {
            addCriterion("stutel <>", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelGreaterThan(Integer value) {
            addCriterion("stutel >", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelGreaterThanOrEqualTo(Integer value) {
            addCriterion("stutel >=", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelLessThan(Integer value) {
            addCriterion("stutel <", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelLessThanOrEqualTo(Integer value) {
            addCriterion("stutel <=", value, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelIn(List<Integer> values) {
            addCriterion("stutel in", values, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelNotIn(List<Integer> values) {
            addCriterion("stutel not in", values, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelBetween(Integer value1, Integer value2) {
            addCriterion("stutel between", value1, value2, "stutel");
            return (Criteria) this;
        }

        public Criteria andStutelNotBetween(Integer value1, Integer value2) {
            addCriterion("stutel not between", value1, value2, "stutel");
            return (Criteria) this;
        }

        public Criteria andStuqqIsNull() {
            addCriterion("stuqq is null");
            return (Criteria) this;
        }

        public Criteria andStuqqIsNotNull() {
            addCriterion("stuqq is not null");
            return (Criteria) this;
        }

        public Criteria andStuqqEqualTo(Integer value) {
            addCriterion("stuqq =", value, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqNotEqualTo(Integer value) {
            addCriterion("stuqq <>", value, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqGreaterThan(Integer value) {
            addCriterion("stuqq >", value, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuqq >=", value, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqLessThan(Integer value) {
            addCriterion("stuqq <", value, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqLessThanOrEqualTo(Integer value) {
            addCriterion("stuqq <=", value, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqIn(List<Integer> values) {
            addCriterion("stuqq in", values, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqNotIn(List<Integer> values) {
            addCriterion("stuqq not in", values, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqBetween(Integer value1, Integer value2) {
            addCriterion("stuqq between", value1, value2, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuqqNotBetween(Integer value1, Integer value2) {
            addCriterion("stuqq not between", value1, value2, "stuqq");
            return (Criteria) this;
        }

        public Criteria andStuclassIsNull() {
            addCriterion("stuclass is null");
            return (Criteria) this;
        }

        public Criteria andStuclassIsNotNull() {
            addCriterion("stuclass is not null");
            return (Criteria) this;
        }

        public Criteria andStuclassEqualTo(String value) {
            addCriterion("stuclass =", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassNotEqualTo(String value) {
            addCriterion("stuclass <>", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassGreaterThan(String value) {
            addCriterion("stuclass >", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassGreaterThanOrEqualTo(String value) {
            addCriterion("stuclass >=", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassLessThan(String value) {
            addCriterion("stuclass <", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassLessThanOrEqualTo(String value) {
            addCriterion("stuclass <=", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassLike(String value) {
            addCriterion("stuclass like", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassNotLike(String value) {
            addCriterion("stuclass not like", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassIn(List<String> values) {
            addCriterion("stuclass in", values, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassNotIn(List<String> values) {
            addCriterion("stuclass not in", values, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassBetween(String value1, String value2) {
            addCriterion("stuclass between", value1, value2, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassNotBetween(String value1, String value2) {
            addCriterion("stuclass not between", value1, value2, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStugradeIsNull() {
            addCriterion("stugrade is null");
            return (Criteria) this;
        }

        public Criteria andStugradeIsNotNull() {
            addCriterion("stugrade is not null");
            return (Criteria) this;
        }

        public Criteria andStugradeEqualTo(String value) {
            addCriterion("stugrade =", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeNotEqualTo(String value) {
            addCriterion("stugrade <>", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeGreaterThan(String value) {
            addCriterion("stugrade >", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeGreaterThanOrEqualTo(String value) {
            addCriterion("stugrade >=", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeLessThan(String value) {
            addCriterion("stugrade <", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeLessThanOrEqualTo(String value) {
            addCriterion("stugrade <=", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeLike(String value) {
            addCriterion("stugrade like", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeNotLike(String value) {
            addCriterion("stugrade not like", value, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeIn(List<String> values) {
            addCriterion("stugrade in", values, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeNotIn(List<String> values) {
            addCriterion("stugrade not in", values, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeBetween(String value1, String value2) {
            addCriterion("stugrade between", value1, value2, "stugrade");
            return (Criteria) this;
        }

        public Criteria andStugradeNotBetween(String value1, String value2) {
            addCriterion("stugrade not between", value1, value2, "stugrade");
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