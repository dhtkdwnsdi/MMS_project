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
		<title>PMMS | 프로젝트 등록</title>
		<meta name="description" content="Form repeater examples">
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

<style>
#label1{
	font-weight: bold;
}
</style>

	<!-- begin::Body -->
	<body class="kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">

		<!-- begin:: Page -->

		<div class="kt-grid kt-grid--hor kt-grid--root">
			<div class="kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page">

						<!-- begin:: Content -->
						<div class="kt-content  kt-grid__item kt-grid__item--fluid" id="kt_content">
							<div class="row">
								<div class="col-lg-12">

									<!--begin::Portlet-->
									<div class="kt-portlet">
										<div class="kt-portlet__head">
											<div class="kt-portlet__head-label">
												<h3>
												프로젝트 등록
												</h3>
											</div>
										</div>

										<!--begin::Form-->
										<form method="POST" enctype="multipart/form-data" id="frm">
											<div class="kt-portlet__body">
												<div class="form-group row form-group-marginless kt-margin-t-20">
													<div class="col-lg-6">
														<label id="label1">프로젝트 명</label>
														<input type="text" class="form-control" placeholder="프로젝트 명을 입력해주세요." name="projName" id="projName">
													</div>
													<div class="col-lg-6">
														<label id="label1">담당자 명</label>
														<input type="text" class="form-control" readonly="readonly" value="${LoginUser.name}">
														<input type="hidden" name="progNum" id="progNum" value="${LoginUser.progNum}">
													</div>
												</div>
												<!-- Start Divider -->
												<br><br>
												<div class="kt-section__content kt-section__content--solid">
													<div class="kt-divider">
														<span></span>
													</div>
												</div>
												<br>
												<!-- End Divider -->
												<div class="form-group row form-group-marginless kt-margin-t-20">
													<div class="col-lg-4">
														<label id="label1">참여 형태</label>
														<select class="form-control" name="partiFormCode" id="partiFormCode">
															<option value="">선택</option>
															<option value="주관">주관</option>
															<option value="도급">도급</option>
															<option value="하도급">하도급</option>
															<option value="파견">파견</option>
														</select>
													</div>
													<div class="col-lg-4">
														<label id="label1">분류</label>
														<select class="form-control" name="projCate" id="projCate">
															<option value="">선택</option>
															<option value="설계">설계</option>
															<option value="개발">개발</option>
															<option value="디자인">디자인</option>
															<option value="등등">등등</option>
														</select>
													</div>
													<div class="col-lg-4">
														<label id="label1">세분류</label>
														<select class="form-control" name="projDetailCate" id="projDetailCate">
															<option value="">선택</option>
															<option value="웹">웹</option>
															<option value="시스템">시스템</option>
															<option value="앱">앱</option>
															<option value="등등">등등</option>
														</select>
													</div>
												</div>
												<!-- Start Divider -->
												<br><br>
												<div class="kt-section__content kt-section__content--solid">
													<div class="kt-divider">
														<span></span>
													</div>
												</div>
												<br>
												<!-- End Divider -->
												<div class="form-group row form-group-marginless kt-margin-t-20">
													<div class="col-lg-6">
														<label id="label1">OS 종류</label>
														<select class="form-control" name="osCode" id="osCode">
															<option value="">선택</option>
															<option value="Windows">Windows</option>
															<option value="Unix">Unix</option>
															<option value="Linux">Linux</option>
															<option value="등등">등등</option>
														</select>
													</div>
													<div class="col-lg-6">
														<label id="label1">프레임워크 종류</label>
														<select class="form-control" name="fwCode" id="fwCode">
															<optgroup label="JAVA">
																<option value="">선택</option>
																<option value="Struts">Struts</option>
																<option value="Spring">Spring</option>
																<option value="전자정부 프레임워크">전자정부 프레임워크</option>
															</optgroup>
															<optgroup label="QRM">
																<option value="">선택</option>
																<option value="myBatis">myBatis</option>
																<option value="Hibernate">Hibernate</option>
															</optgroup>
															<optgroup label="Javascript">
																<option value="">선택</option>
																<option value="AngularJS">AngularJS</option>
																<option value="React">React</option>
																<option value="polymer">polymer</option>
																<option value="Ember">Ember</option>
															</optgroup>
															<optgroup label="FrontEnd">
																<option value="">선택</option>
																<option value="Bootstrap">Bootstrap</option>
																<option value="React">React</option>
																<option value="polymer">polymer</option>
																<option value="Ember">Ember</option>
															</optgroup>
														</select>
													</div>
												</div>
												<div class="form-group row form-group-marginless kt-margin-t-20">
													<div class="col-lg-6">
														<label id="label1">DBMS 종류</label>
														<select class="form-control" name="dbmsCode" id="dbmsCode">
															<option value="">선택</option>
															<option value="Oracle">Oracle</option>
															<option value="MySQL">MySQL</option>
															<option value="MS SQL Server">MS SQL Server</option>
															<option value="PostgreSQL">PostgreSQL</option>
														</select>
													</div>
													<div class="col-lg-6">
														<label id="label1">프로젝트 난이도</label>
														<select class="form-control" name="levelCode" id="levelCode">
															<option value="">선택</option>
															<option value="상">상</option>
															<option value="중">중</option>
															<option value="하">하</option>
														</select>
													</div>
												</div>
												<!-- Start Divider -->
												<br><br>
												<div class="kt-section__content kt-section__content--solid">
													<div class="kt-divider">
														<span></span>
													</div>
												</div>
												<br>
												<!-- End Divider -->
												<div class="form-group row form-group-marginless kt-margin-t-20">
													<div class="col-lg-4">
														<label id="label1">신청 마감일</label>
														<div class="kt-input-icon">
															<input type="text" class="form-control" placeholder="날짜를 설정해주세요." name="deadline" id="deadline" readonly="readonly">
															<span class="kt-input-icon__icon kt-input-icon__icon--right"><span><i class="flaticon-calendar-2"></i></span></span>
														</div>
													</div>
													<div class="col-lg-4">
														<label id="label1">시작 예정일</label>
														<div class="kt-input-icon">
															<input type="text" class="form-control" placeholder="날짜를 설정해주세요." name="startDuedate" id="startDuedate" readonly="readonly">
															<span class="kt-input-icon__icon kt-input-icon__icon--right"><span><i class="flaticon-calendar-2"></i></span></span>
														</div>
													</div>
													<div class="col-lg-4">
														<label id="label1">종료 예정일</label>
														<div class="kt-input-icon">
															<input type="text" class="form-control" placeholder="날짜를 설정해주세요." name="endDuedate" id="endDuedate" readonly="readonly">
															<span class="kt-input-icon__icon kt-input-icon__icon--right"><span><i class="flaticon-calendar-2"></i></span></span>
														</div>
													</div>
												</div>
												<!-- Start Divider -->
												<br><br>
												<div class="kt-section__content kt-section__content--solid">
													<div class="kt-divider">
														<span></span>
													</div>
												</div>
												<br>
												<!-- End Divider -->
												
												<div id="kt_repeater_1">
												<div class="form-group  row" id="kt_repeater_1">
													<label class="col-lg-2 col-form-label" id="label1">사용 프로그래밍 언어</label>
													<div data-repeater-list="" class="col-lg-10">
														
													<div data-repeater-item="" class="form-group row align-items-center" style="">
															<div class="col-md-5">
																<div class="kt-form__group--inline">
																	<div class="kt-form__control">
																		<input type="email" class="form-control" placeholder="Enter full name">
																	</div>
																</div>
																<div class="d-md-none kt-margin-b-10"></div>
															</div>
															<div class="col-md-4">
																<div data-repeater-delete="" class="btn-sm btn btn-danger btn-pill">
																	<span>
																		<i class="la la-trash-o"></i>
																		<span>삭제</span>
																	</span>
																</div>
															</div>
														</div></div>
												</div>
												<div class="form-group row">
													<label class="col-lg-2 col-form-label"></label>
													<div class="col-lg-4">
														<div data-repeater-create="" class="btn btn btn-sm btn-brand btn-pill">
															<span>
																<i class="la la-plus"></i>
																<span>추가</span>
															</span>
														</div>
													</div>
												</div>
											</div>
											
											<!-- Start Divider -->
											<br><br>
											<div class="kt-section__content kt-section__content--solid">
												<div class="kt-divider">
													<span></span>
												</div>
											</div>
											<br>
											<!-- End Divider -->
												
												<div class="form-group row form-group-marginless kt-margin-t-20">
													<div class="col-lg-12">
														<label id="label1">프로젝트 내용</label>
														<textarea class="form-control" name="contents" id="contents" rows="3" style="margin-top: 0px; margin-bottom: 0px; height: 129px;"></textarea>
													</div>
												</div>
												<!-- Start Divider -->
												<br><br>
												<div class="kt-section__content kt-section__content--solid">
													<div class="kt-divider">
														<span></span>
													</div>
												</div>
												<br>
												<!-- End Divider -->
												<div class="form-group">
														<label id="label1">첨부파일</label>
														<div class="custom-file">
															<input type="file" class="custom-file-input" name="projFile" id="projFile">
															<label class="custom-file-label" for="customFile" style="text-align: left;"></label>
														</div>
												</div>
											</div>
											<div class="kt-portlet__foot">
												<div class="kt-form__actions">
													<div class="row">
														<div class="col-lg-6">
														</div>
														<div class="col-lg-6 kt-align-right">
															<button type="button" class="btn btn-primary" id="submitBtn" onclick="registerProject()">저장</button>
															<button type="button" class="btn btn-secondary" onclick="self.close()">취소</button>
															<!-- <button type="reset" class="btn btn-danger">Delete</button> -->
														</div>
													</div>
												</div>
											</div>

										</form>
										<!--end::Form-->
									</div>

									<!--end::Portlet-->
								</div>
							</div>
						</div>

						<!-- end:: Content -->
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

		<!--begin::Page Scripts(used by this page) -->
		<script src="../assets/app/custom/general/crud/forms/widgets/form-repeater.js" type="text/javascript"></script>

		<!--end::Page Scripts -->

		<!--begin::Global App Bundle(used by all pages) -->
		<script src="../assets/app/bundle/app.bundle.js" type="text/javascript"></script>

		<!--end::Global App Bundle -->
	</body>
