<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<form action="/moviepro/mngShowRegPro.do" method="post">
	��ȭ��<input type="text" name="shw_moviename" /> <br />
	�󿵰�<input type="text" name="shw_screen" /> <br />
	�󿵳�¥<input type="date" min="1987-07-01" max="2014-03-01" name="shw_date" step="7"> <br />
	�󿵽ð�<input type="text" name="shw_time" /> <br />
	<input type="submit" value="gogo" />
</form>