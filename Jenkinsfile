pipeline {
    agent any

    tools {
       
        maven "MAVEN_HOME"
    }

    stages {
        stage('TEST') {
            steps {
             
                git 'https://github.com/gkerinel/gkerinelProject.git'

         
            }
          
            post {
                 always {
           junit allowEmptyResults:true, testResults: '**/test-results/*.xml' 
        }
        failure {
            mail to: gker_inel@hotmail.com, subject: 'The Pipeline failed :('
                //success {
                    //junit allowEmptyResults:true, testResults: '**/test-results/*.xml'                          
                   // archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
