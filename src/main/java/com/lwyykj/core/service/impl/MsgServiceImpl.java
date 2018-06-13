package com.lwyykj.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lwyykj.core.bean.app.Doctor;
import com.lwyykj.core.bean.app.Msg;
import com.lwyykj.core.bean.app.MsgQuery;
import com.lwyykj.core.bean.app.MsgQuery.Criteria;
import com.lwyykj.core.bean.app.User;
import com.lwyykj.core.dao.app.DoctorDao;
import com.lwyykj.core.dao.app.MsgDao;
import com.lwyykj.core.dao.app.UserDao;
import com.lwyykj.core.service.MsgService;

@Service("msgService")
public class MsgServiceImpl implements MsgService {
	@Resource
	private MsgDao msgDao;
	@Resource
	private UserDao userDao;
	@Resource
	private DoctorDao doctorDao;

	@Override
	public List<Msg> findById(Integer id) {
		MsgQuery msgQuery = new MsgQuery();
		Criteria createCriteria = msgQuery.createCriteria();
		createCriteria.andMsgIdEqualTo(id);
		msgQuery.setOrderByClause("addtime desc");
		List<Msg> msgs = msgDao.selectByExample(msgQuery);
		if (null != msgs && msgs.size() > 0) {
			for (Msg msg : msgs) {
				if (msg.getStyle() == 1) {
					User user = userDao.selectByPrimaryKey(msg.getUid());
					if (user != null) {
						msg.setUser(user);
					}

				} else if (msg.getStyle() == 2) {
					Doctor doctor = doctorDao.selectByPrimaryKey(msg.getDocId());
					if (doctor != null) {
						msg.setDoctor(doctor);
					}
				}
			}
			return msgs;
		}
		return null;
	}

}
