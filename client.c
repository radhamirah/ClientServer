#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include <arpa/inet.h>
 
int main()
{
    int network_socket;
    network_socket=socket(AF_INET, SOCK_STREAM, 0);
 
    struct sockaddr_in server_address;
    server_address.sin_family=AF_INET;
    server_address.sin_port=htons(6666);
    server_address.sin_addr.s_addr=inet_addr("192.168.31.132");
 
    int connect_socket=connect(network_socket,(struct sockaddr*)&server_address,sizeof(server_address));
    if(connect_socket==-1)
    {
        printf("Message: ");
        recv(client_socket,&ch,sizeof(ch),0);
        printf("Message Received: %s",ch);
        
    }
 
    char ch[1024];
     
    close(network_socket);
return 0;
}   
  
  

