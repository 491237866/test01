package com.bjpowernode.vo;

import java.util.Objects;

public class ViewStudent {
    private String name;
    private Integer id;

    public ViewStudent() {
    }

    public ViewStudent(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewStudent that = (ViewStudent) o;
        return Objects.equals(name, that.name) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "ViewStudent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
