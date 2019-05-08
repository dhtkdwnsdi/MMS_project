<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 
Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 4 & Angular 7
Author: KeenThemes
Website: http://www.keenthemes.com/
Contact: support@keenthemes.com
Follow: www.twitter.com/keenthemes
Dribbble: www.dribbble.com/keenthemes
Like: www.facebook.com/keenthemes
Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
Renew Support: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
License: You must have a valid license purchased only from themeforest(the above link) in order to legally use the theme for your project.
-->
<html lang="en">

	<!-- begin::Head -->
	<head>
		<meta charset="utf-8" />
		<title>Metronic | 계정 정보 수정</title>
		<meta name="description" content="Sticky form action bar example">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

		<!--begin::Fonts -->
		<script src="https://ajax.googleapis.com/ajax/libs/webfont/1.6.16/webfont.js"></script>
		<script>
			WebFont.load({
				google: {
					"families": ["Poppins:300,400,500,600,700", "Roboto:300,400,500,600,700"]
				},
				active: function() {
					sessionStorage.fonts = true;
				}
			});
		</script>

		<!--end::Fonts -->

		<!--begin:: Global Mandatory Vendors -->
		<link href="../assets/vendors/general/perfect-scrollbar/css/perfect-scrollbar.css" rel="stylesheet" type="text/css" />

		<!--end:: Global Mandatory Vendors -->

		<!--begin:: Global Optional Vendors -->
		<link href="../assets/vendors/general/tether/dist/css/tether.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/bootstrap-datepicker/dist/css/bootstrap-datepicker3.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/bootstrap-datetime-picker/css/bootstrap-datetimepicker.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/bootstrap-timepicker/css/bootstrap-timepicker.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/bootstrap-select/dist/css/bootstrap-select.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/bootstrap-switch/dist/css/bootstrap3/bootstrap-switch.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/select2/dist/css/select2.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/ion-rangeslider/css/ion.rangeSlider.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/nouislider/distribute/nouislider.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/owl.carousel/dist/assets/owl.carousel.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/owl.carousel/dist/assets/owl.theme.default.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/dropzone/dist/dropzone.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/summernote/dist/summernote.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/bootstrap-markdown/css/bootstrap-markdown.min.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/animate.css/animate.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/toastr/build/toastr.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/morris.js/morris.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/sweetalert2/dist/sweetalert2.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/general/socicon/css/socicon.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/custom/vendors/line-awesome/css/line-awesome.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/custom/vendors/flaticon/flaticon.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/custom/vendors/flaticon2/flaticon.css" rel="stylesheet" type="text/css" />
		<link href="../assets/vendors/custom/vendors/fontawesome5/css/all.min.css" rel="stylesheet" type="text/css" />

		<!--end:: Global Optional Vendors -->

		<!--begin::Global Theme Styles(used by all pages) -->
		<link href="../assets/demo/default/base/style.bundle.css" rel="stylesheet" type="text/css" />

		<!--end::Global Theme Styles -->

		<!--begin::Layout Skins(used by all pages) -->
		<link href="../assets/demo/default/skins/header/base/light.css" rel="stylesheet" type="text/css" />
		<link href="../assets/demo/default/skins/header/menu/light.css" rel="stylesheet" type="text/css" />
		<link href="../assets/demo/default/skins/brand/dark.css" rel="stylesheet" type="text/css" />
		<link href="../assets/demo/default/skins/aside/dark.css" rel="stylesheet" type="text/css" />

		<!--end::Layout Skins -->
		<link rel="shortcut icon" href="../assets/media/logos/favicon.ico" />
	</head>

	<!-- end::Head -->

	<!-- begin::Body -->
	<body class="kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">

						<!-- begin:: Content -->
						<div class="kt-content  kt-grid__item kt-grid__item--fluid" id="kt_content">
							<div class="row">
								<div class="col-lg-12">

									<!--begin::Portlet-->
									<div class="kt-portlet kt-portlet--last kt-portlet--head-lg kt-portlet--responsive-mobile" id="kt_page_portlet">
										<div class="kt-portlet__head kt-portlet__head--lg">
											<div class="kt-portlet__head-label">
												<h3 class="kt-portlet__head-title">
												계정 정보 수정
												</h3>
											</div>
										</div>
										<div class="kt-portlet__body">
											<form class="kt-form" id="kt_form" name="frm">
											<input type="hidden" id="progNum" name="progNum" value="${LoginUser.progNum}">
												<div class="row">
													<div class="col-xl-2"></div>
													<div class="col-xl-8">
														<div class="kt-section kt-section--first">
															<div class="kt-section__body">
																<div class="form-group row">
																	<label class="col-3 col-form-label">아이디</label>
																	<div class="col-9">
																		<input class="form-control" type="text" id="id" name="id" value="${LoginUser.id}" readonly="readonly">
																	</div>
																</div>
																<div class="form-group row">
																	<label class="col-3 col-form-label">비밀번호</label>
																	<div class="col-9">
																		<input class="form-control" type="password" id="password" name="password" value="${LoginUser.password}">
																	</div>
																</div>
																<div class="form-group row">
																	<label class="col-3 col-form-label">이름</label>
																	<div class="col-9">
																		<input class="form-control" type="text" id="name" name="name" value="${LoginUser.name}">
																	</div>
																</div>
																<div class="form-group row">
																	<label class="col-3 col-form-label">주소</label>
																	<div class="col-9">
																		<input class="form-control" type="text" id="juso" name="juso" value="${LoginUser.juso}" onclick="postcode()">
																	</div>
																</div>
																<div class="form-group row">
																	<label class="col-3 col-form-label">상세 주소</label>
																	<div class="col-9">
																		<input class="form-control" type="text" id="extraJuso" name="extraJuso" value="${LoginUser.extraJuso}">
																	</div>
																</div>
																<div class="form-group row">
																	<label class="col-3 col-form-label">이메일</label>
																	<div class="col-9">
																		<div class="input-group">
																			<div class="input-group-prepend"><span class="input-group-text"><i class="la la-at"></i></span></div>
																			<input type="text" class="form-control" id="email" name="email" value="${LoginUser.email}" placeholder="Email" aria-describedby="basic-addon1">
																		</div>
																	</div>
																</div>
																<div class="form-group row">
																	<label class="col-3 col-form-label">전화번호</label>
																	<div class="col-9">
																		<div class="input-group">
																			<div class="input-group-prepend"><span class="input-group-text"><i class="la la-phone"></i></span></div>
																			<input type="text" class="form-control" id="tel" name="tel" value="${LoginUser.tel}" placeholder="Phone" aria-describedby="basic-addon1"
																			 onkeydown="return onlyNumber(event)" onkeyup="removeChar(event)">
																		</div>
																	</div>
																</div>
																<div class="form-group row">
																	<label class="col-3 col-form-label">은행</label>
																	<div class="col-9">
																		<input class="form-control" type="text" id="bank" name="bank" value="${LoginUser.bank}">
																	</div>
																</div>
																<div class="form-group row">
																	<label class="col-3 col-form-label">계좌번호</label>
																	<div class="col-9">
																		<input class="form-control" type="text" id="account" name="account" value="${LoginUser.account}" onkeydown="return onlyNumber(event)" onkeyup="removeChar(event)">
																	</div>
																</div>
															</div>
														</div>
														<div class="kt-portlet__foot">
												<div class="kt-form__actions kt-form__actions--right">
													<div class="row">
														<!-- <div class="col kt-align-left">
															<button type="reset" class="btn btn-secondary">수정</button>
															<button type="reset" class="btn btn-danger">삭제</button>
														</div> -->
														<div class="col kt-align-right">
															<button type="button" class="btn btn-brand" onclick="updateMember()">저장</button>
														</div>
													</div>
												</div>
											</div>
	 												</div>
													<div class="col-xl-2"></div>
												</div>
											</form>
										</div>
									</div>

									<!--end::Portlet-->
								</div>
							</div>
						</div>

						<!-- end:: Content -->
					</div>

				</div>
			</div>
		</div>

		<!-- end:: Page -->

		<!-- begin::Global Config(global config for global JS sciprts) -->
		<script>
			var KTAppOptions = {
				"colors": {
					"state": {
						"brand": "#5d78ff",
						"dark": "#282a3c",
						"light": "#ffffff",
						"primary": "#5867dd",
						"success": "#34bfa3",
						"info": "#36a3f7",
						"warning": "#ffb822",
						"danger": "#fd3995"
					},
					"base": {
						"label": ["#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466"],
						"shape": ["#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a"]
					}
				}
			};
		</script>

		<!-- end::Global Config -->

		<!--begin:: Global Mandatory Vendors -->
		<script src="../assets/vendors/general/jquery/dist/jquery.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/popper.js/dist/umd/popper.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/bootstrap/dist/js/bootstrap.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/js-cookie/src/js.cookie.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/moment/min/moment.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/tooltip.js/dist/umd/tooltip.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/perfect-scrollbar/dist/perfect-scrollbar.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/sticky-js/dist/sticky.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/wnumb/wNumb.js" type="text/javascript"></script>

		<!--end:: Global Mandatory Vendors -->

		<!--begin:: Global Optional Vendors -->
		<script src="../assets/vendors/general/jquery-form/dist/jquery.form.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/block-ui/jquery.blockUI.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/custom/components/vendors/bootstrap-datepicker/init.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/bootstrap-datetime-picker/js/bootstrap-datetimepicker.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/bootstrap-timepicker/js/bootstrap-timepicker.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/custom/components/vendors/bootstrap-timepicker/init.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/bootstrap-daterangepicker/daterangepicker.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/bootstrap-maxlength/src/bootstrap-maxlength.js" type="text/javascript"></script>
		<script src="../assets/vendors/custom/vendors/bootstrap-multiselectsplitter/bootstrap-multiselectsplitter.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/bootstrap-select/dist/js/bootstrap-select.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/bootstrap-switch/dist/js/bootstrap-switch.js" type="text/javascript"></script>
		<script src="../assets/vendors/custom/components/vendors/bootstrap-switch/init.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/select2/dist/js/select2.full.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/ion-rangeslider/js/ion.rangeSlider.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/typeahead.js/dist/typeahead.bundle.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/handlebars/dist/handlebars.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/inputmask/dist/jquery.inputmask.bundle.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/inputmask/dist/inputmask/inputmask.date.extensions.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/inputmask/dist/inputmask/inputmask.numeric.extensions.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/nouislider/distribute/nouislider.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/owl.carousel/dist/owl.carousel.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/autosize/dist/autosize.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/clipboard/dist/clipboard.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/dropzone/dist/dropzone.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/summernote/dist/summernote.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/markdown/lib/markdown.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/bootstrap-markdown/js/bootstrap-markdown.js" type="text/javascript"></script>
		<script src="../assets/vendors/custom/components/vendors/bootstrap-markdown/init.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/bootstrap-notify/bootstrap-notify.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/custom/components/vendors/bootstrap-notify/init.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/jquery-validation/dist/jquery.validate.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/jquery-validation/dist/additional-methods.js" type="text/javascript"></script>
		<script src="../assets/vendors/custom/components/vendors/jquery-validation/init.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/toastr/build/toastr.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/raphael/raphael.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/morris.js/morris.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/chart.js/dist/Chart.bundle.js" type="text/javascript"></script>
		<script src="../assets/vendors/custom/vendors/bootstrap-session-timeout/dist/bootstrap-session-timeout.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/custom/vendors/jquery-idletimer/idle-timer.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/waypoints/lib/jquery.waypoints.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/counterup/jquery.counterup.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/es6-promise-polyfill/promise.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/sweetalert2/dist/sweetalert2.min.js" type="text/javascript"></script>
		<script src="../assets/vendors/custom/components/vendors/sweetalert2/init.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/jquery.repeater/src/lib.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/jquery.repeater/src/jquery.input.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/jquery.repeater/src/repeater.js" type="text/javascript"></script>
		<script src="../assets/vendors/general/dompurify/dist/purify.js" type="text/javascript"></script>

		<!--end:: Global Optional Vendors -->

		<!--begin::Global Theme Bundle(used by all pages) -->
		<script src="../assets/demo/default/base/scripts.bundle.js" type="text/javascript"></script>

		<!--end::Global Theme Bundle -->

		<!--begin::Global App Bundle(used by all pages) -->
		<script src="../assets/app/bundle/app.bundle.js" type="text/javascript"></script>

		<!--end::Global App Bundle -->
	</body>

	<!-- end::Body -->
	
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
// 자식창에서 부모창으로 값 전달.
 function closeChild(){
    /* opener.document.getElementById("id").value = document.getElementById("id").value;
    opener.document.getElementById("password").value = document.getElementById("password").value;
    opener.document.getElementById("name").value = document.getElementById("name").value;
    opener.document.getElementById("juso").value = document.getElementById("juso").value;
    opener.document.getElementById("extraJuso").value = document.getElementById("extraJuso").value;
    opener.document.getElementById("email").value = document.getElementById("email").value;
    opener.document.getElementById("tel").value = document.getElementById("tel").value;
    opener.document.getElementById("bank").value = document.getElementById("bank").value;
    opener.document.getElementById("account").value = document.getElementById("account").value; */
    
    window.opener.location.reload();		// 부모창 새로고침
    window.close();
}

 function updateMember(){

		// userID 변수에 userID의 입력된 값을 가져오게 함
		var progNum = $('#progNum').val();
		var id = $('#id').val();
		var password = $('#password').val();
		var name = $('#name').val();
		var juso = $('#juso').val();
		var extraJuso = $('#extraJuso').val();
		var email = $('#email').val();
		var tel = $('#tel').val();
		var bank = $('#bank').val();
		var account = $('#account').val();
		
		
		if(id == ""){
			alert("아이디를 입력해주세요.");
			$("#id").focus();
			return false;
		}
		if(password == ""){
			alert("비밀번호를 입력해주세요.");
			$("#password").focus();
			return false;
		}
		if(name == ""){
			alert("이름을 입력해주세요.");
			$("#name").focus();
			return false;
		}
		if(progNum == ""){
			alert("잘못된 정보입니다.");
			return false;
		}
		else if(confirm("수정할 경우 재로그인이 필요합니다.\n정말로 수정하시겠습니까?")){
		
		$.ajax({

			type: 'POST',  // GET or POST 전송방법 

			url: '/prog?command=memberUpdate',  // 이쪽으로 보낸다(호출URL)

			data: {id: id,
				   password: password,
				   name: name,
				   juso: juso,
				   extraJuso: extraJuso,
				   email: email,
				   tel: tel,
				   bank: bank,
				   account: account,
				   progNum: progNum},  // userID 이름에 userID 데이터 값을 넣어서 보낸다

			success: function(data){  // 만약 성공적으로 수행되었다면 result로 값반환
				alert("수정 완료되었습니다.\n다시 로그인 해주세요.");
				self.close();
				opener.location.href = "/main?command=logout";
			},
			error: function(data){
				alert("오류:: 다시 시도해주세요.");
				return false;
			}
			 

		})
		} else{
			return false;
		}
	}

