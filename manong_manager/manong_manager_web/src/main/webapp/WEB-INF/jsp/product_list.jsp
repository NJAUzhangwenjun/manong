<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>商品列表</title>
    <link rel="stylesheet" type="text/css" href="/css/themes/black/easyui.css">
    <link rel="stylesheet" type="text/css" href="/css/themes/icon.css">
    <script type="text/javascript" src="/js/jquery.min.js">
    </script>
    <script type="text/javascript" src="/js/jquery.easyui.min.js">
    </script>
</head>
<body>
<table class="easyui-datagrid">
    <thead>
    <tr>
        <th data-options="field:'code'">编码</th>
        <th data-options="field:'name'">名称</th>
        <th data-options="field:'price'">价格</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>001</td><td>名称1</td><td>2323</td>
    </tr>
    <tr>
        <td>002</td><td>名称2</td><td>4612</td>
    </tr>
    </tbody>
</table>
</body>
</html>
