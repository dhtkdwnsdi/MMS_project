<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<style>
#label1{
 font-weight: bold;;
}
</style>
	<!-- begin::Head -->
	<head>
		<meta charset="utf-8" />
		<title>PMMS | 프로젝트 인력 추천배치</title>
		<meta name="description" content="Base form control examples">
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
		
		<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>

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

		<!-- begin:: Page -->

		<div class="kt-grid kt-grid--hor kt-grid--root">
			<div class="kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page">


					<div class="kt-grid__item kt-grid__item--fluid kt-grid kt-grid--hor">
						<!-- begin:: Content -->
						<div class="kt-content  kt-grid__item kt-grid__item--fluid" id="kt_content">
							<div class="row">
								<div class="col-lg-12">

									<!--begin::Portlet-->
									<div class="kt-portlet">
										<div class="kt-portlet__head">
											<div class="kt-portlet__head-label">
												<h3>
												프로젝트 인력 추천배치
												</h3>
											</div>
										</div>

										<!--begin::Form-->
											<div class="kt-portlet__body">
													<div class="form-group row form-group-marginless kt-margin-t-20">
														<div class="col-lg-6">
														 <div class="form-group">
															<label id="label1">프로그래밍 언어 </label>
																<div class="kt-checkbox-inline">
																	<c:forEach items="${plList}" var="plVo" varStatus="listStat">
																	<label class="kt-checkbox">
																	<input type="checkbox" id="plName" value="${plVo.plName}"> ${plVo.plName}
																	<span></span>
																	</label>
																	</c:forEach>
																</div>
														 </div>
														</div>
														<div class="col-lg-4">
															<label id="label1">프로그래머 등급</label>
															<br>
															<div class="input-group">
															<select name="grade" class="form-control" id="grade">
																<option value="">전체</option>
																<option value="1">초급기능사</option>
																<option value="2">중급기능사</option>
																<option value="3">고급기능사</option>
																<option value="4">초급기술자</option>
																<option value="5">중급기술자</option>
																<option value="6">고급기술자</option>
																<option value="7">특급기술자</option>
																<option value="8">기술사</option>
															</select>
															&nbsp;&nbsp;&nbsp;
															<input type="button" class="btn btn-success btn-sm" id="recommend" value="추천하기">
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
														<label id="label1">추천된 인력</label>
														<br>
													</div>
												</div>
												
												<div class="form-group row form-group-marginless kt-margin-t-20">
													<div class="col-lg-12">
														<table class="table table-bordered table-hover" id="recommendTable">
														<thead style="text-align: center;">
															<tr>
																<th><input type="checkbox" id="allCheck1" name="allCheck"></th>
																<th style="font-weight: bold;">ID</th>
																<th style="font-weight: bold;">이름</th>
																<th style="font-weight: bold;">등급</th>
																<th style="font-weight: bold;">관련기술</th>
																<!-- <th style="font-weight: bold;">프로젝트 참여여부</th>
																<th style="font-weight: bold;">종료날짜</th> -->
															</tr>
														</thead>
														<tbody style="text-align: center;">
															<c:forEach items="${recommendList}" var="rVo" varStatus="listStat">
															<tr>
																<c:if test="${listStat.count < 6}">
																<td><input type="checkbox" class="checkBox1" name="check" value="${rVo.progNum}"></td>
																<td>
																<a href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">${rVo.id}</a>
																	<div class="dropdown-menu">
																	<a class="dropdown-item" href="#" onclick="openProfilePopup('${rVo.progNum}')">
																	<i class="kt-nav__link-icon flaticon2-avatar"></i>
																	<span class="kt-nav__link-text">이력서</span>
																	</a>
																	<a class="dropdown-item" href="#" onclick="openIntroducePopup('${rVo.progNum}')">
																	<i class="flaticon-avatar"></i>
																	<span class="kt-nav__link-text">자기소개서</span>
																	</a>
																	<a class="dropdown-item" href="#" onclick="msgPopUp('${rVo.progNum}', '${rVo.progName}')">
																	<i class="kt-nav__link-icon flaticon2-send"></i>
																	<span class="kt-nav__link-text">메세지</span>
																	</a>
																	<!-- <div class="dropdown-divider"></div>
																	<a class="dropdown-item" href="#">Separated link</a> -->
																	</div>
																</td>
																<td>${rVo.progName}</td>
																
																<c:if test="${rVo.grade eq 1}">
																<td>초급기능사</td>
																</c:if>
																<c:if test="${rVo.grade eq 2}">
																<td>중급기능사</td>
																</c:if>
																<c:if test="${rVo.grade eq 3}">
																<td>고급기능사</td>
																</c:if>
																<c:if test="${rVo.grade eq 4}">
																<td>초급기술사</td>
																</c:if>
																<c:if test="${rVo.grade eq 5}">
																<td>중급기술사</td>
																</c:if>
																<c:if test="${rVo.grade eq 6}">
																<td>고급기술사</td>
																</c:if>
																<c:if test="${rVo.grade eq 7}">
																<td>특급기술사</td>
																</c:if>
																<c:if test="${rVo.grade eq 8}">
																<td>기술사</td>
																</c:if>
																
																<td>${rVo.plName}</td>
																</c:if>
															</tr>
															</c:forEach>
														</tbody>
													</table>
													</div>
													<div class="col-lg-12 kt-align-right">
														<br>
														<input type="hidden" id="projNum" name="projNum" value="${projNum}">
														<input type="button" id="deploy" value="배치" class="btn btn-primary">
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
														<label id="label1">배치된 인력</label>
														<br>
													</div>
												</div>
												
												<div class="form-group row form-group-marginless kt-margin-t-20">
													<div class="col-lg-12">
														<table id="deployedTable" class="table table-bordered table-hover">
														<thead style="text-align: center;">
															<tr>
																<th><input type="checkbox" id="allCheck2"></th>
																<th style="font-weight: bold;">ID</th>
																<th style="font-weight: bold;">이름</th>
																<th style="font-weight: bold;">등급</th>
																<th style="font-weight: bold;">관련기술</th>
																<!-- <th style="font-weight: bold;">프로젝트 참여여부</th>
																<th style="font-weight: bold;">종료날짜</th> -->
															</tr>
														</thead>
														<tbody style="text-align: center;">
															<c:forEach items="${pMemList}" var="pMemVo" varStatus="listStat">
															<tr>
																<td><input type="checkbox" disabled="disabled"></td>
																<td>
																<a href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">${pMemVo.id}</a>
																	<div class="dropdown-menu">
																	<a class="dropdown-item" href="#" onclick="openProfilePopup('${pMemVo.progNum}')">
																	<i class="kt-nav__link-icon flaticon2-avatar"></i>
																	<span class="kt-nav__link-text">이력서</span>
																	</a>
																	<a class="dropdown-item" href="#" onclick="openIntroducePopup('${pMemVo.progNum}')">
																	<i class="flaticon-avatar"></i>
																	<span class="kt-nav__link-text">자기소개서</span>
																	</a>
																	<a class="dropdown-item" href="#" onclick="msgPopUp('${pMemVo.progNum}', '${pMemVo.progName}')">
																	<i class="kt-nav__link-icon flaticon2-send"></i>
																	<span class="kt-nav__link-text">메세지</span>
																	</a>
																	<!-- <div class="dropdown-divider"></div>
																	<a class="dropdown-item" href="#">Separated link</a> -->
																	</div>
																</td>
																<td>${pMemVo.progName}</td>
																
																<c:if test="${pMemVo.grade eq 1}">
																<td>초급기능사</td>
																</c:if>
																<c:if test="${pMemVo.grade eq 2}">
																<td>중급기능사</td>
																</c:if>
																<c:if test="${pMemVo.grade eq 3}">
																<td>고급기능사</td>
																</c:if>
																<c:if test="${pMemVo.grade eq 4}">
																<td>초급기술사</td>
																</c:if>
																<c:if test="${pMemVo.grade eq 5}">
																<td>중급기술사</td>
																</c:if>
																<c:if test="${pMemVo.grade eq 6}">
																<td>고급기술사</td>
																</c:if>
																<c:if test="${pMemVo.grade eq 7}">
																<td>특급기술사</td>
																</c:if>
																<c:if test="${pMemVo.grade eq 8}">
																<td>기술사</td>
																</c:if>
																<td>${pMemVo.plName}</td>
															</tr>
															</c:forEach>
															<c:if test="${empty pMemList}">
																<tr>
																	<td colspan="5">내역이 없습니다.</td>
																</tr>
															</c:if>
														</tbody>
													</table>
													</div>
													<div class="col-lg-12 kt-align-right">
														<br>
														<input type="button" id="cancel" value="취소" class="btn btn-primary">
													</div>
													</div>
												</div>
												
												<div class="kt-portlet__foot">
												<div class="kt-form__actions">
													<div class="row">
														<div class="col-lg-6">
														</div>
														<div class="col-lg-6 kt-align-right">
															<button type="button" class="btn btn-danger" onclick="directDeploy()">직접배치</button>
															<button type="button" class="btn btn-primary" id="save">저장</button>
														</div>
													</div>
												</div>
											</div>
											</div>
											

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

		<!--begin::Global App Bundle(used by all pages) -->
		<script src="../assets/app/bundle/app.bundle.js" type="text/javascript"></script>

		<!--end::Global App Bundle -->
	</body>

	<!-- end::Body -->
	