<link rel="stylesheet" href="//code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" />
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<script>
$.datepicker.setDefaults({
    dateFormat: 'yy-mm-dd',
    prevText: '이전 달',
    nextText: '다음 달',
    monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
    monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
    dayNames: ['일', '월', '화', '수', '목', '금', '토'],
    dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
    dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
    showMonthAfterYear: true,
    yearSuffix: '년'
});

$(function() {
    $("#startDuedate").datepicker();
    $("#endDuedate").datepicker();
    $("#deadline").datepicker();
});

function registerProject(){
	
	// userID 변수에 userID의 입력된 값을 가져오게 함
	var projName = $('#projName').val();
	var progNum = $('#progNum').val();
	var partiFormCode = $('#partiFormCode').val();
	var projCate = $('#projCate').val();
	var projDetailCate = $('#projDetailCate').val();
	var osCode = $('#osCode').val();
	var fwCode = $('#fwCode').val();
	var dbmsCode = $('#dbmsCode').val();
	var levelCode = $('#levelCode').val();
	var startDuedate = $('#startDuedate').val();
	var endDuedate = $('#endDuedate').val();
	var deadline = $('#deadline').val();
	var contents = $('#contents').val();
	var projFile = $('#projFile').val();
	
	
	if(projName == ""){
		alert("프로젝트 명을 입력해주세요.");
		$("#projName").focus();
		return false;
	}
	if(partiFormCode == ""){
		alert("참여형태를 선택해주세요.");
		$("#partiFormCode").focus();
		return false;
	}
	if(projCate == ""){
		alert("분류를 선택해주세요.");
		$("#projCate").focus();
		return false;
	}
	if(projDetailCate == ""){
		alert("세분류를 선택해주세요.");
		$("#projDetailCate").focus();
		return false;
	}
	if(osCode == ""){
		alert("OS를 선택해주세요.");
		$("#osCode").focus();
		return false;
	}
	if(fwCode == ""){
		alert("프레임워크를 선택해주세요.");
		$("#fwCode").focus();
		return false;
	}
	if(dbmsCode == ""){
		alert("DBMS를 선택해주세요.");
		$("#dbmsCode").focus();
		return false;
	}
	if(levelCode == ""){
		alert("프로젝트 난이도를 선택해주세요.");
		$("#levelCode").focus();
		return false;
	}
	if(deadline == ""){
		alert("신청 마감일을 선택해주세요.");
		$("#deadline").focus();
		return false;
	}
	if(startDuedate == ""){
		alert("시작 예정일을 선택해주세요.");
		$("#startDuedate").focus();
		return false;
	}
	if(endDuedate == ""){
		alert("종료 예정일을 선택해주세요.");
		$("#endDuedate").focus();
		return false;
	}
	
	else {
		var form = $("#frm")[0];
		var data = new FormData(form);
	$.ajax({
		
		type: 'POST',  // GET or POST 전송방법 
		enctype: 'multipart/form-data',
		url: '/proj?command=projectRegister',  // 이쪽으로 보낸다(호출URL)
		
		processData: false, 
        contentType: false,
	
		data: data,  
		cache: false,
		timeout: 600000,
		success: function(data){  // 만약 성공적으로 수행되었다면 result로 값반환
			alert("등록되었습니다.");
			self.close();
			opener.location.href = "/proj?command=projectRegisterListForm";
		},
		error: function(data){
			alert("오류:: 다시 시도해주세요.");
			return false;
		}
		 
	})
	} 
}
</script>

	<!-- end::Body -->
</html>
