<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="include/programmerHeader.jsp"%>
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


<head>

</head>


<body
	class="kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">

	<!-- begin:: Page -->
	<!-- begin:: Content -->
	<div class="kt-content  kt-grid__item kt-grid__item--fluid"
		id="kt_content">
		<div class="row">
			<div class="col-lg-12">

				<!--begin::Portlet-->
				<div
					class="kt-portlet kt-portlet--last kt-portlet--head-lg kt-portlet--responsive-mobile"
					id="kt_page_portlet">
					<div class="kt-portlet__head kt-portlet__head--lg">
						<div class="kt-portlet__head-label">
							<h3 class="kt-portlet__head-title">
								Sticky Form Actions <small>try to scroll the page</small>
							</h3>
						</div>
						<div class="kt-portlet__head-toolbar">
							<a href="#" class="btn btn-clean kt-margin-r-10"> <i
								class="la la-arrow-left"></i> <span class="kt-hidden-mobile">Back</span>
							</a>
							<div class="btn-group">
								<button type="button" class="btn btn-brand">
									<i class="la la-check"></i> <span class="kt-hidden-mobile">Save</span>
								</button>
								<button type="button"
									class="btn btn-brand dropdown-toggle dropdown-toggle-split"
									data-toggle="dropdown" aria-haspopup="true"
									aria-expanded="false"></button>
								<div class="dropdown-menu dropdown-menu-right">
									<ul class="kt-nav">
										<li class="kt-nav__item"><a href="#" class="kt-nav__link">
												<i class="kt-nav__link-icon flaticon2-reload"></i> <span
												class="kt-nav__link-text">Save & continue</span>
										</a></li>
										<li class="kt-nav__item"><a href="#" class="kt-nav__link">
												<i class="kt-nav__link-icon flaticon2-power"></i> <span
												class="kt-nav__link-text">Save & exit</span>
										</a></li>
										<li class="kt-nav__item"><a href="#" class="kt-nav__link">
												<i
												class="kt-nav__link-icon flaticon2-edit-interface-symbol-of-pencil-tool"></i>
												<span class="kt-nav__link-text">Save & edit</span>
										</a></li>
										<li class="kt-nav__item"><a href="#" class="kt-nav__link">
												<i class="kt-nav__link-icon flaticon2-add-1"></i> <span
												class="kt-nav__link-text">Save & add new</span>
										</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="kt-portlet__body">
						<form class="kt-form" id="kt_form">
							<div class="row">
								<div class="col-xl-2"></div>
								<div class="col-xl-8">
									<div class="kt-section kt-section--first">
										<div class="kt-section__body">
											<h3 class="kt-section__title kt-section__title-lg">보유 자격증
												등록</h3>
											<div class="form-group row">
												<label class="col-3 col-form-label">자격증명</label>
												<div class="col-9">
													<input class="form-control" type="text" disabled>
												</div>
											</div>
											<div class="form-group row">
												<label class="col-3 col-form-label">발급 기관</label>
												<div class="col-9">
													<input class="form-control" type="text" disabled>
												</div>
											</div>
											<div class="form-group row">
													<label class="col-form-label col-lg-3 col-sm-12">발행일자</label>
													<div class="col-lg-9 col-md-9 col-sm-12">
														<div class="input-group date">
															<input type="text" class="form-control" readonly placeholder="Select date" id="kt_datepicker_2_modal" />
															<div class="input-group-append">
																<span class="input-group-text">
																	<i class="la la-calendar-check-o"></i>
																</span>
															</div>
														</div>
													</div>
												</div>
											<div class="form-group row">
												<label class="col-3 col-form-label">일련번호</label>
												<div class="col-9">
													<input class="form-control" type="text">
												</div>
											</div>
											<div class="kt-portlet__foot kt-portlet__foot--fit-x">
												<div class="kt-form__actions">
													<div class="row">
														<div class="col-lg-2"></div>
														<div class="col-lg-10">
															<button type="reset" class="btn btn-success">Submit</button>
															<button type="reset" class="btn btn-secondary">Cancel</button>
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

				<!--end::Portlet-->
			</div>
		</div>
	</div>

	<!-- end:: Content -->

	<!-- begin:: Footer -->
	

	<!-- begin::Quick Panel -->
	<div id="kt_quick_panel" class="kt-quick-panel">
		<a href="#" class="kt-quick-panel__close"
			id="kt_quick_panel_close_btn"><i class="flaticon2-delete"></i></a>
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
		<div class="kt-quick-panel__content">
			<div class="tab-content">
				<div class="tab-pane fade show kt-scroll active"
					id="kt_quick_panel_tab_notifications" role="tabpanel">
					<div class="kt-notification">
						<a href="#" class="kt-notification__item">
							<div class="kt-notification__item-icon">
								<i class="flaticon2-line-chart kt-font-success"></i>
							</div>
							<div class="kt-notification__item-details">
								<div class="kt-notification__item-title">New order has
									been received</div>
								<div class="kt-notification__item-time">2 hrs ago</div>
							</div>
						</a> <a href="#" class="kt-notification__item">
							<div class="kt-notification__item-icon">
								<i class="flaticon2-box-1 kt-font-brand"></i>
							</div>
							<div class="kt-notification__item-details">
								<div class="kt-notification__item-title">New customer is
									registered</div>
								<div class="kt-notification__item-time">3 hrs ago</div>
							</div>
						</a> <a href="#" class="kt-notification__item">
							<div class="kt-notification__item-icon">
								<i class="flaticon2-chart2 kt-font-danger"></i>
							</div>
							<div class="kt-notification__item-details">
								<div class="kt-notification__item-title">Application has
									been approved</div>
								<div class="kt-notification__item-time">3 hrs ago</div>
							</div>
						</a> <a href="#" class="kt-notification__item">
							<div class="kt-notification__item-icon">
								<i class="flaticon2-image-file kt-font-warning"></i>
							</div>
							<div class="kt-notification__item-details">
								<div class="kt-notification__item-title">New file has been
									uploaded</div>
								<div class="kt-notification__item-time">5 hrs ago</div>
							</div>
						</a> <a href="#" class="kt-notification__item">
							<div class="kt-notification__item-icon">
								<i class="flaticon2-bar-chart kt-font-info"></i>
							</div>
							<div class="kt-notification__item-details">
								<div class="kt-notification__item-title">New user feedback
									received</div>
								<div class="kt-notification__item-time">8 hrs ago</div>
							</div>
						</a> <a href="#" class="kt-notification__item">
							<div class="kt-notification__item-icon">
								<i class="flaticon2-pie-chart-2 kt-font-success"></i>
							</div>
							<div class="kt-notification__item-details">
								<div class="kt-notification__item-title">System reboot has
									been successfully completed</div>
								<div class="kt-notification__item-time">12 hrs ago</div>
							</div>
						</a> <a href="#" class="kt-notification__item">
							<div class="kt-notification__item-icon">
								<i class="flaticon2-favourite kt-font-danger"></i>
							</div>
							<div class="kt-notification__item-details">
								<div class="kt-notification__item-title">New order has
									been placed</div>
								<div class="kt-notification__item-time">15 hrs ago</div>
							</div>
						</a> <a href="#"
							class="kt-notification__item kt-notification__item--read">
							<div class="kt-notification__item-icon">
								<i class="flaticon2-safe kt-font-primary"></i>
							</div>
							<div class="kt-notification__item-details">
								<div class="kt-notification__item-title">Company meeting
									canceled</div>
								<div class="kt-notification__item-time">19 hrs ago</div>
							</div>
						</a> <a href="#" class="kt-notification__item">
							<div class="kt-notification__item-icon">
								<i class="flaticon2-psd kt-font-success"></i>
							</div>
							<div class="kt-notification__item-details">
								<div class="kt-notification__item-title">New report has
									been received</div>
								<div class="kt-notification__item-time">23 hrs ago</div>
							</div>
						</a> <a href="#" class="kt-notification__item">
							<div class="kt-notification__item-icon">
								<i class="flaticon-download-1 kt-font-danger"></i>
							</div>
							<div class="kt-notification__item-details">
								<div class="kt-notification__item-title">Finance report
									has been generated</div>
								<div class="kt-notification__item-time">25 hrs ago</div>
							</div>
						</a> <a href="#" class="kt-notification__item">
							<div class="kt-notification__item-icon">
								<i class="flaticon-security kt-font-warning"></i>
							</div>
							<div class="kt-notification__item-details">
								<div class="kt-notification__item-title">New customer
									comment recieved</div>
								<div class="kt-notification__item-time">2 days ago</div>
							</div>
						</a> <a href="#" class="kt-notification__item">
							<div class="kt-notification__item-icon">
								<i class="flaticon2-pie-chart kt-font-warning"></i>
							</div>
							<div class="kt-notification__item-details">
								<div class="kt-notification__item-title">New customer is
									registered</div>
								<div class="kt-notification__item-time">3 days ago</div>
							</div>
						</a>
					</div>
				</div>
				<div class="tab-pane fade kt-scroll" id="kt_quick_panel_tab_logs"
					role="tabpanel">
					<div class="kt-notification-v2">
						<a href="#" class="kt-notification-v2__item">
							<div class="kt-notification-v2__item-icon">
								<i class="flaticon-bell kt-font-brand"></i>
							</div>
							<div class="kt-notification-v2__itek-wrapper">
								<div class="kt-notification-v2__item-title">5 new user
									generated report</div>
								<div class="kt-notification-v2__item-desc">Reports based
									on sales</div>
							</div>
						</a> <a href="#" class="kt-notification-v2__item">
							<div class="kt-notification-v2__item-icon">
								<i class="flaticon2-box kt-font-danger"></i>
							</div>
							<div class="kt-notification-v2__itek-wrapper">
								<div class="kt-notification-v2__item-title">2 new items
									submited</div>
								<div class="kt-notification-v2__item-desc">by Grog John</div>
							</div>
						</a> <a href="#" class="kt-notification-v2__item">
							<div class="kt-notification-v2__item-icon">
								<i class="flaticon-psd kt-font-brand"></i>
							</div>
							<div class="kt-notification-v2__itek-wrapper">
								<div class="kt-notification-v2__item-title">79 PSD files
									generated</div>
								<div class="kt-notification-v2__item-desc">Reports based
									on sales</div>
							</div>
						</a> <a href="#" class="kt-notification-v2__item">
							<div class="kt-notification-v2__item-icon">
								<i class="flaticon2-supermarket kt-font-warning"></i>
							</div>
							<div class="kt-notification-v2__itek-wrapper">
								<div class="kt-notification-v2__item-title">$2900 worth
									producucts sold</div>
								<div class="kt-notification-v2__item-desc">Total 234 items
								</div>
							</div>
						</a> <a href="#" class="kt-notification-v2__item">
							<div class="kt-notification-v2__item-icon">
								<i class="flaticon-paper-plane-1 kt-font-success"></i>
							</div>
							<div class="kt-notification-v2__itek-wrapper">
								<div class="kt-notification-v2__item-title">4.5h-avarage
									response time</div>
								<div class="kt-notification-v2__item-desc">Fostest is
									Barry</div>
							</div>
						</a> <a href="#" class="kt-notification-v2__item">
							<div class="kt-notification-v2__item-icon">
								<i class="flaticon2-information kt-font-danger"></i>
							</div>
							<div class="kt-notification-v2__itek-wrapper">
								<div class="kt-notification-v2__item-title">Database
									server is down</div>
								<div class="kt-notification-v2__item-desc">10 mins ago</div>
							</div>
						</a> <a href="#" class="kt-notification-v2__item">
							<div class="kt-notification-v2__item-icon">
								<i class="flaticon2-mail-1 kt-font-brand"></i>
							</div>
							<div class="kt-notification-v2__itek-wrapper">
								<div class="kt-notification-v2__item-title">System report
									has been generated</div>
								<div class="kt-notification-v2__item-desc">Fostest is
									Barry</div>
							</div>
						</a> <a href="#" class="kt-notification-v2__item">
							<div class="kt-notification-v2__item-icon">
								<i class="flaticon2-hangouts-logo kt-font-warning"></i>
							</div>
							<div class="kt-notification-v2__itek-wrapper">
								<div class="kt-notification-v2__item-title">4.5h-avarage
									response time</div>
								<div class="kt-notification-v2__item-desc">Fostest is
									Barry</div>
							</div>
						</a>
					</div>
				</div>
				<div
					class="tab-pane kt-quick-panel__content-padding-x fade kt-scroll"
					id="kt_quick_panel_tab_settings" role="tabpanel">
					<form class="kt-form">
						<div class="kt-heading kt-heading--sm kt-heading--space-sm">Customer
							Care</div>
						<div class="form-group form-group-xs row">
							<label class="col-8 col-form-label">Enable Notifications:</label>
							<div class="col-4 kt-align-right">
								<span class="kt-switch kt-switch--success kt-switch--sm">
									<label> <input type="checkbox" checked="checked"
										name="quick_panel_notifications_1"> <span></span>
								</label>
								</span>
							</div>
						</div>
						<div class="form-group form-group-xs row">
							<label class="col-8 col-form-label">Enable Case Tracking:</label>
							<div class="col-4 kt-align-right">
								<span class="kt-switch kt-switch--success kt-switch--sm">
									<label> <input type="checkbox"
										name="quick_panel_notifications_2"> <span></span>
								</label>
								</span>
							</div>
						</div>
						<div class="form-group form-group-last form-group-xs row">
							<label class="col-8 col-form-label">Support Portal:</label>
							<div class="col-4 kt-align-right">
								<span class="kt-switch kt-switch--success kt-switch--sm">
									<label> <input type="checkbox" checked="checked"
										name="quick_panel_notifications_2"> <span></span>
								</label>
								</span>
							</div>
						</div>
						<div
							class="kt-separator kt-separator--space-md kt-separator--border-dashed"></div>
						<div class="kt-heading kt-heading--sm kt-heading--space-sm">Reports</div>
						<div class="form-group form-group-xs row">
							<label class="col-8 col-form-label">Generate Reports:</label>
							<div class="col-4 kt-align-right">
								<span class="kt-switch kt-switch--sm kt-switch--danger">
									<label> <input type="checkbox" checked="checked"
										name="quick_panel_notifications_3"> <span></span>
								</label>
								</span>
							</div>
						</div>
						<div class="form-group form-group-xs row">
							<label class="col-8 col-form-label">Enable Report Export:</label>
							<div class="col-4 kt-align-right">
								<span class="kt-switch kt-switch--sm kt-switch--danger">
									<label> <input type="checkbox"
										name="quick_panel_notifications_3"> <span></span>
								</label>
								</span>
							</div>
						</div>
						<div class="form-group form-group-last form-group-xs row">
							<label class="col-8 col-form-label">Allow Data
								Collection:</label>
							<div class="col-4 kt-align-right">
								<span class="kt-switch kt-switch--sm kt-switch--danger">
									<label> <input type="checkbox" checked="checked"
										name="quick_panel_notifications_4"> <span></span>
								</label>
								</span>
							</div>
						</div>
						<div
							class="kt-separator kt-separator--space-md kt-separator--border-dashed"></div>
						<div class="kt-heading kt-heading--sm kt-heading--space-sm">Memebers</div>
						<div class="form-group form-group-xs row">
							<label class="col-8 col-form-label">Enable Member singup:</label>
							<div class="col-4 kt-align-right">
								<span class="kt-switch kt-switch--sm kt-switch--brand"> <label>
										<input type="checkbox" checked="checked"
										name="quick_panel_notifications_5"> <span></span>
								</label>
								</span>
							</div>
						</div>
						<div class="form-group form-group-xs row">
							<label class="col-8 col-form-label">Allow User Feedbacks:</label>
							<div class="col-4 kt-align-right">
								<span class="kt-switch kt-switch--sm kt-switch--brand"> <label>
										<input type="checkbox" name="quick_panel_notifications_5">
										<span></span>
								</label>
								</span>
							</div>
						</div>
						<div class="form-group form-group-last form-group-xs row">
							<label class="col-8 col-form-label">Enable Customer
								Portal:</label>
							<div class="col-4 kt-align-right">
								<span class="kt-switch kt-switch--sm kt-switch--brand"> <label>
										<input type="checkbox" checked="checked"
										name="quick_panel_notifications_6"> <span></span>
								</label>
								</span>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

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
		<script src="../assets/app/custom/general/crud/forms/widgets/bootstrap-datepicker.js" type="text/javascript"></script>

		<!--end::Page Scripts -->

		<!--begin::Global App Bundle(used by all pages) -->
		<script src="../assets/app/bundle/app.bundle.js" type="text/javascript"></script>


	<!--end::Global App Bundle -->
</body>

<!-- end::Body -->
</html>