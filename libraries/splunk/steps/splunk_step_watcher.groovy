/*@BeforeStep
void before(){
  println "Splunk: running before the ${hookContext.library} library's ${hookContext.step} step"
}

@AfterStep({ config.afterSteps ? (hookContext.step in config.afterSteps) : true })
void after(){
  println "Splunk: running after the ${hookContext.library} library's ${hookContext.step} step"
}

@AfterStep({ currentBuild.result.toString() == "FAILURE" })
void afterFailure(){
  println "Splunk: running after the ${hookContext.library} library's ${hookContext.step} step failure"
}
*/

@Init
void callStart(){
    print "Start"
}
@CleanUp()
void callSendMessage(){
    if (currentBuild.currentResult.toString() == "SUCCESS") {
        println "a"
        println "${currentBuild.currentResult}"
        println "${currentBuild.result}"
        println "${currentBuild.displayName}"
        println "${currentBuild.fullDisplayName}"
        if ("${currentBuild.currentResult}" == "FAILURE")
        {
          println "emin turan"
        }
    }
    if (currentBuild.currentResult.toString() == "FAILURE") {
        println "b"
        println "${currentBuild.currentResult}"
        println "${currentBuild.result}"
        println "${currentBuild.displayName}"
        println "${currentBuild.fullDisplayName}"
    }
    if (currentBuild.currentResult.toString() == "ABORTED") {
        println "a"
        println "${currentBuild.currentResult}"
        println "${currentBuild.result}"
        println "${currentBuild.displayName}"
        println "${currentBuild.fullDisplayName}"
    }
} 
