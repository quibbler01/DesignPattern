package chapter_24;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {
	public static HashMap<String, Object> backUpProp(Object bean) {
		HashMap<String, Object> resultHashMap = new HashMap<String, Object>();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor des : descriptors) {
				String fieldName = des.getName();
				Method getter = des.getReadMethod();
				Object fieldValue = getter.invoke(bean, new Object[] {});
				if (!fieldName.equals("class")) {
					resultHashMap.put(fieldName, fieldValue);
				}
			}
		} catch (Exception e) {
		}
		return resultHashMap;
	}

	public static void restoreProp(Object bean, HashMap<String, Object> propMap) {
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor des : descriptors) {
				String fieldName = des.getName();
				if (propMap.containsKey(fieldName)) {
					Method setter = des.getWriteMethod();
					setter.invoke(bean, new Object[] { propMap.get(fieldName) });
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("shit");
			e.printStackTrace();
		}
	}
}