// 다음 도로명 주소 오픈소스
function postcode() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 각 주소의 노출 규칙에 따라 주소를 조합한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var addr = ''; // 주소 변수
            var extraAddr = ''; // 참고항목 변수

            //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                addr = data.roadAddress;
            } else { // 사용자가 지번 주소를 선택했을 경우(J)
                addr = data.jibunAddress;
            }

            // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
            if(data.userSelectedType === 'R'){
                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                    extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
               
            
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById("juso").value = addr;
            // 커서를 상세주소 필드로 이동한다.
            document.getElementById("extraJuso").focus();
        }
    }).open();
}

//숫자만 입력
function onlyNumber(event){
	event = event || window.event;
	var keyID = (event.which) ? event.which : event.keyCode;
	if ( (keyID >= 48 && keyID <= 57) || (keyID >= 96 && keyID <= 105) || keyID == 8 || keyID == 46 || keyID == 37 || keyID == 39 ) 
		return;
	else
		return false;
}

//문자 지우기
function removeChar(event) {
	event = event || window.event;
	var keyID = (event.which) ? event.which : event.keyCode;
	if ( keyID == 8 || keyID == 46 || keyID == 37 || keyID == 39 ) 
		return;
	else
		event.target.value = event.target.value.replace(/[^0-9]/g, "");
}
</script>
</html>