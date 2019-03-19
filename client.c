#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<string.h>
#include<unistd.h>
#include<netdb.h>
#include<errno.h>

int main()
{
  int sock, bytes received;
  char send data[1024],recv_data[1024];
  struct hosten *host;
  struct sockaddr_in server_addr ;
  
  host=gethostbyname("192.168.31.132");
  
  if((sock=socket(AF_INET, SOCK_STREAM, 0)) == -1)
  {
    perror("Socket");
    exit(1);
  }
  
  server_addr.sin_family=AF_INET;
  server_addr.sin_port=htons(6666);
  server_addr.sin_addr=*((struct in_addr *)host ->h_addr);
  bzero(&(server_addr.sin_zero),8);
  
  if(connect(sock, (struct sockaddr *)&server_addr, sizeof(struct sockaddr)) == -1)
  {
    perrot("Hello");
    exit(1);
  )
  
  

