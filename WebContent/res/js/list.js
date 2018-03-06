/**
 * 调用后台批量删除
 */
function deleteBatch(basePath) {
	$("#mainForm").attr("action", "DeleteBatchServlet.Action");
	$("#mainForm").submit();
}