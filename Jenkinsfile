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
        }
    }
}
