package kr.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// @RequiredArgsConstructor // 원하는 필드만 넣고 싶을 때 필드에 @NonNull 추가해주기
public class MemberVO {
	private String email;
	private String pw;
	private String tel;
	private String addr;
	
	
}
