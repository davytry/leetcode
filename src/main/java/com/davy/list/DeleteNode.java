package com.davy.list;

/**
 * @author Davy
 * <p>
 * 删除链表中的节点
 * 请编写一个函数，用于 删除单链表中某个特定节点 。
 * 在设计函数时需要注意，你无法访问链表的头节点 head ，只能直接访问 要被删除的节点 。
 * <p>
 * 题目数据保证需要删除的节点 不是末尾节点 。
 */
public class DeleteNode {
    public void deleteNode(ListNode1 node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}


class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        val = x;
    }
}