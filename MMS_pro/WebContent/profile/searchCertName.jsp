<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
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
</head>

<!-- end::Head -->

<!-- begin:: Content -->
<div class="kt-content  kt-grid__item kt-grid__item--fluid"
	id="kt_content">

	<div class="kt-portlet kt-portlet--mobile">
		<div class="kt-portlet__body">
			<div class="kt-portlet__head-label">
				<h3 class="kt-portlet__head-title">자격증 검색</h3>
			</div>
			<!--begin: Search Form -->
			<div
				class="kt-form kt-form--label-right kt-margin-t-20 kt-margin-b-10">
				<div class="row align-items-center">
					<div class="col-xl-8 order-2 order-xl-1">
						<div class="row align-items-center">
							<div class="col-md-4 kt-margin-b-20-tablet-and-mobile">
								<div class="kt-input-icon kt-input-icon--left">
									<input type="text" class="form-control" placeholder="Search..."
										id="generalSearch"> <span
										class="kt-input-icon__icon kt-input-icon__icon--left">
										<span><i class="la la-search"></i></span>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xl-4 order-1 order-xl-2 kt-align-right">
						<a href="#" class="btn btn-default kt-hidden"> <i
							class="la la-cart-plus"></i> New Order
						</a>
						<div
							class="kt-separator kt-separator--border-dashed kt-separator--space-lg d-xl-none"></div>
					</div>
				</div>
			</div>
			<div class="kt-portlet__body">
				<form name="frm" method="post">
					<div class="kt-section">
						<div class="kt-section__content">
							<table class="table table-bordered">
								<thead>
									<tr>
										<th><b>#</b></th>
										<th><b>자격증명</b></th>
										<th><b>발급기관</b></th>
									</tr>
								</thead>

								<c:forEach items="${certList}" var="CertVO">
									<tbody>
										<tr>
											<td><input type="hidden" name="certNum" value = "${CertVO.certNum}">
											<a onclick= "return sendToParent()">${CertVO.certNum}</a></td>
											<td><input type="hidden" name=certName value = "${CertVO.certName}">
											<a onclick= "return sendToParent()">${CertVO.certName}</a></td>
											<td>${CertVO.issueOrg}</td>
										</tr>
									</tbody>
								</c:forEach>
							</table>
						</div>
						<!--end::Section-->
					</div>
				</form>
				<!--end: Search Form -->
			</div>
			<div class="kt-portlet__body">
				<!--end: Datatable -->
			</div>
		</div>
	</div>

	<!-- end:: Content -->
</div>

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
</div>
</div>
</div>

<!-- end:: Page -->

<!-- begin::Quick Panel -->
<div id="kt_quick_panel" class="kt-quick-panel">
	<a href="#" class="kt-quick-panel__close" id="kt_quick_panel_close_btn"><i
		class="flaticon2-delete"></i></a>
	<div class="kt-quick-panel__nav">
		<ul
			class="nav nav-tabs nav-tabs-line nav-tabs-bold nav-tabs-line-3x nav-tabs-line-brand  kt-notification-item-padding-x"
			role="tablist">
			<li class="nav-item active"><a class="nav-link active"
				data-toggle="tab" href="#kt_quick_panel_tab_notifications"
				role="tab">Notifications</a></li>
			<li class="nav-item"><a class="nav-link" data-toggle="tab"
				href="#kt_quick_panel_tab_logs" role="tab">Audit Logs</a></li>
			<li class="nav-item"><a class="nav-link" data-toggle="tab"
				href="#kt_quick_panel_tab_settings" role="tab">Settings</a></li>
		</ul>
	</div>
</div>

<!-- end::Quick Panel -->

<!-- begin::Scrolltop -->
<div id="kt_scrolltop" class="kt-scrolltop">
	<i class="fa fa-arrow-up"></i>
</div>

<!-- end::Scrolltop -->

<!-- begin::Sticky Toolbar -->
<!-- end::Sticky Toolbar -->

<!-- begin::Global Config(global config for global JS sciprts) -->
<script>


	function sendToParent(){
	   window.opener.document.frm.certNum.value = document.frm.certNum.value;
	   window.opener.document.frm.certName.value = document.frm.certName.value;
	   self.close();
	   
	}
	
	
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
	src="../assets/app/custom/general/crud/metronic-datatable/advanced/column-rendering.js"
	type="text/javascript"></script>

<!--end::Page Scripts -->

<!--begin::Global App Bundle(used by all pages) -->
<script src="../assets/app/bundle/app.bundle.js" type="text/javascript"></script>

<!--end::Global App Bundle -->
</body>

<!-- end::Body -->
</html>