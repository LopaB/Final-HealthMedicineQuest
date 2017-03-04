$(function(){
	//solving the active menu problem
	switch(menu){
		case 'About Us':
			$('#about').addClass('Active');
			break;
		case 'Contact Us':
			$('#contact').addClass('Active');
			break;
		case 'Home':
			$('#home').addClass('Active');
			break;
		case 'View All Products':
			$('#products').addClass('Active');
			break;
		case 'SignIn':
			$('#login').addClass('Active');
			break;
		case 'Register':
			$('#register').addClass('Active');
			break;
	}
});