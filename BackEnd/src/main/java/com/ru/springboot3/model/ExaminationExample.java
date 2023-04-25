package com.ru.springboot3.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExaminationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationExample() {
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

        public Criteria andExaminationtitleIsNull() {
            addCriterion("examinationtitle is null");
            return (Criteria) this;
        }

        public Criteria andExaminationtitleIsNotNull() {
            addCriterion("examinationtitle is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationtitleEqualTo(String value) {
            addCriterion("examinationtitle =", value, "examinationtitle");
            return (Criteria) this;
        }

        public Criteria andExaminationtitleNotEqualTo(String value) {
            addCriterion("examinationtitle <>", value, "examinationtitle");
            return (Criteria) this;
        }

        public Criteria andExaminationtitleGreaterThan(String value) {
            addCriterion("examinationtitle >", value, "examinationtitle");
            return (Criteria) this;
        }

        public Criteria andExaminationtitleGreaterThanOrEqualTo(String value) {
            addCriterion("examinationtitle >=", value, "examinationtitle");
            return (Criteria) this;
        }

        public Criteria andExaminationtitleLessThan(String value) {
            addCriterion("examinationtitle <", value, "examinationtitle");
            return (Criteria) this;
        }

        public Criteria andExaminationtitleLessThanOrEqualTo(String value) {
            addCriterion("examinationtitle <=", value, "examinationtitle");
            return (Criteria) this;
        }

        public Criteria andExaminationtitleLike(String value) {
            addCriterion("examinationtitle like", value, "examinationtitle");
            return (Criteria) this;
        }

        public Criteria andExaminationtitleNotLike(String value) {
            addCriterion("examinationtitle not like", value, "examinationtitle");
            return (Criteria) this;
        }

        public Criteria andExaminationtitleIn(List<String> values) {
            addCriterion("examinationtitle in", values, "examinationtitle");
            return (Criteria) this;
        }

        public Criteria andExaminationtitleNotIn(List<String> values) {
            addCriterion("examinationtitle not in", values, "examinationtitle");
            return (Criteria) this;
        }

        public Criteria andExaminationtitleBetween(String value1, String value2) {
            addCriterion("examinationtitle between", value1, value2, "examinationtitle");
            return (Criteria) this;
        }

        public Criteria andExaminationtitleNotBetween(String value1, String value2) {
            addCriterion("examinationtitle not between", value1, value2, "examinationtitle");
            return (Criteria) this;
        }

        public Criteria andExaminationstarttimeIsNull() {
            addCriterion("examinationstarttime is null");
            return (Criteria) this;
        }

        public Criteria andExaminationstarttimeIsNotNull() {
            addCriterion("examinationstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationstarttimeEqualTo(Date value) {
            addCriterion("examinationstarttime =", value, "examinationstarttime");
            return (Criteria) this;
        }

        public Criteria andExaminationstarttimeNotEqualTo(Date value) {
            addCriterion("examinationstarttime <>", value, "examinationstarttime");
            return (Criteria) this;
        }

        public Criteria andExaminationstarttimeGreaterThan(Date value) {
            addCriterion("examinationstarttime >", value, "examinationstarttime");
            return (Criteria) this;
        }

        public Criteria andExaminationstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("examinationstarttime >=", value, "examinationstarttime");
            return (Criteria) this;
        }

        public Criteria andExaminationstarttimeLessThan(Date value) {
            addCriterion("examinationstarttime <", value, "examinationstarttime");
            return (Criteria) this;
        }

        public Criteria andExaminationstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("examinationstarttime <=", value, "examinationstarttime");
            return (Criteria) this;
        }

        public Criteria andExaminationstarttimeIn(List<Date> values) {
            addCriterion("examinationstarttime in", values, "examinationstarttime");
            return (Criteria) this;
        }

        public Criteria andExaminationstarttimeNotIn(List<Date> values) {
            addCriterion("examinationstarttime not in", values, "examinationstarttime");
            return (Criteria) this;
        }

        public Criteria andExaminationstarttimeBetween(Date value1, Date value2) {
            addCriterion("examinationstarttime between", value1, value2, "examinationstarttime");
            return (Criteria) this;
        }

        public Criteria andExaminationstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("examinationstarttime not between", value1, value2, "examinationstarttime");
            return (Criteria) this;
        }

        public Criteria andExaminationendtimeIsNull() {
            addCriterion("examinationendtime is null");
            return (Criteria) this;
        }

        public Criteria andExaminationendtimeIsNotNull() {
            addCriterion("examinationendtime is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationendtimeEqualTo(Date value) {
            addCriterion("examinationendtime =", value, "examinationendtime");
            return (Criteria) this;
        }

        public Criteria andExaminationendtimeNotEqualTo(Date value) {
            addCriterion("examinationendtime <>", value, "examinationendtime");
            return (Criteria) this;
        }

        public Criteria andExaminationendtimeGreaterThan(Date value) {
            addCriterion("examinationendtime >", value, "examinationendtime");
            return (Criteria) this;
        }

        public Criteria andExaminationendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("examinationendtime >=", value, "examinationendtime");
            return (Criteria) this;
        }

        public Criteria andExaminationendtimeLessThan(Date value) {
            addCriterion("examinationendtime <", value, "examinationendtime");
            return (Criteria) this;
        }

        public Criteria andExaminationendtimeLessThanOrEqualTo(Date value) {
            addCriterion("examinationendtime <=", value, "examinationendtime");
            return (Criteria) this;
        }

        public Criteria andExaminationendtimeIn(List<Date> values) {
            addCriterion("examinationendtime in", values, "examinationendtime");
            return (Criteria) this;
        }

        public Criteria andExaminationendtimeNotIn(List<Date> values) {
            addCriterion("examinationendtime not in", values, "examinationendtime");
            return (Criteria) this;
        }

        public Criteria andExaminationendtimeBetween(Date value1, Date value2) {
            addCriterion("examinationendtime between", value1, value2, "examinationendtime");
            return (Criteria) this;
        }

        public Criteria andExaminationendtimeNotBetween(Date value1, Date value2) {
            addCriterion("examinationendtime not between", value1, value2, "examinationendtime");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("`source` is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("`source` is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Double value) {
            addCriterion("`source` =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Double value) {
            addCriterion("`source` <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Double value) {
            addCriterion("`source` >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Double value) {
            addCriterion("`source` >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Double value) {
            addCriterion("`source` <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Double value) {
            addCriterion("`source` <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Double> values) {
            addCriterion("`source` in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Double> values) {
            addCriterion("`source` not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Double value1, Double value2) {
            addCriterion("`source` between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Double value1, Double value2) {
            addCriterion("`source` not between", value1, value2, "source");
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