<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


	<aside class="main-sidebar elevation-4 sidebar-light-success">
 		<!-- Brand Logo -->
	    <a href="#" class="brand-link navbar-success">
	      <img src="../assets/img/SoutienScolaireLogo.png" alt="Soutien Scolaire Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
	      <span class="brand-text font-weight-light" style='color: white'><b>Soutien</b> Scolaire</span>
	    </a>
	    
	    <!-- Sidebar -->
	    <div class="sidebar">
		    <div class="user-panel">
		    	<div class="card-body box-profile">
	                <div class="text-center">
	                  <img class="img-circle elevation-2"
	                       src="../assets/img/user2-160x160.jpg"
	                       alt="User Image">
	                </div>
	                <h3 class="profile-username text-center">
	                	<a href="../myAccount.jsp" class="d-block">Utilisateur(ex.)</a>
	                </h3>
	                <p class="text-muted text-center">Dirigeant</p>
	            </div>
	         </div> 
	    
		    <!-- Sidebar Menu -->
			<nav class="mt-2">
				<ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
					
					<li class="nav-item" id="page_dashboard">
						<a href="./dashboard.jsp" class="nav-link">
			              <i class="nav-icon fas fa-tachometer-alt"></i>
			              <p>
			                Tableau de board
			              </p>
			            </a>
					</li>
					
			        
			        <li class="nav-item" id="page_teacher">
			            <a href="./teacher.jsp" class="nav-link">
			              <i class="nav-icon fas fa-chalkboard-teacher"></i>
			              <p>
			                Professeurs
			              </p>
			            </a>
			        </li>
			        
			        <li class="nav-item" id="page_student">
			            <a href="./student.jsp" class="nav-link">
			              <i class="nav-icon fas fa-user-graduate"></i>
			              <p>
			                Élèves
			              </p>
			            </a>
			        </li>
			        
			        <li class="nav-item" id="page_presence">
			            <a href="./presence.jsp" class="nav-link">
			              <i class="nav-icon fas fa-list-ul"></i>
			              <p>
			                Feuilles de présence
			              </p>
			            </a>
			        </li>
			        
               	</ul>
			</nav>
			<!-- /.sidebar-menu -->
		
	    </div>
	    <!-- /.sidebar -->
 	</aside>