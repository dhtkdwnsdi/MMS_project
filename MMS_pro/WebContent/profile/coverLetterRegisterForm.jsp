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
<title>Metronic | 자기소개서 등록</title>
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
<link
	href="../assets/vendors/general/perfect-scrollbar/css/perfect-scrollbar.css"
	rel="stylesheet" type="text/css" />

<!--end:: Global Mandatory Vendors -->

<!--begin:: Global Optional Vendors -->
<link href="../assets/vendors/general/tether/dist/css/tether.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/vendors/general/bootstrap-datepicker/dist/css/bootstrap-datepicker3.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/vendors/general/bootstrap-datetime-picker/css/bootstrap-datetimepicker.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/vendors/general/bootstrap-timepicker/css/bootstrap-timepicker.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/vendors/general/bootstrap-daterangepicker/daterangepicker.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/vendors/general/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/vendors/general/bootstrap-select/dist/css/bootstrap-select.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/vendors/general/bootstrap-switch/dist/css/bootstrap3/bootstrap-switch.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/vendors/general/select2/dist/css/select2.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/vendors/general/ion-rangeslider/css/ion.rangeSlider.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/vendors/general/nouislider/distribute/nouislider.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/vendors/general/owl.carousel/dist/assets/owl.carousel.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/vendors/general/owl.carousel/dist/assets/owl.theme.default.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/vendors/general/dropzone/dist/dropzone.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/vendors/general/summernote/dist/summernote.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/vendors/general/bootstrap-markdown/css/bootstrap-markdown.min.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/vendors/general/animate.css/animate.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/vendors/general/toastr/build/toastr.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/vendors/general/morris.js/morris.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/vendors/general/sweetalert2/dist/sweetalert2.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/vendors/general/socicon/css/socicon.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/vendors/custom/vendors/line-awesome/css/line-awesome.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/vendors/custom/vendors/flaticon/flaticon.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/vendors/custom/vendors/flaticon2/flaticon.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/vendors/custom/vendors/fontawesome5/css/all.min.css"
	rel="stylesheet" type="text/css" />

<!--end:: Global Optional Vendors -->

<!--begin::Global Theme Styles(used by all pages) -->
<link href="../assets/demo/default/base/style.bundle.css"
	rel="stylesheet" type="text/css" />

<!--end::Global Theme Styles -->

<!--begin::Layout Skins(used by all pages) -->
<link href="../assets/demo/default/skins/header/base/light.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/demo/default/skins/header/menu/light.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/demo/default/skins/brand/dark.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/demo/default/skins/aside/dark.css"
	rel="stylesheet" type="text/css" />

<!--end::Layout Skins -->
<link rel="shortcut icon" href="../assets/media/logos/favicon.ico" />
</head>

<!-- end::Head -->

