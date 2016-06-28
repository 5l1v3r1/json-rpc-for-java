package test;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import jcore.jsonrpc.common.JsonRpcObject;

public class TestObject extends JsonRpcObject implements Serializable{
	private static final long serialVersionUID = 1L;

	private List myList = new ArrayList();
	private Map map = new HashMap();
	// ������ڲ���ΪMap
	private Map inputMap = null;
	
	/***
	 * �ۺϲ����Ĳ���
	 * @param szKey1
	 * @param ln01
	 * @param inMap
	 * @return
	 */
	public Map setInputMap(String szKey1, Long ln01,
			Map inMap, // Map�Ĳ��� 
			String szKey2, TestDomain domain, // JavaBean����Ĳ���
			String szKey3, Date oDate ,// ���ڶ���Ĵ������ڴ�����������ʽ����
			String szKey4, Boolean bIn, // Boolean����ڲ�������
			String szKey5, Character ch // Character���͵Ĳ���
			)
	{
		inputMap = inMap;
		inputMap.put(szKey1, ln01);
		inputMap.put(szKey2, domain);
		inputMap.put(szKey3, oDate);
		inputMap.put(szKey4, bIn);
		inputMap.put(szKey5, ch);
		HttpServletRequest request = this.getRequest();
		return inputMap;
	}
	
	public TestObject()
	{
		myList.add("good");
		myList.add(new TestDomain());
		// map��Ҳ���Է��븴�϶���
		map.put("first", "��һ��ֵ");
		map.put("p2", new Date());
		map.put("domain", myList.get(1));
	}
	
	/***
	 * ����Map����
	 * @return
	 */
	public Map getMap()
	{
		return map;
	}
	
	/***
	 * ��ȡһ����ͨ����
	 * @return
	 */
	public Object getStr()
	{
		return myList.get(0);
	}
	
	/***
	 * ��ȡһ�����϶���
	 * @return
	 */
	public Object getMyObj()
	{
		return myList.get(1);
	}
	
	/***
	 * ��ȡList����
	 * @return
	 */
	public List getList()
	{
		return myList;
	}
}
