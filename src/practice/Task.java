package practice;

import java.time.LocalDate;


public class Task {
	//日付を表すdと行動を表すactionの変数を用意する
	private LocalDate date;
	private String action;
	//コンストラクタ
	public Task(LocalDate date, String action) {
		this.date = date;
		this.action = action;
	}
	//getter, setter作っておく
	public LocalDate getDate() {
		return this.date;
	}
	
	public String getAction() {
		return this.action;
	}
	
}
