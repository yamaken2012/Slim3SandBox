jQuery(function(){
	jQuery('#btn-insert').click(function() {
    	jQuery('#post-form').submit();
    });

	jQuery('#btn-update').click(function() {
    	jQuery('#show-form').attr('action', 'update');
    	jQuery('#show-form').submit();
    });
    
	jQuery('#btn-delete').click(function() {
		jQuery('#show-form').attr('action', 'delete');
		jQuery('#show-form').submit();
    });
});