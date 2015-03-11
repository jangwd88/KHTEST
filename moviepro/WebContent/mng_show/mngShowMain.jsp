<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<head>
	<title>상영정보 메인</title>
</head>
<H2 id='header2'>상영정보 메인</H2>
<table border="1" align="center">
  <tr>
    <th>상영 등록</th>
    <th>상영 수정/삭제</th>
  </tr>
  <tr>
    <td><a href="/moviepro/mngShowRegForm.do">[등록]</a></td>
    <td><a href="/moviepro/mngShowModCanForm.do">[수정/삭제]</a></td>
  </tr>
  <tr>
    <th colspan="2">상영중인 영화 리스트</th>
  </tr>
  <tr>
    <td colspan="2">for문/20개 정도만</td>
  </tr>
</table>