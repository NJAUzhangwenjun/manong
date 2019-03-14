
$('#tt').tree({
    onClick: function(node){
        var tabs = $("#tabs");
        var flag = tabs.tabs('getTab',node.text);
        if(flag){
            tabs.tabs("select", node.text);
        }else{

            tabs.tabs('add',{
                title:node.text,
                fit:true,
                href:node.attributes.url,
                closable:true,
                tools:[{
                    iconCls:'icon-mini-refresh',
                    handler:function(){
                        alert('refresh');
                    }
                }]
            });
        }


    }
});


$('#tabs').tabs({
    onBeforeClose: function(title,index){
        var target = this;
        $.messager.confirm('确认','你确认想要关闭'+title,function(r){
            if (r){
                var opts = $(target).tabs('options');
                var bc = opts.onBeforeClose;
                opts.onBeforeClose = function(){};  // 允许现在关闭
                $(target).tabs('close',index);
                opts.onBeforeClose = bc;  // 还原事件函数
            }
        });
        return false;	// 阻止关闭
    }
});
