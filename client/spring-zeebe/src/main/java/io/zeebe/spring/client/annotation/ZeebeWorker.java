package io.zeebe.spring.client.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ZeebeWorker {

  String type() default "${zeebe.worker.defaultType}";

  String name() default "${zeebe.worker.defaultName}";

  long timeout() default -1L;

  int maxJobsActive() default -1;
}
