<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>信息认证</title>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=no"/>
    <style type="text/css">
        * {
            padding: 0;
            margin: 0;
            font-size:14px;
        }

        .check-content {
            padding-top: 120px;
            width: 100%;
            height: 220px;
            background-color: #fefefe;
        }

        .check-head {
            text-align: center;
            width: 100%;
            height: 150px;
        }

        .font input {
            -webkit-appearance: none;
            vertical-align: top;
            border: 2px solid #d7d7d7;
            display: inline-block;
            width: 1.1rem;
            height: 1.1rem;
            border-radius: 50%;
            margin-right: 0.74rem;
            margin-top: 0.375rem;
        }

        .font input[type='radio']:checked:after {
            content: '';
            width: 0.9rem;
            height: 0.9rem;
            background: #8bffbf;
            border-radius: 50%;
            display: block;
        }

        .check-content-item {
            text-align: center;
            margin: 10px auto;
            width: 150px;
            height: 50px;
        }

        .font {
            /*font-size: 1.3rem;*/
            font-size:14px;
            color: #8e8e8e;
        }

        .check-foot {
            padding-top: 20px;
            width: 100%;
            height: 180px;
            background-color: #fefefe;
        }

        .button {
            letter-spacing: 1px;
            margin: 0 auto;
            width: 300px;
            height: 40px;
            background-color: #fccc0d;
            border-radius: 8px;
            text-align: center;
            /*font-size: 1.1rem;*/
            line-height: 38px;
            color: #fefefe;
        }

        .check-content-student {
            padding-top: 100px;
            width: 100%;
            height: 300px;
            background-color: #fefefe;
        }

        .check-content-student .input {
            background-color: transparent;
            outline: none;
            /* font-size: 1rem;*/
            border: 0px;
            border-bottom: 1px solid #cccccc;
            height: 40px;
            width: 200px;
            float: right;
            margin-right: 30px;
        }

        .check-content-student-item {
            width: 100%;
            height: 60px;
        }

        .check-content-student-item .font {
            margin-top: 0.8rem;
            margin-left: 40px;
            height: 40px;
            width: 90px;
            float: left;
            /*font-size: 1.1rem;*/
            color: #9c9c9c;
        }

        ::-webkit-input-placeholder { /* WebKit browsers */
            color: #aeaeae;
            letter-spacing: 1px;
            /*font-size: 0.8rem;*/
        }

        :-moz-placeholder { /* Mozilla Firefox 4 to 18 */
            color: #aeaeae;
            letter-spacing: 1px;
            /*font-size: 0.8rem;*/
        }

        ::-moz-placeholder { /* Mozilla Firefox 19+ */
            color: #aeaeae;
            letter-spacing: 1px;
            /*font-size: 0.8rem;*/
        }

        :-ms-input-placeholder { /* Internet Explorer 10+ */
            color: #aeaeae;
            letter-spacing: 1px;
            /*font-size: 0.8rem;*/
        }

        input:-webkit-autofill {
            box-shadow: 0 0 0px 1000px #fbfbfb inset !important;
        }

        .check-content-button {
            width: 100%;
            height: 200px;
            background-color: #fefefe;
        }

        .check-content-button .buttonNext {
            letter-spacing: 1px;
            margin: 0 auto;
            width: 300px;
            height: 40px;
            background-color: #4fd369;
            border-radius: 8px;
            text-align: center;
            /*font-size: 1.1rem;*/
            line-height: 38px;
            color: #fefefe;
        }

        .isPublic {
            text-align: center;
            width: 100%;
            height: 30px;
        }

        .isPublic .font {
            width: 208px;
            height: 25px;
            display: inline-block;
            /*font-size: 0.8rem;*/
            color: #E33E06;
        }
    </style>
</head>
<body>
<!--选择身份模块-->
<header class="check-head" id="checkimg">
    <img src="img/check-head.png" style="width:100%;height:auto;" alt="">
</header>
<div class="check-content" id="checkradio">
    <div class="check-content-item">
        <label class="font"><input checked="checked" type="radio" id="student" name="type" value="学生"> 我是学生</label>
    </div>
    <div class="check-content-item">
        <label class="font"><input type="radio" id="teacher" name="type" value="老师"> 我是老师</label>
    </div>
    <div class="check-content-item">
        <label class="font"><input type="radio" id="parents" name="type" value="家长"> 我是家长</label>
    </div>
</div>
<footer class="check-foot" id="checkBtn">
    <div class="button" id="BtnCheck" >开始认证</div>
</footer>

<!--填写信息模块-->
<div class="check-content-student" id="addInfo" style="display: none">
    <div class="check-content-student-item" id="students">
        <label class="font">班级名称：</label><input type="text" maxlength="8" placeholder="例如：TCMP001" class="input" id="className"/>
    </div>
    <div class="check-content-student-item">
        <label class="font">姓 名：</label><input type="text" maxlength="8"
                                               onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"
                                               placeholder="请输入姓名" class="input" id="userName"/>
    </div>
    <div class="check-content-student-item">
        <label class="font">手机号：</label><input type="text" maxlength="11"
                                               onkeyup="this.value=this.value.replace(/\D/g,'')"
                                               onafterpaste="this.value=this.value.replace(/\D/g,'')"
                                               placeholder="请输入手机号" class="input" id="phone"/>
    </div>
    <div class="check-content-student-item" id="stuparent">
        <label class="font">孩子姓名：</label><input type="text"
                                                onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"
                                                maxlength="8" placeholder="请输入姓名" class="input" id="stuName"/>
    </div>
    <div class="isPublic">
        <div>
            <label class="font">注意：系统将获得你的公开信息(昵称、头像等)</label>
        </div>
    </div>
</div>
<input type="hidden" id="openId" value="${user.openId}"/>
<input type="hidden" id="nickname" value="${user.nickname}"/>
<input type="hidden" id="headImgUrl" value="${user.headImgUrl}"/>
<div class="check-content-button" id="nextTp"style="display: none">
    <div class="buttonNext" id="nextBtn"  onclick="toSuccess()" >同意并授权</div>
</div>

<script src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
    $(function () {
        //开始认证点击后
        //隐藏选择身份模块
        $("#BtnCheck").click(function () {
            $('#checkimg').attr("style","display:none;");
            $('#checkradio').attr("style","display:none;");
            $('#checkBtn').attr("style","display:none;");
            //显示填写信息模块
            $("#addInfo").attr("style","display:block;");
            $("#nextTp").attr("style","display:block;");
            //判断选中的是哪个身份
            var val=$('input:radio[name="type"]:checked').val();
            if(val=="学生"){
                $('#stuparent').attr("style","display:none;");
            }
            if(val=="家长"){
                $('#students').attr("style","display:none;");
            }
            if(val=="老师"){
                $('#stuparent').attr("style","display:none;");
                $('#students').attr("style","display:none;");
            };
        });
    });
    function toSuccess() {
        var val=$('input:checkbox[name="public"]:checked').val();
        if(val=="true"){
            //同意授权认证
            var className=$("#className").val();
            var phone=$("#phone").val();
            var stuName=$("#stuName").val();
            var userName=$("#userName").val();
            var openId=$("#openId").val();
            var nickname=$("#nickname").val();
            var headImgUrl=$("#headImgUrl").val();

            window.location.href="success.html";
        }if(val==""){
            window.location.href="";
        }
    }

</script>
</body>
</html>