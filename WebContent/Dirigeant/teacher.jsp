<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<!-- Head Begin -->
<head>
  <title>Soutien Scolaire | Professeurs</title>
  <jsp:include page="../includes/header.jsp"></jsp:include>
</head>
<!-- Head End -->

<!-- Body Begin -->
<body class="hold-transition sidebar-mini layout-navbar-fixed layout-fixed accent-success">
<!-- Site wrapper -->
<div class="wrapper">
	<!-- Navbar -->
	<jsp:include page="../includes/navTop.jsp"></jsp:include>
	<!-- /.Dirigeant-Navbar -->
	
    <!-- Main Sidebar Container -->
 	<jsp:include page="./navSidebar.jsp"></jsp:include>
    <!-- /.Dirigeant-Main Sidebar Container -->
	    
	<!-- Main content -->
    <!-- Content Wrapper. Contains page content -->
	<div class="content-wrapper">
		<!-- Content Header (Page header) -->
	    <section class="content-header">
	      <div class="container-fluid">
	        <h2 class="text-center display-6">Professeurs</h2>
	        <p class="text-muted text-center">Ajoutez et modifiez vos professeurs et téléchargez leurs documents</p>
	      </div>
	      <!-- /.container-fluid -->
	    </section>
	    
	    <!-- Main content -->
	    <section class="content">
	        <div class="container-fluid">
	        	<div class="row">
                	<div class="col-12">
                		<div class="card">
							<div class="card-body">
								<!-- card-first ligne -->
					            <form action="#">
					            	<div class="row">
					                    <div class="col-12">
					                        <div class="row">
					                            <div class="col-2">
					                                <div class="btn-group-sm">
									                    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">Opérations</button>
									                      <span class="sr-only">Toggle Dropdown</span>
									                    </button>
									                    <div class="dropdown-menu" role="menu">
									                      <a class="dropdown-item" href="#">Modifier l'objet</a>
									                      <div class="dropdown-divider"></div>
									                      <a class="dropdown-item" href="#">Supprimer l'objet</a>
									                      <div class="dropdown-divider"></div>
									                      <a class="dropdown-item" href="#">Exporter l'objet</a>
									                      <div class="dropdown-divider"></div>
									                      <a class="dropdown-item" href="#">Envoyer un é-mail à l'objet</a>
									                    </div>
									            	</div>
					                            </div>
					                            <!-- /.col -->
					                            <div class="col-7">
					                            	<div class="form-group">
							                            <div class="input-group input-group-sm">
							                                <input type="search" class="form-control form-control-lg" placeholder="Rechercher ...">
							                                <div class="input-group-append">
							                                    <button type="submit" class="btn btn-lg btn-default">
							                                        <i class="fa fa-search"></i>
							                                    </button>
							                                </div>
							                            </div>
							                        </div>
					                            </div>
					                            <!-- /.col -->
					                            <div class="col-3 pull-right">
					                            	<div class="btn-group-sm">
									                  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">Ajouter un professeur</button>
									                  <div class="dropdown-menu" role="menu">
									                    <a class="dropdown-item" href="./addStudent.jsp">Créer un nouvel professeur</a>
									                    <a class="dropdown-item" href="./fileImport.jsp">Importer un fichier</a>
									                  </div>
									               	</div>
					                            </div>
					                            <!-- /.col -->
					                        </div>
					                        <!-- /.row -->
					                    </div>
					                    <!-- /.col -->
					                </div>
					                <!-- /.row -->
					            </form>
					            <!-- /.card-first ligne -->
	            
								<!-- card-table -->
				                <table class="table table-bordered">
				                  <thead>
				                    <tr>
				                      <th style="width: 10px">
					                      <div class="icheck-primary">
					                      	<input type="checkbox" id="agreeTerms" name="terms" value="agree">
					                      </div>
				                      </th>
				                      <th>Nom et prénom</th>
				                      <th>E-mail</th>
				                      <th>Formation</th>
				                    </tr>
				                  </thead>
				                  
				                  <tbody>
				                    <tr>
				                      <td>
										<div class="icheck-primary">
					                    	<input type="checkbox" id="agreeTerms" name="terms" value="agree">
					                    </div>
					                  </td>
				                      <td>aaa</td>
				                      <td>
				                        aaa@etu.univ-tours.com
				                      </td>
				                      <td>Électronique et Génie Électrique</td>
				                    </tr>
				                    
				                    <tr>
				                      <td>
										<div class="icheck-primary">
					                    	<input type="checkbox" id="agreeTerms" name="terms" value="agree">
					                    </div>
					                  </td>
				                      <td>bbb</td>
				                      <td>
				                        bbb@etu.univ-tours.com
				                      </td>
				                      <td>Génie de l'Aménagement et de l'Environnement</td>
				                    </tr>
				                    
				                    <tr>
				                      <td>
										<div class="icheck-primary">
					                    	<input type="checkbox" id="agreeTerms" name="terms" value="agree">
					                    </div>
					                  </td>
				                      <td>ccc</td>
				                      <td>
				                        ccc@etu.univ-tours.com
				                      </td>
				                      <td>Informatique</td>
				                    </tr>
				                    
				                    <tr>
				                      <td>
										<div class="icheck-primary">
					                    	<input type="checkbox" id="agreeTerms" name="terms" value="agree">
					                    </div>
					                  </td>
				                      <td>ddd</td>
				                      <td>
				                        ddd@etu.univ-tours.com
				                      </td>
				                      <td>Mécanique et Génie Mécanique</td>
				                    </tr>
				                    
				                    <tr>
				                      <td>
										<div class="icheck-primary">
					                    	<input type="checkbox" id="agreeTerms" name="terms" value="agree">
					                    </div>
					                  </td>
				                      <td>eee</td>
				                      <td>
				                        eee@etu.univ-tours.com
				                      </td>
				                      <td>Informatique Industrielle</td>
				                    </tr>
				                    
				                    
				                  </tbody>
				                </table>
				                <!-- /.card-table -->
				                
              				</div>
              				<!-- /.card-body -->
              				
				            <div class="card-footer clearfix">
				                <ul class="pagination pagination-sm m-0 float-right">
				                  <li class="page-item"><a class="page-link" href="#">&laquo;</a></li>
				                  <li class="page-item"><a class="page-link" href="#">1</a></li>
				                  <li class="page-item"><a class="page-link" href="#">2</a></li>
				                  <li class="page-item"><a class="page-link" href="#">3</a></li>
				                  <li class="page-item"><a class="page-link" href="#">&raquo;</a></li>
				                </ul>
				            </div>
				            <!-- /.table-pages -->
				            
            			</div>
            			<!-- /.card -->
                	</div>
                	<!-- /.col -->
                </div>
                <!-- /.row -->
                
	        </div>
	        <!-- /.container-fluid -->
	    </section>
	    
		<!-- back-to-top -->
	  	<a id="back-to-top" href="#" class="btn btn-success back-to-top" role="button" aria-label="Scroll to top">
      		<i class="fas fa-chevron-up"></i>
    	</a>
   	</div>
   	<!-- /.content-wrapper -->

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
  
</div>
<!-- /.Dirigeant-Site wrapper -->

<!-- jQuery -->
<script src="../assets/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="../assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- jQuery UI -->
<script src="../assets/plugins/jquery-ui/jquery-ui.min.js"></script>
<!-- overlayScrollbars -->
<script src="../assets/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
<!-- Model App -->
<script src="../assets/js/adminlte.min.js"></script>
<!-- Model for demo purposes -->
<script src="../assets/js/demo.js"></script>
</body>
<!-- Body End -->
</html>