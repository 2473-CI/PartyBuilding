package com.ru.springboot3.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterviewExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIsNull() {
            addCriterion("interviewee is null");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIsNotNull() {
            addCriterion("interviewee is not null");
            return (Criteria) this;
        }

        public Criteria andIntervieweeEqualTo(String value) {
            addCriterion("interviewee =", value, "interviewee");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNotEqualTo(String value) {
            addCriterion("interviewee <>", value, "interviewee");
            return (Criteria) this;
        }

        public Criteria andIntervieweeGreaterThan(String value) {
            addCriterion("interviewee >", value, "interviewee");
            return (Criteria) this;
        }

        public Criteria andIntervieweeGreaterThanOrEqualTo(String value) {
            addCriterion("interviewee >=", value, "interviewee");
            return (Criteria) this;
        }

        public Criteria andIntervieweeLessThan(String value) {
            addCriterion("interviewee <", value, "interviewee");
            return (Criteria) this;
        }

        public Criteria andIntervieweeLessThanOrEqualTo(String value) {
            addCriterion("interviewee <=", value, "interviewee");
            return (Criteria) this;
        }

        public Criteria andIntervieweeLike(String value) {
            addCriterion("interviewee like", value, "interviewee");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNotLike(String value) {
            addCriterion("interviewee not like", value, "interviewee");
            return (Criteria) this;
        }

        public Criteria andIntervieweeIn(List<String> values) {
            addCriterion("interviewee in", values, "interviewee");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNotIn(List<String> values) {
            addCriterion("interviewee not in", values, "interviewee");
            return (Criteria) this;
        }

        public Criteria andIntervieweeBetween(String value1, String value2) {
            addCriterion("interviewee between", value1, value2, "interviewee");
            return (Criteria) this;
        }

        public Criteria andIntervieweeNotBetween(String value1, String value2) {
            addCriterion("interviewee not between", value1, value2, "interviewee");
            return (Criteria) this;
        }

        public Criteria andInterviewerIsNull() {
            addCriterion("interviewer is null");
            return (Criteria) this;
        }

        public Criteria andInterviewerIsNotNull() {
            addCriterion("interviewer is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewerEqualTo(String value) {
            addCriterion("interviewer =", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerNotEqualTo(String value) {
            addCriterion("interviewer <>", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerGreaterThan(String value) {
            addCriterion("interviewer >", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerGreaterThanOrEqualTo(String value) {
            addCriterion("interviewer >=", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerLessThan(String value) {
            addCriterion("interviewer <", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerLessThanOrEqualTo(String value) {
            addCriterion("interviewer <=", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerLike(String value) {
            addCriterion("interviewer like", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerNotLike(String value) {
            addCriterion("interviewer not like", value, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerIn(List<String> values) {
            addCriterion("interviewer in", values, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerNotIn(List<String> values) {
            addCriterion("interviewer not in", values, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerBetween(String value1, String value2) {
            addCriterion("interviewer between", value1, value2, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewerNotBetween(String value1, String value2) {
            addCriterion("interviewer not between", value1, value2, "interviewer");
            return (Criteria) this;
        }

        public Criteria andInterviewlocationIsNull() {
            addCriterion("interviewLocation is null");
            return (Criteria) this;
        }

        public Criteria andInterviewlocationIsNotNull() {
            addCriterion("interviewLocation is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewlocationEqualTo(String value) {
            addCriterion("interviewLocation =", value, "interviewlocation");
            return (Criteria) this;
        }

        public Criteria andInterviewlocationNotEqualTo(String value) {
            addCriterion("interviewLocation <>", value, "interviewlocation");
            return (Criteria) this;
        }

        public Criteria andInterviewlocationGreaterThan(String value) {
            addCriterion("interviewLocation >", value, "interviewlocation");
            return (Criteria) this;
        }

        public Criteria andInterviewlocationGreaterThanOrEqualTo(String value) {
            addCriterion("interviewLocation >=", value, "interviewlocation");
            return (Criteria) this;
        }

        public Criteria andInterviewlocationLessThan(String value) {
            addCriterion("interviewLocation <", value, "interviewlocation");
            return (Criteria) this;
        }

        public Criteria andInterviewlocationLessThanOrEqualTo(String value) {
            addCriterion("interviewLocation <=", value, "interviewlocation");
            return (Criteria) this;
        }

        public Criteria andInterviewlocationLike(String value) {
            addCriterion("interviewLocation like", value, "interviewlocation");
            return (Criteria) this;
        }

        public Criteria andInterviewlocationNotLike(String value) {
            addCriterion("interviewLocation not like", value, "interviewlocation");
            return (Criteria) this;
        }

        public Criteria andInterviewlocationIn(List<String> values) {
            addCriterion("interviewLocation in", values, "interviewlocation");
            return (Criteria) this;
        }

        public Criteria andInterviewlocationNotIn(List<String> values) {
            addCriterion("interviewLocation not in", values, "interviewlocation");
            return (Criteria) this;
        }

        public Criteria andInterviewlocationBetween(String value1, String value2) {
            addCriterion("interviewLocation between", value1, value2, "interviewlocation");
            return (Criteria) this;
        }

        public Criteria andInterviewlocationNotBetween(String value1, String value2) {
            addCriterion("interviewLocation not between", value1, value2, "interviewlocation");
            return (Criteria) this;
        }

        public Criteria andContextIsNull() {
            addCriterion("context is null");
            return (Criteria) this;
        }

        public Criteria andContextIsNotNull() {
            addCriterion("context is not null");
            return (Criteria) this;
        }

        public Criteria andContextEqualTo(String value) {
            addCriterion("context =", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotEqualTo(String value) {
            addCriterion("context <>", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextGreaterThan(String value) {
            addCriterion("context >", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextGreaterThanOrEqualTo(String value) {
            addCriterion("context >=", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLessThan(String value) {
            addCriterion("context <", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLessThanOrEqualTo(String value) {
            addCriterion("context <=", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLike(String value) {
            addCriterion("context like", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotLike(String value) {
            addCriterion("context not like", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextIn(List<String> values) {
            addCriterion("context in", values, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotIn(List<String> values) {
            addCriterion("context not in", values, "context");
            return (Criteria) this;
        }

        public Criteria andContextBetween(String value1, String value2) {
            addCriterion("context between", value1, value2, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotBetween(String value1, String value2) {
            addCriterion("context not between", value1, value2, "context");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeIsNull() {
            addCriterion("interviewTime is null");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeIsNotNull() {
            addCriterion("interviewTime is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeEqualTo(Date value) {
            addCriterion("interviewTime =", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeNotEqualTo(Date value) {
            addCriterion("interviewTime <>", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeGreaterThan(Date value) {
            addCriterion("interviewTime >", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("interviewTime >=", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeLessThan(Date value) {
            addCriterion("interviewTime <", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeLessThanOrEqualTo(Date value) {
            addCriterion("interviewTime <=", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeIn(List<Date> values) {
            addCriterion("interviewTime in", values, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeNotIn(List<Date> values) {
            addCriterion("interviewTime not in", values, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeBetween(Date value1, Date value2) {
            addCriterion("interviewTime between", value1, value2, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeNotBetween(Date value1, Date value2) {
            addCriterion("interviewTime not between", value1, value2, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andBelongtoIsNull() {
            addCriterion("belongto is null");
            return (Criteria) this;
        }

        public Criteria andBelongtoIsNotNull() {
            addCriterion("belongto is not null");
            return (Criteria) this;
        }

        public Criteria andBelongtoEqualTo(String value) {
            addCriterion("belongto =", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoNotEqualTo(String value) {
            addCriterion("belongto <>", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoGreaterThan(String value) {
            addCriterion("belongto >", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoGreaterThanOrEqualTo(String value) {
            addCriterion("belongto >=", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoLessThan(String value) {
            addCriterion("belongto <", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoLessThanOrEqualTo(String value) {
            addCriterion("belongto <=", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoLike(String value) {
            addCriterion("belongto like", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoNotLike(String value) {
            addCriterion("belongto not like", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoIn(List<String> values) {
            addCriterion("belongto in", values, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoNotIn(List<String> values) {
            addCriterion("belongto not in", values, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoBetween(String value1, String value2) {
            addCriterion("belongto between", value1, value2, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoNotBetween(String value1, String value2) {
            addCriterion("belongto not between", value1, value2, "belongto");
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