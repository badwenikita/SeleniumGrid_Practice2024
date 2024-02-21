pipeline 
{
    agent any
    
    tools{
    	maven 'maven'
        }

    stages 
    {
        stage('Build') 
        {
            steps{
                echo("BUILD the project")
            }
        }
                   
        
        stage("Deploy to QA"){
            steps{
                echo("deploy to QA")
            }
        }
                
        stage('Regression Automation Test') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    git 'https://github.com/badwenikita/SeleniumGrid_Practice2024.git'
                    bat "mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml"
                    
                }
            }
        }
                
        
        
        stage("Deploy to Stage"){
            steps{
                echo("deploy to Stage")
            }
        }
        
        stage('Sanity Automation Test') {
            steps {
                echo("Perform Sanity Testcases")
                }
            }
        }
        
        stage("Deploy to Prod"){
            steps{
                echo("deploy to Prod")
            }
        }
        
        
    }
}