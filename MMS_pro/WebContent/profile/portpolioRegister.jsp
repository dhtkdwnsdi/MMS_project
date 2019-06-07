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
<title>Metronic | 포트폴리오 등록</title>
<meta name="description" content="Bootstrap daterangepicker examples">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!--begin::Fonts -->
<script
	src="https://ajax.googleapis.com/ajax/libs/webfont/1.6.16/webfont.js"></script>
<script>
	WebFont.load({
		google : {
			"families" : [ "Poppins:300,400,500,600,700",
					"Roboto:300,400,500,600,700" ]
		},
		active : function() {
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


	<div class="kt-content  kt-grid__item kt-grid__item--fluid"
		id="kt_content">
		<div class="kt-portlet kt-portlet--mobile">
			<div class="kt-portlet__head kt-portlet__head--lg">
				<div class="kt-portlet__head-label">
					<h3 class="kt-portlet__head-title">포트폴리오 등록</h3>
				</div>
			</div>
			<div class="kt-portlet__body">
				<form class="kt-form" id="kt_form" method="post" >
					<input type="hidden" name="progNum" value="${LoginUser.progNum}"
						id="progNum">
					<div class="row">
						<div class="col-xl-2"></div>
						<div class="col-xl-8">
							<div class="kt-section kt-section--first">

								<div class="kt-section__body">
									<%-- <h3 class="kt-section__title kt-section__title-lg">${LoginUser.name} 님의 경력 정보</h3>
																<div class="kt-separator kt-separator--border-dashed kt-separator--space-lg"></div> --%>

									
									
									<div class="form-group row">
										<label class="col-3 col-form-label">제목</label>
										<div class="col-9">
											<input class="form-control" type="text" name = "subject" id="subject">
										</div>

									</div>
									
									
									
									
									
									
									<div class="form-group row">
										<label class="col-3 col-form-label">발주기관</label>
										<div class="col-9">
											<input class="form-control" type="text" name = "organization" id="organization">
										</div>

									</div>

									
									
									
									
									
									

									<div class="form-group row">
										<label class="col-3 col-form-label">카테고리</label>
										<div class="col-9">
											<select name="portCate" class="form-control" id="portCate">
												<option value="">--선택--</option>
												<option value="개발">개발</option>
												<option value="디자인">디자인</option>

											</select>
										</div>
									</div>
									
									
									
									
									

									<div class="form-group row">
										<label class="col-3 col-form-label">세부 카테고리</label>
										<div class="col-9">
											<select name="portDetailCate" class="form-control"
												id="portDetailCate">
												<option value="">--선택--</option>
												<option value="웹">웹</option>
												<option value="어플리케이션">어플리케이션</option>
												<option value="워드프레스">워드프레스</option>
												<option value="퍼블리싱">퍼블리싱</option>
												<option value="소프트웨어">일반 소프트웨어</option>
												<option value="커머스, 쇼핑몰">커머스, 쇼핑몰</option>
												<option value="게임">게임</option>
												<option value="임베디드">임베디드</option>
												<option value="기타">기타</option>
												
												<option value="">--선택--</option>
												<option value="웹">웹</option>
												<option value="어플리케이션">어플리케이션</option>
												<option value="제품">제품</option>
												<option value="프레젠테이션">프레젠테이션</option>
												<option value="인쇄물">인쇄물</option>
												<option value="커머스, 쇼핑몰">커머스, 쇼핑몰</option>
												<option value="로고">로고</option>
												<option value="그래픽">그래픽</option>
												<option value="영상">영상</option>
												<option value="기타">기타</option>
											</select>
										</div>
									</div>








									<div class="form-group row">
										<label class="col-3 col-form-label">시작일</label>
										<div class="col-9">
											<input type="text" class="form-control" id="kt_datepicker_1"
												readonly name="portStartDate">
										</div>
									</div>









									<div class="form-group row">
										<label class="col-3 col-form-label">종료일</label>
										<div class="col-9">
											<input type="text" class="form-control"
												id="kt_datepicker_4_1" readonly name="portEndDate">
										</div>
									</div>










									<div class="form-group row">
										<label class="col-3 col-form-label">참여율</label>
										<div class="col-9">
											<input class="form-control" type="text" id="rate" placeholder="참여율을 1에서 100사이로 입력하시오">
										</div>
									</div>



									<!-- <div class="form-group form-group-last row">
										<label class="col-3 col-form-label">관련기술 </label>
										<textarea style="width: 600px; height: 120px;"
											class="form-control" id="exampleTextarea"></textarea>
									</div> -->

									<div class="form-group row">
										<label class="col-3 col-form-label">내용 </label>
										<textarea style="width: 900px; height: 120px;" name="portContents" id="portContents"
											class="form-control" id="exampleTextarea"></textarea>
									</div>
									
									
									
									<!-- <div class="form-group row">
										<label class="col-3 col-form-label">사용 프로그래밍 언어</label>
										<div class="col-9">
											<input type="hidden" name="plNum" id="plNum" class="plNum">
											<div class="kt-input-icon kt-input-icon--right">
												<input type="text" name="usePl" class="form-control autocomplete" placeholder="사용 프로그래밍 언어를 입력해주세요.">
												<span class="kt-input-icon__icon kt-input-icon__icon--right">
												<span>
												<button type="button" class="btn btn-outline-hover-danger btn-icon" onClick="openPopUp2()" id="certNameCherck">
														<i class="la la-search"></i>
												</button>
												</span>
											</span>
											</div>
										</div>
										
									</div> -->
									
									
									
									<!-- <div id="kt_repeater_1">
										<div class="form-group row" id="kt_repeater_1">
											<label class="col-3 col-form-label">관련 기술(프로그래밍 언어)</label>
												<div data-repeater-list="" class="col-9" id="list">
													<div data-repeater-item="" class="form-group row align-items-center" style="" id="repeat">
														<div class="col-12">
														<input type="hidden" name="plNum" class="form-control" id="plNum">
															<div class="kt-form__group--inline">
																<div class="kt-input-icon kt-input-icon--right">
																<input type="text" id="plName" name="plName" class="form-control autocomplete">
																<span class="kt-input-icon__icon kt-input-icon__icon--right">
																<span>
													<button type="button" class="btn btn-outline-hover-danger btn-icon" onClick="openPopUp()" id="certNameCherck">
														<i class="la la-search"></i>
												</button>
												</span>
											</span>
											</div>
																		
																		<div class="kt-form__control">
																			<input type="hidden" name="plNum" id="plNum" class="plNum">
																			
																		</div>
																	</div>
																	<div class="d-md-none kt-margin-b-10"></div>
																</div>
														</div>
													</div>
												</div>
												<div class="form-group row">
													<div class="col-lg-4">
													<button type="button" name="add" class="btn btn-primary">추가</button>
													</div>
												</div>
											</div> -->
											
									<div class="form-group row">
										<label class="col-3 col-form-label">핵심 프로그래밍 언어</label>
										<div class="col-9">
											<input type="hidden" name="plNum" class="form-control" id="plNum">
											<div class="kt-input-icon kt-input-icon--right">
												<input type="text" class="form-control" id="plName" name="plName" readonly> 
												<span class="kt-input-icon__icon kt-input-icon__icon--right">
												<span>
												<button type="button" class="btn btn-outline-hover-danger btn-icon" onClick="openPopUp1()" id="plNameCherck">
														<i class="la la-search"></i>
												</button>
												</span>
											</span>
											</div>
										</div>
									</div>
									
									
									
									
									<!-- <div class="form-group row">
										<label class="col-3 col-form-label">서브 프로그래밍 언어</label>
										<div class="col-9">
											<input type="hidden" name="plNum2" class="form-control" id="plNum2">
											<div class="kt-input-icon kt-input-icon--right">
												<input type="text" class="form-control" id="plName" name="plName" readonly> 
												<span class="kt-input-icon__icon kt-input-icon__icon--right">
												<span>
												<button type="button" class="btn btn-outline-hover-danger btn-icon" onClick="openPopUp2()" id="plNameCherck">
														<i class="la la-search"></i>
												</button>
												</span>
											</span>
											</div>
										</div>
									</div> -->
									
									
									

								<div class="form-group form-group-last row">
									<label class="col-3 col-form-label">첨부파일</label>
									<div class="col-9">
										<div class="kt-input-icon kt-input-icon--right">
											<input type="file" class="custom-file-input" name="projFile" id="projFile">
											<label class="custom-file-label" for="customFile" style="text-align: left;"></label>
										</div>
									</div>
								</div>


									<br>
									<div class="col kt-align-right">
										<button type="button" class="btn btn-brand" onclick="registerPortpolio()">등록</button>
										<button type="button" class="btn btn-secondary" onclick="window.close();" >취소</button>	
									</div>
							</div>
						</div>
					</div>
				</div>
			</form>
			</div>
		</div>
	</div>

	<!-- end:: Content -->
	<!-- end:: Page -->

	<!-- begin::Global Config(global config for global JS sciprts) -->
	<script>
		var KTAppOptions = {
			"colors" : {
				"state" : {
					"brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				},
				"base" : {
					"label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				}
			}
		};
	</script>

	<!-- end::Global Config -->

	<!--begin:: Global Mandatory Vendors -->
	<script src="../assets/vendors/general/jquery/dist/jquery.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/popper.js/dist/umd/popper.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/bootstrap/dist/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/js-cookie/src/js.cookie.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/moment/min/moment.min.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/tooltip.js/dist/umd/tooltip.min.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/perfect-scrollbar/dist/perfect-scrollbar.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/sticky-js/dist/sticky.min.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/wnumb/wNumb.js"
		type="text/javascript"></script>

	<!--end:: Global Mandatory Vendors -->

	<!--begin:: Global Optional Vendors -->
	<script
		src="../assets/vendors/general/jquery-form/dist/jquery.form.min.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/block-ui/jquery.blockUI.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/custom/components/vendors/bootstrap-datepicker/init.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/bootstrap-datetime-picker/js/bootstrap-datetimepicker.min.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/bootstrap-timepicker/js/bootstrap-timepicker.min.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/custom/components/vendors/bootstrap-timepicker/init.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/bootstrap-daterangepicker/daterangepicker.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/bootstrap-maxlength/src/bootstrap-maxlength.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/custom/vendors/bootstrap-multiselectsplitter/bootstrap-multiselectsplitter.min.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/bootstrap-select/dist/js/bootstrap-select.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/bootstrap-switch/dist/js/bootstrap-switch.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/custom/components/vendors/bootstrap-switch/init.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/select2/dist/js/select2.full.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/ion-rangeslider/js/ion.rangeSlider.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/typeahead.js/dist/typeahead.bundle.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/handlebars/dist/handlebars.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/inputmask/dist/jquery.inputmask.bundle.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/inputmask/dist/inputmask/inputmask.date.extensions.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/inputmask/dist/inputmask/inputmask.numeric.extensions.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/nouislider/distribute/nouislider.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/owl.carousel/dist/owl.carousel.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/autosize/dist/autosize.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/clipboard/dist/clipboard.min.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/dropzone/dist/dropzone.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/summernote/dist/summernote.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/markdown/lib/markdown.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/bootstrap-markdown/js/bootstrap-markdown.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/custom/components/vendors/bootstrap-markdown/init.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/bootstrap-notify/bootstrap-notify.min.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/custom/components/vendors/bootstrap-notify/init.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/jquery-validation/dist/jquery.validate.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/jquery-validation/dist/additional-methods.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/custom/components/vendors/jquery-validation/init.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/toastr/build/toastr.min.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/raphael/raphael.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/morris.js/morris.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/chart.js/dist/Chart.bundle.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/custom/vendors/bootstrap-session-timeout/dist/bootstrap-session-timeout.min.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/custom/vendors/jquery-idletimer/idle-timer.min.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/waypoints/lib/jquery.waypoints.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/counterup/jquery.counterup.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/es6-promise-polyfill/promise.min.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/sweetalert2/dist/sweetalert2.min.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/custom/components/vendors/sweetalert2/init.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/jquery.repeater/src/lib.js"
		type="text/javascript"></script>
	<script
		src="../assets/vendors/general/jquery.repeater/src/jquery.input.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/jquery.repeater/src/repeater.js"
		type="text/javascript"></script>
	<script src="../assets/vendors/general/dompurify/dist/purify.js"
		type="text/javascript"></script>

	<!--end:: Global Optional Vendors -->

	<!--begin::Global Theme Bundle(used by all pages) -->
	<script src="../assets/demo/default/base/scripts.bundle.js"
		type="text/javascript"></script>

	<!--end::Global Theme Bundle -->

	<!--begin::Page Scripts(used by this page) -->
	<script
		src="../assets/app/custom/general/crud/forms/widgets/bootstrap-datepicker.js"
		type="text/javascript"></script>

	<!--end::Page Scripts -->

	<!--begin::Global App Bundle(used by all pages) -->
	<script src="../assets/app/bundle/app.bundle.js" type="text/javascript"></script>

	<!--end::Global App Bundle -->
</body>
<script>
	// 학력 등록 AJAX
	function registerPortpolio() {

		// userID 변수에 userID의 입력된 값을 가져오게 함
		var subject = $('#subject').val();
		var organization = $('#organization').val();
		var portCate = $('#portCate').val();
		var portDetailCate = $('#portDetailCate').val();
		var portContents = $('#portContents').val();
		var portStartDate = $('#portStartDate').val();
		var portEndDate = $('#portEndDate').val();
		var rate = $('#rate').val();
		var portFile = $('#portFile').val();
		var plNum = $('#plNum').val();

		if (subject == "") {
			alert("제목을 입력해주세요.");
			$("#subject").focus();
		}
		if (organization == "") {
			alert("발주기관을 입력해주세요.");
			$("#organization").focus();
		}
		if (portCate == "") {
			alert("카테고리를 입력해주세요.");
			$("#portCate").focus();
		}
		if (portDetailCate == "") {
			alert("세부 카테고리를 입력해주세요.");
			$("#portDetailCate").focus();
		}
		if (portStartDate == "") {
			alert("내용를 입력해주세요.");
			$("#portDetailCate").focus();
		}
		if (portDetailCate == "") {
			alert("세부 카테고리를 입력해주세요.");
			$("#portDetailCate").focus();
		}
		if (progNum == "") {
			alert("잘못된 정보입니다.");
			return false;
		} else {

			$.ajax({

				type : 'POST', // GET or POST 전송방법 

				url : '/prog?command=portpolioRegister', // 이쪽으로 보낸다(호출URL)

				data : {
					eduCategory : eduCategory,
					eduState : eduState,
					schoolName : schoolName,
					enterDate : enterDate,
					graduateDate : graduateDate,
					progNum : progNum
				}, // userID 이름에 userID 데이터 값을 넣어서 보낸다

				success : function(data) { // 만약 성공적으로 수행되었다면 result로 값반환
					alert("등록 되었습니다.");
					self.close();
					opener.location.href = "/prog?command=resumeForm";
				},
				error : function(data) {
					alert("오류:: 다시 시도해주세요.");
					return false;
				}

			})
		}
	}
	
	
		
</script>

<link rel="stylesheet" href="//code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" />
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<script>
	$.datepicker.setDefaults({
		dateFormat : 'yy-mm-dd',
		prevText : '이전 달',
		nextText : '다음 달',
		monthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월',
				'10월', '11월', '12월' ],
		monthNamesShort : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월',
				'9월', '10월', '11월', '12월' ],
		dayNames : [ '일', '월', '화', '수', '목', '금', '토' ],
		dayNamesShort : [ '일', '월', '화', '수', '목', '금', '토' ],
		dayNamesMin : [ '일', '월', '화', '수', '목', '금', '토' ],
		showMonthAfterYear : true,
		yearSuffix : '년'
	});

	$(function() {
		$("#datepicker1").datepicker();
	});
	
	
	 function openPopUp1() {
			// window.name = "부모창 이름"; 
			window.name = "childForm";
			// window.open("open할 window", "자식창 이름", "팝업창 옵션");
			var width = "500";
			var height = "300";
			var top = (window.screen.height - height) / 2;
			var left = (window.screen.width - width) / 2;
			var url = "/prog?command=plSearchForm";
			var title = "프로그래밍 언어 검색";
			var status = "toolbar=no,directories=no,scrollbars=no,resizable=no,status=no,menubar=no,width="
					+ width + ",height=" + height + ",top=" + top + ",left=" + left;

			window.open(url, title, status);

			
		} 	
	 
	 function openPopUp2() {
			// window.name = "부모창 이름"; 
			window.name = "childForm";
			// window.open("open할 window", "자식창 이름", "팝업창 옵션");
			var width = "500";
			var height = "300";
			var top = (window.screen.height - height) / 2;
			var left = (window.screen.width - width) / 2;
			var url = "/prog?command=plSearchForm";
			var title = "프로그래밍 언어 검색";
			var status = "toolbar=no,directories=no,scrollbars=no,resizable=no,status=no,menubar=no,width="
					+ width + ",height=" + height + ",top=" + top + ",left=" + left;

			window.open(url, title, status);

			
		} 	
</script>






<!-- end::Body -->
</html>