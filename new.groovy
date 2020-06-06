a=10
if(a==10)
{
	job("myfirstjob"){
		description("this is my discription")
		
		scm{
			github("AkarshAgarwal99/byfilesystem.git")
			}
		triggers{
			scm("* * * * *")
			}
		steps{
			docker run -dit --name akarsh centos:latest
			}
		}
}