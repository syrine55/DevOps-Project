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
        stage('build') {
            steps {
                sh "mvn clean package";
            }
        }
    }
}
