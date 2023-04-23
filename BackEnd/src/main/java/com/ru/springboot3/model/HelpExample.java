package com.ru.springboot3.model;

import java.util.ArrayList;
import java.util.List;

public class HelpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HelpExample() {
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

        public Criteria andHelpobjectIsNull() {
            addCriterion("helpObject is null");
            return (Criteria) this;
        }

        public Criteria andHelpobjectIsNotNull() {
            addCriterion("helpObject is not null");
            return (Criteria) this;
        }

        public Criteria andHelpobjectEqualTo(String value) {
            addCriterion("helpObject =", value, "helpobject");
            return (Criteria) this;
        }

        public Criteria andHelpobjectNotEqualTo(String value) {
            addCriterion("helpObject <>", value, "helpobject");
            return (Criteria) this;
        }

        public Criteria andHelpobjectGreaterThan(String value) {
            addCriterion("helpObject >", value, "helpobject");
            return (Criteria) this;
        }

        public Criteria andHelpobjectGreaterThanOrEqualTo(String value) {
            addCriterion("helpObject >=", value, "helpobject");
            return (Criteria) this;
        }

        public Criteria andHelpobjectLessThan(String value) {
            addCriterion("helpObject <", value, "helpobject");
            return (Criteria) this;
        }

        public Criteria andHelpobjectLessThanOrEqualTo(String value) {
            addCriterion("helpObject <=", value, "helpobject");
            return (Criteria) this;
        }

        public Criteria andHelpobjectLike(String value) {
            addCriterion("helpObject like", value, "helpobject");
            return (Criteria) this;
        }

        public Criteria andHelpobjectNotLike(String value) {
            addCriterion("helpObject not like", value, "helpobject");
            return (Criteria) this;
        }

        public Criteria andHelpobjectIn(List<String> values) {
            addCriterion("helpObject in", values, "helpobject");
            return (Criteria) this;
        }

        public Criteria andHelpobjectNotIn(List<String> values) {
            addCriterion("helpObject not in", values, "helpobject");
            return (Criteria) this;
        }

        public Criteria andHelpobjectBetween(String value1, String value2) {
            addCriterion("helpObject between", value1, value2, "helpobject");
            return (Criteria) this;
        }

        public Criteria andHelpobjectNotBetween(String value1, String value2) {
            addCriterion("helpObject not between", value1, value2, "helpobject");
            return (Criteria) this;
        }

        public Criteria andHelpobjectcardIsNull() {
            addCriterion("helpObjectCard is null");
            return (Criteria) this;
        }

        public Criteria andHelpobjectcardIsNotNull() {
            addCriterion("helpObjectCard is not null");
            return (Criteria) this;
        }

        public Criteria andHelpobjectcardEqualTo(String value) {
            addCriterion("helpObjectCard =", value, "helpobjectcard");
            return (Criteria) this;
        }

        public Criteria andHelpobjectcardNotEqualTo(String value) {
            addCriterion("helpObjectCard <>", value, "helpobjectcard");
            return (Criteria) this;
        }

        public Criteria andHelpobjectcardGreaterThan(String value) {
            addCriterion("helpObjectCard >", value, "helpobjectcard");
            return (Criteria) this;
        }

        public Criteria andHelpobjectcardGreaterThanOrEqualTo(String value) {
            addCriterion("helpObjectCard >=", value, "helpobjectcard");
            return (Criteria) this;
        }

        public Criteria andHelpobjectcardLessThan(String value) {
            addCriterion("helpObjectCard <", value, "helpobjectcard");
            return (Criteria) this;
        }

        public Criteria andHelpobjectcardLessThanOrEqualTo(String value) {
            addCriterion("helpObjectCard <=", value, "helpobjectcard");
            return (Criteria) this;
        }

        public Criteria andHelpobjectcardLike(String value) {
            addCriterion("helpObjectCard like", value, "helpobjectcard");
            return (Criteria) this;
        }

        public Criteria andHelpobjectcardNotLike(String value) {
            addCriterion("helpObjectCard not like", value, "helpobjectcard");
            return (Criteria) this;
        }

        public Criteria andHelpobjectcardIn(List<String> values) {
            addCriterion("helpObjectCard in", values, "helpobjectcard");
            return (Criteria) this;
        }

        public Criteria andHelpobjectcardNotIn(List<String> values) {
            addCriterion("helpObjectCard not in", values, "helpobjectcard");
            return (Criteria) this;
        }

        public Criteria andHelpobjectcardBetween(String value1, String value2) {
            addCriterion("helpObjectCard between", value1, value2, "helpobjectcard");
            return (Criteria) this;
        }

