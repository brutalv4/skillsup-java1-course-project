<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login & Register</title>
    <link rel="stylesheet" href="../../resources/styles/login.css"/>
    <link rel="stylesheet" href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css">
</head>
<body>
    <section id="login-bg">
        <div id="login-bg-top">
            <div class="logo-circle"></div>
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h3>Hi, you need to login now!</h3>
                    </div><!-- /.col-md-12 -->
                </div><!-- /.row -->
            </div><!-- /.container -->
        </div>

        <div class="container">
            <div class="col-md-12">
                <div class="bg-content">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
                    </div>

                    <div class="input-group" style="margin-top: 10px">
                        <input type="text" class="form-control" placeholder="Password" aria-describedby="basic-addon1">
                    </div>

                    <div class="input-group" style="margin-top: 50px;">
                        <a href="#" class="btn btn-success btn-lg">LOGIN</a>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <script type="text/javascript" src="webjars/jquery/2.2.4/jquery.min.js"></script>
    <script type="text/javascript" src="webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../../resources/scripts/login.js"></script>
</body>
</html>
