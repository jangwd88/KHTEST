<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<form action="/moviepro/mngShowRegPro.do" method="post">
	영화명<input type="text" name="shw_moviename" /> <br />
	상영관<input type="text" name="shw_screen" /> <br />
	상영날짜<input type="date" min="1987-07-01" max="2014-03-01" name="shw_date" step="7"> <br />
	상영시간<input type="text" name="shw_time" /> <br />
	<input type="submit" value="gogo" />
</form>