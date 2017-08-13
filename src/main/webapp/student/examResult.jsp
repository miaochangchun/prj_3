<%--
  Created by IntelliJ IDEA.
  User: 10048
  Date: 2017/8/11
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>考试结果</title>
</head>
<body>
<table width="1003" height="485" border="0" cellpadding="0" cellspacing="0" class="centerbg">
    <tr>
        <td width="149" height="485">
            &nbsp;
        </td>

        <td width="741" valign="top" class="rightbian">
            <table width="60%" align="center" cellpadding="10" cellspacing="0" border="1">
                <tr>
                    <td height="35" colspan="2"></td>
                </tr>
                <tr>
                    <td height="49" colspan="2">
                        <div align="center">
				            <span class="STYLE4">
					            <strong>eggpeijun</strong>
					            考试情况表
				            </span>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">&nbsp;</td>
                </tr>
                <tr>
                    <td>
                        <div align="center">
                            考试姓名:${request.studentName}
                        </div>
                    </td>
                    <td>
                        <div align="center">
                            考生得分:${request.generalPoint}分
                        </div>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <div align="center">
                            <a href="showSubjectAnswer.action">查看答案</a>
                        </div>
                    </td>
                </tr>
            </table>
        </td>
        <td width="113">&nbsp;</td>
    </tr>
</table>
</body>
</html>
