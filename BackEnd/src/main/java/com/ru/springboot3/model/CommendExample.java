package com.ru.springboot3.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommendExample() {
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

        public Criteria andCommendtitleIsNull() {
            addCriterion("commendTitle is null");
            return (Criteria) this;
        }

        public Criteria andCommendtitleIsNotNull() {
            addCriterion("commendTitle is not null");
            return (Criteria) this;
        }

        public Criteria andCommendtitleEqualTo(String value) {
            addCriterion("commendTitle =", value, "commendtitle");
            return (Criteria) this;
        }

        public Criteria andCommendtitleNotEqualTo(String value) {
            addCriterion("commendTitle <>", value, "commendtitle");
            return (Criteria) this;
        }

        public Criteria andCommendtitleGreaterThan(String value) {
            addCriterion("commendTitle >", value, "commendtitle");
            return (Criteria) this;
        }

        public Criteria andCommendtitleGreaterThanOrEqualTo(String value) {
            addCriterion("commendTitle >=", value, "commendtitle");
            return (Criteria) this;
        }

        public Criteria andCommendtitleLessThan(String value) {
            addCriterion("commendTitle <", value, "commendtitle");
            return (Criteria) this;
        }

        public Criteria andCommendtitleLessThanOrEqualTo(String value) {
            addCriterion("commendTitle <=", value, "commendtitle");
            return (Criteria) this;
        }

        public Criteria andCommendtitleLike(String value) {
            addCriterion("commendTitle like", value, "commendtitle");
            return (Criteria) this;
        }

        public Criteria andCommendtitleNotLike(String value) {
            addCriterion("commendTitle not like", value, "commendtitle");
            return (Criteria) this;
        }

        public Criteria andCommendtitleIn(List<String> values) {
            addCriterion("commendTitle in", values, "commendtitle");
            return (Criteria) this;
        }

        public Criteria andCommendtitleNotIn(List<String> values) {
            addCriterion("commendTitle not in", values, "commendtitle");
            return (Criteria) this;
        }

        public Criteria andCommendtitleBetween(String value1, String value2) {
            addCriterion("commendTitle between", value1, value2, "commendtitle");
            return (Criteria) this;
        }

        public Criteria andCommendtitleNotBetween(String value1, String value2) {
            addCriterion("commendTitle not between", value1, value2, "commendtitle");
            return (Criteria) this;
        }

        public Criteria andPartynameIsNull() {
            addCriterion("partyName is null");
            return (Criteria) this;
        }

        public Criteria andPartynameIsNotNull() {
            addCriterion("partyName is not null");
            return (Criteria) this;
        }

        public Criteria andPartynameEqualTo(String value) {
            addCriterion("partyName =", value, "partyname");
            return (Criteria) this;
        }

        public Criteria andPartynameNotEqualTo(String value) {
            addCriterion("partyName <>", value, "partyname");
            return (Criteria) this;
        }

        public Criteria andPartynameGreaterThan(String value) {
            addCriterion("partyName >", value, "partyname");
            return (Criteria) this;
        }

        public Criteria andPartynameGreaterThanOrEqualTo(String value) {
            addCriterion("partyName >=", value, "partyname");
            return (Criteria) this;
        }

        public Criteria andPartynameLessThan(String value) {
            addCriterion("partyName <", value, "partyname");
            return (Criteria) this;
        }

        public Criteria andPartynameLessThanOrEqualTo(String value) {
            addCriterion("partyName <=", value, "partyname");
            return (Criteria) this;
        }

        public Criteria andPartynameLike(String value) {
            addCriterion("partyName like", value, "partyname");
            return (Criteria) this;
        }

        public Criteria andPartynameNotLike(String value) {
            addCriterion("partyName not like", value, "partyname");
            return (Criteria) this;
        }

        public Criteria andPartynameIn(List<String> values) {
            addCriterion("partyName in", values, "partyname");
            return (Criteria) this;
        }

        public Criteria andPartynameNotIn(List<String> values) {
            addCriterion("partyName not in", values, "partyname");
            return (Criteria) this;
        }

        public Criteria andPartynameBetween(String value1, String value2) {
            addCriterion("partyName between", value1, value2, "partyname");
            return (Criteria) this;
        }

        public Criteria andPartynameNotBetween(String value1, String value2) {
            addCriterion("partyName not between", value1, value2, "partyname");
            return (Criteria) this;
        }

        public Criteria andCommenduseridIsNull() {
            addCriterion("commendUserId is null");
            return (Criteria) this;
        }

        public Criteria andCommenduseridIsNotNull() {
            addCriterion("commendUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCommenduseridEqualTo(String value) {
            addCriterion("commendUserId =", value, "commenduserid");
            return (Criteria) this;
        }

        public Criteria andCommenduseridNotEqualTo(String value) {
            addCriterion("commendUserId <>", value, "commenduserid");
            return (Criteria) this;
        }

        public Criteria andCommenduseridGreaterThan(String value) {
            addCriterion("commendUserId >", value, "commenduserid");
            return (Criteria) this;
        }

        public Criteria andCommenduseridGreaterThanOrEqualTo(String value) {
            addCriterion("commendUserId >=", value, "commenduserid");
            return (Criteria) this;
        }

        public Criteria andCommenduseridLessThan(String value) {
            addCriterion("commendUserId <", value, "commenduserid");
            return (Criteria) this;
        }

        public Criteria andCommenduseridLessThanOrEqualTo(String value) {
            addCriterion("commendUserId <=", value, "commenduserid");
            return (Criteria) this;
        }

        public Criteria andCommenduseridLike(String value) {
            addCriterion("commendUserId like", value, "commenduserid");
            return (Criteria) this;
        }

        public Criteria andCommenduseridNotLike(String value) {
            addCriterion("commendUserId not like", value, "commenduserid");
            return (Criteria) this;
        }

        public Criteria andCommenduseridIn(List<String> values) {
            addCriterion("commendUserId in", values, "commenduserid");
            return (Criteria) this;
        }

        public Criteria andCommenduseridNotIn(List<String> values) {
            addCriterion("commendUserId not in", values, "commenduserid");
            return (Criteria) this;
        }

        public Criteria andCommenduseridBetween(String value1, String value2) {
            addCriterion("commendUserId between", value1, value2, "commenduserid");
            return (Criteria) this;
        }

        public Criteria andCommenduseridNotBetween(String value1, String value2) {
            addCriterion("commendUserId not between", value1, value2, "commenduserid");
            return (Criteria) this;
        }

        public Criteria andCommendusernameIsNull() {
            addCriterion("commendUserName is null");
            return (Criteria) this;
        }

        public Criteria andCommendusernameIsNotNull() {
            addCriterion("commendUserName is not null");
            return (Criteria) this;
        }

        public Criteria andCommendusernameEqualTo(String value) {
            addCriterion("commendUserName =", value, "commendusername");
            return (Criteria) this;
        }

        public Criteria andCommendusernameNotEqualTo(String value) {
            addCriterion("commendUserName <>", value, "commendusername");
            return (Criteria) this;
        }

        public Criteria andCommendusernameGreaterThan(String value) {
            addCriterion("commendUserName >", value, "commendusername");
            return (Criteria) this;
        }

        public Criteria andCommendusernameGreaterThanOrEqualTo(String value) {
            addCriterion("commendUserName >=", value, "commendusername");
            return (Criteria) this;
        }

        public Criteria andCommendusernameLessThan(String value) {
            addCriterion("commendUserName <", value, "commendusername");
            return (Criteria) this;
        }

        public Criteria andCommendusernameLessThanOrEqualTo(String value) {
            addCriterion("commendUserName <=", value, "commendusername");
            return (Criteria) this;
        }

        public Criteria andCommendusernameLike(String value) {
            addCriterion("commendUserName like", value, "commendusername");
            return (Criteria) this;
        }

        public Criteria andCommendusernameNotLike(String value) {
            addCriterion("commendUserName not like", value, "commendusername");
            return (Criteria) this;
        }

        public Criteria andCommendusernameIn(List<String> values) {
            addCriterion("commendUserName in", values, "commendusername");
            return (Criteria) this;
        }

        public Criteria andCommendusernameNotIn(List<String> values) {
            addCriterion("commendUserName not in", values, "commendusername");
            return (Criteria) this;
        }

        public Criteria andCommendusernameBetween(String value1, String value2) {
            addCriterion("commendUserName between", value1, value2, "commendusername");
            return (Criteria) this;
        }

        public Criteria andCommendusernameNotBetween(String value1, String value2) {
            addCriterion("commendUserName not between", value1, value2, "commendusername");
            return (Criteria) this;
        }

        public Criteria andCommendcontextIsNull() {
            addCriterion("commendContext is null");
            return (Criteria) this;
        }

        public Criteria andCommendcontextIsNotNull() {
            addCriterion("commendContext is not null");
            return (Criteria) this;
        }

        public Criteria andCommendcontextEqualTo(String value) {
            addCriterion("commendContext =", value, "commendcontext");
            return (Criteria) this;
        }

        public Criteria andCommendcontextNotEqualTo(String value) {
            addCriterion("commendContext <>", value, "commendcontext");
            return (Criteria) this;
        }

        public Criteria andCommendcontextGreaterThan(String value) {
            addCriterion("commendContext >", value, "commendcontext");
            return (Criteria) this;
        }

        public Criteria andCommendcontextGreaterThanOrEqualTo(String value) {
            addCriterion("commendContext >=", value, "commendcontext");
            return (Criteria) this;
        }

        public Criteria andCommendcontextLessThan(String value) {
            addCriterion("commendContext <", value, "commendcontext");
            return (Criteria) this;
        }

        public Criteria andCommendcontextLessThanOrEqualTo(String value) {
            addCriterion("commendContext <=", value, "commendcontext");
            return (Criteria) this;
        }

        public Criteria andCommendcontextLike(String value) {
            addCriterion("commendContext like", value, "commendcontext");
            return (Criteria) this;
        }

        public Criteria andCommendcontextNotLike(String value) {
            addCriterion("commendContext not like", value, "commendcontext");
            return (Criteria) this;
        }

        public Criteria andCommendcontextIn(List<String> values) {
            addCriterion("commendContext in", values, "commendcontext");
            return (Criteria) this;
        }

        public Criteria andCommendcontextNotIn(List<String> values) {
            addCriterion("commendContext not in", values, "commendcontext");
            return (Criteria) this;
        }

        public Criteria andCommendcontextBetween(String value1, String value2) {
            addCriterion("commendContext between", value1, value2, "commendcontext");
            return (Criteria) this;
        }

        public Criteria andCommendcontextNotBetween(String value1, String value2) {
            addCriterion("commendContext not between", value1, value2, "commendcontext");
            return (Criteria) this;
        }

        public Criteria andCommendtimeIsNull() {
            addCriterion("commendTime is null");
            return (Criteria) this;
        }

        public Criteria andCommendtimeIsNotNull() {
            addCriterion("commendTime is not null");
            return (Criteria) this;
        }

        public Criteria andCommendtimeEqualTo(Date value) {
            addCriterion("commendTime =", value, "commendtime");
            return (Criteria) this;
        }

        public Criteria andCommendtimeNotEqualTo(Date value) {
            addCriterion("commendTime <>", value, "commendtime");
            return (Criteria) this;
        }

        public Criteria andCommendtimeGreaterThan(Date value) {
            addCriterion("commendTime >", value, "commendtime");
            return (Criteria) this;
        }

        public Criteria andCommendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commendTime >=", value, "commendtime");
            return (Criteria) this;
        }

        public Criteria andCommendtimeLessThan(Date value) {
            addCriterion("commendTime <", value, "commendtime");
            return (Criteria) this;
        }

        public Criteria andCommendtimeLessThanOrEqualTo(Date value) {
            addCriterion("commendTime <=", value, "commendtime");
            return (Criteria) this;
        }

        public Criteria andCommendtimeIn(List<Date> values) {
            addCriterion("commendTime in", values, "commendtime");
            return (Criteria) this;
        }

        public Criteria andCommendtimeNotIn(List<Date> values) {
            addCriterion("commendTime not in", values, "commendtime");
            return (Criteria) this;
        }

        public Criteria andCommendtimeBetween(Date value1, Date value2) {
            addCriterion("commendTime between", value1, value2, "commendtime");
            return (Criteria) this;
        }

        public Criteria andCommendtimeNotBetween(Date value1, Date value2) {
            addCriterion("commendTime not between", value1, value2, "commendtime");
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