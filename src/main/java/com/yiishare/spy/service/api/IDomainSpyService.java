package com.yiishare.spy.service.api;

import com.yiishare.spy.domain.validdomain.ValidDomain;

/**
 * 
 * 域名爬取服务 <br> 
 *  
 * @author zhang.zhigao<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年8月12日 <br>
 * @since V1.0<br>
 * @see com.yiishare.spy.service.api <br>
 */
public interface IDomainSpyService {

    /**
     * 
     * 查询可用的域名 <br> 
     *  
     * @author zhang.zhigao<br>
     * @taskId <br>
     * @param name 域名
     * @return <br>
     * @exception Exception if has exception
     */
    public ValidDomain findValidDomain(String name) throws Exception;
    
    /**
     * 
     * 指定域名商的接口地址对指定的域名进行查询 <br> 
     *  
     * @author zhang.zhigao<br>
     * @param url 接口地址
     * @param name 域名
     * @return ValidDomain
     * @throws Exception if has error <br>
     */
    public ValidDomain findValidDomain(String url, String name) throws Exception;
}
