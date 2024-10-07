package com.example.adastra.api.base;

public interface OperationProcessor<Request extends OperationInput, Response extends OperationResult> {
    Response process(Request input);
}
