package com.example.demo;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class AopAspectImplementation {
	@Around(value = "@within(com.example.demo.AopAspects) || @annotation(com.example.demo.AopAspects)")
	public String aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		HttpServletRequest request= ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		HttpServletResponse response= ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getResponse();
		
		StringBuilder test= new StringBuilder();
		
		MethodSignature signature= (MethodSignature) joinPoint.getSignature();
		Method method= signature.getMethod();
		
		AopAspects aopmethod= method.getAnnotation(AopAspects.class);
		
		
		long startTime= System.currentTimeMillis();
		Object result=joinPoint.proceed();
		long endTime= System.currentTimeMillis();
		
		String methodName = method.getName();
		String serverName= request.getServerName();
		String requestType= request.getMethod();
		//String requestUrl= request.getRequestURL().toString();
		String requestUrl= getRequestUrl(request);
		int status= response.getStatus();
		
		if(joinPoint.getArgs()!=null && joinPoint.getArgs().length>0) {
			for(int i=0;i<joinPoint.getArgs().length;i++) {
				if(joinPoint.getArgs()[i] instanceof OptionHeader) {
				test.append("Request Body : :" + getJsonString(joinPoint.getArgs()[i]).toString() )	;
					
				}
				
			}
		}
		if(aopmethod.allow()) {
		test.append("Target Method Name :" + methodName + "\n");
		test.append("Request Method Type :" + requestType + "\n");
		test.append("Server Name :" + serverName +"\n");
		test.append("Request Url :" + requestUrl + "\n");
		test.append("Status Code : " + status + "\n");
		test.append("Time Taken : "+(endTime- startTime) + " milliSeconds"+"\n");
		}
		System.out.println(test.toString());
		return null;
		
	}

	private String getJsonString(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		String json="";
		try {
			json= mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}

	private String getRequestUrl(HttpServletRequest request) {
		UriComponentsBuilder builder = UriComponentsBuilder.newInstance().scheme(request.getScheme())
				.host(request.getServerName()).port(request.getServerPort()).path("json");
		return builder.toUriString();
	}

//	private String getRequestUrl(HttpServletRequest request) {
//		UriComponentsBuilder builer= UriComponentsBuilder.newInstance().scheme(request.getScheme()).host(request.getServerName())
//				.port(request.getServerPort())
//				.path(request.geta)
//		return null;
//	}

}
