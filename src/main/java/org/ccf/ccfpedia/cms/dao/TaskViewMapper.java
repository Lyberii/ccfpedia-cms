package org.ccf.ccfpedia.cms.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.ccf.ccfpedia.cms.bean.TaskViewBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TaskViewMapper {
    List<TaskViewBean> selectByCommitteeId(@Param("id") Integer id);
    int committeeAllCount(@Param("id") Integer id);
    int committeeStateCount(@Param("id") Integer id,@Param("statusId") Integer stateId);
    List<TaskViewBean> selectByCommitteeAndState(@Param("id") Integer id,@Param("statusId") Integer stateId);
    List<TaskViewBean> selectByEditId(@Param("id") Integer id);
    int editAllCount(@Param("id") Integer id);
    int editStateCount(@Param("id") Integer id,@Param("statusId") Integer stateId);
    List<TaskViewBean> selectByEditAndState(@Param("id") Integer id,@Param("statusId") Integer stateId);
    List<TaskViewBean> selectTaskViewByState(@Param("id") Integer id);
    int taskViewStateCount(@Param("id") Integer id);
    List<TaskViewBean> selectTaskViewList(@Param("userId") Integer userid,@Param("roleId") Integer roleId,@Param("keyword") String keyword,@Param("statusId") Integer statusId,@Param("pageNo") Integer pageNo,@Param("pageSize") Integer pageSize);
    List<TaskViewBean> selectTaskViewListNew(@Param("userId") Integer userid,@Param("roleId") Integer roleId,@Param("keyword") String keyword,@Param("status") List<Integer> idList,@Param("pageNo") Integer pageNo,@Param("pageSize") Integer pageSize);
    int getCount(@Param("userId") Integer userid,@Param("roleId") Integer roleId,@Param("keyword") String keyword,@Param("statusId") Integer statusId);
    int getCountNew(@Param("userId") Integer userid,@Param("roleId") Integer roleId,@Param("keyword") String keyword,@Param("status") List<Integer> statusId);

    List<TaskViewBean> selectByExpertId(@Param("id") Integer id);
    int allExpertCount(@Param("id") Integer id);
    int expertStateCount(@Param("id") Integer id,@Param("statusId") Integer statusId);
    List<TaskViewBean> selectByExpertAndState(@Param("id") Integer id,@Param("statusId") Integer statusId);
}
