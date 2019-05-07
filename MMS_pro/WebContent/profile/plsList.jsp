<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/programmerHeader.jsp"%>
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
</head>

<!-- end::Head -->

<!-- crud_metronic-datatable_advanced_column-rendering.html -->

<!-- begin::Body -->
<body
	class="kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">
	<!-- begin:: Content -->
	<div class="kt-content  kt-grid__item kt-grid__item--fluid"
		id="kt_content">
		<div class="row">
			<div class="col-xl-6">
				<!-- begin:: Content -->
				<div class="kt-content  kt-grid__item kt-grid__item--fluid"
					id="kt_content">
					<!-- <div class="alert alert-light alert-elevate" role="alert">
						<div class="alert-icon">
							<i class="flaticon-warning kt-font-brand"></i>
						</div>
						<div class="alert-text">The Metronic Datatable allows
							flexible customization of its rows cells by exposing datatable
							and column schema object onto a callback function. In this
							example we shown how you can customize specific cell appearance
							using the datatable cell renderer callback function.</div>
					</div> -->
					<div class="kt-portlet kt-portlet--mobile">
						<!-- <div class="kt-portlet__head kt-portlet__head--lg">
							<div class="kt-portlet__head-label">
								<span class="kt-portlet__head-icon"> <i
									class="kt-font-brand flaticon2-line-chart"></i>
								</span>
								<h3 class="kt-portlet__head-title">포트폴리오</h3>
							</div>
							<div class="kt-portlet__head-toolbar">
								<div class="kt-portlet__head-wrapper">
									<a href="#" class="btn btn-clean btn-icon-sm"> <i
										class="la la-long-arrow-left"></i> Back
									</a> &nbsp;
									<div class="dropdown dropdown-inline">
										<button type="button" class="btn btn-brand btn-icon-sm"
											data-toggle="dropdown" aria-haspopup="true"
											aria-expanded="false">
											<i class="flaticon2-plus"></i> Add New
										</button>
										<div class="dropdown-menu dropdown-menu-right">
											<ul class="kt-nav">
												<li class="kt-nav__section kt-nav__section--first"><span
													class="kt-nav__section-text">Choose an action:</span></li>
												<li class="kt-nav__item"><a href="#"
													class="kt-nav__link"> <i
														class="kt-nav__link-icon flaticon2-open-text-book"></i> <span
														class="kt-nav__link-text">Reservations</span>
												</a></li>
												<li class="kt-nav__item"><a href="#"
													class="kt-nav__link"> <i
														class="kt-nav__link-icon flaticon2-calendar-4"></i> <span
														class="kt-nav__link-text">Appointments</span>
												</a></li>
												<li class="kt-nav__item"><a href="#"
													class="kt-nav__link"> <i
														class="kt-nav__link-icon flaticon2-bell-alarm-symbol"></i>
														<span class="kt-nav__link-text">Reminders</span>
												</a></li>
												<li class="kt-nav__item"><a href="#"
													class="kt-nav__link"> <i
														class="kt-nav__link-icon flaticon2-contract"></i> <span
														class="kt-nav__link-text">Announcements</span>
												</a></li>
												<li class="kt-nav__item"><a href="#"
													class="kt-nav__link"> <i
														class="kt-nav__link-icon flaticon2-shopping-cart-1"></i> <span
														class="kt-nav__link-text">Orders</span>
												</a></li>
												<li class="kt-nav__separator kt-nav__separator--fit"></li>
												<li class="kt-nav__item"><a href="#"
													class="kt-nav__link"> <i
														class="kt-nav__link-icon flaticon2-rocket-1"></i> <span
														class="kt-nav__link-text">Projects</span>
												</a></li>
												<li class="kt-nav__item"><a href="#"
													class="kt-nav__link"> <i
														class="kt-nav__link-icon flaticon2-chat-1"></i> <span
														class="kt-nav__link-text">User Feedbacks</span>
												</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div> -->
						<div class="kt-portlet__body">

							<!--begin: Search Form -->
							<!-- <div
								class="kt-form kt-form--label-right kt-margin-t-20 kt-margin-b-10">
								<div class="row align-items-center">
									<div class="col-xl-8 order-2 order-xl-1">
										<div class="row align-items-center">
											<div class="col-md-4 kt-margin-b-20-tablet-and-mobile">
												<div class="kt-input-icon kt-input-icon--left">
													<input type="text" class="form-control"
														placeholder="Search..." id="generalSearch"> <span
														class="kt-input-icon__icon kt-input-icon__icon--left">
														<span><i class="la la-search"></i></span>
													</span>
												</div>
											</div>
											<div class="col-md-4 kt-margin-b-20-tablet-and-mobile">
														<div class="kt-form__group kt-form__group--inline">
															<div class="kt-form__label">
																<label>Status:</label>
															</div>
															<div class="kt-form__control">
																<select class="form-control bootstrap-select" id="kt_form_status">
																	<option value="">All</option>
																	<option value="1">Pending</option>
																	<option value="2">Delivered</option>
																	<option value="3">Canceled</option>
																	<option value="4">Success</option>
																	<option value="5">Info</option>
																	<option value="6">Danger</option>
																</select>
															</div>
														</div>
													</div>
											<div class="col-md-4 kt-margin-b-20-tablet-and-mobile">
														<div class="kt-form__group kt-form__group--inline">
															<div class="kt-form__label">
																<label>Type:</label>
															</div>
															<div class="kt-form__control">
																<select class="form-control bootstrap-select" id="kt_form_type">
																	<option value="">All</option>
																	<option value="1">Online</option>
																	<option value="2">Retail</option>
																	<option value="3">Direct</option>
																</select>
															</div>
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
							</div> -->

							<!-- end: Search Form -->
						</div>
						<div class="kt-portlet__body kt-portlet__body--fit">

							<!--begin: Datatable -->
							<div class="kt-content  kt-grid__item kt-grid__item--fluid"
								id="kt_content">
								<!-- <div class="alert alert-light alert-elevate" role="alert">
									<div class="alert-icon">
										<i class="flaticon-warning kt-font-brand"></i>
									</div>
									<div class="alert-text">The Metronic Datatable allows
										flexible customization of its rows cells by exposing datatable
										and column schema object onto a callback function. In this
										example we shown how you can customize specific cell
										appearance using the datatable cell renderer callback
										function.</div>
								</div> -->
								<div class="kt-portlet kt-portlet--mobile">
									<div class="kt-portlet__head kt-portlet__head--lg">
										<div class="kt-portlet__head-label">
											<span class="kt-portlet__head-icon"> <i
												class="kt-font-brand flaticon2-line-chart"></i>
											</span>
											<h3 class="kt-portlet__head-title">프로그래밍 언어 숙련도</h3>
										</div>
										<div class="kt-portlet__head-toolbar">
											<div class="kt-portlet__head-wrapper">
												<a href="#" class="btn btn-clean btn-icon-sm"> <i
													class="la la-long-arrow-left"></i> Back
												</a> &nbsp;
												<div class="dropdown dropdown-inline">
													<button type="button" class="btn btn-brand btn-icon-sm"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false">
														<i class="flaticon2-plus"></i> Add New
													</button>
												</div>
											</div>
										</div>
									</div>
									<div class="kt-portlet__body">

										<!--begin: Search Form -->
										<!-- <div
											class="kt-form kt-form--label-right kt-margin-t-20 kt-margin-b-10">
											<div class="row align-items-center">
												<div class="col-xl-8 order-2 order-xl-1">
													<div class="row align-items-center">
														<div class="col-md-4 kt-margin-b-20-tablet-and-mobile">
															<div class="kt-input-icon kt-input-icon--left">
																<input type="text" class="form-control"
																	placeholder="Search..." id="generalSearch"> <span
																	class="kt-input-icon__icon kt-input-icon__icon--left">
																	<span><i class="la la-search"></i></span>
																</span>
															</div>
														</div>
														<div class="col-md-4 kt-margin-b-20-tablet-and-mobile">
															<div class="kt-form__group kt-form__group--inline">
																<div class="kt-form__label">
																	<label>Status:</label>
																</div>
																<div class="kt-form__control">
																	<div class="dropdown bootstrap-select form-control">
																		<select class="form-control bootstrap-select"
																			id="kt_form_status" tabindex="-98">
																			<option value="">All</option>
																			<option value="1">Pending</option>
																			<option value="2">Delivered</option>
																			<option value="3">Canceled</option>
																			<option value="4">Success</option>
																			<option value="5">Info</option>
																			<option value="6">Danger</option>
																		</select>
																		<button type="button"
																			class="btn dropdown-toggle bs-placeholder btn-light"
																			data-toggle="dropdown" role="button"
																			data-id="kt_form_status" title="All">
																			<div class="filter-option">
																				<div class="filter-option-inner">
																					<div class="filter-option-inner-inner">All</div>
																				</div>
																			</div>
																		</button>
																		<div class="dropdown-menu " role="combobox">
																			<div class="inner show" role="listbox"
																				aria-expanded="false" tabindex="-1">
																				<ul class="dropdown-menu inner show"></ul>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
														<div class="col-md-4 kt-margin-b-20-tablet-and-mobile">
															<div class="kt-form__group kt-form__group--inline">
																<div class="kt-form__label">
																	<label>Type:</label>
																</div>
																<div class="kt-form__control">
																	<div class="dropdown bootstrap-select form-control">
																		<select class="form-control bootstrap-select"
																			id="kt_form_type" tabindex="-98">
																			<option value="">All</option>
																			<option value="1">Online</option>
																			<option value="2">Retail</option>
																			<option value="3">Direct</option>
																		</select>
																		<button type="button"
																			class="btn dropdown-toggle bs-placeholder btn-light"
																			data-toggle="dropdown" role="button"
																			data-id="kt_form_type" title="All">
																			<div class="filter-option">
																				<div class="filter-option-inner">
																					<div class="filter-option-inner-inner">All</div>
																				</div>
																			</div>
																		</button>
																		<div class="dropdown-menu " role="combobox">
																			<div class="inner show" role="listbox"
																				aria-expanded="false" tabindex="-1">
																				<ul class="dropdown-menu inner show"></ul>
																			</div>
																		</div>
																	</div>
																</div>
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
										</div> -->

										<!--end: Search Form -->
									</div>
									<div class="kt-portlet__body kt-portlet__body--fit">

										<!--begin: Datatable -->
										<div
											class="kt-datatable kt-datatable--default kt-datatable--brand kt-datatable--loaded"
											id="column_rendering" style="">
											<table class="kt-datatable__table"
												style="display: block; min-height: 300px;">
												<thead class="kt-datatable__head">
													<tr class="kt-datatable__row" style="left: 0px;">
														<th data-field="PortNum"
															class="kt-datatable__cell--center kt-datatable__cell kt-datatable__cell--sort kt-datatable__cell--sorted"
															data-sort="asc"><span style="width: 30px;">#<i
																class="flaticon2-arrow-up"></i></span></th>
														<th data-field="Subject"
															class="kt-datatable__cell kt-datatable__cell--sort"><span
															style="width: 134px;">제목</span></th>
														<th data-field="Actions" data-autohide-disabled="false"
															class="kt-datatable__cell kt-datatable__cell--sort">
															<span style="width: 110px;">Actions</span>
														</th>
													</tr>
												</thead>
												<c:forEach items="${plsList}" var="PlsVo">
												<tbody class="kt-datatable__body" style="">
													<tr data-row="0" class="kt-datatable__row"
														style="left: 0px;">
														<td
															class="kt-datatable__cell--sorted kt-datatable__cell--center kt-datatable__cell"
															data-field="plsNum">${PlsVo.plsNum}
														</td>
														<td data-field="plNum" class="kt-datatable__cell">
															${PlsVo.plNum}
														</td>
														<td data-field="profiency" class="kt-datatable__cell">
															${PlsVo.profiency}
														</td>
														<td data-field="experience" class="kt-datatable__cell">
															${PlsVo.experience}
														</td>
														<td data-field="Actions" data-autohide-disabled="false"
															class="kt-datatable__cell"><span
															style="overflow: visible; position: relative; width: 110px;">
															<a title="Edit details"
																class="btn btn-sm btn-clean btn-icon btn-icon-md" href="../profile/portpolioModify.jsp"> <i
																	class="la la-edit"></i>
															</a> 
															<a title="Delete"
																class="btn btn-sm btn-clean btn-icon btn-icon-md"> <i
																	class="la la-trash"></i>
															</a>
														</span></td>
													</tr>
												</tbody>
												</c:forEach>
											</table>
											<div class="kt-datatable__pager kt-datatable--paging-loaded">
												<ul class="kt-datatable__pager-nav">
													<li><a title="First"
														class="kt-datatable__pager-link kt-datatable__pager-link--first kt-datatable__pager-link--disabled"
														data-page="1" disabled="disabled"><i
															class="flaticon2-fast-back"></i></a></li>
													<li><a title="Previous"
														class="kt-datatable__pager-link kt-datatable__pager-link--prev kt-datatable__pager-link--disabled"
														data-page="1" disabled="disabled"><i
															class="flaticon2-back"></i></a></li>
													<li style=""></li>
													<li style="display: none;"><input type="text"
														class="kt-pager-input form-control" title="Page number"></li>
													<li><a
														class="kt-datatable__pager-link kt-datatable__pager-link-number kt-datatable__pager-link--active"
														data-page="1" title="1">1</a></li>
													<li><a
														class="kt-datatable__pager-link kt-datatable__pager-link-number"
														data-page="2" title="2">2</a></li>
													<li><a
														class="kt-datatable__pager-link kt-datatable__pager-link-number"
														data-page="3" title="3">3</a></li>
													<li><a
														class="kt-datatable__pager-link kt-datatable__pager-link-number"
														data-page="4" title="4">4</a></li>
													<li><a
														class="kt-datatable__pager-link kt-datatable__pager-link-number"
														data-page="5" title="5">5</a></li>
													<li></li>
													<li><a title="Next"
														class="kt-datatable__pager-link kt-datatable__pager-link--next"
														data-page="2"><i class="flaticon2-next"></i></a></li>
													<li><a title="Last"
														class="kt-datatable__pager-link kt-datatable__pager-link--last"
														data-page="35"><i class="flaticon2-fast-next"></i></a></li>
												</ul>
												<!-- <div class="kt-datatable__pager-info">
													<div
														class="dropdown bootstrap-select kt-datatable__pager-size"
														style="width: 60px;">
														<select class="selectpicker kt-datatable__pager-size"
															title="Select page size" data-width="60px"
															data-selected="10" tabindex="-98"><option
																class="bs-title-option" value=""></option>
															<option value="10">10</option>
															<option value="20">20</option>
															<option value="30">30</option>
															<option value="50">50</option>
															<option value="100">100</option></select>
														<button type="button"
															class="btn dropdown-toggle btn-light"
															data-toggle="dropdown" role="button"
															title="Select page size">
															<div class="filter-option">
																<div class="filter-option-inner">
																	<div class="filter-option-inner-inner">10</div>
																</div>
															</div>
														</button>
														<div class="dropdown-menu " role="combobox">
															<div class="inner show" role="listbox"
																aria-expanded="false" tabindex="-1">
																<ul class="dropdown-menu inner show"></ul>
															</div>
														</div>
													</div>
												</div> -->
											</div>
										</div>

										<!--end: Datatable -->
									</div>
								</div>
							</div>

							<!--end: Datatable -->
						</div>
					</div>
				</div>

				<!-- end:: Content -->
			</div>

			<!-- begin:: Footer -->
			<%@ include file="../include/footer.jsp"%>
			<!-- end:: Footer -->
		</div>
	</div>
	</div>

	<!-- end:: Page -->

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

	<!--begin::Global App Bundle(used by all pages) -->
	<script src="../assets/app/bundle/app.bundle.js" type="text/javascript"></script>

	<!--end::Global App Bundle -->
</body>

<!-- end::Body -->
</html>