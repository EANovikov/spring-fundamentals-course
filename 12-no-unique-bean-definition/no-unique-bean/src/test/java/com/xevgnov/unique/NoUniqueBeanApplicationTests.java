package com.xevgnov.unique;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
class NoUniqueBeanApplicationTests {

    // Spring IoC fails on start to demonstrate:
    // ReportProcessorServiceImpl required a single bean, but 3 were found"
    void contextLoads() {
    }

}
