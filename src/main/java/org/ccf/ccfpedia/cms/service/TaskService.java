package org.ccf.ccfpedia.cms.service;

import org.ccf.ccfpedia.cms.bean.EntryBean;
import org.ccf.ccfpedia.cms.bean.TaskBean;
import org.ccf.ccfpedia.cms.bean.TaskViewBean;

import java.util.List;

public interface TaskService {

    //获取任务列表
    List<TaskViewBean> getTaskViewList(Integer userid, String keyword, Integer status_id, Integer pageNo, Integer pageSize );
    //获取任务列表新
    List<TaskViewBean> getTaskViewListNew(Integer userid, String keyword, Integer status_id, Integer pageNo, Integer pageSize );
    //通过ID查询任务
    TaskBean getTaskById(int id);
    //获取任务数量
     int getCount(Integer userId, String keyword, Integer status_id);
    //获取任务数量
    int getCountNew(Integer userId, String keyword, Integer status_id);
    //获取工委所有任务列表
    List<TaskViewBean> getCommitteeTaskViewList(int id);
    //获取工委个状态任务列表
    List<TaskViewBean> getCommitteeStateViewList(int id,int stateId);
    //获取工委所有任务数量
    int getCommitteeTaskCount(int id);
    //获取工委各状态任务数量
    int getCommitteeTaskStateCount(int id,int statusId);
    //获取编辑所有任务列表
    List<TaskViewBean> getEditTaskViewList(int id);
    //获取编辑个状态任务列表
    List<TaskViewBean> getEditStateViewList(int id,int stateId);
    //获取编辑所有任务数量
    int getEditTaskCount(int id);
    //获取编辑各状态任务数量
    int getEditTaskStateCount(int id,int statusId);
    //工委专委新建任务
    int addTask(TaskBean taskBean);
    //工委专委修改任务
    int modifyTask(TaskBean taskBean);
    //工委专委删除任务
    int deleteTask(TaskBean taskBean);
    //工委专委完成任务
    int completeTask(TaskBean taskBean);
    //专委驳回任务
    int expertRejectTask(int id, String memo);
    //专委驳回任务
    int editCompleteTask(int id);
    //编辑驳回任务
    int editRejectTask(int id, String memo);
    //通过任务状态查询所有任务
    List<TaskViewBean> getTaskViewByState(int id);
    //获取各状态任务数量
    int taskViewStateCount(int id);
    //获取任务中的词条
    List<EntryBean> getTaskEntryByTaskId(int id);
    //获取任务中的词条数量
    int getTaskEntryCount(int id);

    List<TaskBean> getExpertTaskList(int id );
    //获取专委所有任务列表
    List<TaskViewBean> getExpertTaskViewList(int id);
    //获取专委各状态任务列表
    List<TaskViewBean> getExpertStateViewList(int id,int statusId);
    //获取专委所有任务数量
    int getExpertTaskCount(int id);
    //获取专委各状态任务数量
    int getExpertTaskStateCount(int id,int statusId);
}
