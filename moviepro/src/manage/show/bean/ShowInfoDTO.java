package manage.show.bean;

import java.sql.Timestamp;

public class ShowInfoDTO {
	private int shw_num;
	private String shw_moviename;
	private String shw_screen;
	private Timestamp shw_date;
	private int shw_time;
	private int shw_seatcnt;
	public int getShw_num() {
		return shw_num;
	}
	public void setShw_num(int shw_num) {
		this.shw_num = shw_num;
	}
	public String getShw_moviename() {
		return shw_moviename;
	}
	public void setShw_moviename(String shw_moviename) {
		this.shw_moviename = shw_moviename;
	}
	public String getShw_screen() {
		return shw_screen;
	}
	public void setShw_screen(String shw_screen) {
		this.shw_screen = shw_screen;
	}
	public Timestamp getShw_date() {
		return shw_date;
	}
	public void setShw_date(Timestamp shw_date) {
		this.shw_date = shw_date;
	}
	public int getShw_time() {
		return shw_time;
	}
	public void setShw_time(int shw_time) {
		this.shw_time = shw_time;
	}
	public int getShw_seatcnt() {
		return shw_seatcnt;
	}
	public void setShw_seatcnt(int shw_seatcnt) {
		this.shw_seatcnt = shw_seatcnt;
	}


}
