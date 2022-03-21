package com.bjpowernode.vo;

import java.util.Objects;

public class QueryParam {
    private String paramName;
    private Integer paramAge;

    public QueryParam() {
    }

    public QueryParam(String paramName, Integer paramAge) {
        this.paramName = paramName;
        this.paramAge = paramAge;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public Integer getParamAge() {
        return paramAge;
    }

    public void setParamAge(Integer paramAge) {
        this.paramAge = paramAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QueryParam that = (QueryParam) o;
        return Objects.equals(paramName, that.paramName) && Objects.equals(paramAge, that.paramAge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramName, paramAge);
    }

    @Override
    public String toString() {
        return "QueryParam{" +
                "paramName='" + paramName + '\'' +
                ", paramAge=" + paramAge +
                '}';
    }
}
