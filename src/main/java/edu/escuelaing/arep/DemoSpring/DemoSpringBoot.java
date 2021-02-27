package edu.escuelaing.arep.DemoSpring;

import edu.escuelaing.arep.ServidorHttp.HttpServer;

import javax.annotation.processing.Completion;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoSpringBoot implements Processor {
    private static DemoSpringBoot _instance = new DemoSpringBoot();
    private Map<String, Method> requestProcessors = new HashMap();

    private DemoSpringBoot() {
    }

    public static DemoSpringBoot getInstance() {
        return _instance;
    }

    public void loadComponents(String[] componentsList) throws ClassNotFoundException {
        for (String componentName : componentsList) {
            loadComponent(componentName);
        }
    }

    private void loadComponent(String[] componentsList) throws ClassNotFoundException {
        String componentName;
        Class component = Class.forName(componentName);
        Method[] componentMethods = component.getDeclaredMethods();

        for (Method m : componentMethods) {
            if (m.isAnnotationPresent((Class<? extends Annotation>) RequestMapping.class)) {
                requestProcessors.put(m.getAnnotation(RequestMapping.class).value(), m);
            }
        }
    }

    @Override
    public String handle(String path, HttpRequest req, HttpResponse res) {
        String ans = "";
        if (requestProcessors.containsKey(path)) {
            try {
                ans = requestProcessors.get(path).invoke(null, null).toString();
            } catch (IllegalAccessException excep) {
                excep.printStackTrace();
            } catch (InvocationTargetException excep) {
                excep.printStackTrace();
            }
        }
        return "HTTP/1.1 200 OK\r\n"
                + "\r\n" + ans;
    }

    public void startServer() {
        HttpServer hserver = new HttpServer();
        hserver.registerProcessor("/springapp", this);
        try {
            hserver.startServer(8080);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws ClassNotFoundException {
        DemoSpringBoot.getInstance().loadComponent(args);
        DemoSpringBoot.getInstance().startServer();

    }

    @Override
    public Set<String> getSupportedOptions() {
        return null;
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return null;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return null;
    }

    @Override
    public void init(ProcessingEnvironment processingEnv) {

    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        return false;
    }

    @Override
    public Iterable<? extends Completion> getCompletions(Element element, AnnotationMirror annotation, ExecutableElement member, String userText) {
        return null;
    }
}