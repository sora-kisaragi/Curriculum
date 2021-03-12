<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- 今回の課題 指定された内容
	1.jspTest.jsp内でincludeディレクティブを使用し、header.jspとfooter.jspを外部から読み込む
	2.Calendar・SimpleDateFormatライブラリをimportし、ヘッダーへ作成日時をフォーマットして、 年月日 を表示させる
	3.styleの指定
		jspTest
			padding-top: 50px;
			padding-bottom: 50px;

		header
			// div
			background-color: gray;

			// label
			display: inline-block;
			padding: 10px;
			color: white;

			// label
			padding: 10px;
			font-size: 10px;

		footer
			// div
			background-color: gray;

			// label
			display: inline-block;
			padding: 10px;
			color: white;
	4. 入力エリアは機能を実装しなくてもよい
 --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- headerを表示 --%>
	<%@ include file="header.jsp" %>

	<%-- name id 入力エリア --%>
	<div class="content">
		<%-- テーブルを使い整列 --%>
		<table>
			<tr align="center">

				<th>
					<%-- labelを使うことでtextをクリックしても入力欄がアクティブに --%>
					<label for="name-id">
						name
					</label>
				</th>

				<th>
					<input type="text" name="name" id="name-id">
				</th>
			</tr>

			<tr align="center">
				<th>
					<label for="id-id">
						id
					</label>
				</th>
				<th>
					<input type="text" name="id" id="id-id">
				</th>
			</tr>

		</table>
	</div>

	<%-- footerを表示 --%>
	<%@ include file="footer.jsp" %>

</body>
</html>