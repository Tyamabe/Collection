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
	public Task(LocalDate date, String action) {
		this.d = d;
		this.action = action;
	}
	//getter, setter作っておく
	protected LocalDate getD() {
		return d;
	}
	
	protected void setD(LocalDate d) {
		this.d = d;
	}
	
	protected String getAction() {
		return action;
	}
	
	protected void setAction(String action) {
		this.action = action;
	}
	
	
}
