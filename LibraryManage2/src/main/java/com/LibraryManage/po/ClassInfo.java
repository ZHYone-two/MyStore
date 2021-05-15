package com.LibraryManage.po;

import java.io.Serializable;

public class ClassInfo  implements Serializable {
    int id;
    String name;
    String remarks;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public ClassInfo() {
    }

    @Override
    public String toString() {
        return "ClassInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

}
