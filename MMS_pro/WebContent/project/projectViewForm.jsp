<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
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

	<!-- begin::Head -->
	<head>
		<meta charset="utf-8" />
		<title>PMMS | 프로젝트 상세보기</title>
		<meta name="description" content="Multi column form examples">
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
#label1 {
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
								<div class="col-lg-8">

									<!--begin::Portlet-->
									<div class="kt-portlet">
										<div class="kt-portlet__head">
											<div class="kt-portlet__head-label">
												<h3>
												프로젝트 상세조회
												</h3>
											</div>
											<div class="kt-portlet__head-toolbar">
												<div class="btn-group">
													<c:if test="${LoginUser.progNum eq projVo.progNum}">
													<button type="button" class="btn btn-success">
														<i class="la la-check"></i>
														인력배치
													</button>
													</c:if>
												</div>
											</div>
										</div>

										<!--begin::Form-->
										<form class="kt-form kt-form--label-right">
											<div class="kt-portlet__body">
												<div class="form-group row form-group-marginless kt-margin-t-20">
													<div class="col-lg-4">
														<label id="label1">프로젝트 명</label>
														<input type="hidden" id="projNum" value="${projVo.projNum}">
														<input type="text" class="form-control" value="${projVo.projName}" name="projName" id="projName" readonly="readonly">
													</div>
													<div class="col-lg-4">
														<label id="label1">담당자 명</label>
														<input type="text" class="form-control" readonly="readonly" value="${projVo.progName}">
													</div>
													<div class="col-lg-4">
														<label id="label1">프로젝트 상태</label>
														<input type="text" class="form-control" readonly="readonly" value="${projVo.projStat}">
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
														<input type="text" class="form-control" readonly="readonly" value="${projVo.partiFormCode}">
													</div>
													<div class="col-lg-4">
														<label id="label1">분류</label>
														<input type="text" class="form-control" readonly="readonly" value="${projVo.projCate}">
													</div>
													<div class="col-lg-4">
														<label id="label1">세분류</label>
														<input type="text" class="form-control" readonly="readonly" value="${projVo.projDetailCate}">
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
														<input type="text" class="form-control" readonly="readonly" value="${projVo.osCode}">
													</div>
													<div class="col-lg-6">
														<label id="label1">프레임워크 종류</label>
														<input type="text" class="form-control" readonly="readonly" value="${projVo.fwCode}">
													</div>
												</div>
												<div class="form-group row form-group-marginless kt-margin-t-20">
													<div class="col-lg-6">
														<label id="label1">DBMS 종류</label>
														<input type="text" class="form-control" readonly="readonly" value="${projVo.dbmsCode}">
													</div>
													<div class="col-lg-6">
														<label id="label1">프로젝트 난이도</label>
														<input type="text" class="form-control" readonly="readonly" value="${projVo.levelCode}">
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
														<label id="label1">모집 인원</label>
														<input type="text" class="form-control" readonly="readonly" value="${projVo.recruitNumber}">
													</div>
													<div class="col-lg-6">
														<label id="label1">신청 마감일</label>
														<div class="kt-input-icon">
															<input type="text" class="form-control" value="${projVo.deadline}" name="deadline" id="deadline" readonly="readonly">
															<span class="kt-input-icon__icon kt-input-icon__icon--right"><span><i class="flaticon-calendar-2"></i></span></span>
														</div>
													</div>
												</div>
												<div class="form-group row form-group-marginless kt-margin-t-20">
													<div class="col-lg-6">
														<label id="label1">시작 예정일</label>
														<div class="kt-input-icon">
															<input type="text" class="form-control" value="${projVo.startDuedate}" name="startDuedate" id="startDuedate" readonly="readonly">
															<span class="kt-input-icon__icon kt-input-icon__icon--right"><span><i class="flaticon-calendar-2"></i></span></span>
														</div>
													</div>
													<div class="col-lg-6">
														<label id="label1">종료 예정일</label>
														<div class="kt-input-icon">
															<input type="text" class="form-control" value="${projVo.endDuedate}" name="endDuedate" id="endDuedate" readonly="readonly">
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
												<div class="form-group row form-group-marginless kt-margin-t-20">
													<div class="col-lg-12">
														<label id="label1">프로젝트 내용</label>
														<textarea class="form-control" name="contents" id="contents" rows="3" style="margin-top: 0px; margin-bottom: 0px; height: 129px;" readonly="readonly">${projVo.contents}</textarea>
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
																<label id="label1">첨부파일</label>
																<div></div>
																<div class="custom-file">
																	<label class="custom-file-label" for="customFile" style="text-align: left;">
																	<a href="/proj?command=download&projFile=${projVo.projFile}">${projVo.projFile}</a></label>
																</div>
														</div>
												</div>
											</div>
											<div class="kt-portlet__foot">
												<div class="kt-form__actions">
													<div class="row">
														<div class="col-lg-6">
														</div>
														<div class="col-lg-6 kt-align-right">
															<c:if test="${LoginUser.progNum eq projVo.progNum}">
															<button type="button" class="btn btn-primary" onclick="location.href='/proj?command=projectUpdateForm&projNum=${projVo.projNum}'">수정</button>
															<button type="button" class="btn btn-danger" id="delete">삭제</button>
															</c:if>
															<button type="button" class="btn btn-secondary" id="cancel">목록</button>
														</div>
													</div>
												</div>
											</div>
										</form>

										<!--end::Form-->
									</div>

									<!--end::Portlet-->
								</div>
								
							<div class="col-lg-4">
								<div class="kt-portlet">
										<div class="kt-portlet__head">
											<div class="kt-portlet__head-label">
												<h4>
													사용 프로그래밍 언어
												</h4>
											</div>
											<!-- <div class="kt-portlet__head-toolbar">
												<a href="#" class="btn btn-label-brand btn-bold btn-sm dropdown-toggle" data-toggle="dropdown">
													All
												</a>
												<div class="dropdown-menu dropdown-menu-fit dropdown-menu-right">
													<ul class="kt-nav">
														<li class="kt-nav__section kt-nav__section--first">
															<span class="kt-nav__section-text">Finance</span>
														</li>
														<li class="kt-nav__item">
															<a href="#" class="kt-nav__link">
																<i class="kt-nav__link-icon flaticon2-graph-1"></i>
																<span class="kt-nav__link-text">Statistics</span>
															</a>
														</li>
														<li class="kt-nav__item">
															<a href="#" class="kt-nav__link">
																<i class="kt-nav__link-icon flaticon2-calendar-4"></i>
																<span class="kt-nav__link-text">Events</span>
															</a>
														</li>
														<li class="kt-nav__item">
															<a href="#" class="kt-nav__link">
																<i class="kt-nav__link-icon flaticon2-layers-1"></i>
																<span class="kt-nav__link-text">Reports</span>
															</a>
														</li>
														<li class="kt-nav__section kt-nav__section--first">
															<span class="kt-nav__section-text">HR</span>
														</li>
														<li class="kt-nav__item">
															<a href="#" class="kt-nav__link">
																<i class="kt-nav__link-icon flaticon2-calendar-4"></i>
																<span class="kt-nav__link-text">Notifications</span>
															</a>
														</li>
														<li class="kt-nav__item">
															<a href="#" class="kt-nav__link">
																<i class="kt-nav__link-icon flaticon2-file-1"></i>
																<span class="kt-nav__link-text">Files</span>
															</a>
														</li>
													</ul>
												</div>
											</div> -->
										</div>
										<div class="kt-portlet__body">
											<div class="kt-widget4">
												<c:forEach items="${uList}" var="uVo" varStatus="listStat">
												<div class="kt-widget4__item">
													<div class="kt-widget4__pic kt-widget4__pic--logo">
														<img src="../assets/media/client-logos/logo5.png" alt="">
													</div>
													<div class="kt-widget4__info">
														<a href="#" class="kt-widget4__title">
															${uVo.plName}
														</a>
														<!-- <p class="kt-widget4__text">
															Make Metronic Great Again
														</p> -->
													</div>
													<!-- <span class="kt-widget4__number kt-font-brand">+$2500</span> -->
												</div>
												</c:forEach>
												<!-- <div class="kt-widget4__item">
													<div class="kt-widget4__pic kt-widget4__pic--logo">
														<img src="../assets/media/client-logos/logo4.png" alt="">
													</div>
													<div class="kt-widget4__info">
														<a href="#" class="kt-widget4__title">
															StarBucks
														</a>
														<p class="kt-widget4__text">
															Good Coffee &amp; Snacks
														</p>
													</div>
													<span class="kt-widget4__number kt-font-brand">-$290</span>
												</div> -->
												<!-- <div class="kt-widget4__item">
													<div class="kt-widget4__pic kt-widget4__pic--logo">
														<img src="../assets/media/client-logos/logo3.png" alt="">
													</div>
													<div class="kt-widget4__info">
														<a href="#" class="kt-widget4__title">
															Phyton
														</a>
														<p class="kt-widget4__text">
															A Programming Language
														</p>
													</div>
													<span class="kt-widget4__number kt-font-brand">+$17</span>
												</div> -->
												<!-- <div class="kt-widget4__item">
													<div class="kt-widget4__pic kt-widget4__pic--logo">
														<img src="../assets/media/client-logos/logo2.png" alt="">
													</div>
													<div class="kt-widget4__info">
														<a href="#" class="kt-widget4__title">
															GreenMakers
														</a>
														<p class="kt-widget4__text">
															Make Green Great Again
														</p>
													</div>
													<span class="kt-widget4__number kt-font-brand">-$2.50</span>
												</div> -->
												<!-- <div class="kt-widget4__item">
													<div class="kt-widget4__pic kt-widget4__pic--logo">
														<img src="../assets/media/client-logos/logo1.png" alt="">
													</div>
													<div class="kt-widget4__info">
														<a href="#" class="kt-widget4__title">
															FlyThemes
														</a>
														<p class="kt-widget4__text">
															A Let's Fly Fast Again Language
														</p>
													</div>
													<span class="kt-widget4__number kt-font-brand">+$200</span>
												</div> -->
											</div>
										</div>
									</div>
							
                           <!--begin:: Widgets/New Users-->
                           <c:if test="${projVo.projStat eq '진행'}">
                           <div class="kt-portlet">
                              <div class="kt-portlet__head">
                                 <div class="kt-portlet__head-label">
                                    <h4>
                                       	프로젝트 구성원
                                    </h4>
                                 </div>
                                 <!-- <div class="kt-portlet__head-toolbar">
                                    <ul class="nav nav-tabs nav-tabs-line nav-tabs-bold nav-tabs-line-brand" role="tablist">
                                       <li class="nav-item">
                                          <a class="nav-link active" data-toggle="tab" href="#kt_widget4_tab1_content" role="tab">
                                             Today
                                          </a>
                                       </li>
                                       <li class="nav-item">
                                          <a class="nav-link" data-toggle="tab" href="#kt_widget4_tab2_content" role="tab">
                                             Month
                                          </a>
                                       </li>
                                    </ul>
                                 </div> -->
                              </div>
                              <div class="kt-portlet__body">
                                 <div class="tab-content">
                                    <div class="tab-pane active" id="kt_widget4_tab1_content">
                                       <div class="kt-widget4">
                                       	<c:forEach items="${mList}" var="mVo" varStatus="listStat">
                                          <div class="kt-widget4__item">
                                             <div class="kt-widget4__pic kt-widget4__pic--pic">
                                                <img src="../assets/media/users/100_4.jpg" alt="">
                                             </div>
                                             <div class="kt-widget4__info">
                                                <a href="#" class="kt-widget4__username">
                                                   ${mVo.progName}
                                                </a>
                                                <p class="kt-widget4__text">
                                                   ${mVo.applyPosition}
                                                </p>
                                             </div>
                                             <a href="#" class="btn btn-sm btn-label-brand btn-bold">Message</a>
                                          </div>
                                         </c:forEach>
                                       </div>
                                    </div>
                                    <!-- <div class="tab-pane" id="kt_widget4_tab2_content">
                                       <div class="kt-widget4">
                                          <div class="kt-widget4__item">
                                             <div class="kt-widget4__pic kt-widget4__pic--pic">
                                                <img src="../assets/media/users/100_2.jpg" alt="">
                                             </div>
                                             <div class="kt-widget4__info">
                                                <a href="#" class="kt-widget4__username">
                                                   Kristika Bold
                                                </a>
                                                <p class="kt-widget4__text">
                                                   Product Designer,Apple Inc
                                                </p>
                                             </div>
                                             <a href="#" class="btn btn-sm btn-label-success">Follow</a>
                                          </div>
                                          <div class="kt-widget4__item">
                                             <div class="kt-widget4__pic kt-widget4__pic--pic">
                                                <img src="../assets/media/users/100_13.jpg" alt="">
                                             </div>
                                             <div class="kt-widget4__info">
                                                <a href="#" class="kt-widget4__username">
                                                   Ron Silk
                                                </a>
                                                <p class="kt-widget4__text">
                                                   Release Manager, Loop Inc
                                                </p>
                                             </div>
                                             <a href="#" class="btn btn-sm btn-label-brand">Follow</a>
                                          </div>
                                          <div class="kt-widget4__item">
                                             <div class="kt-widget4__pic kt-widget4__pic--pic">
                                                <img src="../assets/media/users/100_9.jpg" alt="">
                                             </div>
                                             <div class="kt-widget4__info">
                                                <a href="#" class="kt-widget4__username">
                                                   Nick Bold
                                                </a>
                                                <p class="kt-widget4__text">
                                                   Web Developer, Facebook Inc
                                                </p>
                                             </div>
                                             <a href="#" class="btn btn-sm btn-label-danger">Follow</a>
                                          </div>
                                          <div class="kt-widget4__item">
                                             <div class="kt-widget4__pic kt-widget4__pic--pic">
                                                <img src="../assets/media/users/100_2.jpg" alt="">
                                             </div>
                                             <div class="kt-widget4__info">
                                                <a href="#" class="kt-widget4__username">
                                                   Wiltor Delton
                                                </a>
                                                <p class="kt-widget4__text">
                                                   Project Manager, Amazon Inc
                                                </p>
                                             </div>
                                             <a href="#" class="btn btn-sm btn-label-success">Follow</a>
                                          </div>
                                          <div class="kt-widget4__item">
                                             <div class="kt-widget4__pic kt-widget4__pic--pic">
                                                <img src="../assets/media/users/100_8.jpg" alt="">
                                             </div>
                                             <div class="kt-widget4__info">
                                                <a href="#" class="kt-widget4__username">
                                                   Nick Bold
                                                </a>
                                                <p class="kt-widget4__text">
                                                   Web Developer, Facebook Inc
                                                </p>
                                             </div>
                                             <a href="#" class="btn btn-sm btn-label-info">Follow</a>
                                          </div>
                                       </div>
                                    </div> -->
                                 </div>
                              </div>

                           <!--end:: Widgets/New Users-->
                        			</div>
                        </c:if>
                        		</div>
							</div>
						</div>

						<!-- end:: Content -->
					</div>

				</div>
			<!-- begin:: Footer -->
					
					<%@ include file="../include/footer.jsp" %>

			<!-- end:: Footer -->
		<!-- end:: Page -->

		<!-- begin::Scrolltop -->
		<div id="kt_scrolltop" class="kt-scrolltop">
			<i class="fa fa-arrow-up"></i>
		</div>
		<!-- end::Scrolltop -->


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
		<script src="../assets/app/custom/general/crud/forms/widgets/select2.js" type="text/javascript"></script>
	</body>

	<!-- end::Body -->
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
        /* $("#startDuedate").datepicker();
        $("#endDuedate").datepicker();
        $("#deadline").datepicker(); */
    });

    
$(document).ready(
		function() {
			$('#cancel').on("click",function(event) {
						self.location = "proj?command=projectRegisterListForm";
					});
			$('#delete').on("click", function(evt) {
				
				var confirmStat = confirm("삭제하시겠습니까?");
				
				if(confirmStat == true){
					var projNum = $('#projNum').val();
					alert("삭제되었습니다.");
					self.location = "proj?command=projectDelete&projNum="+projNum;	
				} else{
					return false;
				}
				
			});
		});
</script>
</html>
