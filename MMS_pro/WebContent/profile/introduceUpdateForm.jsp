<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<style type="text/css">
table, td, tr, th {
	text-align: center;
}
</style>
</head>

<!-- end::Head -->

<!-- begin::Body -->
<body
	class="kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">

	<!-- begin:: Page -->

	<div class="kt-grid kt-grid--hor kt-grid--root">
		<div
			class="kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page">

			<!-- begin:: Content -->
			<div class="kt-content  kt-grid__item kt-grid__item--fluid"
				id="kt_content">
				<div class="row">
					<div class="col-lg-12">

						<!--begin::Portlet-->
						<div class="kt-portlet">
							<div class="kt-portlet__head">
								<div class="kt-portlet__head-label">
									<h3 class="kt-portlet__head-title">${LoginUser.name}님의
										자기소개서</h3>
								</div>
								<div class="kt-portlet__head-toolbar">
									<div class="btn-group"></div>
								</div>
							</div>

							<!--begin::Form-->
							<form class="kt-form kt-form--label-right" method="post" action="prog?command=introduceUpdate" enctype="multipart/form-data">
								<input type="hidden" name="progNum" id="progNum" value="${LoginUser.progNum}">
								<div class="kt-portlet__body">


									<label></label>
									<div class="form-group form-group-last row">

										<label class="col-3 col-form-label">성장과정 </label>

										<textarea style="width: 740px; height: 120px;"
											class="form-control" id="exampleTextarea"
											name = "introduce1">${progVo.introduce1 }</textarea>
									</div>

									<label></label><label></label>
									<div class="form-group form-group-last row">
										<label class="col-3 col-form-label">장점·단점</label>
										<textarea style="width: 740px; height: 120px;"
											class="form-control" id="exampleTextarea"
											name = "introduce2">${progVo.introduce2 }</textarea>
									</div>


									<label></label><label></label>
									<div class="form-group form-group-last row">
										<label class="col-3 col-form-label">취미·특기</label>
										<textarea style="width: 740px; height: 120px;"
											class="form-control" id="exampleTextarea"
											name = "introduce3">${progVo.introduce3 }</textarea>
									</div>

									<label></label><label></label>
									<div class="form-group form-group-last row"> 
										<label class="col-3 col-form-label">계획·포부 </label>
										<textarea style="width: 740px; height: 120px;"
											class="form-control" id="exampleTextarea"
											name = "introduce4">${progVo.introduce4 }</textarea>
									</div>


									<label></label><label></label>
									<div class="form-group form-group-last row">
										<label class="col-3 col-form-label">첨부파일</label>
										<div class="col-lg-6 col-md-6 col-sm-6">
											<input type="file" class="custom-file-input" name="introFile"
												id="introFile">
											<label class="custom-file-label"
												for="customFile" style="text-align: left;"></label>
										</div>
									</div>




									<div class="kt-portlet__foot">
										<div class="kt-form__actions">
											<div class="row">
												<div class="col-lg-6"></div>
												<div class="col-lg-6 kt-align-right">
													<button type="submit" class="btn btn-primary">저정</button>
												</div>
											</div>
										</div>
									</div>


								</div>
								</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>




















	<!--end::Form-->

	<!--end::Portlet-->

	<!-- begin:: Footer -->
	<div
		class="kt-footer kt-grid__item kt-grid kt-grid--desktop kt-grid--ver-desktop">
		<div class="kt-footer__copyright">
			2019&nbsp;&copy;&nbsp;<a href="http://keenthemes.com/metronic"
				target="_blank" class="kt-link">Keenthemes</a>
		</div>
		<div class="kt-footer__menu">
			<a href="http://keenthemes.com/metronic" target="_blank"
				class="kt-footer__menu-link kt-link">About</a> <a
				href="http://keenthemes.com/metronic" target="_blank"
				class="kt-footer__menu-link kt-link">Team</a> <a
				href="http://keenthemes.com/metronic" target="_blank"
				class="kt-footer__menu-link kt-link">Contact</a>
		</div>
	</div>

	<!-- end:: Footer -->

	<!-- end:: Page -->

	<!-- begin::Quick Panel -->

	<!-- end::Quick Panel -->

	<!-- begin::Scrolltop -->
	<div id="kt_scrolltop" class="kt-scrolltop">
		<i class="fa fa-arrow-up"></i>
	</div>

	<!-- end::Scrolltop -->

	<!-- begin::Sticky Toolbar -->
	<ul class="kt-sticky-toolbar" style="margin-top: 30px;">
		<li class="kt-sticky-toolbar__item kt-sticky-toolbar__item--success"
			id="kt_demo_panel_toggle" data-toggle="kt-tooltip"
			title="Check out more demos" data-placement="right"><a href="#"
			class=""><i class="flaticon2-drop"></i></a></li>
		<li class="kt-sticky-toolbar__item kt-sticky-toolbar__item--brand"
			data-toggle="kt-tooltip" title="Layout Builder" data-placement="left">
			<a
			href="https://keenthemes.com/metronic/preview/default/builder.html"
			target="_blank"><i class="flaticon2-gear"></i></a>
		</li>
		<li class="kt-sticky-toolbar__item kt-sticky-toolbar__item--warning"
			data-toggle="kt-tooltip" title="Documentation" data-placement="left">
			<a href="https://keenthemes.com/metronic/?page=docs" target="_blank"><i
				class="flaticon2-telegram-logo"></i></a>
		</li>
	</ul>

	<!-- end::Sticky Toolbar -->

	<!-- begin::Demo Panel -->


	<!-- end::Demo Panel -->

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
		src="../assets/app/custom/general/crud/metronic-datatable/base/data-local.js"
		type="text/javascript"></script>

	<!--end::Page Scripts -->

	<!--begin::Global App Bundle(used by all pages) -->
	<script src="../assets/app/bundle/app.bundle.js" type="text/javascript"></script>

	<!--end::Global App Bundle -->
</body>

<!-- end::Body -->

<script>
	function openPopUp() {
		// window.name = "부모창 이름"; 
		window.name = "parentForm";
		// window.open("open할 window", "자식창 이름", "팝업창 옵션");
		var width = "800";
		var height = "500";
		var top = (window.screen.height - height) / 2;
		var left = (window.screen.width - width) / 2;
		var url = "profile/eduRegisterForm.jsp";
		var title = "학력 정보 등록";
		var status = "toolbar=no,directories=no,scrollbars=no,resizable=no,status=no,menubar=no,width="
				+ width + ",height=" + height + ",top=" + top + ",left=" + left;

		window.open(url, title, status);

		/* window.open("memberUpdateForm.jsp",
		        "childForm", "width=500, height=300, resizable = no, scrollbars = no"); */
	}
</script>
</html>
