<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<!-- Head Begin -->
<head>
  <title>Soutien Scolaire | dashboard</title>
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
		<div class="row">
			<div class="col-9">
				<!-- card-body -->
		        <div class="card-body">
		          <!-- carousel slide [page middle] -->
		          <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
		            <ol class="carousel-indicators">
		              <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
		              <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
		            </ol>
		            <div class="carousel-inner">
		              <div class="carousel-item active">
		                <img class="d-block w-100" src="../assets/img/dashboard_background.png" alt="First slide">
	                 	<div class="card-img-overlay">
		                    <p class="card-text text-white" style="text-align:center; font-size:120%;">
		                   	 <b>Bienvenue, Utilisateur(ex.) </b><br>
		                   	 Il y a <b>1</b> cours aujourd'hui.</p>
	                  	</div>
		              </div>
		              <div class="carousel-item">
		                <img class="d-block w-100" src="../assets/img/dashboard_background.png" alt="Second slide">
		                
		                <div class="card-img-overlay d-flex flex-column ">
		                   	<p class="card-text text-white" style="text-align:center">
		                   	 Si vous avez besoin d'aide, <br>
		                   	 consultez le guide de démarrage ou contactez-nous sur le chat.</p>
		                </div>
		              </div>
		            </div>
		            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
		              <span class="carousel-control-custom-icon" aria-hidden="true">
		                <i class="fas fa-chevron-left"></i>
		              </span>
		              <span class="sr-only">Previous</span>
		            </a>
		            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
		              <span class="carousel-control-custom-icon" aria-hidden="true">
		                <i class="fas fa-chevron-right"></i>
		              </span>
		              <span class="sr-only">Next</span>
		            </a>
		          </div>
		          <!-- ./carousel slide [page middle] -->
		          
				</div>
        		
        		<div id="external-events">
				</div>

				<div class="card-body">
              		<!-- THE CALENDAR -->
                	<div id="calendar"></div>
				</div>

			</div>

		
			<div class="col-3">
				<!-- card-body -->
		        <div class="card-body">
		        	<!-- small box [page right] -->
					<div class="small-box bg-info">
					   <div class="inner">
					     <h5><b>Signatures</b></h5>
					     <p>Période actuelle</p>
					   </div>
					   <div class="icon">
					     <i class="far fa-calendar-alt"></i>
					   </div>
					   <a href="./sign.jsp" class="small-box-footer">
					     Plus d'info <i class="fas fa-arrow-circle-right"></i>
					   </a>
					</div>
            
		            <div class="small-box bg-success">
		              <div class="inner">
		                <h5><b>Présence</b></h5>
		                <p>Les 30 derniers jours</p>
		              </div>
		              <div class="icon">
		                <i class="fas fa-chart-pie"></i>
		              </div>
		              <a href="./presence.jsp" class="small-box-footer">
		                Plus d'info <i class="fas fa-arrow-circle-right"></i>
		              </a>
		            </div>
            
		            <div class="small-box bg-warning">
		              <div class="inner">
		                <h5><b>Aide</b></h5>
		                <p>Contactez-nous</p>
		              </div>
		              <div class="icon">
		                <i class="fas fa-hands-helping"></i>
		              </div>
		              <a href="../aide.jsp" class="small-box-footer">
		                Plus d'info <i class="fas fa-arrow-circle-right"></i>
		              </a>
		            </div>
					<!-- ./ small box [page right] -->
		        </div>
		        <!-- ./card body -->
			</div>
	    </div>
	    
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
<!-- fullCalendar 2.2.5 -->
<script src="../assets/plugins/moment/moment.min.js"></script>
<script src="../assets/plugins/fullcalendar/main.js"></script>
<!-- Page specific script -->
<script>
  $(function () {

    /* initialize the external events
     -----------------------------------------------------------------*/
    function ini_events(ele) {
      ele.each(function () {

        // create an Event Object (https://fullcalendar.io/docs/event-object)
        // it doesn't need to have a start or end
        var eventObject = {
          title: $.trim($(this).text()) // use the element's text as the event title
        }

        // store the Event Object in the DOM element so we can get to it later
        $(this).data('eventObject', eventObject)

        // make the event draggable using jQuery UI
        $(this).draggable({
          zIndex        : 1070,
          revert        : true, // will cause the event to go back to its
          revertDuration: 0  //  original position after the drag
        })

      })
    }

    ini_events($('#external-events div.external-event'))

    /* initialize the calendar
     -----------------------------------------------------------------*/
    //Date for the calendar events (dummy data)
    var date = new Date()
    var d    = date.getDate(),
        m    = date.getMonth(),
        y    = date.getFullYear()

    var Calendar = FullCalendar.Calendar;
    var Draggable = FullCalendar.Draggable;

    var containerEl = document.getElementById('external-events');
    var checkbox = document.getElementById('drop-remove');
    var calendarEl = document.getElementById('calendar');

    // initialize the external events
    // -----------------------------------------------------------------

    new Draggable(containerEl, {
      itemSelector: '.external-event',
      eventData: function(eventEl) {
        return {
          title: eventEl.innerText,
          backgroundColor: window.getComputedStyle( eventEl ,null).getPropertyValue('background-color'),
          borderColor: window.getComputedStyle( eventEl ,null).getPropertyValue('background-color'),
          textColor: window.getComputedStyle( eventEl ,null).getPropertyValue('color'),
        };
      }
    });

    var calendar = new Calendar(calendarEl, {
      headerToolbar: {
        left  : 'prev,next today',
        center: 'title',
        right : 'dayGridMonth,timeGridWeek,timeGridDay'
      },
      themeSystem: 'bootstrap',
      //Random default events
      events: [
        {
          title          : 'Réunion',
          start          : new Date(y, m, d-1, 13, 00),
          end            : new Date(y, m, d-1, 14, 00),
          allDay         : false,
          backgroundColor: '#0073b7', //Blue
          borderColor    : '#0073b7' //Blue
        },
        {
          title          : 'Mobile',
          start          : new Date(y, m, d, 16, 15),
          end            : new Date(y, m, d, 18, 15),
          allDay         : false,
          url            : '#',
          backgroundColor: '#00c0ef', //Info (aqua)
          borderColor    : '#00c0ef' //Info (aqua)
        },
        {
          title          : 'Analyse des données',
          start          : new Date(y, m, d + 1, 8, 15),
          end            : new Date(y, m, d + 1, 10, 15),
          url            : '#',
          allDay         : false,
          backgroundColor: '#00a65a', //Success (green)
          borderColor    : '#00a65a' //Success (green)
        }
      ],
      editable  : true,
      droppable : true, // this allows things to be dropped onto the calendar !!!
      drop      : function(info) {
        // is the "remove after drop" checkbox checked?
        if (checkbox.checked) {
          // if so, remove the element from the "Draggable Events" list
          info.draggedEl.parentNode.removeChild(info.draggedEl);
        }
      }
    });

    calendar.render();
    // $('#calendar').fullCalendar()

    /* ADDING EVENTS */
    var currColor = '#3c8dbc' //Red by default
    // Color chooser button
    $('#color-chooser > li > a').click(function (e) {
      e.preventDefault()
      // Save color
      currColor = $(this).css('color')
      // Add color effect to button
      $('#add-new-event').css({
        'background-color': currColor,
        'border-color'    : currColor
      })
    })
    $('#add-new-event').click(function (e) {
      e.preventDefault()
      // Get value and make sure it is not null
      var val = $('#new-event').val()
      if (val.length == 0) {
        return
      }

      // Create events
      var event = $('<div />')
      event.css({
        'background-color': currColor,
        'border-color'    : currColor,
        'color'           : '#fff'
      }).addClass('external-event')
      event.text(val)
      $('#external-events').prepend(event)

      // Add draggable funtionality
      ini_events(event)

      // Remove event from text input
      $('#new-event').val('')
    })
  })
</script>

</body>
<!-- Body End -->
</html>