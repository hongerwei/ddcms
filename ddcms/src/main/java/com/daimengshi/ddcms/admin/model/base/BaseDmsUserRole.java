package com.daimengshi.ddcms.admin.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDmsUserRole<M extends BaseDmsUserRole<M>> extends JbootModel<M> implements IBean {

    public static final String ACTION_ADD = "DmsUserRole:add";
    public static final String ACTION_DELETE = "DmsUserRole:delete";
    public static final String ACTION_UPDATE = "DmsUserRole:update";


    @Override
    public String addAction() {
        return ACTION_ADD;
    }

    @Override
    public String deleteAction() {
        return ACTION_DELETE;
    }

    @Override
    public String updateAction() {
        return ACTION_UPDATE;
    }


	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setRid(java.lang.Integer rid) {
		set("rid", rid);
	}
	
	public java.lang.Integer getRid() {
		return getInt("rid");
	}

	public void setUid(java.lang.String uid) {
		set("uid", uid);
	}
	
	public java.lang.String getUid() {
		return getStr("uid");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}