        public Criteria andHelpobjectcardNotBetween(String value1, String value2) {
            addCriterion("helpObjectCard not between", value1, value2, "helpobjectcard");
            return (Criteria) this;
        }

        public Criteria andHelpobjectadressIsNull() {
            addCriterion("helpObjectAdress is null");
            return (Criteria) this;
        }

        public Criteria andHelpobjectadressIsNotNull() {
            addCriterion("helpObjectAdress is not null");
            return (Criteria) this;
        }

        public Criteria andHelpobjectadressEqualTo(String value) {
            addCriterion("helpObjectAdress =", value, "helpobjectadress");
            return (Criteria) this;
        }

        public Criteria andHelpobjectadressNotEqualTo(String value) {
            addCriterion("helpObjectAdress <>", value, "helpobjectadress");
            return (Criteria) this;
        }

        public Criteria andHelpobjectadressGreaterThan(String value) {
            addCriterion("helpObjectAdress >", value, "helpobjectadress");
            return (Criteria) this;
        }

        public Criteria andHelpobjectadressGreaterThanOrEqualTo(String value) {
            addCriterion("helpObjectAdress >=", value, "helpobjectadress");
            return (Criteria) this;
        }

        public Criteria andHelpobjectadressLessThan(String value) {
            addCriterion("helpObjectAdress <", value, "helpobjectadress");
            return (Criteria) this;
        }

        public Criteria andHelpobjectadressLessThanOrEqualTo(String value) {
            addCriterion("helpObjectAdress <=", value, "helpobjectadress");
            return (Criteria) this;
        }

        public Criteria andHelpobjectadressLike(String value) {
            addCriterion("helpObjectAdress like", value, "helpobjectadress");
            return (Criteria) this;
        }

        public Criteria andHelpobjectadressNotLike(String value) {
            addCriterion("helpObjectAdress not like", value, "helpobjectadress");
            return (Criteria) this;
        }

        public Criteria andHelpobjectadressIn(List<String> values) {
            addCriterion("helpObjectAdress in", values, "helpobjectadress");
            return (Criteria) this;
        }

        public Criteria andHelpobjectadressNotIn(List<String> values) {
            addCriterion("helpObjectAdress not in", values, "helpobjectadress");
            return (Criteria) this;
        }

        public Criteria andHelpobjectadressBetween(String value1, String value2) {
            addCriterion("helpObjectAdress between", value1, value2, "helpobjectadress");
            return (Criteria) this;
        }

        public Criteria andHelpobjectadressNotBetween(String value1, String value2) {
            addCriterion("helpObjectAdress not between", value1, value2, "helpobjectadress");
            return (Criteria) this;
        }

        public Criteria andHelperpartyidIsNull() {
            addCriterion("helperPartyId is null");
            return (Criteria) this;
        }

        public Criteria andHelperpartyidIsNotNull() {
            addCriterion("helperPartyId is not null");
            return (Criteria) this;
        }

        public Criteria andHelperpartyidEqualTo(String value) {
            addCriterion("helperPartyId =", value, "helperpartyid");
            return (Criteria) this;
        }

        public Criteria andHelperpartyidNotEqualTo(String value) {
            addCriterion("helperPartyId <>", value, "helperpartyid");
            return (Criteria) this;
        }

        public Criteria andHelperpartyidGreaterThan(String value) {
            addCriterion("helperPartyId >", value, "helperpartyid");
            return (Criteria) this;
        }

        public Criteria andHelperpartyidGreaterThanOrEqualTo(String value) {
            addCriterion("helperPartyId >=", value, "helperpartyid");
            return (Criteria) this;
        }

        public Criteria andHelperpartyidLessThan(String value) {
            addCriterion("helperPartyId <", value, "helperpartyid");
            return (Criteria) this;
        }

        public Criteria andHelperpartyidLessThanOrEqualTo(String value) {
            addCriterion("helperPartyId <=", value, "helperpartyid");
            return (Criteria) this;
        }

        public Criteria andHelperpartyidLike(String value) {
            addCriterion("helperPartyId like", value, "helperpartyid");
            return (Criteria) this;
        }

        public Criteria andHelperpartyidNotLike(String value) {
            addCriterion("helperPartyId not like", value, "helperpartyid");
            return (Criteria) this;
        }

        public Criteria andHelperpartyidIn(List<String> values) {
            addCriterion("helperPartyId in", values, "helperpartyid");
            return (Criteria) this;
        }

        public Criteria andHelperpartyidNotIn(List<String> values) {
            addCriterion("helperPartyId not in", values, "helperpartyid");
            return (Criteria) this;
        }

