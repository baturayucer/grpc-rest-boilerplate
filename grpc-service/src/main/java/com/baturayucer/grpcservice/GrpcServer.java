package com.baturayucer.grpcservice;

import com.baturayucer.grpcservice.service.LogServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {

	public static void main(String[] args) {
		try {
			Server server = ServerBuilder
					.forPort(6565)
					.addService(new LogServiceImpl()).build();
			server.start();
			server.awaitTermination();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
