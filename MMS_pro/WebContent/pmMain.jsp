<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="include/header.jsp"%>
<%-- <%@ page session="false"%> --%>
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
<title>Metronic | Dashboard</title>
</head>


<!-- end::Head -->
<!-- begin::Body -->
<body
	class="kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">
	<!-- begin:: Content -->
	<div class="kt-content  kt-grid__item kt-grid__item--fluid"
		id="kt_content">


		<!--내 프로젝트 내역-->
		<div class="row">
			<div class="col-xl-8">
				<div class="kt-portlet kt-portlet--tabs kt-portlet--height-fluid">
					<div class="kt-portlet__head">
						<div class="kt-portlet__head-label">
							<h3 class="kt-portlet__head-title">내 프로젝트 내역</h3>
						</div>



						<div class="kt-portlet__head-toolbar">
							<ul
								class="nav nav-tabs nav-tabs-bold nav-tabs-line   nav-tabs-line-right nav-tabs-line-brand"
								role="tablist">
								<li class="nav-item"><a class="nav-link active"
									data-toggle="tab" href="#kt_portlet_tab_1_1" role="tab"> 전체
										리스트 </a></li>
								<li class="nav-item"><a class="nav-link" data-toggle="tab"
									href="#kt_portlet_tab_1_2" role="tab"> 진행 프로젝트 </a></li>
								<li class="nav-item"><a class="nav-link" data-toggle="tab"
									href="#kt_portlet_tab_1_3" role="tab"> 종료 프로젝트 </a></li>
							</ul>
						</div>
					</div>
					<div class="kt-portlet__body">
						<div class="tab-content">
							<div class="tab-pane active" id="kt_portlet_tab_1_1">
								<table class="table table-bordered table-hover">
									<thead style="text-align: center;">
										<tr>
											<th>#</th>
											<th style="font-weight: bold;">프로젝트 명</th>
											<th style="font-weight: bold;">담당자</th>
											<th style="font-weight: bold;">지원직무</th>
											<th style="font-weight: bold;">상태</th>
										</tr>
									</thead>
									<tbody style="text-align: center;">
										<c:forEach items="${aList}" var="pVo" varStatus="listStat">
											<tr>
												<th scope="row">${listStat.count}</th>
												<c:if test="${listStat.count < 6}">
													<td><a
														href="/proj?command=myProjectViewForm&projNum=${pVo.projNum}">${pVo.projName}</a></td>
													<td>${pVo.progName}</td>
													<td>${pVo.applyPosition}</td>
													<c:if test="${pVo.projStat eq '모집' }">
														<td><span
															class="kt-badge kt-badge--success kt-badge--inline">모집</span></td>
													</c:if>
													<c:if test="${pVo.projStat eq '진행' }">
														<td><span
															class="kt-badge kt-badge--warning kt-badge--inline">진행</span></td>
													</c:if>
													<c:if test="${pVo.projStat eq '종료' }">
														<td><span
															class="kt-badge kt-badge--danger kt-badge--inline">종료</span></td>
													</c:if>
												</c:if>
											</tr>
										</c:forEach>
										<c:if test="${empty aList }">
											<tr>
												<td colspan="7">내역이 없습니다</td>
											</tr>
										</c:if>
									</tbody>

								</table>

								<div class="col kt-align-center">
									<button type="button" class="btn btn-clean btn-bold btn-upper"
										onclick="location.href='/proj?command=projectListForm'">
										내 프로젝트 목록으로 가기</button>

								</div>
								<div class="tab-pane" id="kt_portlet_tab_1_2">
									<table class="table table-bordered table-hover">
										<thead style="text-align: center;">
											<tr>
												<th>#</th>
												<th style="font-weight: bold;">프로젝트 명</th>
												<th style="font-weight: bold;">담당자</th>
												<th style="font-weight: bold;">지원직무</th>
												<th style="font-weight: bold;">상태</th>
											</tr>
										</thead>
										<tbody style="text-align: center;">
											<c:forEach items="${pPList}" var="pVo" varStatus="listStat">
												<tr>
													<c:if test="${listStat.count < 6}">
														<th scope="row">${listStat.count}</th>

														<td><a
															href="/proj?command=myProjectViewForm&projNum=${pVo.projNum}">${pVo.projName}</a></td>
														<td>${pVo.progName}</td>
														<td>${pVo.applyPosition}</td>
														<c:if test="${pVo.projStat eq '모집' }">
															<td><span
																class="kt-badge kt-badge--success kt-badge--inline">모집</span></td>
														</c:if>
														<c:if test="${pVo.projStat eq '진행' }">
															<td><span
																class="kt-badge kt-badge--warning kt-badge--inline">진행</span></td>
														</c:if>
														<c:if test="${pVo.projStat eq '종료' }">
															<td><span
																class="kt-badge kt-badge--danger kt-badge--inline">종료</span></td>
														</c:if>
													</c:if>
												</tr>
											</c:forEach>
											<c:if test="${empty pPList }">
												<td colspan="7">내역이 없습니다</td>
											</c:if>
										</tbody>

									</table>
								</div>
								<div class="tab-pane" id="kt_portlet_tab_1_3">
									<table class="table table-bordered table-hover">
										<thead style="text-align: center;">
											<tr>
												<th>#</th>
												<th style="font-weight: bold;">프로젝트 명</th>
												<th style="font-weight: bold;">담당자</th>
												<th style="font-weight: bold;">지원직무</th>
												<th style="font-weight: bold;">상태</th>
											</tr>
										</thead>
										<tbody style="text-align: center;">
											<c:forEach items="${ePList}" var="eVo" varStatus="listStat">
												<tr>
													<c:if test="${listStat.count < 6}">
														<th scope="row">${listStat.count}</th>
														<td><a
															href="/proj?command=myProjectViewForm&projNum=${pVo.projNum}">${eVo.projName}</a></td>
														<td>${eVo.progName}</td>
														<td>${eVo.applyPosition}</td>
														<c:if test="${eVo.projStat eq '모집' }">
															<td><span
																class="kt-badge kt-badge--success kt-badge--inline">모집</span></td>
														</c:if>
														<c:if test="${eVo.projStat eq '진행' }">
															<td><span
																class="kt-badge kt-badge--warning kt-badge--inline">진행</span></td>
														</c:if>
														<c:if test="${eVo.projStat eq '종료' }">
															<td><span
																class="kt-badge kt-badge--danger kt-badge--inline">종료</span></td>
														</c:if>
													</c:if>
												</tr>
											</c:forEach>
											<c:if test="${empty ePList }">
												<td colspan="7">내역이 없습니다</td>
											</c:if>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>


				</div>

				<!--메세지-->
				<div class="col-xl-4">
					<div class="kt-portlet kt-portlet--tabs kt-portlet--height-fluid">
						<div class="kt-portlet__head">
							<div class="kt-portlet__head-label">
								<h3 class="kt-portlet__head-title">메세지</h3>
							</div>


							<div class="kt-portlet__head-toolbar">
								<ul
									class="nav nav-tabs nav-tabs-bold nav-tabs-line   nav-tabs-line-right nav-tabs-line-brand"
									role="tablist">
									<li class="nav-item"><a class="nav-link active"
										data-toggle="tab" href="#kt_portlet_tab_1_4" role="tab">
											받은 메세지 </a></li>
									<li class="nav-item"><a class="nav-link" data-toggle="tab"
										href="#kt_portlet_tab_1_5" role="tab"> 보낸 메세지 </a></li>

								</ul>
							</div>
						</div>


						<div class="kt-portlet__body">
							<div class="tab-content">
								<input type="hidden" name="progNum" value="${LoginUser.progNum}">
								<div class="tab-pane active" id="kt_portlet_tab_1_4">
									<form method="post" action="/prog?command=receiveMsgDelete">
										<table class="table table-bordered table-hover">
											<thead style="text-align: center;">
												<tr>

													<th style="font-weight: bold;">제목</th>
													<th style="font-weight: bold;">보낸 사람</th>

												</tr>
											</thead>
											<c:choose>
												<c:when test="${not empty ReceiveMessageList}">
													<tbody style="text-align: center;">
														<c:forEach items="${ReceiveMessageList}" var="rVo"
															varStatus="listStat">

															<c:if test="${listStat.count < 6}">

																<tr>

																	<td><a
																		onclick="window.open('prog?command=messageReceiveViewForm&receiveNum=${rVo.receiveNum}','상세보기','width=800,height=500,location=no,status=no,scrollbars=no')">${rVo.receiveSubject}</a></td>
																	<td>${rVo.receiveName}</td>

																</tr>
															</c:if>
														</c:forEach>
												</c:when>
												<c:otherwise>
													<tr>
														<td colspan="5" class="txt_center" align="center"><b>받은
																메세지가 없습니다.</b></td>
													</tr>
												</c:otherwise>
											</c:choose>

											</tbody>
										</table>

										<div>
											<div>
												<div class="col kt-align-center">
													<div class="col kt-align-center">
														<button type="button"
															class="btn btn-clean btn-bold btn-upper"
															onclick="location.href='/prog?command=messageListForm'">
															메세지 전체 목록으로 가기</button>
													</div>
												</div>
											</div>

										</div>


									</form>
								</div>
								<div class="tab-pane" id="kt_portlet_tab_1_5">
									<form method="post" action="/prog?command=sendMsgDelete">
										<table class="table table-bordered table-hover">
											<thead style="text-align: center;">
												<tr>

													<th style="font-weight: bold;">제목</th>
													<th style="font-weight: bold;">받는 사람</th>

												</tr>
											</thead>
											<c:choose>
												<c:when test="${not empty SendMessageList}">
													<tbody style="text-align: center;">
														<c:forEach items="${SendMessageList}" var="sVo"
															varStatus="listStat">
															<c:if test="${listStat.count < 6}">
																<tr>

																	<td><a
																		onclick="window.open('prog?command=messageSendViewForm&sendNum=${sVo.sendNum}','상세보기','width=800,height=500,location=no,status=no,scrollbars=no')">${sVo.sendSubject}</a></td>
																	<td>${sVo.sendName}<input type="hidden"
																		id="sendReceiver" value="${sVo.sendReceiver}"></td>

																</tr>
															</c:if>
														</c:forEach>
												</c:when>
												<c:otherwise>
													<tr>
														<td colspan="5" class="txt_center" align="center"><b>보낸
																메세지가 없습니다.</b></td>
													</tr>
												</c:otherwise>
											</c:choose>
											</tbody>
										</table>

									</form>
								</div>
								<div></div>

							</div>
						</div>
					</div>

				</div>

			</div>


			<!--프로젝트 접수승인-->
			<div class="row">
				<div class="col-xl-12">

				
					<div class="kt-portlet kt-portlet--tabs">
						<div class="kt-portlet__head">
							<div class="kt-portlet__head-label">
								<h3 class="kt-portlet__head-title">프로젝트 접수 승인</h3>
							</div>
							<div class="kt-portlet__head-toolbar">
								<ul
									class="nav nav-tabs nav-tabs-bold nav-tabs-line   nav-tabs-line-right nav-tabs-line-brand"
									role="tablist">
									<li class="nav-item"><a class="nav-link active"
										data-toggle="tab" href="#kt_portlet_tab_1_7" role="tab">
											승인대기 리스트 </a></li>
									<li class="nav-item"><a class="nav-link" data-toggle="tab"
										href="#kt_portlet_tab_1_6" role="tab"> 전체 리스트 </a></li>
									
								</ul>
							</div>
						</div>
						<div class="kt-portlet__body">
							<div class="tab-content">
								<div class="tab-pane active" id="kt_portlet_tab_1_7">



									<table class="table table-bordered table-hover">
										<thead style="text-align: center;">
											<tr>
												<th>#</th>
												<th style="font-weight: bold;">프로젝트 명</th>
												<th style="font-weight: bold;">신청자 명</th>
												<th style="font-weight: bold;">지원 직무</th>
												<th style="font-weight: bold;">신청 날짜</th>
												<th style="font-weight: bold;">상태</th>
												<th style="font-weight: bold;">승인여부</th>
											</tr>
										</thead>
										<tbody style="text-align: center;">

											<c:forEach items="${acceptList}" var="acVo"
												varStatus="listStat">

												<tr>
													<c:if test="${listStat.count < 6}">

														<th scope="row">${listStat.count}</th>
														<td>${acVo.projName}</td>
														<td><a href="#">${acVo.progName}</a></td>
														<td>${acVo.applyPosition}</td>
														<td>${acVo.applyDate}</td>
														<c:if test="${acVo.applyStat eq '승인' }">
															<td><span
																class="kt-badge kt-badge--success kt-badge--inline">승인</span></td>
														</c:if>
														<c:if test="${acVo.applyStat eq '승인대기' }">
															<td><span
																class="kt-badge kt-badge--warning kt-badge--inline">승인대기</span></td>
														</c:if>
														<c:if test="${acVo.applyStat eq '거절' }">
															<td><span
																class="kt-badge kt-badge--danger kt-badge--inline">거절</span></td>
														</c:if>
														<c:if
															test="${acVo.applyStat eq '승인대기' and acVo.projStat eq '모집'}">
															<td><span
																class="kt-badge kt-badge--success kt-badge--inline"
																onclick="acceptApply('${acVo.applyStmtNum}')">승인</span>
																<span class="kt-badge kt-badge--danger kt-badge--inline"
																onclick="denyApply('${acVo.applyStmtNum}')">거절</span></td>
														</c:if>
														<c:if
															test="${acVo.applyStat ne '승인대기' or acVo.projStat ne '모집'}">
															<td>-</td>
														</c:if>
													</c:if>
												</tr>

											</c:forEach>

											<c:if test="${empty acceptList}">
												<tr>
													<td colspan="10">내역이 없습니다</td>
												</tr>
											</c:if>

										</tbody>

									</table>

									<div class="col kt-align-center">
										<div class="col kt-align-center">
											<button type="button"
												class="btn btn-clean btn-bold btn-upper"
												onclick="location.href='/proj?command=projectApplyAcceptForm'">
												프로젝트 접수 승인 전체 목록으로 가기</button>
										</div>
									</div>




								</div>
								<div class="tab-pane" id="kt_portlet_tab_1_6">

									<table class="table table-bordered table-hover">
										<thead style="text-align: center;">
											<tr>
												<th>#</th>
												<th style="font-weight: bold;">프로젝트 명</th>
												<th style="font-weight: bold;">신청자 명</th>
												<th style="font-weight: bold;">지원 직무</th>
												<th style="font-weight: bold;">신청 날짜</th>
												<th style="font-weight: bold;">상태</th>
												<th style="font-weight: bold;">승인여부</th>
											</tr>
										</thead>
										<tbody style="text-align: center;">
											<c:forEach items="${allList}" var="aVo" varStatus="listStat">
												<tr>
													<c:if test="${listStat.count < 6}">
														<th scope="row">${listStat.count}</th>
														<td>${aVo.projName}</td>
														<td><a href="#">${aVo.progName}</a></td>
														<td>${aVo.applyPosition}</td>
														<td>${aVo.applyDate}</td>
														<c:if test="${aVo.applyStat eq '승인' }">
															<td><span
																class="kt-badge kt-badge--success kt-badge--inline">승인</span></td>
														</c:if>
														<c:if test="${aVo.applyStat eq '승인대기' }">
															<td><span
																class="kt-badge kt-badge--warning kt-badge--inline">승인대기</span></td>
														</c:if>
														<c:if test="${aVo.applyStat eq '거절' }">
															<td><span
																class="kt-badge kt-badge--danger kt-badge--inline">거절</span></td>
														</c:if>
														<c:if
															test="${aVo.applyStat eq '승인대기' and aVo.projStat eq '모집'}">
															<td><a href="#"><span
																	class="kt-badge kt-badge--success kt-badge--inline"
																	onclick="acceptApply('${aVo.applyStmtNum}')">승인</span></a>
																<a href="#"><span
																	class="kt-badge kt-badge--danger kt-badge--inline"
																	onclick="denyApply('${aVo.applyStmtNum}')">거절</span></a></td>
														</c:if>
														<c:if
															test="${aVo.applyStat ne '승인대기' or aVo.projStat ne '모집'}">
															<td>-</td>
														</c:if>
													</c:if>
												</tr>

											</c:forEach>
											<c:if test="${empty allList}">
												<tr>
													<td colspan="10">내역이 없습니다</td>

												</tr>
											</c:if>

										</tbody>
									</table>


								</div>
								
							</div>

						</div>
					</div>

				
				</div>
			</div>
		
		</div>

		<div class="col-xl-14">










			<!-- begin:: Footer -->

			<%@include file="include/footer.jsp"%>

			<!-- end:: Footer -->
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
									<div class="kt-notification__item-title">New file has
										been uploaded</div>
									<div class="kt-notification__item-time">5 hrs ago</div>
								</div>
							</a> <a href="#" class="kt-notification__item">
								<div class="kt-notification__item-icon">
									<i class="flaticon2-bar-chart kt-font-info"></i>
								</div>
								<div class="kt-notification__item-details">
									<div class="kt-notification__item-title">New user
										feedback received</div>
									<div class="kt-notification__item-time">8 hrs ago</div>
								</div>
							</a> <a href="#" class="kt-notification__item">
								<div class="kt-notification__item-icon">
									<i class="flaticon2-pie-chart-2 kt-font-success"></i>
								</div>
								<div class="kt-notification__item-details">
									<div class="kt-notification__item-title">System reboot
										has been successfully completed</div>
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
									<div class="kt-notification-v2__item-desc">Total 234
										items</div>
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
								<label class="col-8 col-form-label">Enable
									Notifications:</label>
								<div class="col-4 kt-align-right">
									<span class="kt-switch kt-switch--success kt-switch--sm">
										<label> <input type="checkbox" checked="checked"
											name="quick_panel_notifications_1"> <span></span>
									</label>
									</span>
								</div>
							</div>
							<div class="form-group form-group-xs row">
								<label class="col-8 col-form-label">Enable Case
									Tracking:</label>
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
								<label class="col-8 col-form-label">Enable Report
									Export:</label>
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
								<label class="col-8 col-form-label">Enable Member
									singup:</label>
								<div class="col-4 kt-align-right">
									<span class="kt-switch kt-switch--sm kt-switch--brand">
										<label> <input type="checkbox" checked="checked"
											name="quick_panel_notifications_5"> <span></span>
									</label>
									</span>
								</div>
							</div>
							<div class="form-group form-group-xs row">
								<label class="col-8 col-form-label">Allow User
									Feedbacks:</label>
								<div class="col-4 kt-align-right">
									<span class="kt-switch kt-switch--sm kt-switch--brand">
										<label> <input type="checkbox"
											name="quick_panel_notifications_5"> <span></span>
									</label>
									</span>
								</div>
							</div>
							<div class="form-group form-group-last form-group-xs row">
								<label class="col-8 col-form-label">Enable Customer
									Portal:</label>
								<div class="col-4 kt-align-right">
									<span class="kt-switch kt-switch--sm kt-switch--brand">
										<label> <input type="checkbox" checked="checked"
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
		<!-- <ul class="kt-sticky-toolbar" style="margin-top: 30px;">
		<li class="kt-sticky-toolbar__item kt-sticky-toolbar__item--success"
			id="kt_demo_panel_toggle" data-toggle="kt-tooltip"
			title="Check out more demos" data-placement="right"><a href="#"
			class=""><i class="flaticon2-drop"></i></a></li>
		<li class="kt-sticky-toolbar__item kt-sticky-toolbar__item--brand"
			data-toggle="kt-tooltip" title="Layout Builder" data-placement="left"><a
			href="https://keenthemes.com/metronic/preview/default/builder.html"
			target="_blank"><i class="flaticon2-gear"></i></a></li>
		<li class="kt-sticky-toolbar__item kt-sticky-toolbar__item--warning"
			data-toggle="kt-tooltip" title="Documentation" data-placement="left">
			<a href="https://keenthemes.com/metronic/?page=docs" target="_blank"><i
				class="flaticon2-telegram-logo"></i></a>
		</li>
	</ul> -->

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
							<a href="../default/index.html"
								class="btn btn-brand btn-elevate " target="_blank">Preview</a>
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
		<script
			src="../assets/vendors/general/select2/dist/js/select2.full.js"
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
		<script
			src="../assets/vendors/general/clipboard/dist/clipboard.min.js"
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
		<script
			src="../assets/vendors/general/jquery.repeater/src/repeater.js"
			type="text/javascript"></script>
		<script src="../assets/vendors/general/dompurify/dist/purify.js"
			type="text/javascript"></script>

		<!--end:: Global Optional Vendors -->

		<!--begin::Global Theme Bundle(used by all pages) -->
		<script src="../assets/demo/default/base/scripts.bundle.js"
			type="text/javascript"></script>

		<!--end::Global Theme Bundle -->

		<!--begin::Page Vendors(used by this page) -->
		<script
			src="../assets/vendors/custom/fullcalendar/fullcalendar.bundle.js"
			type="text/javascript"></script>
		<script
			src="//maps.google.com/maps/api/js?key=AIzaSyBTGnKT7dt597vo9QgeQ7BFhvSRP4eiMSM"
			type="text/javascript"></script>
		<script src="../assets/vendors/custom/gmaps/gmaps.js"
			type="text/javascript"></script>

		<!--end::Page Vendors -->

		<!--begin::Page Scripts(used by this page) -->
		<script src="../assets/app/custom/general/dashboard.js"
			type="text/javascript"></script>

		<!--end::Page Scripts -->

		<!--begin::Global App Bundle(used by all pages) -->
		<script src="../assets/app/bundle/app.bundle.js"
			type="text/javascript"></script>

		<!--end::Global App Bundle -->
</body>


<script>

//프로젝트 신청 승인
	function acceptApply(applyStmtNum) {
		var applyStmtNum = applyStmtNum;

		if (confirm("신청 승인하시겠습니까?") == true) {
			location.href = "/proj?command=applyAccept&applyStmtNum="
					+ applyStmtNum;
			alert("신청 승인되었습니다.");
		} else {
			return false;
		}

	}
	
//프로젝트 신청 거절
	function denyApply(applyStmtNum) {
		var applyStmtNum = applyStmtNum;

		if (confirm("신청 거절하시겠습니까?") == true) {
			location.href = "/proj?command=applyDeny&applyStmtNum="
					+ applyStmtNum;
			alert("신청 거절되었습니다.");
		} else {
			return false;
		}

	}
</script>


<!-- end::Body -->
</html>