function formValidation()
{
	
	
	var username=document.getElementById("username").value;
	var password=document.getElementById("password").value;

	if(username==null || username=="")
	{
		alert("User Name Can't be Empty");
		return false;
	}
	
	if(password==null || password=="")
	{
		alert("Password Can't be Empty");
		return false;
	}
	return true;
}