<script>

// 추천 기능 Jquery
$("#recommend").click(function(){
	// 사용자가 추천 받고 싶은 프로그래밍 언어를 배열로 받음
	var plList = [];
	
	$("#plName:checked").each(function(i){ // jQuery로 for문 돌면서 check 된 값 배열에 대입
		plList.push($(this).val());
	});
	
	// 사용자가 추천 받고 싶은 프로그래머 등급을 받음
	var grade = $('#grade').val();
	
	
	$.ajax({
		
		type: 'POST',  // GET or POST 전송방법 
		url: '/proj?command=projectManpowerRecommend',  // 이쪽으로 보낸다(호출URL)
		traditional : true,
		dataType : "json",
		data: {
			"plName" : plList,
			"grade" : grade
		},  
		success: function(data){  // 만약 성공적으로 수행되었다면 result로 값반환
			// 추천된 인력 테이블을 비움
			$("#recommendTable > tbody").empty();
			
			// ajax를 통해 얻은 data의 길이가 0보다 클 경우 즉, 리스트가 있을 경우
			if(data.length > 0) {
			$.each(data, function(key, value){
				var eachrow = "<tr>"
							+ "<td>" + "<input type=\"checkbox\" class=\"checkBox1\" name=\"check\" value=\"" + value.progNum + "\"" + ">"
							+ "</td>"
							+ "<td>" + "<a href=\"#\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">" 
							+ value.id
							+ "</a>"
							
							+ "<div class=\"dropdown-menu\">"
							+ "<a class=\"dropdown-item\" href=\"#\" onclick=\"openProfilePopup('" + value.progNum + "')\">"
							+ "<i class=\"kt-nav__link-icon flaticon2-avatar\"></i>"
							+ "<span class=\"kt-nav__link-text\">이력서</span></a>"
							
							+ "<a class=\"dropdown-item\" href=\"#\" onclick=\"openIntroducePopup('" + value.progNum + "')\">"
							+ "<i class=\"flaticon-avatar\"></i>"
							+ "<span class=\"kt-nav__link-text\">자기소개서</span></a>"
							
							+ "<a class=\"dropdown-item\" href=\"#\" onclick=\"msgPopUp('" + value.progNum + "', '" + value.progName + "')\">"
							+ "<i class=\"kt-nav__link-icon flaticon2-send\"></i>"
							+ "<span class=\"kt-nav__link-text\">메세지</span></a>"
							+ "</div>"
							
							
							+ "</td>"
							+ "<td>" + value.progName + "</td>"
							+ "<td>" + value.grade + "</td>"
							+ "<td>" + value.plName + "</td>";
				$("#recommendTable > tbody").append(eachrow);
			});
			}
			else {
				var eachrow = "<tr>"
					+ "<td colspan=\"5\">" + "내역이 없습니다" + "</td>"
					+ "</tr>";
				$("#recommendTable > tbody").append(eachrow);	
			}
		
		},
		error:function(request,status,error){
	        alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
	       }
		 

	});
});



