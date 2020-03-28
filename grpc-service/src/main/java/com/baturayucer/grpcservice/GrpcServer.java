package com.baturayucer.grpcservice;

import com.baturayucer.grpcservice.grpc.LogServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class GrpcServer {

	public static void main(String[] args) {
		SpringApplication.run(GrpcServer.class, args);
		try {
			Server server = ServerBuilder
					.forPort(6565)
					.addService(new LogServiceGrpc()).build();
			server.start();
			server.awaitTermination();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
