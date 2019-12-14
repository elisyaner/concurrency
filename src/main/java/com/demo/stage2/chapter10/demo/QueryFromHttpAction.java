/*
 * All rights Reserved, Designed By baowei
 *
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
package com.demo.stage2.chapter10.demo;

/**
 * @author yan.zhang
 * @date 2019/11/23 20:53
 */
public class QueryFromHttpAction {

    public void execute() {
        String idCard = getIdCard();
        ActionContext.getActionContext().getContext().setCardId(idCard);
    }

    private String getIdCard() {
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "340403" + Thread.currentThread().getId();
    }
}