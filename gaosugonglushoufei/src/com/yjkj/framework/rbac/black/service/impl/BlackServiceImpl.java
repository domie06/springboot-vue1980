package com.yjkj.framework.rbac.black.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.rbac.black.model.Black;
import com.yjkj.framework.rbac.black.service.inte.BlackService;
@Service
public class BlackServiceImpl extends BaseService implements BlackService {

	
	@Override
	public Pager informationLoad(Pager pager,Black Black,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("black", Black);
		List<Black> list = this.blackDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Black));
		return pager;
	}

	@Override
	public List<Black> informationLoadAll(Black Black) throws Exception {
		List<Black> list = this.blackDao.informationLoadAll(Black);
		return list;
	}
	

	@Override
	public Integer count(Black Black) throws Exception {
		Integer count = this.blackDao.count(Black);
		return count;
	}

	@Override
	public Black informationLoadOne(Black Black) throws Exception {
			Black = this.blackDao.informationLoadOne(Black);
		return Black;
	}

	@Override
	public void informationDelete(Black Black) throws Exception {
			this.blackDao.informationDelete(Black);

	}

	@Override
	public void informationAdd(Black Black) throws Exception {
			Black.setId(Regular.createId());
			Black.setCreatetime(CreatDate.getDate());
			this.blackDao.informationAdd(Black);

	}

	@Override
	public void informationUpade(Black Black) throws Exception {
			this.blackDao.informationUpdate(Black);
	}

}
