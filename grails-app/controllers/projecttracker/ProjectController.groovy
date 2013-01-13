package projecttracker

class ProjectController {

    def index = {
		redirect(action: current);
	}
	
	def current = {
		def allProjects = Project.list()
		[allProjects:allProjects]
	}
	
	def overdue = {
		render "Order overdue stuff";
	}
}
