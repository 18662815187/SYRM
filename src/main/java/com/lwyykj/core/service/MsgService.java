package com.lwyykj.core.service;

import java.util.List;

import com.lwyykj.core.bean.app.Msg;

public interface MsgService {
	public List<Msg> findById(Integer id);
}
