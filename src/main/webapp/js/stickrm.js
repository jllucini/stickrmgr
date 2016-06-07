

var StickrM = ( function () {
	var _remoteHost;
	
	_sendStickers = function( stickrList ) {
		console.log( "Send sticker list to backend "+stickrList);
	};
	
	return {
		
		sendStickers : _sendStickers
	};
	
}) ();

var Card = Backbone.Model.extend({
	defaults: {
		code: '',
		description: ''
	}
});

var CardCollection = Backbone.Collection.extend({
	  model: Card
});