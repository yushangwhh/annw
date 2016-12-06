package top.annwz.base.dubbo.service.imp;

import org.springframework.stereotype.Service;
import top.annwz.base.Dao.IBasicDao;
import top.annwz.base.dubbo.service.IBaUserService;
import top.annwz.base.entity.BaUser;
import top.annwz.base.mapper.BaUserMapper;

import javax.annotation.Resource;

/**
 * Created by Wuhuahui on 2016/12/4.
 */
@Service
public class BaUserService  implements IBaUserService {

	@Resource
	private BaUserMapper baUserMapper;
	@Override
	public BaUser getUser(Long userId) {
		return baUserMapper.get(userId);
	}
}
