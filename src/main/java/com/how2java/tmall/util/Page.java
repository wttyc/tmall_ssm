package com.how2java.tmall.util;

/**
 * @author tyc
 * @date 2019/1/3
 */
public class Page {

//    int start; 每页开始位置
//    int count; 每页显示的数量
//    int total; 总共有多少条数据
//    String param; 参数(这个属性在后续有用到，但是分类的分页查询里并没有用到，请忽略)

    private int start;
    private int count;
    private int total;
    private String param;
    //每页默认显示5条数据
    private static final int defaultCount = 5;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public Page() {
        count = defaultCount;
    }

    public Page(int start, int count) {
        this();
        this.start = start;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Page [start=" + start +
                ", count=" + count +
                ", total=" + total +
                ", getStart()=" + getStart() +
                ", getCount()=" + getCount() +
                ", isHasPreviouse()=" + isHasPreviouse() +
                ", isHasNext()=" + isHasNext() +
                ", getTotalPage()=" + getTotalPage() +
                ", getLast()=" + getLast() +
                "]";
    }

    /**
     * 返回总页数
     *
     * @return totalPage
     */
    public int getTotalPage() {
        int totalPage;
        if (total % count == 0) {
            totalPage = total / count;
        } else {
            totalPage = total / count + 1;
        }
        if (totalPage == 0) {
            totalPage = 1;
        }
        return totalPage;
    }

    /**
     * 返回最后一页的开始数
     *
     * @return
     */
    public int getLast() {
        int last;
        if (total % count == 0) {
            last = total - count;
        } else {
            last = total - total % count;
        }
        last = last < 0 ? 0 : last;
        return last;

    }

    /**
     * 判断是否有上一页
     *
     * @return
     */
    public boolean isHasPreviouse() {
        if (start == 0) {
            return false;
        }
        return true;
    }

    /**
     * 判断是否有下一页
     *
     * @return
     */
    public boolean isHasNext() {
        if ( start == getLast()) {
            return false;
        }
        return true;
    }

    //
//    方法：
//    getTotalPage 根据 每页显示的数量count以及总共有多少条数据total，计算出总共有多少页
//    getLast 计算出最后一页的数值是多少
//    isHasPreviouse 判断是否有前一页
//    isHasNext 判断是否有后一页
}
