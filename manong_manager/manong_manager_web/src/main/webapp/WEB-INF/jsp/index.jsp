<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>MaNOng</title>
    <link rel="stylesheet" type="text/css" href="/css/themes/black/easyui.css">
    <link rel="stylesheet" type="text/css" href="/css/themes/icon.css">
    <script type="text/javascript" src="/js/jquery.min.js">
    </script>
    <script type="text/javascript" src="/js/jquery.easyui.min.js">
    </script>
</head>
<<body class="easyui-layout">
    <div data-options="region:'west',title:'菜单',split:true , minWidth:180" style="width:100px;">

        <ul id="tt" class="easyui-tree">
            <li>
                <span>商品管理</span>
                <ul>
                    <li data-options="attributes:{'url':'product_list'}">商品列表</li>
                    <li data-options="attributes:{'url':'product_add'}">商品添加</li>
                </ul>
            </li>
            <li><span>File21</span></li>
        </ul>

    </div>
    <div data-options="region:'center'">

        <div id="tabs" class="easyui-tabs" style="width:100%;height:100%;">
            <div title="首页" data-options="iconCls:'icon-reload',closable:true,fit:true" style="overflow:auto;padding:20px;display:none;">
                首页
            </div>

        </div>

    </div>

<%------js--%>

    <script type="text/javascript" src="/js/index.js"></script>


</body>
</html>
