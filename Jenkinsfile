pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Build Startttt.........."
                // Get some code from a GitHub repository
                git 'https://github.com/denizturkmen/Jenkinsss.git'
                // Run Maven on a Unix agent.
                sh "mvn clean install"
            }
            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
