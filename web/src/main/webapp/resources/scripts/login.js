$(document).ready(function () {
        $('#login-submit').click(function () {
            var usr = $('#login-usr').val()
            var pwd = $('#login-pwd').val()

            $.ajax({
                type: "POST",
                url: "/submitLogin",
                contentType: "json",
                data: '{"login": }',
                success: function (data) {
                    if (data.status == "okay") {
                        // update status
                        window.location.href = "/main";
                    } else {
                        alert("Incorect credentils!!!");
                    }
                }
                }
            );


            }
        )
    }
)