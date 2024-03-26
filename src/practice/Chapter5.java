package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) throws Exception {
		
		//yyyy/MM/ddの形で表示したい
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		List<Task> taskList = new ArrayList<Task>();//1つの要素にLocalDateとActionの二つをもつ空のリストを作成するには<>がStringとかではダメ。コンストラクタTask使用。ラムダ式
		
		
		//Actionを生成してtasklistに追加する
		taskList.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う。"));
		taskList.add(new Task(LocalDate.of(2021, 9, 15), "○○社面談。"));
		taskList.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う。"));
		taskList.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く。"));
		taskList.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く。"));
		
		//Comparatorを使ってListをソートする方法→https://qiita.com/sinoofgan/items/89c200755131f13a3dbc
		taskList.sort(Comparator.comparing(Task::getD, Comparator.naturalOrder()));
		
		//拡張for文で順番に要素を取り出して処理
		for(Task task : taskList) {
			System.out.println(task.getD().format(dateTimeFormatter) + " " + task.getAction());
			
		}
	}
	
	

}
