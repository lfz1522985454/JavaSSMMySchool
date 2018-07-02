
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>验证手机号</title>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes"/>
    <style type="text/css">
        .coent-top {
            margin-top: 30px;
            width: 100%;
            height: 50px;
            font-size:14px;
        }

        .check-font {
            margin-left: 1.5rem;
            color: #7f7f7f;
            width: 90%;
            height: 40px;
            display: inline-block;
        }

        .getNum {
            position: relative;
            width: 100%;
            height: 52px;
        }

        input {
            z-index: 999;
            background-color: transparent;
            outline: none;
            /*font-size: 1.1rem;*/
            border: 0px;
            height: 45px;
            width: 130px;
            float: left;
            margin-left: 1.9rem;
            margin-top: 10px;
        }
        ::-webkit-input-placeholder { /* WebKit browsers */
            text-indent: 3px;
            color: #aeaeae;
            letter-spacing: 1px;
            /*font-size:1rem;*/
        }
        :-moz-placeholder { /* Mozilla Firefox 4 to 18 */
            color: #aeaeae;
            letter-spacing: 1px;
            /*font-size:1rem;*/
        }
        ::-moz-placeholder { /* Mozilla Firefox 19+ */
            color: #aeaeae;
            letter-spacing: 1px;
            /*font-size:1rem;*/
        }
        :-ms-input-placeholder { /* Internet Explorer 10+ */
            color: #aeaeae;
            letter-spacing: 1px;
            /*font-size:1rem;*/
        }
        input:-webkit-autofill { box-shadow: 0 0 0px 1000px #fbfbfb inset !important;}

        .line {
            z-index: -999;
            position: absolute;
            top: 43px;;
            left: 1.7rem;
            height: 4px;
            width: 130px;
            border:2px solid #5dd982;
        }

        .line-top {
            width: 100%;
            height: 46px;
            background-color: #ffffff;
        }

        .btnGet {
            margin-top: 5px;
            width: 160px;
            height: 50px;
            background-color: #83d47f;
            display: inline-block;
            float: right;
            border-radius: 4px;
            color: #f8f8f8;
            /*font-size: 1.1rem;*/
            text-align: center;
            line-height: 3rem;
        }

        .BtnNext {
            margin-left: 1.2rem;
            margin-top: 15px;
            width: 94%;
            height: 50px;
            background-color: #83d47f;
            text-align: center;
            line-height: 3rem;
            /*font-size: 1.1rem;*/
            color: #ffffff;
        }

        .smallFont {
            width: 98%;
            height: 30px;
            margin-top: 15px;
            text-align: right;
            color: #9c9c9c;
            /*font-size: 0.9rem;*/
        }
    </style>
</head>
<body>
<div class="coent-top">
    <span class="check-font">认证身份需要短信确认，验证码已发送至手机: 136****0553,请按提示操作。</span>
</div>
<div class="getNum">
    <div class="line-top">
        <input type="text" placeholder="填写验证码"> <div class="btnGet">获取验证码<span id="time"></span></div>
    </div>
    <div class="line"></div>
</div>
<div class="BtnNext">提交并授权</div>
<div class="smallFont">收不到验证码?</div>
</body>

<script src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
    function time() {
        var i = 61;
        i--;
        if(i==-1)
            return null;
        document.getElementById("time").innerHTML = i;
        setTimeout("time();",1000);
    }
    window.onload=time;
</script>
</html>