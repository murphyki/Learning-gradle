import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class CustomTask extends DefaultTask {
  def message = "Hello from CustomTask"

  @TaskAction
  def runQuery() {
    def cmd
        // do whatever you want here...
        println "${message}"
  }
}