<%--
  Created by IntelliJ IDEA.
  User: 10048
  Date: 2017/8/13
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="../css/skin.css" rel="stylesheet" type="text/css" />
</head>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td width="17" valign="top" background="images/mail_leftbg.gif">
            <img src="images/left-top-right.gif" width="17" height="29" />
        </td>
        <td valign="top" background="images/content-bg.gif">
            <table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" class="left_topbg" id="table2">
                <tr>
                    <td height="31">
                        <div class="titlebt">学生成绩</div>
                    </td>
                </tr>
            </table>
        </td>
        <td width="16" valign="top" background="images/mail_rightbg.gif">
            <img src="images/nav-right-bg.gif" width="16" height="29" />
        </td>
    </tr>
    <tr>
        <td valign="middle" background="images/mail_leftbg.gif">&nbsp;</td>
        <td valign="top" bgcolor="#F7F8F9">
            <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                    <td width="53%" valign="top">&nbsp;</td>
                </tr>
                <tr>
                    <td valign="middle">
                        <span class="left_txt">
			                <div id="queryForm" align="center">
                                <!--查询表单-->
			    	            <form action="queryStudentByClass" method="post">
			    	                <table border="0" cellspacing="10" cellpadding="0">
			    	                    <tr>
			    	                	    <td>班级编号:</td>
			    	                	    <td><input type="text" name="sclass" size="20" ></td>
			    	                    </tr>
			    	                    <tr>
			    	                    	<td colspan="2">
                                                <div align="center">
			    	                    	        <input type="submit" value="查询">
			    	                    	        <input type="reset" value="重置">
			      	                            </div>
                                            </td>
			    	                    </tr>
			                        </table>
			                    </form>
			                </div>
                        </span>
                    </td>
                </tr>
            </table>
        </td>
        <td background="images/mail_rightbg.gif">&nbsp;</td>
    </tr>
    <tr>
        <td valign="bottom" background="images/mail_leftbg.gif">
            <img src="images/buttom_left2.gif" width="17" height="17" />
        </td>
        <td background="images/buttom_bgs.gif">
            <img src="images/buttom_bgs.gif" width="17" height="17">
        </td>
        <td valign="bottom" background="images/mail_rightbg.gif">
            <img src="images/buttom_right2.gif" width="16" height="17" />
        </td>
    </tr>
</table>
</body>
</html>
