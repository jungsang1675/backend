package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import project.Board;

public class BoardExample4 {
	//Field
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	
	//Constructor
	public BoardExample4() {
		try {
			//JDBC Driver ���
			Class.forName("oracle.jdbc.OracleDriver");
			
			//�����ϱ�
			conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/XE", 
				"java", 
				"oracle"
			);
		} catch(Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	//Method	
	public void list() {
		//Ÿ��Ʋ �� �÷��� ���
		System.out.println();
		System.out.println("[�Խù� ���]");
		System.out.println("-----------------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("-----------------------------------------------------------------------");
		
		//boards ���̺��� �Խù� ������ �����ͼ� ����ϱ�
		try {
			String sql = "" +
				"SELECT bno, btitle, bcontent, bwriter, bdate " +
				"FROM boards " + 
				"ORDER BY bno DESC";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {		
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s \n", 
						board.getBno(), 
						board.getBwriter(),
						board.getBdate(),
						board.getBtitle());
			}
			rs.close();
			pstmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
			exit();
		}
		
		//���� �޴� ���
		mainMenu();
	}
	
	public void mainMenu() {
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("���� �޴�: 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("�޴� ����: ");
		String menuNo = scanner.nextLine();
		System.out.println();
		
		switch(menuNo) {
			case "1" -> create();
			case "2" -> read();
			case "3" -> clear();
			case "4" -> exit();
		}
	}	
	
	public void create() {
		//�Է� �ޱ�
		Board board = new Board();
		System.out.println("[�� �Խù� �Է�]");
		System.out.print("����: "); 	
		board.setBtitle(scanner.nextLine());
		System.out.print("����: "); 	
		board.setBcontent(scanner.nextLine());
		System.out.print("�ۼ���: "); 	
		board.setBwriter(scanner.nextLine());
		
		//���� �޴� ���
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("���� �޴�: 1.Ok | 2.Cancel");
		System.out.print("�޴� ����: ");
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			//boards ���̺� �Խù� ���� ����
			try {
				String sql = "" +
					"INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate) " +
					"VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		
		//�Խù� ��� ���
		list();
	}
	
	public void read() {
		System.out.println("*** read() �޼ҵ� �����");
		list();
	}
	
	public void clear() {
		System.out.println("*** clear() �޼ҵ� �����");
		list();
	}
	
	public void exit() {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		BoardExample4 boardExample = new BoardExample4();
		boardExample.list();
	}
}