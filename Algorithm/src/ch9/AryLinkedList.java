package ch9;
import java.util.Comparator;
//���� ����ũ Ŭ����(�迭 Ŀ�� ����)

public class AryLinkedList<E> {
	
	//���
	class Node<E> {
		private E data;         //������
		private int next;       //����Ʈ�� ���� ������
		private int dnext;      //free ����Ʈ�� ���� ������
		
		//data�� next�� ����
		void set(E data, int next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<E>[] n;                 //����Ʈ ��ü
	private int size;                    //����Ʈ�� �뷮(���� ū ������ ��)
	private int max;                     //��� ���� ���� record
	private int head;                    //�Ӹ� ���
	private int crnt;                    //���� ���
	private int deleted;                 //free ����Ʈ�� �Ӹ� ���
	private static final int NULL = -1;  //���� ��� ���� / ����Ʈ ���� ��

	//������
	public AryLinkedList(int capacity) {
		head = crnt = max = deleted = NULL;
		try {
			n=new Node[capacity];
			for(int i=0; i<capacity; i++)
				n[i] = new Node<E>();
			size = capacity;
		}
		catch (OutOfMemoryError e) {
			size = 0; //�迭 ���� ����
		}
	}
	
	//������ �����ϴ� record�� �ε����� ����
	private int getInsertIndex() {
		if(deleted == NULL) {             //������ recored�� ����
			if(max < size)
				return ++max;             //�� record�� ���
			else
				return NULL;              //�뷮 over(��ħ)
		} else {
			int rec = deleted;            //free ����Ʈ����
			deleted = n[rec].dnext;       //�Ӹ� rec�� ����
			return rec;
		}
	}
	
	//--- record idx�� ���� ����Ʈ�� ��� ---//
    private void deleteIndex(int idx) {
        if (deleted == NULL) {                    // ���� record�� �������� ����
            deleted = idx;                        // idx�� ���� ����Ʈ��
            n[idx].dnext = NULL;                  // �Ӹ��� ���
        } else {
            int rec = deleted;                    // idx�� ���� ����Ʈ��
            deleted = idx;                        // �Ӹ��� ����
            n[rec].dnext = rec;
        }
    }

    //--- ��带 �˻� ---//
    public E search(E obj, Comparator<? super E> c) {
        int ptr = head;                                    // ���� ��ĵ ���� ���

        while (ptr != NULL) {
            if (c.compare(obj, n[ptr].data) == 0) {
                crnt = ptr;
                return n[ptr].data;                   // �˻� ����
            }
            ptr = n[ptr].next;                        // ���� ��� ����
        }
        return null;                                  // �˻� ����
    }

    //--- �Ӹ���� ���� ---//
    public void addFirst(E obj) {
        int ptr = head;                                // ���� ���� �Ӹ����
        int rec = getInsertIndex();
        if (rec != NULL) {
            head = crnt = rec;                         // �� rec ��° ���ڵ忡 ����
            n[head].set(obj, ptr);
        }
    }

    //--- ������� ���� ---//
    public void addLast(E obj) {
        if (head == NULL)                                // ����Ʈ�� ���������
            addFirst(obj);                               // �Ӹ��� ����
        else {
            int ptr = head;
            while (n[ptr].next != NULL)
                ptr = n[ptr].next;
            int rec = getInsertIndex();
            if (rec != NULL) {                        // �� rec ��° ���ڵ忡 ����
                n[ptr].next = crnt = rec;
                n[rec].set(obj, NULL);
            }
        }
    }

    //--- �Ӹ���� ���� ---//
    public void removeFirst() {
        if (head != NULL) {                            // ����Ʈ�� ������� ������
            int ptr = n[head].next;
            deleteIndex(head);
            head = crnt = ptr;
        }
    }

    //--- ������� ���� ---//
    public void removeLast() {
        if (head != NULL) {
            if (n[head].next == NULL)            // ��尡 �ϳ��� ������
                removeFirst();                   // �Ӹ���� ����
            else {
                int ptr = head;                  // ��ĵ ���� ���
                int pre = head;                  // ��ĵ ���� ����� ���ʳ��

                while (n[ptr].next != NULL) {
                    pre = ptr;
                    ptr = n[ptr].next;
                }
                n[pre].next = NULL;                    // pre�� ���� ���� ���� ���
                deleteIndex(pre);
                crnt = pre;
            }
        }
    }

    //--- ���ڵ� p�� ���� ---//
    public void remove(int p) {
        if (head != NULL) {
            if (p == head)                                // p�� �Ӹ� ����̸�
                removeFirst();                            // �Ӹ���� ����
            else {
                int ptr = head;

                while (n[ptr].next != p) {
                    ptr = n[ptr].next;
                    if (ptr == NULL) return;    // p�� ����Ʈ�� ����
                }
                n[ptr].next = NULL;
                deleteIndex(ptr);
                n[ptr].next = n[p].next;
                crnt = ptr;
            }
        }
    }

    //--- ���� ��� ���� ---//
    public void removeCurrentNode() {
        remove(crnt);
    }

    //--- ��ü ��� ���� ---//
    public void clear() {
        while (head != NULL)                        // ��� �� ������
            removeFirst();                          // �Ӹ� ��� ����
        crnt = NULL;
    }

    //--- ���� ��带 �ϳ� �������� ���� ---//
    public boolean next() {
        if (crnt == NULL || n[crnt].next == NULL)
            return false;                                    // ���ư� �� ����
        crnt = n[crnt].next;
        return true;
    }

    //--- ���� ��� ǥ�� ---//
    public void printCurrentNode() {
        if (crnt == NULL)
            System.out.println("���� ��尡 �����ϴ�.");
        else
            System.out.println(n[crnt].data);
    }

    //--- ��ü ��� ǥ�� ---//
    public void dump() {
        int ptr = head;

        while (ptr != NULL) {
            System.out.println(n[ptr].data);
            ptr = n[ptr].next;
        }
    }
}
