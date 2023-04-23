package com.ru.springboot3.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VolunteerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VolunteerExample() {
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

        public Criteria andUserIsNull() {
            addCriterion("`user` is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("`user` is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("`user` =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("`user` <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("`user` >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("`user` >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("`user` <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("`user` <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("`user` like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("`user` not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("`user` in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("`user` not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("`user` between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("`user` not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andPartyidIsNull() {
            addCriterion("partyId is null");
            return (Criteria) this;
        }

        public Criteria andPartyidIsNotNull() {
            addCriterion("partyId is not null");
            return (Criteria) this;
        }

        public Criteria andPartyidEqualTo(String value) {
            addCriterion("partyId =", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidNotEqualTo(String value) {
            addCriterion("partyId <>", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidGreaterThan(String value) {
            addCriterion("partyId >", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidGreaterThanOrEqualTo(String value) {
            addCriterion("partyId >=", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidLessThan(String value) {
            addCriterion("partyId <", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidLessThanOrEqualTo(String value) {
            addCriterion("partyId <=", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidLike(String value) {
            addCriterion("partyId like", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidNotLike(String value) {
            addCriterion("partyId not like", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidIn(List<String> values) {
            addCriterion("partyId in", values, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidNotIn(List<String> values) {
            addCriterion("partyId not in", values, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidBetween(String value1, String value2) {
            addCriterion("partyId between", value1, value2, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidNotBetween(String value1, String value2) {
            addCriterion("partyId not between", value1, value2, "partyid");
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

        public Criteria andVolunteeraddressIsNull() {
            addCriterion("volunteerAddress is null");
            return (Criteria) this;
        }

        public Criteria andVolunteeraddressIsNotNull() {
            addCriterion("volunteerAddress is not null");
            return (Criteria) this;
        }

        public Criteria andVolunteeraddressEqualTo(String value) {
            addCriterion("volunteerAddress =", value, "volunteeraddress");
            return (Criteria) this;
        }

        public Criteria andVolunteeraddressNotEqualTo(String value) {
            addCriterion("volunteerAddress <>", value, "volunteeraddress");
            return (Criteria) this;
        }

        public Criteria andVolunteeraddressGreaterThan(String value) {
            addCriterion("volunteerAddress >", value, "volunteeraddress");
            return (Criteria) this;
        }

        public Criteria andVolunteeraddressGreaterThanOrEqualTo(String value) {
            addCriterion("volunteerAddress >=", value, "volunteeraddress");
            return (Criteria) this;
        }

        public Criteria andVolunteeraddressLessThan(String value) {
            addCriterion("volunteerAddress <", value, "volunteeraddress");
            return (Criteria) this;
        }

        public Criteria andVolunteeraddressLessThanOrEqualTo(String value) {
            addCriterion("volunteerAddress <=", value, "volunteeraddress");
            return (Criteria) this;
        }

        public Criteria andVolunteeraddressLike(String value) {
            addCriterion("volunteerAddress like", value, "volunteeraddress");
            return (Criteria) this;
        }

        public Criteria andVolunteeraddressNotLike(String value) {
            addCriterion("volunteerAddress not like", value, "volunteeraddress");
            return (Criteria) this;
        }

        public Criteria andVolunteeraddressIn(List<String> values) {
            addCriterion("volunteerAddress in", values, "volunteeraddress");
            return (Criteria) this;
        }

        public Criteria andVolunteeraddressNotIn(List<String> values) {
            addCriterion("volunteerAddress not in", values, "volunteeraddress");
            return (Criteria) this;
        }

        public Criteria andVolunteeraddressBetween(String value1, String value2) {
            addCriterion("volunteerAddress between", value1, value2, "volunteeraddress");
            return (Criteria) this;
        }

        public Criteria andVolunteeraddressNotBetween(String value1, String value2) {
            addCriterion("volunteerAddress not between", value1, value2, "volunteeraddress");
            return (Criteria) this;
        }

        public Criteria andVolunteercontextIsNull() {
            addCriterion("volunteerContext is null");
            return (Criteria) this;
        }

        public Criteria andVolunteercontextIsNotNull() {
            addCriterion("volunteerContext is not null");
            return (Criteria) this;
        }

        public Criteria andVolunteercontextEqualTo(String value) {
            addCriterion("volunteerContext =", value, "volunteercontext");
            return (Criteria) this;
        }

        public Criteria andVolunteercontextNotEqualTo(String value) {
            addCriterion("volunteerContext <>", value, "volunteercontext");
            return (Criteria) this;
        }

        public Criteria andVolunteercontextGreaterThan(String value) {
            addCriterion("volunteerContext >", value, "volunteercontext");
            return (Criteria) this;
        }

        public Criteria andVolunteercontextGreaterThanOrEqualTo(String value) {
            addCriterion("volunteerContext >=", value, "volunteercontext");
            return (Criteria) this;
        }

        public Criteria andVolunteercontextLessThan(String value) {
            addCriterion("volunteerContext <", value, "volunteercontext");
            return (Criteria) this;
        }

        public Criteria andVolunteercontextLessThanOrEqualTo(String value) {
            addCriterion("volunteerContext <=", value, "volunteercontext");
            return (Criteria) this;
        }

        public Criteria andVolunteercontextLike(String value) {
            addCriterion("volunteerContext like", value, "volunteercontext");
            return (Criteria) this;
        }

        public Criteria andVolunteercontextNotLike(String value) {
            addCriterion("volunteerContext not like", value, "volunteercontext");
            return (Criteria) this;
        }

        public Criteria andVolunteercontextIn(List<String> values) {
            addCriterion("volunteerContext in", values, "volunteercontext");
            return (Criteria) this;
        }

        public Criteria andVolunteercontextNotIn(List<String> values) {
            addCriterion("volunteerContext not in", values, "volunteercontext");
            return (Criteria) this;
        }

        public Criteria andVolunteercontextBetween(String value1, String value2) {
            addCriterion("volunteerContext between", value1, value2, "volunteercontext");
            return (Criteria) this;
        }

        public Criteria andVolunteercontextNotBetween(String value1, String value2) {
            addCriterion("volunteerContext not between", value1, value2, "volunteercontext");
            return (Criteria) this;
        }

        public Criteria andVolunteertitleIsNull() {
            addCriterion("volunteerTitle is null");
            return (Criteria) this;
        }

        public Criteria andVolunteertitleIsNotNull() {
            addCriterion("volunteerTitle is not null");
            return (Criteria) this;
        }

        public Criteria andVolunteertitleEqualTo(String value) {
            addCriterion("volunteerTitle =", value, "volunteertitle");
            return (Criteria) this;
        }

        public Criteria andVolunteertitleNotEqualTo(String value) {
            addCriterion("volunteerTitle <>", value, "volunteertitle");
            return (Criteria) this;
        }

        public Criteria andVolunteertitleGreaterThan(String value) {
            addCriterion("volunteerTitle >", value, "volunteertitle");
            return (Criteria) this;
        }

        public Criteria andVolunteertitleGreaterThanOrEqualTo(String value) {
            addCriterion("volunteerTitle >=", value, "volunteertitle");
            return (Criteria) this;
        }

        public Criteria andVolunteertitleLessThan(String value) {
            addCriterion("volunteerTitle <", value, "volunteertitle");
            return (Criteria) this;
        }

        public Criteria andVolunteertitleLessThanOrEqualTo(String value) {
            addCriterion("volunteerTitle <=", value, "volunteertitle");
            return (Criteria) this;
        }

        public Criteria andVolunteertitleLike(String value) {
            addCriterion("volunteerTitle like", value, "volunteertitle");
            return (Criteria) this;
        }

        public Criteria andVolunteertitleNotLike(String value) {
            addCriterion("volunteerTitle not like", value, "volunteertitle");
            return (Criteria) this;
        }

        public Criteria andVolunteertitleIn(List<String> values) {
            addCriterion("volunteerTitle in", values, "volunteertitle");
            return (Criteria) this;
        }

        public Criteria andVolunteertitleNotIn(List<String> values) {
            addCriterion("volunteerTitle not in", values, "volunteertitle");
            return (Criteria) this;
        }

        public Criteria andVolunteertitleBetween(String value1, String value2) {
            addCriterion("volunteerTitle between", value1, value2, "volunteertitle");
            return (Criteria) this;
        }

        public Criteria andVolunteertitleNotBetween(String value1, String value2) {
            addCriterion("volunteerTitle not between", value1, value2, "volunteertitle");
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