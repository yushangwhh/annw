package top.annwz.base.mapper;

import top.annwz.base.entity.BaUser;

public interface BaUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(BaUser record);

    int insertSelective(BaUser record);

    int updateByPrimaryKeySelective(BaUser record);

    int updateByPrimaryKey(BaUser record);
    BaUser get(Long ukid);
}