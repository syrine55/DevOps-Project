pipeline {
    agent {label "vagrant"}
    stages {
        stage('GIT') {
            steps {
                echo 'github';
                git branch:'main',
                    url: 'https://github.com/syrine55/TP_Achat.git',
                    credentialsId: 'gitCredentials';
            }
        }
        stage('sonar') {
            steps {
                sh "mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=root";
            }
        }
        stage('unit testing') {
            steps {
                sh "mvn clean test -Ptest";
            }
        }
        stage('build') {
            steps {
                sh "mvn clean package -Pprod";
            }
        }
    }
}
