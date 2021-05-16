<%--
  Created by IntelliJ IDEA.
  User: timejay
  Date: 2021/5/11
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="js/axios-0.18.0.js"></script>
    <script src="js/jquery-2.1.1.min.js"></script>
    <script src="js/vuejs-2.5.16.js"></script>
</head>
<body>
<center>
    <form id="aFrom">
        用户名：<input type="text" placeholder="请输入用户名id！" v-model:value="list.id"><br/>
        存款金额：<input type="text" v-model:value="list.money"><br/>
        <input type="button"  value="注册账户" @click="add()">
    </form>
</center>
<%--js--%>
<script type="text/javascript">
    /*
    vue
    */
    let vue = new Vue({
        el: "#aFrom",
        data: {
            list:{}
        },
        methods: {
            add: function () {
                console.log("list结果");
                console.log(this.list);
                axios.post(
                    'aco/add',
                    this.list,
                ).then(response => {
                    if (response.data.flag) {
                        window.location.href = "http://www.baidu.com";
                    } else {
                        alert(response.data.message)
                    }
                })

            }
        }
    })
</script>
</body>
</html>
