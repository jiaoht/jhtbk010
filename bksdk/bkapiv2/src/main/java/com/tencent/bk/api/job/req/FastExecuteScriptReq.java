package com.tencent.bk.api.job.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tencent.bk.api.job.model.IP;
import com.tencent.bk.api.protocol.ApiReq;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Setter
@Getter
public class FastExecuteScriptReq extends ApiReq {

    /**
     * 必填：业务ID
     */
    @JsonProperty("bk_biz_id")
    private int bkBizId;
    /**
     * 可选：脚本ID
     */
    @JsonProperty("script_id")
    private long scriptId;
    /**
     * 可选：	敏感参数将会在执行详情页面上隐藏, 0:不是（默认），1:是
     */
    @JsonProperty("is_param_sensitive")
    private int isParamSensitive;
    /**
     * 可选：执行脚本的超时时间
     */
    @JsonProperty("script_timeout")
    private int scriptTimeout;
    /**
     * 仅当script_content有值时，此字段必填!
     * 执行脚本的类型:1(shell脚本)、2(bat脚本)、3(perl脚本)、4(python脚本)、5(powershell脚本)
     */
    @JsonProperty("script_type")
    private int scriptType;
    /**
     * 可选：执行脚本的执行参数, 需要做base64编码再发送
     */
    @JsonProperty("script_param")
    private String scriptParam;
    /**
     * 可选：执行脚本的内容, 需要做base64编码再发送
     * 如果同时传了script_id和script_content，则script_id优先
     */
    @JsonProperty("script_content")
    private String scriptContent;
    /**
     * 必填： 执行帐号名/别名
     */
    private String account;

    /**
     * IP对象数组。ip_list与custom_query_id之间任意选一或并存，ip数据会去重合并
     */
    @JsonProperty("ip_list")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Collection<IP> ipDtoList;

    /**
     * 配置平台上的自定义查询id列表。ip_list与custom_query_id之间任意选一或并存，ip数据会去重合并
     */
    @JsonProperty("custom_query_id")
    private Collection<String> customQueryId;
}
