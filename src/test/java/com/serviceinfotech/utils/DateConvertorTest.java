package com.serviceinfotech.utils;


import com.serviceinfotech.config.DateConvertorServiceAutoConfiguration;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DateConvertorServiceAutoConfiguration.class, loader = AnnotationConfigContextLoader.class)
public class DateConvertorTest {

    @Autowired
    private DateConvertor dateConvertor;

    @Test
    public void shouldConvertUtilDateToXMLGregorian() throws Exception {

        XMLGregorianCalendar xmlGregorianCalendar = dateConvertor.format(new Date());
        Assertions.assertThat(xmlGregorianCalendar.getYear()).isEqualTo(2017);

    }
}