package kadai_010;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Scores_chapter10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Connection url =null;
		Statement hyou=null;
		try {
			
			url=DriverManager.getConnection(
					 "jdbc:mysql://localhost/challenge_java",
		                "root",
		                "Mtmt0617@");
			
			System.out.println("データベース接続成功"+url);
		
			hyou =url.createStatement();
			String update ="UPDATE scores SET score_math=95,score_english=80 WHERE id=5;";
			System.out.println("レコード更新を実行します");
			int rowCnt =hyou.executeUpdate(update);
			System.out.println(rowCnt+"件のレコードが更新されました");
			
			
			
			String sql = "SELECT * FROM scores ORDER BY score_math DESC,score_english DESC;";
			ResultSet result = hyou.executeQuery(sql);
			System.out.println("数学・英語の点数が高い順に並べ替えました");
			
			
			 while(result.next()) {
	                int id = result.getInt("id");
	                String name = result.getString("name");
	                int score_math = result.getInt("score_math");
	                int score_english =result.getInt("score_english");
	                System.out.println(result.getRow() + "件目：生徒id=" + id
	                                   + "／氏名=" + name + "／数学=" + score_math+"／英語="+score_english );
	            }
			 
			 
			
			
	
           
			
			
			
	}catch(SQLException e) {
		System.out.println("エラー発生："+ e.getMessage());
		
	}finally {
        // 使用したオブジェクトを解放
        if( url != null ) {
            
            try { url.close(); } catch(SQLException ignore) {}
            
        }
        if( hyou != null ) {
            try { hyou.close(); } catch(SQLException ignore) {}
        }
        
}
}

}
