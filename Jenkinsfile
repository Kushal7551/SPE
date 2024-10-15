pipeline{
    environment{
        DOCKERHUB_CRED = credentials("DockerCredentials")
        PATH = "/opt/homebrew/bin:$PATH" 
    }
    agent any
    stages{
        stage("Stage 1 : Git Clone"){
            steps{
                git clone "https://github.com/kushal7551/SPE.git"
//                    sh 'ls'
            }
        }

        stage("Stage 2 : Maven Build"){
            steps{
                sh 'mvn clean install'
            }
        }

        stage("Stage 3 : Build Docker Image"){
            steps{
                sh "/usr/local/bin/docker  build -t kushal7551/calculator:latest ."
            }
        }

        stage("Stage 4 : Push Docker Image to Dockerhub"){
            steps{
                sh 'echo $DOCKERHUB_CRED_PSW | /usr/local/bin/docker login -u $DOCKERHUB_CRED_USR --password-stdin'
                sh "/usr/local/bin/docker push kushal7551/calculator:latest"
            }
        }

        stage("Stage 5 : Clean Unwanted Docker Images"){
            steps{
                sh "/usr/local/bin/docker container prune -f"
                sh "/usr/local/bin/docker image prune -a -f"
            }
        }

        stage('Stage 6 : Ansible Deployment') {
            steps {
//                 ansiblePlaybook colorized: true,
//                 credentialsId: 'localhost',
//                 installation: 'Ansible',
//                 inventory: 'inventory',
//                 playbook: 'Deploy_Calculator.yml'
                    sh 'ansible-playbook -i inventory Deploy_Calculator.yml'
             }
        }
    }
}