$("#deploy").click(function(){
	
	var zeroTd = "<tr>"
			   + "<td colspan=\"5\">"
			   + "내역이 없습니다."
			   + "</td>"
			   + "</tr>"; 
			   
	var length = $("#recommendTable > tbody td").length;
	var noList = $("#deployedTable > tbody td").length;
	
	var allCheck = $("#allCheck1").is(":checked");
	
	// 배치된 인력 칸에 내역 없음일 경우
	if(noList == 1){
		$("#deployedTable > tbody tr").remove();
	}
	
	// allCheck을 눌러서 추천된 인력을 모두 배치된 인력으로 내릴 경우 내역없음을 띄운 동시에 allCheck1 체크 해제
	if(allCheck == true){
		$("#recommendTable > tbody").append(zeroTd);
		$("#allCheck1").prop("checked", false);
	}
	
	
	var checkbox = $("input[name=check]:checked");
	
	checkbox.each(function(i) { 	
		var tr = checkbox.parent().parent().eq(i);
		var td = tr.children();
		var progNum = $(this).val();
		var id = td.eq(1).html();
		var name = td.eq(2).text();
		var grade = td.eq(3).text();
		var plName = td.eq(4).text();
		var row = "<tr>"
				+ "<td>" + "<input type=\"checkbox\" class=\"checkBox2\" name=\"check2\" value=\"" + progNum + "\"" + ">" + "</td>"
				+ "<td>" + id + "</td>"
				+ "<td>" + name + "</td>"
				+ "<td>" + grade + "</td>"
				+ "<td>" + plName + "</td>"
				+ "</tr>";
				
		// 숨긴 값의 체크박스를 false 상태로 바꿈
		$(this).prop("checked", false);
		
		// allcheck할 경우 숨긴 값의 체크박스도 체크되어서 class 값을 바꿈
		$(this).attr("class", "hide");
		tr.hide();
		$("#deployedTable > tbody").append(row);
	});
	
});

