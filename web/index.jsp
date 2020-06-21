<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/static/css/b_login.css">
    <script src="/static/js/jquery-1.11.3.js"></script>
    <style>
        #verify {
            height: 34px;
            vertical-align: top;
            font-size: 16px;
        }

        #code_img {
            width: 100px;
            height: 40px;
            cursor: pointer;
            vertical-align: top;
        }
    </style>
    <title>后台登录页面</title>
</head>
<body>
<div class="login">
    <div class="loginmain">
        <h2>登录管理系统</h2>
        <form action="GoLogin" class="form-horizontal" method="post">
            <!-- 让表单在一行中显示form-horizontal -->
            <div class="form-group">
                <label for="username" class="col-lg-1 control-label">账&nbsp;&nbsp;&nbsp;&nbsp;号</label>
                <div class="col-lg-4">
                    <input type="text" name="name" id="username" class="form-control" placeholder="请输入您的账号">
                </div>
            </div>
            <div class="form-group"></div>
            <div class="form-group"></div>
            <div class="form-group">
                <label for="password" class="col-lg-1 control-label">密&nbsp;&nbsp;&nbsp;&nbsp;码</label>
                <div class="col-lg-4">
                    <input type="password" name="pwd" id="password" class="form-control" placeholder="请输入您的密码">
                </div>
            </div>

            <div class="form-group">
                <div class="col-lg-11 col-lg-offset-1">
		                 <span class="checkbox ">
				             <input type="radio" name="type" id="type1" value="1" checked="checked">管理员
					         <input type="radio" name="type" id="type2" value="2">教师
					         <input type="radio" name="type" id="type3" value="3">学生
                         </span>
                </div>
            </div>
            <!-- <div class="form-group"></div> -->

            <div class="form-group">
                <div class="col-lg-11 col-lg-offset-1">
		                <span class="checkbox ">
		                       <p>
                                     <input style="color: #ff0000;" type="text" class="topAlign" id="verify" name="verify"
                                            required>&nbsp;&nbsp;
                                     <canvas width="100" height="40" id="verifyCanvas"></canvas>
                                     <img id="code_img">
                               </p>

		                </span>
                </div>
            </div>

            <div class="form-group">
                <div class="col-lg-4 col-lg-offset-1">
                    <input type="submit" name="button" value="登录" class="btn btn-danger btn-lg">
                    <span class="text"></span>
                </div>
            </div>
        </form>
    </div>

    <div class="rightpic">
        <div id="container">
            <img src="static/img/1.jpg" alt="" width="500px" height="330px">
        </div>
    </div>
</div>

<script src="/static/js/jquery-3.1.1.min.js"></script>
<script src="/static/js/bootstrap.min.js"></script>
<script src="/static/js/delaunay.js"></script>
<script src="/static/js/TweenMax.js"></script>
<script src="/static/js/effect.js"></script>
<script src="/static/js/b_login.js"></script>
</body>

<script>
    var nums = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "0", 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
        'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        'y', 'z'];

    drawCode();

    // 绘制验证码
    function drawCode() {
        var canvas = document.getElementById("verifyCanvas");  //获取HTML端画布
        var context = canvas.getContext("2d");                 //获取画布2D上下文
        context.fillStyle = "cornflowerblue";                  //画布填充色
        context.fillRect(0, 0, canvas.width, canvas.height);   //清空画布
        context.fillStyle = "white";                           //设置字体颜色
        context.font = "25px Arial";                           //设置字体
        var rand = new Array();
        var x = new Array();
        var y = new Array();
        for (var i = 0; i < 5; i++) {
            rand[i] = nums[Math.floor(Math.random() * nums.length)]
            x[i] = i * 16 + 10;
            y[i] = Math.random() * 20 + 20;
            context.fillText(rand[i], x[i], y[i]);
        }
        //画3条随机线
        for (var i = 0; i < 3; i++) {
            drawline(canvas, context);
        }

        // 画30个随机点
        for (var i = 0; i < 30; i++) {
            drawDot(canvas, context);
        }
        convertCanvasToImage(canvas)
    }

    // 随机线
    function drawline(canvas, context) {
        context.moveTo(Math.floor(Math.random() * canvas.width), Math.floor(Math.random() * canvas.height));             //随机线的起点x坐标是画布x坐标0位置，y坐标是画布高度的随机数
        context.lineTo(Math.floor(Math.random() * canvas.width), Math.floor(Math.random() * canvas.height));  //随机线的终点x坐标是画布宽度，y坐标是画布高度的随机数
        context.lineWidth = 0.5;                                                  //随机线宽
        context.strokeStyle = 'rgba(50,50,50,0.3)';                               //随机线描边属性
        context.stroke();                                                         //描边，即起点描到终点
    }

    // 随机点(所谓画点其实就是画1px像素的线，方法不再赘述)
    function drawDot(canvas, context) {
        var px = Math.floor(Math.random() * canvas.width);
        var py = Math.floor(Math.random() * canvas.height);
        context.moveTo(px, py);
        context.lineTo(px + 1, py + 1);
        context.lineWidth = 0.2;
        context.stroke();

    }

    // 绘制图片
    function convertCanvasToImage(canvas) {
        document.getElementById("verifyCanvas").style.display = "none";
        var image = document.getElementById("code_img");
        image.src = canvas.toDataURL("image/png");
        return image;
    }

    // 点击图片刷新
    document.getElementById('code_img').onclick = function () {
        $('#verifyCanvas').remove();
        $('#verify').after('<canvas width="100" height="40" id="verifyCanvas"></canvas>')
        drawCode();
    }
</script>

</html>