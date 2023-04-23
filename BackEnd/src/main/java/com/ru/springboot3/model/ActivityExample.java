package com.ru.springboot3.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andActivityaddressIsNull() {
            addCriterion("activityAddress is null");
            return (Criteria) this;
        }

        public Criteria andActivityaddressIsNotNull() {
            addCriterion("activityAddress is not null");
            return (Criteria) this;
        }

        public Criteria andActivityaddressEqualTo(String value) {
            addCriterion("activityAddress =", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressNotEqualTo(String value) {
            addCriterion("activityAddress <>", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressGreaterThan(String value) {
            addCriterion("activityAddress >", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressGreaterThanOrEqualTo(String value) {
            addCriterion("activityAddress >=", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressLessThan(String value) {
            addCriterion("activityAddress <", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressLessThanOrEqualTo(String value) {
            addCriterion("activityAddress <=", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressLike(String value) {
            addCriterion("activityAddress like", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressNotLike(String value) {
            addCriterion("activityAddress not like", value, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressIn(List<String> values) {
            addCriterion("activityAddress in", values, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressNotIn(List<String> values) {
            addCriterion("activityAddress not in", values, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressBetween(String value1, String value2) {
            addCriterion("activityAddress between", value1, value2, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivityaddressNotBetween(String value1, String value2) {
            addCriterion("activityAddress not between", value1, value2, "activityaddress");
            return (Criteria) this;
        }

        public Criteria andActivitytitleIsNull() {
            addCriterion("activityTitle is null");
            return (Criteria) this;
        }

        public Criteria andActivitytitleIsNotNull() {
            addCriterion("activityTitle is not null");
            return (Criteria) this;
        }

        public Criteria andActivitytitleEqualTo(String value) {
            addCriterion("activityTitle =", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleNotEqualTo(String value) {
            addCriterion("activityTitle <>", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleGreaterThan(String value) {
            addCriterion("activityTitle >", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleGreaterThanOrEqualTo(String value) {
            addCriterion("activityTitle >=", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleLessThan(String value) {
            addCriterion("activityTitle <", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleLessThanOrEqualTo(String value) {
            addCriterion("activityTitle <=", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleLike(String value) {
            addCriterion("activityTitle like", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleNotLike(String value) {
            addCriterion("activityTitle not like", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleIn(List<String> values) {
            addCriterion("activityTitle in", values, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleNotIn(List<String> values) {
            addCriterion("activityTitle not in", values, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleBetween(String value1, String value2) {
            addCriterion("activityTitle between", value1, value2, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleNotBetween(String value1, String value2) {
            addCriterion("activityTitle not between", value1, value2, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andBelongtoIsNull() {
            addCriterion("belongTo is null");
            return (Criteria) this;
        }

        public Criteria andBelongtoIsNotNull() {
            addCriterion("belongTo is not null");
            return (Criteria) this;
        }

        public Criteria andBelongtoEqualTo(String value) {
            addCriterion("belongTo =", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoNotEqualTo(String value) {
            addCriterion("belongTo <>", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoGreaterThan(String value) {
            addCriterion("belongTo >", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoGreaterThanOrEqualTo(String value) {
            addCriterion("belongTo >=", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoLessThan(String value) {
            addCriterion("belongTo <", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoLessThanOrEqualTo(String value) {
            addCriterion("belongTo <=", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoLike(String value) {
            addCriterion("belongTo like", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoNotLike(String value) {
            addCriterion("belongTo not like", value, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoIn(List<String> values) {
            addCriterion("belongTo in", values, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoNotIn(List<String> values) {
            addCriterion("belongTo not in", values, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoBetween(String value1, String value2) {
            addCriterion("belongTo between", value1, value2, "belongto");
            return (Criteria) this;
        }

        public Criteria andBelongtoNotBetween(String value1, String value2) {
            addCriterion("belongTo not between", value1, value2, "belongto");
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