$("#cancel").click(function(){
	var zeroTd = "<tr>"
		   + "<td colspan=\"5\">"
		   + "내역이 없습니다."
		   + "</td>"
		   + "</tr>"; 
		   
	var allCheck = $("#allCheck2").is("checked");
	
	if(allCheck == true){
		$("#deployedTable > tbody").append(zeroTd);
		$("#allCheck2").prop("checked", false);
	}
	

		   
	var checkbox = $("input[name=check2]:checked");
	checkbox.each(function(i){
		tr = checkbox.parent().parent().eq(i);
		$(this).prop("checked", false);
		$(this).attr("name", "hideCheck2");
		$(this).attr("class", "hideCheck2");
		tr.hide();
	});
	
});

// 체크박스 전체 선택, 해제
$( document ).ready( function() {
    $( '#allCheck1' ).click( function() {
      $( '.checkBox1' ).prop( 'checked', this.checked );
    } );
  } );
  
$( document ).ready( function() {
    $( '#allCheck2' ).click( function() {
      $( '.checkBox2' ).prop( 'checked', this.checked );
    } );
  } );

var dProgNum = [];
$("#save").click(function(){
	var projNum = $("#projNum").val();
	// class가 checkBox2인 value 값을 dProgNum 배열에 대입 
	$("input[name=check2]").each(function(i){
		dProgNum.push($("input[name=check2]").eq(i).val());
	});
	
	if(dProgNum.length == 0){
		alert("인력을 배치해주세요.");
		return false;
	}

	if(confirm("저장하시겠습니까?") == true){
			
			$.ajax({
				type: "POST",
				data: {
					"dProgNum" : dProgNum,
					"projNum"  : projNum
				},
				url: "/proj?command=projectRecommendDeploy",
				traditional : true,
				
				success: function(data){
					alert("저장되었습니다.");
					self.close();
					opener.location.href = "/proj?command=myProjectViewForm&projNum="+projNum;
				},
				error:function(request,status,error){
			        alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
			       }

				
				
			});
		
		
	}
	else{
		return false;
	}
	
	
	
	
	
});

