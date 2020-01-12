package com.baturayucer.grpcclient;

import com.baturayucer.grpcservice.service.LogRequest;
import com.baturayucer.grpcservice.service.LogResponse;
import com.baturayucer.grpcservice.service.LogServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class GrpcClient {

	public static void main(String[] args) {
		//SpringApplication.run(GrpcClient.class, args);

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
				.usePlaintext()
				.build();

		LogServiceGrpc.LogServiceBlockingStub stub
				= LogServiceGrpc.newBlockingStub(channel);

		LogResponse logResponse = stub.log(LogRequest.newBuilder()
				.setLogLevel("DEBUG")
				.setLogMessage("Log request")
				.build());

		System.out.println("Log Response:" + logResponse);

		channel.shutdown();
	}
}
