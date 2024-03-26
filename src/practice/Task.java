package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Task {
	//yyyy/MM/ddの形で表示したい
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	//日付を表すdと行動を表すactionの変数を用意する
	private LocalDate d;
	private String action;
	//コンストラクタ
	public Task(LocalDate d, String action) {
		this.d = d;
		this.action = action;
	}
	//getter, setter作っておく
	public LocalDate getD() {
		return d;
	}
	
	public void setD(LocalDate d) {
		this.d = d;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	
}
