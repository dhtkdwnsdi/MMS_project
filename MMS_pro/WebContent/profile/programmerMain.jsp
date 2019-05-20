<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="kt-content  kt-grid__item kt-grid__item--fluid" id="kt_content">
							<div class="row">
								<div class="col-xl-6">

									<!--begin::Portlet-->
									<div class="kt-portlet">
										<div class="kt-portlet__head">
											<div class="kt-portlet__head-label">
												<h3 class="kt-portlet__head-title" >
													프로젝트 찾기
												</h3>
											</div>
										</div>
										<div class="kt-portlet__body">
											<form>
											<!--begin::Section-->
											<div class="kt-section">
												<div class="kt-section__content">
													<table class="table">
														<thead>
															<tr>
																<th>#</th>
																<th style="font-weight: bold;">프로젝트 명</th>
																<th style="font-weight: bold;">카테고리</th>
																<th style="font-weight: bold;">신청마감일</th>
																<th style="font-weight: bold;">담당자</th>
															</tr>
														</thead>
														<tbody>
															<tr>
																<th scope="row">1</th>
																<td>Jhon</td>
																<td>Stone</td>
																<td>@jhon</td>
															</tr>
															<tr>
																<th scope="row">2</th>
																<td>Lisa</td>
																<td>Nilson</td>
																<td>@lisa</td>
															</tr>
															<tr>
																<th scope="row">3</th>
																<td>Larry</td>
																<td>the Bird</td>
																<td>@twitter</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>

											<!--end::Section-->
											</form>
										</div>

										<!--end::Form-->
									</div>

									<!--end::Portlet-->

									<!--begin::Portlet-->
									<div class="kt-portlet">
										<div class="kt-portlet__head">
											<div class="kt-portlet__head-label">
												<h3 class="kt-portlet__head-title">
													Table Head Options
												</h3>
											</div>
										</div>
										<div class="kt-portlet__body">

											<!--begin::Section-->
											<div class="kt-section">
												<span class="kt-section__info">
													Similar to default and inverse tables, use one of two modifier classes to make &lt;thead&gt;s appear light or dark gray.
												</span>
												<div class="kt-section__content">
													<table class="table">
														<thead class="thead-light">
															<tr>
																<th>#</th>
																<th>First Name</th>
																<th>Last Name</th>
																<th>Username</th>
															</tr>
														</thead>
														<tbody>
															<tr>
																<th scope="row">1</th>
																<td>Jhon</td>
																<td>Stone</td>
																<td>@jhon</td>
															</tr>
															<tr>
																<th scope="row">2</th>
																<td>Lisa</td>
																<td>Nilson</td>
																<td>@lisa</td>
															</tr>
															<tr>
																<th scope="row">3</th>
																<td>Larry</td>
																<td>the Bird</td>
																<td>@twitter</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>

											<!--end::Section-->

											<!--begin::Section-->
											<div class="kt-section">
												<div class="kt-section__content">
													<table class="table">
														<thead class="thead-dark">
															<tr>
																<th>#</th>
																<th>First Name</th>
																<th>Last Name</th>
																<th>Username</th>
															</tr>
														</thead>
														<tbody>
															<tr>
																<th scope="row">1</th>
																<td>Jhon</td>
																<td>Stone</td>
																<td>@jhon</td>
															</tr>
															<tr>
																<th scope="row">2</th>
																<td>Lisa</td>
																<td>Nilson</td>
																<td>@lisa</td>
															</tr>
															<tr>
																<th scope="row">3</th>
																<td>Larry</td>
																<td>the Bird</td>
																<td>@twitter</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>

											<!--end::Section-->
										</div>
									</div>

									<!--end::Portlet-->

									<!--begin::Portlet-->
									<div class="kt-portlet">
										<div class="kt-portlet__head">
											<div class="kt-portlet__head-label">
												<h3 class="kt-portlet__head-title">
													Small Table
												</h3>
											</div>
										</div>
										<div class="kt-portlet__body">

											<!--begin::Section-->
											<div class="kt-section">
												<span class="kt-section__info">
													Add <code>.table-sm</code> to make tables more compact by cutting cell padding in half.
												</span>
												<div class="kt-section__content">
													<table class="table table-sm table-head-bg-brand">
														<thead class="thead-inverse">
															<tr>
																<th>#</th>
																<th>First Name</th>
																<th>Last Name</th>
																<th>Username</th>
															</tr>
														</thead>
														<tbody>
															<tr>
																<th scope="row">1</th>
																<td>Jhon</td>
																<td>Stone</td>
																<td>@jhon</td>
															</tr>
															<tr>
																<th scope="row">2</th>
																<td>Lisa</td>
																<td>Nilson</td>
																<td>@lisa</td>
															</tr>
															<tr>
																<th scope="row">3</th>
																<td>Larry</td>
																<td>the Bird</td>
																<td>@twitter</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>

											<!--end::Section-->
										</div>
									</div>

									<!--end::Portlet-->

									<!--begin::Portlet-->
									<div class="kt-portlet">
										<div class="kt-portlet__head">
											<div class="kt-portlet__head-label">
												<h3 class="kt-portlet__head-title">
													Striped Rows
												</h3>
											</div>
										</div>
										<div class="kt-portlet__body">

											<!--begin::Section-->
											<div class="kt-section">
												<div class="kt-section__content">
													<table class="table table-striped">
														<thead>
															<tr>
																<th>#</th>
																<th>First Name</th>
																<th>Last Name</th>
																<th>Username</th>
															</tr>
														</thead>
														<tbody>
															<tr>
																<th scope="row">1</th>
																<td>Jhon</td>
																<td>Stone</td>
																<td>@jhon</td>
															</tr>
															<tr>
																<th scope="row">2</th>
																<td>Lisa</td>
																<td>Nilson</td>
																<td>@lisa</td>
															</tr>
															<tr>
																<th scope="row">3</th>
																<td>Larry</td>
																<td>the Bird</td>
																<td>@twitter</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>

											<!--end::Section-->
										</div>

										<!--end::Form-->
									</div>

									<!--end::Portlet-->
								</div>
								<div class="col-xl-6">

									<!--begin::Portlet-->
									<div class="kt-portlet">
										<div class="kt-portlet__head">
											<div class="kt-portlet__head-label">
												<h3 class="kt-portlet__head-title">
													Bordered Table
												</h3>
											</div>
										</div>
										<div class="kt-portlet__body">

											<!--begin::Section-->
											<div class="kt-section">
												<div class="kt-section__content">
													<table class="table table-bordered">
														<thead>
															<tr>
																<th>#</th>
																<th>First Name</th>
																<th>Last Name</th>
																<th>Username</th>
															</tr>
														</thead>
														<tbody>
															<tr>
																<th scope="row">1</th>
																<td>Jhon</td>
																<td>Stone</td>
																<td>@jhon</td>
															</tr>
															<tr>
																<th scope="row">2</th>
																<td>Lisa</td>
																<td>Nilson</td>
																<td>@lisa</td>
															</tr>
															<tr>
																<th scope="row">3</th>
																<td>Larry</td>
																<td>the Bird</td>
																<td>@twitter</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>

											<!--end::Section-->
										</div>

										<!--end::Form-->
									</div>

									<!--end::Portlet-->

									<!--begin::Portlet-->
									<div class="kt-portlet">
										<div class="kt-portlet__head">
											<div class="kt-portlet__head-label">
												<h3 class="kt-portlet__head-title">
													Hoverable Table
												</h3>
											</div>
										</div>
										<div class="kt-portlet__body">

											<!--begin::Section-->
											<div class="kt-section">
												<div class="kt-section__content">
													<table class="table table-bordered table-hover">
														<thead>
															<tr>
																<th>#</th>
																<th>First Name</th>
																<th>Last Name</th>
																<th>Username</th>
															</tr>
														</thead>
														<tbody>
															<tr>
																<th scope="row">1</th>
																<td>Jhon</td>
																<td>Stone</td>
																<td>@jhon</td>
															</tr>
															<tr>
																<th scope="row">2</th>
																<td>Lisa</td>
																<td>Nilson</td>
																<td>@lisa</td>
															</tr>
															<tr>
																<th scope="row">3</th>
																<td>Larry</td>
																<td>the Bird</td>
																<td>@twitter</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>

											<!--end::Section-->
										</div>

										<!--end::Form-->
									</div>

									<!--end::Portlet-->

									<!--begin::Portlet-->
									<div class="kt-portlet">
										<div class="kt-portlet__head">
											<div class="kt-portlet__head-label">
												<h3 class="kt-portlet__head-title">
													Table Row States
												</h3>
											</div>
										</div>
										<div class="kt-portlet__body">

											<!--begin::Section-->
											<div class="kt-section">
												<div class="kt-section__content">
													<table class="table">
														<thead>
															<tr>
																<th>#</th>
																<th>First Name</th>
																<th>Last Name</th>
																<th>Username</th>
															</tr>
														</thead>
														<tbody>
															<tr class="table-active">
																<th scope="row">1</th>
																<td>Jhon</td>
																<td>Stone</td>
																<td>@jhon</td>
															</tr>
															<tr class="table-primary">
																<th scope="row">2</th>
																<td>Lisa</td>
																<td>Nilson</td>
																<td>@lisa</td>
															</tr>
															<tr class="table-success">
																<th scope="row">3</th>
																<td>Larry</td>
																<td>the Bird</td>
																<td>@twitter</td>
															</tr>
															<tr class="table-brand">
																<th scope="row">4</th>
																<td>Nick</td>
																<td>looper</td>
																<td>@king</td>
															</tr>
															<tr class="table-warning">
																<th scope="row">5</th>
																<td>Joan</td>
																<td>thestar</td>
																<td>@joan</td>
															</tr>
															<tr class="table-danger">
																<th scope="row">6</th>
																<td>Sean</td>
																<td>coder</td>
																<td>@coder</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>

											<!--end::Section-->
										</div>

										<!--end::Form-->
									</div>

									<!--end::Portlet-->

								</div>
							</div>
						</div>
</body>
</html>