package com.ru.springboot3.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("`role` is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("`role` is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("`role` =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("`role` <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("`role` >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("`role` >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("`role` <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("`role` <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("`role` like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("`role` not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("`role` in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("`role` not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("`role` between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("`role` not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andIdentitycardIsNull() {
            addCriterion("identityCard is null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardIsNotNull() {
            addCriterion("identityCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardEqualTo(String value) {
            addCriterion("identityCard =", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotEqualTo(String value) {
            addCriterion("identityCard <>", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardGreaterThan(String value) {
            addCriterion("identityCard >", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardGreaterThanOrEqualTo(String value) {
            addCriterion("identityCard >=", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardLessThan(String value) {
            addCriterion("identityCard <", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardLessThanOrEqualTo(String value) {
            addCriterion("identityCard <=", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardLike(String value) {
            addCriterion("identityCard like", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotLike(String value) {
            addCriterion("identityCard not like", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardIn(List<String> values) {
            addCriterion("identityCard in", values, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotIn(List<String> values) {
            addCriterion("identityCard not in", values, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardBetween(String value1, String value2) {
            addCriterion("identityCard between", value1, value2, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotBetween(String value1, String value2) {
            addCriterion("identityCard not between", value1, value2, "identitycard");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
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