function directDeploy()
{
	var projNum = $("#projNum").val();
    // window.name = "부모창 이름"; 
      window.name = "parentForm";
    // window.open("open할 window", "자식창 이름", "팝업창 옵션");
      var width = "800"; 
	  var height = "700"; 
	  var top = (window.screen.height-height)/2; 
	  var left = (window.screen.width-width)/2; 
 	  var url = "/proj?command=projectManpowerDirectDeployForm&projNum="+projNum; 
	  var title = "프로젝트 인력 직접배치"; 
	  var status = "toolbar=no,directories=no,scrollbars=no,resizable=no,status=no,menubar=no,width="+width+",height="+height+",top="+top+",left="+left;

      window.open(url, title, status);


  
    /* window.open("memberUpdateForm.jsp",
            "childForm", "width=500, height=300, resizable = no, scrollbars = no"); */    
}

function msgPopUp(progNum,progName){
	var sendReceiver = progNum;
	var sendName = progName;
	
    var width = "800"; 
	var height = "555"; 
	var top = (window.screen.height-height)/2; 
	var left = (window.screen.width-width)/2; 
	var url = "/prog?command=messageRegisterForm&sendReceiver="+sendReceiver+"&sendName="+sendName; 
	var title = "메세지 보내기"; 
	var status = "toolbar=no,directories=no,scrollbars=no,resizable=no,status=no,menubar=no,width="+width+",height="+height+",top="+top+",left="+left;

    
    window.open(url, title, status);
    
}

function openProfilePopup(progNum)
{
	var progNum = progNum;
    // window.name = "부모창 이름"; 
      window.name = "parentForm";
    // window.open("open할 window", "자식창 이름", "팝업창 옵션");
      var width = "800"; 
	  var height = "700"; 
	  var top = (window.screen.height-height)/2; 
	  var left = (window.screen.width-width)/2; 
 	  var url = "/prog?command=profilePopup&progNum="+progNum; 
	  var title = "프로젝트 인력배치"; 
	  var status = "toolbar=no,directories=no,scrollbars=no,resizable=no,status=no,menubar=no,width="+width+",height="+height+",top="+top+",left="+left;

      window.open(url, title, status);


  
    /* window.open("memberUpdateForm.jsp",
            "childForm", "width=500, height=300, resizable = no, scrollbars = no"); */    
}

function openIntroducePopup(progNum)
{
	var progNum = progNum;
    // window.name = "부모창 이름"; 
      window.name = "parentForm";
    // window.open("open할 window", "자식창 이름", "팝업창 옵션");
      var width = "800"; 
	  var height = "700"; 
	  var top = (window.screen.height-height)/2; 
	  var left = (window.screen.width-width)/2; 
 	  var url = "/prog?command=introducePopup&progNum="+progNum; 
	  var title = "프로젝트 인력배치"; 
	  var status = "toolbar=no,directories=no,scrollbars=no,resizable=no,status=no,menubar=no,width="+width+",height="+height+",top="+top+",left="+left;

      window.open(url, title, status);


  
    /* window.open("memberUpdateForm.jsp",
            "childForm", "width=500, height=300, resizable = no, scrollbars = no"); */    
}

</script>
</html>