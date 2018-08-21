package org.ccf.ccfpedia.cms.bean;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupBean {
    private int id;
    private String name;
    private List<FirstClassBean> firstClassList;

    public List<FirstClassBean> getFirstClassList() {
        return firstClassList;
    }

    public void setFirstClassList(List<FirstClassBean> firstClassList) {
        this.firstClassList = firstClassList;
    }

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
}
