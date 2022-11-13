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
                sh "mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=vagrant";
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
      stage('Nexus') {
            steps{
                nexusArtifactUploader artifacts: [
                    [
                        artifactId: 'tpAchatProject', 
                        classifier: '', 
                        file: 'target/tpAchatProject-1.0.jar', 
                        type: 'jar'
                    ]
                ], 
                credentialsId: 'nexus', 
                groupId: 'com.esprit.examen', 
                nexusUrl: '192.168.1.13:8081', 
                nexusVersion: 'nexus3', 
                protocol: 'http', 
                repository: 'maven-devops-release', 
                version: '1.0'
                
            }
        }
        stage('Pull artifact from Nexus'){
            steps{
                
                sh "curl http://192.168.1.13:8081/repository/maven-devops-release/com/esprit/examen/tpAchatProject/1.0/tpAchatProject-1.0.jar --output tpAchatProject-1.0.jar";
            }
        }
        stage('Build image') {
            steps{
                script{
                    dockerImage = docker.build "192.168.1.13:8082/repository/docker-devops-project-releases/achatprojet:latest"
                }
            }
        }

        stage('Push image to Nexus') {
            steps {
                
                script{
                    withDockerRegistry([credentialsId: 'nexus', url: 'http://192.168.1.13:8082/repository/docker-devops-project-releases/']) {
                        sh "docker push 192.168.1.13:8082/repository/docker-devops-project-releases/achatprojet:latest"
                    }
                }
            }
        }

    }
}
