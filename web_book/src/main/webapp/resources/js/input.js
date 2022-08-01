/*

*/

$(function(){
	$(".btn-primary").click(function(e){
	// 입력 버튼이 클릭하면 submit 기능중지
	e.preventDefault();
	let code = $('#code');
	let price = $('#price');
	// code,price 사용자 입력값 가져온 후 숫자로 들어왓는지 확인
	if(isNaN(code.val())){
		alert('코드를 확인해 주세요');
		code.select(); // 코드 요소 안에 있는 값을 블록으로 선택해줌
		return;
	}
	// 숫자가 아니라면 메세지 띄우고 되돌아가기
	
	// 입력이 올바로 되었다면 form submit 시키기

		
		

	})
	
	
})