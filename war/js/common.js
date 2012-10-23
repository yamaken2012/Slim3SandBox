jQuery(function(){
	jQuery('#btn-update').click(function() {
    	jQuery('#show-form').attr('action', 'update');
    	jQuery('#show-form').submit();
    });
    
	jQuery('#btn-delete').click(function() {
		jQuery('#show-form').attr('action', 'delete');
		jQuery('#show-form').submit();
    });
});