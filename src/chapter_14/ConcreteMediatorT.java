package chapter_14;

public class ConcreteMediatorT extends MediatorT {

	@Override
	public void doSomething1() {
		// TODO Auto-generated method stub
		super.c1.doSelf();
		super.c2.doSelf();
	}

	@Override
	public void doSomething2() {
		// TODO Auto-generated method stub
		//�������ֵ��ã����������õ��ù�ϵ�������ջ���
//		super.c1.doDep();
//		super.c2.doDep();
		super.c1.doSelf();
		super.c2.doSelf();
	}

}