        public Criteria andHelperpartyidBetween(String value1, String value2) {
            addCriterion("helperPartyId between", value1, value2, "helperpartyid");
            return (Criteria) this;
        }

        public Criteria andHelperpartyidNotBetween(String value1, String value2) {
            addCriterion("helperPartyId not between", value1, value2, "helperpartyid");
            return (Criteria) this;
        }

        public Criteria andHelpernameIsNull() {
            addCriterion("helperName is null");
            return (Criteria) this;
        }

        public Criteria andHelpernameIsNotNull() {
            addCriterion("helperName is not null");
            return (Criteria) this;
        }

        public Criteria andHelpernameEqualTo(String value) {
            addCriterion("helperName =", value, "helpername");
            return (Criteria) this;
        }

        public Criteria andHelpernameNotEqualTo(String value) {
            addCriterion("helperName <>", value, "helpername");
            return (Criteria) this;
        }

        public Criteria andHelpernameGreaterThan(String value) {
            addCriterion("helperName >", value, "helpername");
            return (Criteria) this;
        }

        public Criteria andHelpernameGreaterThanOrEqualTo(String value) {
            addCriterion("helperName >=", value, "helpername");
            return (Criteria) this;
        }

        public Criteria andHelpernameLessThan(String value) {
            addCriterion("helperName <", value, "helpername");
            return (Criteria) this;
        }

        public Criteria andHelpernameLessThanOrEqualTo(String value) {
            addCriterion("helperName <=", value, "helpername");
            return (Criteria) this;
        }

        public Criteria andHelpernameLike(String value) {
            addCriterion("helperName like", value, "helpername");
            return (Criteria) this;
        }

        public Criteria andHelpernameNotLike(String value) {
            addCriterion("helperName not like", value, "helpername");
            return (Criteria) this;
        }

        public Criteria andHelpernameIn(List<String> values) {
            addCriterion("helperName in", values, "helpername");
            return (Criteria) this;
        }

        public Criteria andHelpernameNotIn(List<String> values) {
            addCriterion("helperName not in", values, "helpername");
            return (Criteria) this;
        }

        public Criteria andHelpernameBetween(String value1, String value2) {
            addCriterion("helperName between", value1, value2, "helpername");
            return (Criteria) this;
        }

        public Criteria andHelpernameNotBetween(String value1, String value2) {
            addCriterion("helperName not between", value1, value2, "helpername");
            return (Criteria) this;
        }

        public Criteria andHelpercardIsNull() {
            addCriterion("helperCard is null");
            return (Criteria) this;
        }

        public Criteria andHelpercardIsNotNull() {
            addCriterion("helperCard is not null");
            return (Criteria) this;
        }

        public Criteria andHelpercardEqualTo(String value) {
            addCriterion("helperCard =", value, "helpercard");
            return (Criteria) this;
        }

        public Criteria andHelpercardNotEqualTo(String value) {
            addCriterion("helperCard <>", value, "helpercard");
            return (Criteria) this;
        }

        public Criteria andHelpercardGreaterThan(String value) {
            addCriterion("helperCard >", value, "helpercard");
            return (Criteria) this;
        }

        public Criteria andHelpercardGreaterThanOrEqualTo(String value) {
            addCriterion("helperCard >=", value, "helpercard");
            return (Criteria) this;
        }

        public Criteria andHelpercardLessThan(String value) {
            addCriterion("helperCard <", value, "helpercard");
            return (Criteria) this;
        }

        public Criteria andHelpercardLessThanOrEqualTo(String value) {
            addCriterion("helperCard <=", value, "helpercard");
            return (Criteria) this;
        }

        public Criteria andHelpercardLike(String value) {
            addCriterion("helperCard like", value, "helpercard");
            return (Criteria) this;
        }

        public Criteria andHelpercardNotLike(String value) {
            addCriterion("helperCard not like", value, "helpercard");
            return (Criteria) this;
        }

        public Criteria andHelpercardIn(List<String> values) {
            addCriterion("helperCard in", values, "helpercard");
            return (Criteria) this;
        }

        public Criteria andHelpercardNotIn(List<String> values) {
            addCriterion("helperCard not in", values, "helpercard");
            return (Criteria) this;
        }

        public Criteria andHelpercardBetween(String value1, String value2) {
            addCriterion("helperCard between", value1, value2, "helpercard");
            return (Criteria) this;
        }

        public Criteria andHelpercardNotBetween(String value1, String value2) {
            addCriterion("helperCard not between", value1, value2, "helpercard");
            return (Criteria) this;
        }

