package produce_comsume;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 仓库类Storage实现缓冲区,方法一：同步方法
 *
 * Email:530025983@qq.com
 *
 * @author MONKEY.D.MENG 2011-03-15
 *
 */
//public  class  Storage
//{
//    // 仓库最大存储量
//    private final int MAX_SIZE;
//    public Storage(int num){
//        MAX_SIZE = num;
//    }
//
//    // 仓库存储的载体
//    private LinkedList<Object> list = new LinkedList<Object>();
//
//    //生产num个产品
//    public void produce(int num){
//        synchronized (list){
//            while(num + list.size() > MAX_SIZE){
//                System.out.println("【要生产的产品数量】:" + num + "/t【库存量】:" + list.size() + "/t暂时不能执行生产任务!");
//                try{
//                    list.wait();
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//
//            }
//            for(int i = 0;i<num;i++){
//                list.add(new Object());
//            }
//
//            System.out.println("【已经生产产品数】:" + num + "/t【现仓储量为】:" + list.size());
//            list.notifyAll();
//        }
//    }
//
//    //消费num个产品
//    public void consume(int num){
//        synchronized (list){
//            while(list.size() < num){
//                System.out.println("【要消费的产品数量】:" + num + "/t【库存量】:" + list.size() + "/t暂时不能执行生产任务!");
//                try{
//                    list.wait();
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
//            for(int i = 0;i<num;i++){
//                list.remove();
//            }
//            System.out.println("【已经消费产品数】:" + num + "/t【现仓储量为】:" + list.size());
//            list.notifyAll();
//        }
//    }
//
//
//
//
//
//    // get/set方法
//    public LinkedList<Object> getList()
//    {
//        return list;
//    }
//
//    public void setList(LinkedList<Object> list)
//    {
//        this.list = list;
//    }
//
//    public int getMAX_SIZE()
//    {
//        return MAX_SIZE;
//    }
//}


/**
 * 仓库类Storage实现缓冲区，方法二:lock方法
 *
 * Email:530025983@qq.com
 *
 * @author MONKEY.D.MENG 2011-03-15
 *
 */
//public class Storage
//{
//    // 仓库最大存储量
//    private final int MAX_SIZE;
//    //构造器，初始化仓库大小
//    public Storage(int num){
//        MAX_SIZE = num;
//    }
//
//    // 仓库存储的载体
//    private LinkedList<Object> list = new LinkedList<Object>();
//
//    // 锁
//    private final Lock lock = new ReentrantLock();
//
//    // 仓库满的条件变量
//    private final Condition full = lock.newCondition();
//
//    // 仓库空的条件变量
//    private final Condition empty = lock.newCondition();
//
//    // 生产num个产品
//    public void produce(int num)
//    {
//        // 获得锁
//        lock.lock();
//
//        // 如果仓库剩余容量不足
//        while (list.size() + num > MAX_SIZE)
//        {
//            System.out.println("【要生产的产品数量】:" + num + "/t【库存量】:" + list.size()
//                    + "/t暂时不能执行生产任务!");
//            try
//            {
//                // 由于条件不满足，生产阻塞
//                full.await();
//            }
//            catch (InterruptedException e)
//            {
//                e.printStackTrace();
//            }
//        }
//
//        // 生产条件满足情况下，生产num个产品
//        for (int i = 1; i <= num; ++i)
//        {
//            list.add(new Object());
//        }
//
//        System.out.println("【已经生产产品数】:" + num + "/t【现仓储量为】:" + list.size());
//
//        // 唤醒其他所有线程
//        //full.signalAll();
//        empty.signalAll();
//
//        // 释放锁
//        lock.unlock();
//    }
//
//    // 消费num个产品
//    public void consume(int num)
//    {
//        // 获得锁
//        lock.lock();
//
//        // 如果仓库存储量不足
//        while (list.size() < num)
//        {
//            System.out.println("【要消费的产品数量】:" + num + "/t【库存量】:" + list.size()
//                    + "/t暂时不能执行生产任务!");
//            try
//            {
//                // 由于条件不满足，消费阻塞
//                empty.await();
//            }
//            catch (InterruptedException e)
//            {
//                e.printStackTrace();
//            }
//        }
//
//        // 消费条件满足情况下，消费num个产品
//        for (int i = 1; i <= num; ++i)
//        {
//            list.remove();
//        }
//
//        System.out.println("【已经消费产品数】:" + num + "/t【现仓储量为】:" + list.size());
//
//        // 唤醒其他所有线程
//        full.signalAll();
//        //empty.signalAll();
//
//        // 释放锁
//        lock.unlock();
//    }
//
//    // set/get方法
//    public int getMAX_SIZE()
//    {
//        return MAX_SIZE;
//    }
//
//    public LinkedList<Object> getList()
//    {
//        return list;
//    }
//
//    public void setList(LinkedList<Object> list)
//    {
//        this.list = list;
//    }
//}


/**
 * 仓库类Storage实现缓冲区
 *
 * Email:530025983@qq.com
 *
 * @author MONKEY.D.MENG 2011-03-15
 *
 */
public class Storage
{
    // 仓库最大存储量
    private final int MAX_SIZE;

    // 仓库存储的载体
    private LinkedBlockingQueue<Object> list;
    //构造器
    public Storage(int num){
        MAX_SIZE = num;
        list = new LinkedBlockingQueue<Object>(MAX_SIZE);

    }

    // 生产num个产品
    public void produce(int num)
    {
        // 如果仓库剩余容量为0
        if (list.size() == MAX_SIZE)
        {
            System.out.println("【库存量】:" + MAX_SIZE + "/t暂时不能执行生产任务!");
        }

        // 生产条件满足情况下，生产num个产品
        for (int i = 1; i <= num; ++i)
        {
            try
            {
                // 放入产品，自动阻塞
                list.put(new Object());
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            //System.out.println("【现仓储量为】:" + list.size());
        }
        System.out.println("【已经生产产品数】:" + num +"【现仓储量为】:" + list.size());
    }

    // 消费num个产品
    public void consume(int num)
    {
        // 如果仓库存储量不足
        if (list.size() == 0)
        {
            System.out.println("【库存量】:0/t暂时不能执行生产任务!");
        }

        // 消费条件满足情况下，消费num个产品
        for (int i = 1; i <= num; ++i)
        {
            try
            {
                // 消费产品，自动阻塞
                list.take();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        System.out.println("【已经消费产品数】:" + num +"【现仓储量为】:" + list.size());
    }

    // set/get方法
    public LinkedBlockingQueue<Object> getList()
    {
        return list;
    }

    public void setList(LinkedBlockingQueue<Object> list)
    {
        this.list = list;
    }

    public int getMAX_SIZE()
    {
        return MAX_SIZE;
    }
}