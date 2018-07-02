<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My JSP 'index.jsp' starting page</title>
    
	

  </head>
  
  <body>
  	<form action="/testPaper/selTestPaperpage.do" method="post" id="form1">
			<!-- 保存当前页码 -->
				<input type="hidden" name="pageIndex" value="1" id="pageIndex" />
				试卷名称：<input type="text" name="questionName1"  id="questionName1"/>&ensp;&ensp;
				创建人：
				<select name="createdBy1" id="createdBy1">
					<option value="-1">-=请选择=-</option>
						<option value="1">马守彬</option>
						<option value="2">宋歌</option>
						<option value="3">郝龙女</option>
				</select><br/>
				创建时间：<input type="text" name="creationDate1" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" />
				至
				<input type="text" name="creationDate2" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" />
				<input type="submit" value="查询"  class="btn" />
				
			</form><br/>
			<table width="900px" border="1px" id="show">
				<tr>
					<td>编号</td>
					<td>试卷名称</td>
					<td>答题时间</td>
					<td>试卷总分</td>
					<td>创建人</td>
					<td>创建时间</td>
					<td>备注</td>
					<td>操作</td>
				</tr>
			</table>
			<br/>

  </body>
</html>
