package kr.smhrd.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.smhrd.model.MemberVO;

@Mapper
public interface MemberMapper {

	public void joinService(MemberVO vo);
	public MemberVO loginService(MemberVO vo);
}
