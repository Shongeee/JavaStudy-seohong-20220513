package j18_최상위클래스.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor // 기본생성자 (매개변수가 없는 생성자 Args = 매개변수) // final이 붙은 변수는 생성 시 값이 꼭 들어가야하기 때문에 NoArgsConstructor을 사용할 수 없음
@RequiredArgsConstructor
@AllArgsConstructor // 전체생성자
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Product2 {
	private int productCode;
	@NonNull //RequiredArgsConstructor 사용 시 NonNull 사용 -> 또는 변수에 final 사용
	private String productName;
	private int category;
	private LocalDate productionDate;
	
}