        public Criteria andHelperaddressIsNull() {
            addCriterion("helperAddress is null");
            return (Criteria) this;
        }

        public Criteria andHelperaddressIsNotNull() {
            addCriterion("helperAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHelperaddressEqualTo(String value) {
            addCriterion("helperAddress =", value, "helperaddress");
            return (Criteria) this;
        }

        public Criteria andHelperaddressNotEqualTo(String value) {
            addCriterion("helperAddress <>", value, "helperaddress");
            return (Criteria) this;
        }

        public Criteria andHelperaddressGreaterThan(String value) {
            addCriterion("helperAddress >", value, "helperaddress");
            return (Criteria) this;
        }

        public Criteria andHelperaddressGreaterThanOrEqualTo(String value) {
            addCriterion("helperAddress >=", value, "helperaddress");
            return (Criteria) this;
        }

        public Criteria andHelperaddressLessThan(String value) {
            addCriterion("helperAddress <", value, "helperaddress");
            return (Criteria) this;
        }

        public Criteria andHelperaddressLessThanOrEqualTo(String value) {
            addCriterion("helperAddress <=", value, "helperaddress");
            return (Criteria) this;
        }

        public Criteria andHelperaddressLike(String value) {
            addCriterion("helperAddress like", value, "helperaddress");
            return (Criteria) this;
        }

        public Criteria andHelperaddressNotLike(String value) {
            addCriterion("helperAddress not like", value, "helperaddress");
            return (Criteria) this;
        }

        public Criteria andHelperaddressIn(List<String> values) {
            addCriterion("helperAddress in", values, "helperaddress");
            return (Criteria) this;
        }

        public Criteria andHelperaddressNotIn(List<String> values) {
            addCriterion("helperAddress not in", values, "helperaddress");
            return (Criteria) this;
        }

        public Criteria andHelperaddressBetween(String value1, String value2) {
            addCriterion("helperAddress between", value1, value2, "helperaddress");
            return (Criteria) this;
        }

        public Criteria andHelperaddressNotBetween(String value1, String value2) {
            addCriterion("helperAddress not between", value1, value2, "helperaddress");
            return (Criteria) this;
        }

        public Criteria andHelperbelongtoIsNull() {
            addCriterion("helperBelongTo is null");
            return (Criteria) this;
        }

        public Criteria andHelperbelongtoIsNotNull() {
            addCriterion("helperBelongTo is not null");
            return (Criteria) this;
        }

        public Criteria andHelperbelongtoEqualTo(String value) {
            addCriterion("helperBelongTo =", value, "helperbelongto");
            return (Criteria) this;
        }

        public Criteria andHelperbelongtoNotEqualTo(String value) {
            addCriterion("helperBelongTo <>", value, "helperbelongto");
            return (Criteria) this;
        }

        public Criteria andHelperbelongtoGreaterThan(String value) {
            addCriterion("helperBelongTo >", value, "helperbelongto");
            return (Criteria) this;
        }

        public Criteria andHelperbelongtoGreaterThanOrEqualTo(String value) {
            addCriterion("helperBelongTo >=", value, "helperbelongto");
            return (Criteria) this;
        }

        public Criteria andHelperbelongtoLessThan(String value) {
            addCriterion("helperBelongTo <", value, "helperbelongto");
            return (Criteria) this;
        }

        public Criteria andHelperbelongtoLessThanOrEqualTo(String value) {
            addCriterion("helperBelongTo <=", value, "helperbelongto");
            return (Criteria) this;
        }

        public Criteria andHelperbelongtoLike(String value) {
            addCriterion("helperBelongTo like", value, "helperbelongto");
            return (Criteria) this;
        }

        public Criteria andHelperbelongtoNotLike(String value) {
            addCriterion("helperBelongTo not like", value, "helperbelongto");
            return (Criteria) this;
        }

        public Criteria andHelperbelongtoIn(List<String> values) {
            addCriterion("helperBelongTo in", values, "helperbelongto");
            return (Criteria) this;
        }

        public Criteria andHelperbelongtoNotIn(List<String> values) {
            addCriterion("helperBelongTo not in", values, "helperbelongto");
            return (Criteria) this;
        }

        public Criteria andHelperbelongtoBetween(String value1, String value2) {
            addCriterion("helperBelongTo between", value1, value2, "helperbelongto");
            return (Criteria) this;
        }

        public Criteria andHelperbelongtoNotBetween(String value1, String value2) {
            addCriterion("helperBelongTo not between", value1, value2, "helperbelongto");
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