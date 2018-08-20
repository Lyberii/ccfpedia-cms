package org.ccf.ccfpedia.cms.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.ccf.ccfpedia.cms.bean.FirstClassBean;
import org.ccf.ccfpedia.cms.bean.RoleBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EntryMapper {

    List<FirstClassBean> getFirstClassEntryList();
    int firstClassAllCount();
    int addFirstClassEntry(FirstClassBean firstClassBean);
    int updateByPrimaryKeySelective(FirstClassBean firstClassBean);
}
