<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


<head>
<meta charset="utf-8" />
<title>PMMS | 프로젝트 등록</title>
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
</head>


<body
	class="kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">

	<!-- begin:: Page -->
	<!-- begin:: Content -->
	<div class="kt-content  kt-grid__item kt-grid__item--fluid"
		id="kt_content">
		<div class="kt-portlet kt-portlet--mobile">
			<div class="kt-portlet__head kt-portlet__head--lg">
				<div class="kt-portlet__head-label">
					<h3 class="kt-portlet__head-title">보유 자격증 등록</h3>
				</div>
			</div>
			<div class="kt-portlet__body">
				<form class="kt-form" id="kt_form" name="frm" method="post"
					action="prog?command=myCertRegist">
					<input type="hidden" name="progNum" id="progNum"
						value="${LoginUser.progNum}">
					<div class="row">
						<div class="col-xl-2"></div>
						<div class="col-xl-8">
							<div class="kt-section kt-section--first">
								<div class="kt-section__body">

									<div class="form-group row">
										<label class="col-3 col-form-label">자격증명</label> <input
											name="certNum" class="form-control" type="hidden">
										<div class="kt-input-icon kt-input-icon--right">
											<input type="text" class="form-control" id="generalSearch"
												name="certName" readonly> <span
												class="kt-input-icon__icon kt-input-icon__icon--right">
												<span><button type="button"
														class="btn btn-outline-hover-danger btn-icon"
														onClick="certNameCheck()" id="certNameCherck">
														<i class="la la-search"></i>
													</button></span>
											</span>
										</div>
									</div>

									<div class="form-group row">
										<label class="col-3 col-form-label">발급기관</label>
										<div class="col-9">
											<input class="form-control" type="text" name="issueOrg"
												id="issueOrg">
										</div>
									</div>
									<div class="form-group row">
										<label class="col-3 col-form-label">발행일자</label>
										<div class="col-9">
											<input type="text" class="form-control" id="kt_datepicker_1"
												readonly name="issueDate">
										</div>
									</div>
									<div class="form-group row">
										<label class="col-3 col-form-label">일련번호</label>
										<div class="col-9">
											<input class="form-control" type="text" name="certSerial"
												id="certSerial">
										</div>
									</div>
								</div>
							</div>
							<div class="kt-portlet__foot">
								<div class="kt-form__actions kt-form__actions--right">
									<div class="row">
										<div class="col kt-align-right">
											<button type="submit" class="btn btn-brand">등록</button>
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
	</div>

	<!-- end:: Content -->

	<!-- begin:: Footer -->


	<!-- begin::Scrolltop -->
	<div id="kt_scrolltop" class="kt-scrolltop">
		<i class="fa fa-arrow-up"></i>
	</div>

	<!-- end::Scrolltop -->

	<!-- end::Sticky Toolbar -->

	<!-- begin::Demo Panel -->
	<div id="kt_demo_panel" class="kt-demo-panel">
		<div class="kt-demo-panel__head">
			<h3 class="kt-demo-panel__title">
				Select A Demo

				<!--<small>5</small>-->
			</h3>
			<a href="#" class="kt-demo-panel__close" id="kt_demo_panel_close"><i
				class="flaticon2-delete"></i></a>
		</div>
		<div class="kt-demo-panel__body">
			<div class="kt-demo-panel__item kt-demo-panel__item--active">
				<div class="kt-demo-panel__item-title">Default</div>
				<div class="kt-demo-panel__item-preview">
					<img src="../assets/media/demos/Demo-_Default.jpg" alt="" />
					<div class="kt-demo-panel__item-preview-overlay">
						<a href="../default/index.html" class="btn btn-brand btn-elevate "
							target="_blank">Preview</a>
					</div>
				</div>
			</div>
			<div class="kt-demo-panel__item ">
				<div class="kt-demo-panel__item-title">Demo 2</div>
				<div class="kt-demo-panel__item-preview">
					<img src="../assets/media/demos/Demo-2.jpg" alt="" />
					<div class="kt-demo-panel__item-preview-overlay">
						<a href="../demo2/index.html" class="btn btn-brand btn-elevate "
							target="_blank">Preview</a>
					</div>
				</div>
			</div>
			<div class="kt-demo-panel__item ">
				<div class="kt-demo-panel__item-title">Demo 3</div>
				<div class="kt-demo-panel__item-preview">
					<img src="../assets/media/demos/Demo-3.jpg" alt="" />
					<div class="kt-demo-panel__item-preview-overlay">
						<a href="../demo3/index.html" class="btn btn-brand btn-elevate "
							target="_blank">Preview</a>
					</div>
				</div>
			</div>
			<div class="kt-demo-panel__item ">
				<div class="kt-demo-panel__item-title">Demo 4</div>
				<div class="kt-demo-panel__item-preview">
					<img src="../assets/media/demos/Demo-4.jpg" alt="" />
					<div class="kt-demo-panel__item-preview-overlay">
						<a href="../demo4/index.html" class="btn btn-brand btn-elevate "
							target="_blank">Preview</a>
					</div>
				</div>
			</div>
			<div class="kt-demo-panel__item ">
				<div class="kt-demo-panel__item-title">Demo 5</div>
				<div class="kt-demo-panel__item-preview">
					<img src="../assets/media/demos/Demo-5.jpg" alt="" />
					<div class="kt-demo-panel__item-preview-overlay">
						<a href="../demo5/index.html" class="btn btn-brand btn-elevate "
							target="_blank">Preview</a>
					</div>
				</div>
			</div>
			<div class="kt-demo-panel__item ">
				<div class="kt-demo-panel__item-title">Demo 6</div>
				<div class="kt-demo-panel__item-preview">
					<img src="../assets/media/demos/Demo-6.jpg" alt="" />
					<div class="kt-demo-panel__item-preview-overlay">
						<a href="../demo6/index.html" class="btn btn-brand btn-elevate "
							target="_blank">Preview</a>
					</div>
				</div>
			</div>
			<div class="kt-demo-panel__item ">
				<div class="kt-demo-panel__item-title">Demo 7</div>
				<div class="kt-demo-panel__item-preview">
					<img src="../assets/media/demos/Demo-7.jpg" alt="" />
					<div class="kt-demo-panel__item-preview-overlay">
						<a href="../demo7/index.html" class="btn btn-brand btn-elevate "
							target="_blank">Preview</a>
					</div>
				</div>
			</div>
			<div class="kt-demo-panel__item ">
				<div class="kt-demo-panel__item-title">Demo 8</div>
				<div class="kt-demo-panel__item-preview">
					<img src="../assets/media/demos/Demo-8.jpg" alt="" />
					<div class="kt-demo-panel__item-preview-overlay">
						<a href="../demo8/index.html" class="btn btn-brand btn-elevate "
							target="_blank">Preview</a>
					</div>
				</div>
			</div>
			<div class="kt-demo-panel__item ">
				<div class="kt-demo-panel__item-title">Demo 9</div>
				<div class="kt-demo-panel__item-preview">
					<img src="../assets/media/demos/Demo-9.jpg" alt="" />
					<div class="kt-demo-panel__item-preview-overlay">
						<a href="../demo9/index.html" class="btn btn-brand btn-elevate "
							target="_blank">Preview</a>
					</div>
				</div>
			</div>
			<div class="kt-demo-panel__item ">
				<div class="kt-demo-panel__item-title">Demo 10</div>
				<div class="kt-demo-panel__item-preview">
					<img src="../assets/media/demos/Demo-10.jpg" alt="" />
					<div class="kt-demo-panel__item-preview-overlay">
						<a href="../demo10/index.html" class="btn btn-brand btn-elevate "
							target="_blank">Preview</a>
					</div>
				</div>
			</div>
			<div class="kt-demo-panel__item ">
				<div class="kt-demo-panel__item-title">Demo 11</div>
				<div class="kt-demo-panel__item-preview">
					<img src="../assets/media/demos/Demo-11.jpg" alt="" />
					<div class="kt-demo-panel__item-preview-overlay">
						<a href="../demo11/index.html" class="btn btn-brand btn-elevate "
							target="_blank">Preview</a>
					</div>
				</div>
			</div>
			<div class="kt-demo-panel__item ">
				<div class="kt-demo-panel__item-title">Demo 12</div>
				<div class="kt-demo-panel__item-preview">
					<img src="../assets/media/demos/Demo-12.jpg" alt="" />
					<div class="kt-demo-panel__item-preview-overlay">
						<a href="../demo12/index.html" class="btn btn-brand btn-elevate "
							target="_blank">Preview</a>
					</div>
				</div>
			</div>
			<div class="kt-demo-panel__item ">
				<div class="kt-demo-panel__item-title">Demo 13</div>
				<div class="kt-demo-panel__item-preview">
					<img src="../assets/media/demos/Demo-13.jpg" alt="" />
					<div class="kt-demo-panel__item-preview-overlay">
						<a href="#" class="btn btn-brand btn-elevate disabled">Coming
							soon</a>
					</div>
				</div>
			</div>
			<div class="kt-demo-panel__item ">
				<div class="kt-demo-panel__item-title">Demo 14</div>
				<div class="kt-demo-panel__item-preview">
					<img src="../assets/media/demos/Demo-14.jpg" alt="" />
					<div class="kt-demo-panel__item-preview-overlay">
						<a href="#" class="btn btn-brand btn-elevate disabled">Coming
							soon</a>
					</div>
				</div>
			</div>
			<a href="" target="_blank"
				class="kt-demo-panel__purchase btn btn-brand btn-elevate btn-bold btn-upper">
				Buy Metronic Now! </a>
		</div>
	</div>

	<!-- end::Demo Panel -->

	<!-- begin::Global Config(global config for global JS sciprts) -->
	<script>
		function certNameCheck() {
			var url = "/prog?command=certSearchForm"
			window
					.open(url, "_blank_1",
							"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=500, height=400");

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
		src="../assets/app/custom/general/crud/forms/widgets/bootstrap-datepicker.js"
		type="text/javascript"></script>

	<!--end::Page Scripts -->

	<!--begin::Global App Bundle(used by all pages) -->
	<script src="../assets/app/bundle/app.bundle.js" type="text/javascript"></script>


	<!--end::Global App Bundle -->
</body>

<!-- end::Body -->
</html>