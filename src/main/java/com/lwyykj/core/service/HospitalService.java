package com.lwyykj.core.service;
import com.lwyykj.core.bean.hps.Hospital;;
/**
 * 医院服务接口
 * @author john
 *
 */

public interface HospitalService {
	//通过id查询
	public Hospital findByID(int id);
}
