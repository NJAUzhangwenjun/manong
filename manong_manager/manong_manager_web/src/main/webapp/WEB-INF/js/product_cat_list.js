/**
 * 商品管理列表
 */
$(function () {
    $('#product_category').tree({
        url: "/product_category/list",
        loadFilter: function (data) {
            if (data.d) {
                return data.d;
            } else {
                return data;
            }
        }
    });
});