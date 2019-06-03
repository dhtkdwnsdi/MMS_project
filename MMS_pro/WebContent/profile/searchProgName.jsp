<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html lang="en">
<meta charset="utf-8" />
<title>PMMS | 프로그래머 검색</title>
<meta name="description" content="Multi column form examples">
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
<head>
</head>

<!-- end::Head -->

<!-- begin:: Content -->
<div class="kt-content  kt-grid__item kt-grid__item--fluid"
	id="kt_content">

	<div class="kt-portlet kt-portlet--mobile">
		<div class="kt-portlet__body">
			<div class="kt-portlet__head-label">
				<h3 class="kt-portlet__head-title">프로그래머 검색</h3>
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
										<th style="font-weight: bold;">이름</th>
										<th style="font-weight: bold;">id</th>
									</tr>
								</thead>

								<tbody style="text-align: center;">
									<c:forEach items="${progList}" var="pVo"
										varStatus="listStat">
										<tr>
											<th scope="row">
											${listStat.count}</th>
											<td><a onclick="sendToParent('${pVo.progNum}','${pVo.name}')">
											${pVo.name}</a></td>
											<td>${pVo.id}</td>
										</tr>
									</c:forEach>
								</tbody>
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
	function sendToParent(prognum, name) {

		
		opener.document.getElementById("sendReceiver").value = prognum;
		opener.document.getElementById("sendName").value = name;
		
		window.close();

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