<!-- begin::Body -->
<body
	class="kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">

	<!-- begin:: Content -->


	<div class="kt-content  kt-grid__item kt-grid__item--fluid"
		id="kt_content">
		<div class="kt-portlet kt-portlet--mobile">
			<div class="kt-portlet__head kt-portlet__head--lg">
				<div class="kt-portlet__head-label">
					<h3 class="kt-portlet__head-title">자기소개서 등록</h3>
				</div>
			</div>
			<div class="kt-portlet__body">
				<form class="kt-form" id="kt_form" method="post" action="">
					<input type="hidden" name="progNum" value="${LoginUser.progNum}"
						id="progNum">
					<div class="row">
						<div class="col-xl-2"></div>
						<div class="col-xl-8">
							<div class="kt-section kt-section--first">

								<div class="kt-section__body">
									<%-- <h3 class="kt-section__title kt-section__title-lg">${LoginUser.name} 님의 경력 정보</h3>
																<div class="kt-separator kt-separator--border-dashed kt-separator--space-lg"></div> --%>




									<div class="kt-portlet__body">
										<div class="form-group row">
											<label class="col-form-label col-lg-3 col-sm-12">Default
												Demo</label>
											<div class="col-lg-9 col-md-9 col-sm-12">
												<div class="md-editor" id="1557735214903">
													<div class="md-header btn-toolbar">
														<div class="btn-group">
															<button class="btn-default btn-sm btn" type="button"
																title="Bold" tabindex="-1"
																data-provider="bootstrap-markdown"
																data-handler="bootstrap-markdown-cmdBold"
																data-hotkey="Ctrl+B">
																<span class="fa fa-bold"></span>
															</button>
															<button class="btn-default btn-sm btn" type="button"
																title="Italic" tabindex="-1"
																data-provider="bootstrap-markdown"
																data-handler="bootstrap-markdown-cmdItalic"
																data-hotkey="Ctrl+I">
																<span class="fa fa-italic"></span>
															</button>
															<button class="btn-default btn-sm btn" type="button"
																title="Heading" tabindex="-1"
																data-provider="bootstrap-markdown"
																data-handler="bootstrap-markdown-cmdHeading"
																data-hotkey="Ctrl+H">
																<span class="fa fa-heading"></span>
															</button>
														</div>
														<div class="btn-group">
															<button class="btn-default btn-sm btn" type="button"
																title="URL/Link" tabindex="-1"
																data-provider="bootstrap-markdown"
																data-handler="bootstrap-markdown-cmdUrl"
																data-hotkey="Ctrl+L">
																<span class="fa fa-link"></span>
															</button>
															<button class="btn-default btn-sm btn" type="button"
																title="Image" tabindex="-1"
																data-provider="bootstrap-markdown"
																data-handler="bootstrap-markdown-cmdImage"
																data-hotkey="Ctrl+G">
																<span class="fa fa-image"></span>
															</button>
														</div>
														<div class="btn-group">
															<button class="btn-default btn-sm btn" type="button"
																title="Unordered List" tabindex="-1"
																data-provider="bootstrap-markdown"
																data-handler="bootstrap-markdown-cmdList"
																data-hotkey="Ctrl+U">
																<span class="fa fa-list"></span>
															</button>
															<button class="btn-default btn-sm btn" type="button"
																title="Ordered List" tabindex="-1"
																data-provider="bootstrap-markdown"
																data-handler="bootstrap-markdown-cmdListO"
																data-hotkey="Ctrl+O">
																<span class="fa fa-list-ol"></span>
															</button>
															<button class="btn-default btn-sm btn" type="button"
																title="Code" tabindex="-1"
																data-provider="bootstrap-markdown"
																data-handler="bootstrap-markdown-cmdCode"
																data-hotkey="Ctrl+K">
																<span class="fa fa-code"></span>
															</button>
															<button class="btn-default btn-sm btn" type="button"
																title="Quote" tabindex="-1"
																data-provider="bootstrap-markdown"
																data-handler="bootstrap-markdown-cmdQuote"
																data-hotkey="Ctrl+Q">
																<span class="fa fa-quote-left"></span>
															</button>
														</div>
														<div class="btn-group">
															<button class="btn-sm btn btn-primary" type="button"
																title="Preview" tabindex="-1"
																data-provider="bootstrap-markdown"
																data-handler="bootstrap-markdown-cmdPreview"
																data-hotkey="Ctrl+P" data-toggle="button">
																<span class="fa fa-search"></span> Preview
															</button>
														</div>
														<div class="md-controls">
															<a class="md-control md-control-fullscreen" href="#"><span
																class="fa fa-expand"></span></a>
														</div>
													</div>
													<textarea name="content" class="form-control md-input"
														data-provide="markdown" rows="10" style="resize: none;"></textarea>
													<div class="md-fullscreen-controls">
														<a href="#" class="exit-fullscreen"
															title="Exit fullscreen"><span class="fa fa-compress"></span></a>
													</div>
												</div>
											</div>
										</div>
										<div class="form-group row">
											<label class="col-form-label col-lg-3 col-sm-12">Modal
												Demos</label>
											<div class="col-lg-9 col-md-9 col-sm-12">
												<a href="" class="btn btn-success btn-pill"
													data-toggle="modal" data-target="#kt_markdown_modal">Launch
													modal examples</a>
											</div>
										</div>
									</div>




									<div class="form-group form-group-last row">
										<label class="col-3 col-form-label">첨부파일</label>
										<div class="col-lg-9 col-md-9 col-sm-12">
											<div
												class="kt-dropzone dropzone m-dropzone--primary dz-clickable"
												action="inc/api/dropzone/upload.php" id="m-dropzone-two">
												<div class="kt-dropzone__msg dz-message needsclick">
													<h3 class="kt-dropzone__msg-title">Drop files here or
														click to upload.</h3>
													<span class="kt-dropzone__msg-desc">Upload up to 10
														files</span>
												</div>
											</div>
										</div>
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
	function registerEdu() {

		// userID 변수에 userID의 입력된 값을 가져오게 함
		var progNum = $('#progNum').val();
		var eduCategory = $('#eduCategory').val();
		var eduState = $('#eduState').val();
		var schoolName = $('#schoolName').val();
		var enterDate = $('#kt_datepicker_1').val();
		var graduateDate = $('#kt_datepicker_4_1').val();

		if (eduCategory == "") {
			alert("분류를 입력해주세요.");
			$("#eduCategory").focus();
		}
		if (eduState == "") {
			alert("상태를 입력해주세요.");
			$("#eduState").focus();
		}
		if (schoolName == "") {
			alert("학교명을 입력해주세요.");
			$("#schoolName").focus();
		}
		if (progNum == "") {
			alert("잘못된 정보입니다.");
			return false;
		} else {

			$.ajax({

				type : 'POST', // GET or POST 전송방법 

				url : '/prog?command=eduRegister', // 이쪽으로 보낸다(호출URL)

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
					opener.location.href = "/prog?command=eduListForm";
				},
				error : function(data) {
					alert("오류:: 다시 시도해주세요.");
					return false;
				}

			})
		}
	}
</script>

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" />
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
</script>
<!-- end::Body -->
</html>